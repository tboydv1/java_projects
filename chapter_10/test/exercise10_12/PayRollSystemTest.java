/**
 * 
 */
package exercise10_12;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import exercise10_12.Employee;
import examples.Date;

/**
 * @author tboydev
 *
 */
class PayRollSystemTest {
	Employee[] myEmployees;
	Date currentDate;
	
	/**
	 * @throws java.lang.Exception
	 */
	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		
		myEmployees = new Employee[2];
		currentDate = new Date(2, 16, 1996);
		myEmployees[0] = new CommissionEmployee("Bob", "Martin", "222-33-2212", 200, 0.7, 2, 23, 1995);
		myEmployees[1] = new HourlyEmployee("Jane", "Smith", "234-55-5555", 8, 9, 1992, 20, 45);

	/**
	 * @throws java.lang.Exception
	 */
		
	}
	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void employeesInitializedTest(){
		
		for(int i = 0; i < myEmployees.length; i++)
			assertNotNull(myEmployees[i]);
		
	}
	
	@Test
	void calculatePayRollTest() {
		
		assertNotNull(myEmployees[0].earnings());
		assertNotNull(myEmployees[1].earnings());
		
		for(Employee employeeObjects: myEmployees) {
			
			System.out.println(employeeObjects);
			
			System.out.println();
			
		}
	}
	
	@Test
	void add100$BonusOnEmployeeBirthdayTest() {
		
		for(Employee employeeObjects: myEmployees) {
			
			
			if (employeeObjects.getBirthDate().getMonth() == currentDate.getMonth()) {
				assertEquals(employeeObjects.getBirthDate().getMonth(), currentDate.getMonth());		
					System.out.println(employeeObjects + "\nHappy Birthday, you recieved 100$ as bonus\nTotal earnings is: " +  (employeeObjects.earnings() + 100));
			}
			else {
				assertNotEquals(employeeObjects.getBirthDate().getMonth(), currentDate.getMonth());
				System.out.println(employeeObjects + "\nTotal earnings is: " + employeeObjects.earnings());
			}
			
			System.out.println();
			
		}
		
		
	}
	
	

}
