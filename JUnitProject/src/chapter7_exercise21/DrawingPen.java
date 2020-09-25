/**
 * 
 */
package chapter7_exercise21;

/**
 * @author tboydev
 *
 */
public class DrawingPen {

	
	PenStatus currentStatus  = PenStatus.UP;

	public PenStatus getCurrentStatus() {
		return currentStatus;
	}

	public void setCurrentStatus(PenStatus currentStatus) {
		this.currentStatus = currentStatus;
	}
	
	
}
