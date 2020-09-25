/**
 * 
 */
package chapter7_exercise28;

/**
 * @author tboydev
 *
 */
public class Hare {

	
	
	
	private int harePosition = 1;
	
	private HareMove hareMove;
	
	

	public HareMove getHareMove() {
		return hareMove;
	}

	public void setHareMove(Clock myClock) {
		
		if(myClock.getTick() >= 1 && myClock.getTick() <=2 )
			this.hareMove = HareMove.Sleep;
		else if(myClock.getTick() >= 3 && myClock.getTick() <=4 )
			this.hareMove = HareMove.BigHop;
		else if(myClock.getTick() == 5 )
			this.hareMove = HareMove.BigSlip;
		else if(myClock.getTick() >= 6 && myClock.getTick() <=8 )
			this.hareMove = HareMove.SmallHop;
		else if(myClock.getTick() >= 9 && myClock.getTick() <=10 )
			this.hareMove = HareMove.SmallSlip;
	}

	public int getHarePosition() {
		return harePosition;
	}

	public void setHarePosition(int harePosition) {
		
		
		
		if(harePosition >= 1)
			this.harePosition = harePosition;
		else if (harePosition < 1) {
			this.harePosition = 1;
		}
		
		
	}

	
	
	public void move(RaceTrack myTrack) {
		
		int temp;
		
		if(getHareMove() == HareMove.Sleep) {
			
			setHarePosition(getHarePosition());
			
			myTrack.getTrackFloor()[getHarePosition()] = RaceStatus.H ;
		}
		else if(getHareMove() == HareMove.BigHop) {
			
			temp = getHarePosition() + 9;
			
			setHarePosition(temp);
			
			myTrack.getTrackFloor()[getHarePosition()] = RaceStatus.H ;
		}
		else if(getHareMove() == HareMove.BigSlip) {
			
			temp = getHarePosition() - 12;
			
			setHarePosition(temp);
			
			myTrack.getTrackFloor()[getHarePosition()] = RaceStatus.H ;
		}
		
		else if(getHareMove() == HareMove.SmallHop) {
			
			temp = getHarePosition() + 1;
			
			setHarePosition(temp);
			
			myTrack.getTrackFloor()[getHarePosition()] = RaceStatus.H ;
		}
		
		else if(getHareMove() == HareMove.SmallSlip) {
			
			temp = getHarePosition() - 2;
			
			setHarePosition(temp);
			
			myTrack.getTrackFloor()[getHarePosition()] = RaceStatus.H ;
		}
		
	}
	
	
	
	
}
