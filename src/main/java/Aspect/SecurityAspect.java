package Aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;

import java.util.logging.Logger;

@Aspect
public class SecurityAspect {
    private final Logger logger = Logger.getLogger(SecurityAspect.class.getName());

    @Around(value = "@annotation(ToLog)")
    public Object secure(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        logger.info("Security Aspect: calling the intercepted method");

        Object returnedVal = proceedingJoinPoint.proceed();

        logger.info("Security aspect: Method executed and returned " + returnedVal);

        return returnedVal;
    }
}
