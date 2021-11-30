package svoby.spring.projectmanagement.logging;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Aspect
@Component
public class ApplicationLoggerAspect {

    private final Logger log = LoggerFactory.getLogger(this.getClass());

    @Pointcut("within(svoby.spring.projectmanagement.controllers..*)")
    public void definePackagePointcuts() {

    }

    @Around("definePackagePointcuts()")
    public Object logAround(ProceedingJoinPoint joinPoint){
        log.debug("\n ------------------------------------------ ");
        log.debug(" Před metodou \n {}, {} () with arguments[s] = {}", joinPoint.getSignature().getDeclaringTypeName(),
                joinPoint.getSignature().getName(), Arrays.toString(joinPoint.getArgs()));
        log.debug(" ---------------------------------------------- \n \n \n");

        Object o = null;

        try {
            o = joinPoint.proceed();
        } catch (Throwable e) {
            e.printStackTrace();
        }

        log.debug(" Po metodě \n {}, {} () with arguments[s] = {}", joinPoint.getSignature().getDeclaringTypeName(),
                joinPoint.getSignature().getName(), Arrays.toString(joinPoint.getArgs()));
        log.debug(" ---------------------------------------------- \n \n \n");

        return o;


    }

}
