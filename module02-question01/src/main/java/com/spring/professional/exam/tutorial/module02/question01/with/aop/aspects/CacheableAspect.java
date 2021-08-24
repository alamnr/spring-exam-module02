package com.spring.professional.exam.tutorial.module02.question01.with.aop.aspects;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.logging.Logger;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class CacheableAspect {

	private Logger logger = Logger.getLogger("Cacheable.logger");
	
	private Map<Cachekey , Object> cache = new HashMap< >();
	
	@Around("@annotation(com.spring.professional.exam.tutorial.module02.question01.with.aop.annotations.Cacheable)")
	public Object checkCache(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
		Cachekey cachekey = new Cachekey(proceedingJoinPoint);
		
		if(cache.containsKey(cachekey)) {
			logger.info(String.format("Fetching value from cache for %s - ", proceedingJoinPoint.getSignature().toShortString()));
			return cache.get(cachekey);
		} else {
			Object result = proceedingJoinPoint.proceed();
			cache.put(cachekey, result);
			return result;
		}
	}
	
	private static class Cachekey{
		private final Object target;
		private final String signature;
		private final Object[] args;
		
		public Cachekey(ProceedingJoinPoint proceedingJoinPoint) {
			this.target = proceedingJoinPoint.getTarget();
			this.signature = proceedingJoinPoint.getSignature().toLongString();
			args = proceedingJoinPoint.getArgs();
		}	
		
		@Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Cachekey)) return false;
            Cachekey cacheKey = (Cachekey) o;
            return target == cacheKey.target &&
                    Objects.equals(signature, cacheKey.signature) &&
                    Arrays.equals(args, cacheKey.args);
        }

        @Override
        public int hashCode() {
            int result = Objects.hash(target, signature);
            result = 31 * result + Arrays.hashCode(args);
            return result;
        }
    }
		
}
