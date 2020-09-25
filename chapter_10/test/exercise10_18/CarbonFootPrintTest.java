package exercise10_18;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CarbonFootPrintTest {

	CarbonFootPrint greenHouse, RolceRoyce, myBike;
	ArrayList <CarbonFootPrint> utilities;
	
	
	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		
		utilities = new ArrayList<CarbonFootPrint>();
		
		greenHouse = new Building();
		RolceRoyce = new Car();
		myBike = new Bicycle();
		
		utilities.add(greenHouse);
		
		utilities.add(RolceRoyce);
		
		utilities.add(myBike);
		
	}

	@AfterEach
	void tearDown() throws Exception {
	}
	
	@Test
	void calculateGreenHouseCarbonFootPrintTest() {
		
		assertEquals(0.0,((Building) greenHouse).getMonthlyElectricityKWH());
		((Building) greenHouse).setMonthlyElectricityKWH(135);
		
		//assertEquals(135.0,((Building) greenHouse).getMonthlyElectricityKWH());
		
		assertEquals((135 * 12), greenHouse.getCarbonFootPrint());
		
	}
	
	@Test
	void calculateGreenHouseCarbonFootPrintWithNegatKWHElectricyTest() {
		
		assertEquals(0.0,((Building) greenHouse).getMonthlyElectricityKWH());
		
		assertThrows(IllegalArgumentException.class, ()-> ((Building) greenHouse).setMonthlyElectricityKWH(-135));
		
		assertEquals(0.0,((Building) greenHouse).getMonthlyElectricityKWH());
		
		
	}
	
	@Test
	void calculateRolceRoyceCarbonFootPrintWithNegativeValuesTest() {
		
		assertEquals(0.0,((Car)RolceRoyce).getAverageMPG());
		
		assertEquals(0.0,((Car)RolceRoyce).getAverageYearlyMiles());
		
		
		
		assertThrows(IllegalArgumentException.class, ()-> ((Car)RolceRoyce).setAverageMPG(-25));
		assertThrows(IllegalArgumentException.class, ()->((Car)RolceRoyce).setAverageYearlyMiles(-1560));
		
		assertEquals(0.0,((Car)RolceRoyce).getAverageMPG());
		
		assertEquals(0.0,((Car)RolceRoyce).getAverageYearlyMiles());
		
		assertEquals(0.0, RolceRoyce.getCarbonFootPrint());
		
	}
	
	@Test
	void calculateRolceRoyceCarbonFootPrintTest() {
		
		assertEquals(0.0,((Car)RolceRoyce).getAverageMPG());
		
		assertEquals(0.0,((Car)RolceRoyce).getAverageYearlyMiles());
		
		((Car)RolceRoyce).setAverageMPG(25);
		
		((Car)RolceRoyce).setAverageYearlyMiles(1560);
		
		assertEquals(25.0,((Car)RolceRoyce).getAverageMPG());
		
		assertEquals(1560.0,((Car)RolceRoyce).getAverageYearlyMiles());
		
		assertNotEquals(0.0, RolceRoyce.getCarbonFootPrint());
		
	}
	
	@Test
	void calculateBicycleCarbonFootPrintTest() {
		
		assertEquals(0.0, ((Bicycle)myBike).getTotalMiles());
		
		assertThrows(IllegalArgumentException.class, ()-> ((Bicycle) myBike).setTotalMiles(-48));
		
		assertEquals(0.0, ((Bicycle)myBike).getTotalMiles());
		
		((Bicycle) myBike).setTotalMiles(48);
		
		assertEquals(48.0, ((Bicycle)myBike).getTotalMiles());
		
		assertEquals((48 * 34), myBike.getCarbonFootPrint());
	}
	
	
	
	

	@Test
	void carbonFootPrintElementest() {
		
//		Initialize necessary variables for car class
		assertEquals(0.0,((Car)RolceRoyce).getAverageMPG());
		
		assertEquals(0.0,((Car)RolceRoyce).getAverageYearlyMiles());
		
		((Car)RolceRoyce).setAverageMPG(25);
		
		((Car)RolceRoyce).setAverageYearlyMiles(1560);
		
		assertEquals(25.0,((Car)RolceRoyce).getAverageMPG());
		
		assertEquals(1560.0,((Car)RolceRoyce).getAverageYearlyMiles());
		
//		Initialize necessary variables for Building class

		assertEquals(0.0,((Building) greenHouse).getMonthlyElectricityKWH());
		((Building) greenHouse).setMonthlyElectricityKWH(135);
		assertEquals(135.0,((Building) greenHouse).getMonthlyElectricityKWH());
	
		
		
//		Initialize necessary variables for Bicycle class
		
		assertEquals(0.0, ((Bicycle)myBike).getTotalMiles());
		((Bicycle) myBike).setTotalMiles(48);
		
		assertEquals(48.0, ((Bicycle)myBike).getTotalMiles());

		
		for(CarbonFootPrint e: utilities) {
			assertNotNull(e);
			
			assertNotEquals(0, e.getCarbonFootPrint());
			
			System.out.printf("%sCarbonFootPrint: %.2f%n%n", e.toString(), e.getCarbonFootPrint());
			
		}
		
		
	}
	
	

}
