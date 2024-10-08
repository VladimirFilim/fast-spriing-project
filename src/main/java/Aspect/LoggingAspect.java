package Aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;

import java.util.logging.Logger;

@Aspect public class LoggingAspect {
    private Logger logger = Logger.getLogger(LoggingAspect.class.getName());

    @Around(value = "@annotation(ToLog)")
    public Object log(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        logger.info("Logging aspect: Calling the intercepted method ");

        Object returnedVal = proceedingJoinPoint.proceed();

        logger.info("Logging aspect: Method executed and returned " + returnedVal);

        return returnedVal;
    }
}