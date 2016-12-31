package CoreSpring.AspectOrientedSpring.SoundSystemCounter;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by congzihan on 16/12/30.
 */
@Aspect
public class TrackCounter {
    private Map<Integer, Integer> trackCounts = new HashMap<Integer, Integer>();

    //通知play track方法
    @Pointcut("execution(* CoreSpring.WiringBeans.SoundSystem.CompactDisc.playTrack(int)) && args(trackNumbers) ")
    //切点定义的参数和切点方法的参数名称是一致的
    public void trackPlayed(int trackNumbers) {
    }

    // 在播放前为磁道计数
    @Before("trackPlayed(trackNumber)")
    public void countTrack(int trackNumber) {
        int count = getPlayCount(trackNumber);
        trackCounts.put(trackNumber, count + 1);
    }

    public int getPlayCount(int trackNumber) {
        return trackCounts.containsKey(trackNumber) ? trackCounts.get(trackNumber) : 0;
    }
}
