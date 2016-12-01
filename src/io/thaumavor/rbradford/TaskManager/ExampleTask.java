package io.thaumavor.rbradford.TaskManager;

public class ExampleTask extends Task {

	@Override
	public void runTask() { // The default task object
		System.out.println("This is an example");
	}

	// Most methods will be overriden
	@Override
	public Boolean returnRunnable() {
		return super.returnRunnable() && true;
	}

	@Override
	public int getWait() {
		return 1;
	}

	@Override
	public int getCPULoad() {
		return 0; // 0 is no load, 3 is maximum load
	}
}
