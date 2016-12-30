package CoreSpring.AspectOrientedSpring.Concert;

import org.aspectj.lang.annotation.*;

/**
 * Created by congzihan on 16/12/30.
 */
@Aspect
public class Audience {
    //定义命名的切点
    @Pointcut("execution(* CoreSpring.AspectOrientedSpring.Concert.Performance.perform(..))")
    public void performance() {
    }

    //表演之前
    @Before("performance()")
    public void silenceCellPhones() {
        System.out.println("Silencing cell phones");
    }

    //表演之前
    @Before("performance()")
    public void takeSeats() {
        System.out.println("Taking seats");
    }

    //表演之后
    @AfterReturning("performance()")
    public void applause() {
        System.out.println("CLAP CLAP CLAP!!!");
    }

    //表演失败
    @AfterThrowing("performance()")
    public void demandRefund() {
        System.out.println("Demanding a refund");
    }
}
