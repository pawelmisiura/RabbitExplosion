package com.spartaglobal.RabbitExplosion;
import java.util.Timer;
import java.util.TimerTask;

public class GlobalTimer{
    private int seconds;
    private int secondsCount;
    private Timer timer = new Timer();

    public GlobalTimer(int seconds) {
        this.seconds = seconds;
        timer.schedule(new GlobalTask(), 0,  1000);
    }

    class GlobalTask extends TimerTask {
        @Override
        public void run() {
            if (secondsCount <= seconds){
                secondsCount++;
            } else {
                timer.cancel();
            }
        }
    }
}