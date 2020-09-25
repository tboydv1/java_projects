/**
 * 
 */
package chapter7_exercise28;

/**
 * @author tboydev
 *
 */
public class Tortoise {


	
	private int tortoisePosition = 1;
	
	private TortoiseMove myMove;
	
	
	public TortoiseMove getMyMove() {
		return myMove;
	}

	public void setMyMove(Clock tortoiseClock) {
		
		if(tortoiseClock.getTick() >= 1 && tortoiseClock.getTick() <= 5) 
			this.myMove = TortoiseMove.FastPlod;
		else if(tortoiseClock.getTick() >= 5 && tortoiseClock.getTick() <= 7)
			this.myMove = TortoiseMove.Slip;
		else if(tortoiseClock.getTick() > 7 && tortoiseClock.getTick() <=10)
			this.myMove = TortoiseMove.SlowPlod;
		
	}

	public int getTortoisePosition() {
		return tortoisePosition;
	}

	public void setTortoisePosition(int tortoisePosition) {
		
		
		
				
			 if(tortoisePosition >= 1)
					this.tortoisePosition = tortoisePosition;
				else if(tortoisePosition < 1) {
					this.tortoisePosition = 1;
				}
	
		
		
		
			
	}

	
	
	public void move(RaceTrack myTrack) {
		
		int temp;
		
		if(TortoiseMove.FastPlod == getMyMove()) {
			
			temp = this.tortoisePosition + 3;
			 
			setTortoisePosition(temp);
			
			myTrack.getTrackFloor()[getTortoisePosition()] = RaceStatus.T;
		}
		
		else if(TortoiseMove.Slip == getMyMove()) {
			
			temp = getTortoisePosition() - 6;
			
			setTortoisePosition(temp);
			
			myTrack.getTrackFloor()[getTortoisePosition()] = RaceStatus.T;
		}
		
		else if(TortoiseMove.SlowPlod == getMyMove()) {
			
			temp = getTortoisePosition() +  1;
			
			setTortoisePosition(temp);
			
			myTrack.getTrackFloor()[getTortoisePosition()] = RaceStatus.T;
		}
	}
	
	
}
