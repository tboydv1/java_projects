package chapter7_exercise21;

public enum PenStatus {

	UP(1), DOWN(2);
	
	private int status;
	
	private PenStatus(int id) {
		this.status = id;
	}

	public int getStatus() {
		return status;
	}


	
}
