package CoreSpring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by root on 2016/12/18.
 */
public class KnightMain {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("knights.xml");
        Knight knight = context.getBean(Knight.class);
        knight.embarkOnQuest();
        context.close();
    }
}
