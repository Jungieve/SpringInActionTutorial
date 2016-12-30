package CoreSpring.AspectOrientedSpring.Concert;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

/**
 * Created by congzihan on 16/12/30.
 */
@Aspect
public class Audience {
    //定义命名的切点
    @Pointcut("execution(* CoreSpring.AspectOrientedSpring.Concert.Performance.perform(..))")
    public void performance() {
    }

    //创建环绕通知
    public void watchPerformance(ProceedingJoinPoint joinPoint) {
        try {
            System.out.println("Silencing cell phones");
            System.out.println("Taking seats");
            joinPoint.proceed();
            System.out.println("CLAP CLAP CLAP!!!");
        } catch (Throwable throwable) {
            System.out.println("Demanding a refund");
        }
    }
}
