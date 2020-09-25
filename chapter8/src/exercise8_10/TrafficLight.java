package exercise8_10;

public enum TrafficLight {

	RED(60),
	YELLOW(10),
	GREEN(40);
	
	
	private int duration;
	
	TrafficLight(int duration){
		
		this.duration = duration;
	}
	
	public int getDuration() {
		return duration;
	}
	
	public void setDuration(int duration) {
		this.duration = duration;
	}
	
	
}
