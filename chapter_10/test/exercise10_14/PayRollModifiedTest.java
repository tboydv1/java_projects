package exercise10_14;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import exercise10_12.Employee;

class PayRollModifiedTest {

	Employee[] myEmployees;
	
	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		
		myEmployees = new Employee[3];
		myEmployees[0] = new PieceWorker("Jordon", "Bruce", "332-3233-3-32", 04,06,1998,10,45);
		
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void piceWorkerInitializedTest() {
		
		assertNotNull(myEmployees[0]);
		
		System.out.println(myEmployees[0]);
	}

}
