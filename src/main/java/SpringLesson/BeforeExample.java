package SpringLesson;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * Created by Алена on 29.03.14.
 */
@Aspect
@Component
public class BeforeExample {
    @Before("execution(* SpringLesson.*.sendGreetings(..))")
    public void beforeMessage() {
        System.out.println("Before method call");
    }
    @Around("execution(* SpringLesson.*.sendGreetings(..))")
    public Object insteadOfMessage(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("instead of original method");
//        proceed - выполняет и реальный метод тоже
//        Object res = pjp.proceed();
//        return res;

        return null;
    }
}
