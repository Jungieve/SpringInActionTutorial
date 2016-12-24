package CoreSpring.SpringingIntoAction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by root on 2016/12/18.
 */
public class KnightMain {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("CoreSpring/SpringingINtoAction/knights.xml");
        Knight knight = context.getBean(Knight.class);
        knight.embarkOnQuest();
        context.close();
    }
}
