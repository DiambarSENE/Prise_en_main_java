package sn.dev;

import java.util.Timer;
import java.util.TimerTask;

public class CustumeTimer {
	private Timer timer;
	private int intOnSec;
	
	public CustumeTimer() {
		this.timer = new Timer();
		this.intOnSec = 10;
	}
	
	public void start( CalculeListner cl) {
		cl.onStart();
		timer.schedule(new TimerTask() {
			
			@Override
			public void run() {
				System.out.println(intOnSec +"s");
				cl.onRun();
				if(intOnSec == 0) {
					cl.onFinish();
					cancel();
				}
				intOnSec--;
			}
		}, 1000,1000);
	}
	

}
