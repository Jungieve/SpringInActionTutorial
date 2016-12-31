package CoreSpring.AspectOrientedSpring.Concert;

import org.aspectj.lang.annotation.DeclareParents;

/**
 * Created by congzihan on 16/12/31.
 */
public class EncoreableIntroducer {
    //@DeclareParents注解所标注的静态属性指明了要引入的接口
    @DeclareParents(value = "CoreSpring.AspectOrientedSpring.Concert.Performance+", defaultImpl = DefaultEncoreable.class)
    public static Encoreable encoreable;
}
