package CoreSpring.SpringingIntoAction;

import java.io.PrintStream;

/**
 * Created by root on 2016/12/18.
 */
public class Ministrel {
    private PrintStream stream;

    public Ministrel(PrintStream stream) {
        this.stream = stream;
    }

    //探险之前调用
    public void singBeforeQuest(){
        stream.println("Fa la la,the knight is so brave!");
    }

    //探险之后调用
    public void singAfterQuest(){
        stream.println("Tee hee hee, the brave knight did embark on a quest");
    }
}
