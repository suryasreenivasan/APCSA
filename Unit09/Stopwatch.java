
public class Stopwatch {
	private long startTime;
	private long endTime;
	
	public Stopwatch() {
		
	}
	
	public long getStartTime() {
		return startTime;
	}
	
	public long getEndTime() {
		return endTime;
	}
	
	public void start() {
		startTime = System.currentTimeMillis();
	}
	public void stop() {
		endTime = System.currentTimeMillis();
	}
	long getElapsedTime() {
		return System.currentTimeMillis() - startTime;
	}
}
