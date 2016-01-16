package com.ryanb3.TaskManager;

public class Task {
	
	double lastTimeRun = 0.0;
	boolean started = false; 
	boolean toRemove = false;
	int CPUCore;
	
	public void runTask() { //The default task object
		
	}
	
	//Most methods will be overriden
	
	public Boolean returnRunnable() {
		return started;
	}
	
	public int getWait() {
		return 1000;
	}
	
	public int getCPULoad() {
		return 0; //0 is no load, 3 is maximum load
	}
	
	public void start() {
		started = true;
	}
	
	public void stop() {
		started = false;
	}
	
	public void remove() {
		toRemove = true;
	}
}
