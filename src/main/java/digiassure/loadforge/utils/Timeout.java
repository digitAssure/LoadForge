package digiassure.loadforge.utils;

import digiassure.loadforge.interfaces.TimeoutCallback;

/**
 * @author sapan.dang
 */
public class Timeout extends  Thread {

    TimeoutCallback timeoutCallback;
    long duration;

    public Timeout(TimeoutCallback timeoutCallback,long duration)
    {
        this.setPriority(Thread.MAX_PRIORITY);
        this.timeoutCallback=timeoutCallback;
        this.duration=duration;
    }

    public void startTimer() throws InterruptedException {
        this.sleep(duration);
        timeoutCallback.timeout();
    }


}
