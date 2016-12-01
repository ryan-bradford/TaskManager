package io.thaumavor.rbradford.TaskManager.Test;

import io.thaumavor.rbradford.TaskManager.ExampleTask;
import io.thaumavor.rbradford.TaskManager.Task;
import io.thaumavor.rbradford.TaskManager.TaskManager;

public class Test {

	public Test() {
		
	}
	
	public static void main(String[] args) {
		TaskManager manager = new TaskManager();
		Task added = new ExampleTask();
		manager.addTask(added);
		added.start();
 	}
	
}
