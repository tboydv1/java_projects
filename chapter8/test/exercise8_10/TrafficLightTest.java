package exercise8_10;

public class TrafficLightTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
					
		for(TrafficLight value: TrafficLight.values()) {
			
			System.out.printf("%-10sduration: %d%n",value,value.getDuration());
			
		}
	}

}
