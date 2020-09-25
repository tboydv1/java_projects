package exercise10_14;

import exercise10_12.Employee;

public class PieceWorker extends Employee {

	private double wage;
	private int pieces;
	
	public PieceWorker(String firstName, String lastName, String socialSecurityNumber, int birthMonth, int birthDay,
			int birthYear, double wage, int pieces) {
		super(firstName, lastName, socialSecurityNumber, birthMonth, birthDay, birthYear);
		// TODO Auto-generated constructor stub
		
		if(wage < 0.0)
			throw new IllegalArgumentException("Wage must be > 0.0");
		
		if(pieces < 0)
			throw new IllegalArgumentException("Pieces must be > 0");
		
		this.wage = wage;;
		this.pieces = pieces;
	}
	
	

	public double getWage() {
		return wage;
	}



	public void setWage(double wage) {
		this.wage = wage;
	}



	public int getPieces() {
		return pieces;
	}



	public void setPieces(int pieces) {
		this.pieces = pieces;
	}



	@Override
	public double earnings() {
		// TODO Auto-generated method stub
		return getWage() * getPieces();
	}
	
	public String toString() {
		
		return String.format("piece worker %s\n%.2f", super.toString(), earnings());
	}

}
