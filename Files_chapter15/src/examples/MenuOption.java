package examples;

public enum MenuOption {

	ZERO_BALANCE(1),
	CREDIT_BALANCE(2),
	DEBIT_BALANCE(3),
	END(4);
	
	private final int value;
	
	private MenuOption(int value) {
		this.value = value;
	}
	
}
