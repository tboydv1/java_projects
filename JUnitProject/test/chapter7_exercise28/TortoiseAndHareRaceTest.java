package chapter7_exercise28;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Random;

class TortoiseAndHareRaceTest {
		
	Tortoise ijapa;
	Hare myHare;
	RaceTrack everest;
	Clock raceClock;
	Random randomNumber;

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("Testing...");
		ijapa = new Tortoise();
		myHare = new Hare(); 
		everest = new RaceTrack();
		raceClock = new Clock();
		
		randomNumber = new Random();
		

		
		
		
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void tortoiseInitializedTest() {
		
		assertNotNull(ijapa);
		

		
		assertEquals(1, ijapa.getTortoisePosition());
		
	}
	
	@Test
	void hareInitializedTest() {
		
		assertNotNull(myHare);
		
		
		
		assertEquals(1, myHare.getHarePosition());
	}
	
	@Test
	void raceTrackInitializedTest() {
		
		assertNotNull(everest);
		assertEquals(80, everest.getTrackFloor().length);
		
	}
	
	@Test 
	void TortoiseFastPlodMoveTest() {
		
		raceClock.setTick(1);
		
		assertEquals(1, ijapa.getTortoisePosition());
		
		
		ijapa.setMyMove(raceClock);
		
		assertEquals(TortoiseMove.FastPlod ,ijapa.getMyMove());
		
		ijapa.move(everest);
		
		assertEquals(4, ijapa.getTortoisePosition());
		
		assertEquals(RaceStatus.T, everest.getTrackFloor()[ijapa.getTortoisePosition()]);
	}
	
	@Test 
	void TortoiseSlipMoveTest() {
		
		raceClock.setTick(6);
		
		ijapa.setTortoisePosition(10);
		
		assertEquals(10, ijapa.getTortoisePosition());
		
		ijapa.setMyMove(raceClock);
		
		assertEquals(TortoiseMove.Slip ,ijapa.getMyMove());
		
		ijapa.move(everest);
		
		assertEquals(4, ijapa.getTortoisePosition());
		
		assertEquals(RaceStatus.T, everest.getTrackFloor()[ijapa.getTortoisePosition()]);
	}
	
	@Test 
	void TortoiseSlowPlodMoveTest() {
		
		raceClock.setTick(8);
		
		ijapa.setTortoisePosition(10);
		
		assertEquals(10, ijapa.getTortoisePosition());
		
		ijapa.setMyMove(raceClock);
		
		assertEquals(TortoiseMove.SlowPlod ,ijapa.getMyMove());
		
		ijapa.move(everest);
		
		assertEquals(11, ijapa.getTortoisePosition());
		
		assertEquals(RaceStatus.T, everest.getTrackFloor()[ijapa.getTortoisePosition()]);
	}
	
	@Test 
	void TortoiseMoveOutsideRaceTrackTest() {
		
		raceClock.setTick(6);
		
		ijapa.setTortoisePosition(1);
		
		assertEquals(1, ijapa.getTortoisePosition());
		
		ijapa.setMyMove(raceClock);
		
		assertEquals(TortoiseMove.Slip ,ijapa.getMyMove());
		
		ijapa.move(everest);
		
		assertEquals(1, ijapa.getTortoisePosition());
		
		assertEquals(RaceStatus.T, everest.getTrackFloor()[ijapa.getTortoisePosition()]);
	}
	
	@Test 
	void HareMoveSleepTest() {
		
		raceClock.setTick(1);
		
		myHare.setHarePosition(1);
		
		assertEquals(1, myHare.getHarePosition());
		
		myHare.setHareMove(raceClock);
		
		assertEquals(HareMove.Sleep ,myHare.getHareMove());
		
		myHare.move(everest);
		
		assertEquals(1, myHare.getHarePosition());
		
		assertEquals(RaceStatus.H, everest.getTrackFloor()[myHare.getHarePosition()]);
	}
	
	@Test 
	void HareMoveBigHopTest() {
		
		raceClock.setTick(3);
		
		myHare.setHarePosition(1);
		
		assertEquals(1, myHare.getHarePosition());
		
		myHare.setHareMove(raceClock);
		
		assertEquals(HareMove.BigHop ,myHare.getHareMove());
		
		myHare.move(everest);
		
		assertEquals(10, myHare.getHarePosition());
		
		assertEquals(RaceStatus.H, everest.getTrackFloor()[myHare.getHarePosition()]);
	}
	
	@Test 
	void HareMoveBigSlipTest() {
		
		raceClock.setTick(5);
		
		myHare.setHarePosition(15);
		
		assertEquals(15, myHare.getHarePosition());
		
		myHare.setHareMove(raceClock);
		
		assertEquals(HareMove.BigSlip ,myHare.getHareMove());
		
		myHare.move(everest);
		
		assertEquals(3, myHare.getHarePosition());
		
		assertEquals(RaceStatus.H, everest.getTrackFloor()[myHare.getHarePosition()]);
	}
	
	@Test 
	void HareMoveSmallHopTest() {
		
		raceClock.setTick(6);
		
		myHare.setHarePosition(15);
		
		assertEquals(15, myHare.getHarePosition());
		
		myHare.setHareMove(raceClock);
		
		assertEquals(HareMove.SmallHop ,myHare.getHareMove());
		
		myHare.move(everest);
		
		assertEquals(16, myHare.getHarePosition());
		
		assertEquals(RaceStatus.H, everest.getTrackFloor()[myHare.getHarePosition()]);
	}
	
	@Test 
	void HareMoveSmallSlipTest() {
		
		raceClock.setTick(9);
		
		myHare.setHarePosition(15);
		
		assertEquals(15, myHare.getHarePosition());
		
		myHare.setHareMove(raceClock);
		
		assertEquals(HareMove.SmallSlip ,myHare.getHareMove());
		
		myHare.move(everest);
		
		assertEquals(13, myHare.getHarePosition());
		
		assertEquals(RaceStatus.H, everest.getTrackFloor()[myHare.getHarePosition()]);
	}
	
	@Test 
	void HareMoveOutSideRaceTrackTest() {
		
		raceClock.setTick(9);
		
		myHare.setHarePosition(1);
		
		assertEquals(1, myHare.getHarePosition());
		
		myHare.setHareMove(raceClock);
		
		assertEquals(HareMove.SmallSlip ,myHare.getHareMove());
		
		myHare.move(everest);
		
		assertEquals(1, myHare.getHarePosition());
		
		assertEquals(RaceStatus.H, everest.getTrackFloor()[myHare.getHarePosition()]);
	}

	@Test
	void clockTickTortoiseMoveTest() {
		
		assertNotNull(raceClock);
		
		raceClock.setTick(1);
	
		ijapa.setMyMove(raceClock);
		
		assertEquals(TortoiseMove.FastPlod, ijapa.getMyMove());
		
		raceClock.setTick(2);
		
		ijapa.setMyMove(raceClock);
		
		assertEquals(TortoiseMove.FastPlod, ijapa.getMyMove());
		
		raceClock.setTick(3);
		
		ijapa.setMyMove(raceClock);
		
		assertEquals(TortoiseMove.FastPlod, ijapa.getMyMove());
		
		
		raceClock.setTick(4);
		
		ijapa.setMyMove(raceClock);
		
		assertEquals(TortoiseMove.FastPlod, ijapa.getMyMove());
		
		raceClock.setTick(5);
		
		ijapa.setMyMove(raceClock);
		
		assertEquals(TortoiseMove.FastPlod, ijapa.getMyMove());
		
		raceClock.setTick(6);
		
		ijapa.setMyMove(raceClock);
		
		assertEquals(TortoiseMove.Slip, ijapa.getMyMove());
		
		raceClock.setTick(7);
		
		ijapa.setMyMove(raceClock);
		
		assertEquals(TortoiseMove.Slip, ijapa.getMyMove());
		
		raceClock.setTick(8);
		
		ijapa.setMyMove(raceClock);
		
		assertEquals(TortoiseMove.SlowPlod, ijapa.getMyMove());
		
		raceClock.setTick(9);
		
		ijapa.setMyMove(raceClock);
		
		assertEquals(TortoiseMove.SlowPlod, ijapa.getMyMove());
	
		raceClock.setTick(10);
		
		ijapa.setMyMove(raceClock);
		
		assertEquals(TortoiseMove.SlowPlod, ijapa.getMyMove());
	}
	
	@Test
	void clockTickHareMoveTest() {
		
		assertNotNull(raceClock);
		
		raceClock.setTick(1);
	
		myHare.setHareMove(raceClock);
		
		assertEquals(HareMove.Sleep, myHare.getHareMove());
		
		raceClock.setTick(2);
		
		myHare.setHareMove(raceClock);
		
		assertEquals(HareMove.Sleep, myHare.getHareMove());
		
		raceClock.setTick(3);
		
		myHare.setHareMove(raceClock);
		
		assertEquals(HareMove.BigHop, myHare.getHareMove());
		
		raceClock.setTick(4);
		
		myHare.setHareMove(raceClock);
		
		assertEquals(HareMove.BigHop, myHare.getHareMove());
		
		raceClock.setTick(5);
		
		myHare.setHareMove(raceClock);
		
		assertEquals(HareMove.BigSlip, myHare.getHareMove());
		
		raceClock.setTick(6);
		
		myHare.setHareMove(raceClock);
		
		assertEquals(HareMove.SmallHop, myHare.getHareMove());
		
		raceClock.setTick(7);
		
		myHare.setHareMove(raceClock);
		
		assertEquals(HareMove.SmallHop, myHare.getHareMove());
		
		raceClock.setTick(8);
		
		myHare.setHareMove(raceClock);
		
		assertEquals(HareMove.SmallHop, myHare.getHareMove());
		
		raceClock.setTick(9);
		
		myHare.setHareMove(raceClock);
		
		assertEquals(HareMove.SmallSlip, myHare.getHareMove());
		
		raceClock.setTick(10);
		
		myHare.setHareMove(raceClock);
		
		assertEquals(HareMove.SmallSlip, myHare.getHareMove());
		
		
		
		
	}
	
	@Test 
	void AminalRaceSimulation() {
		
		while(myHare.getHarePosition() < 70 && ijapa.getTortoisePosition() < 70) {
			
			raceClock.setTick(1 + randomNumber.nextInt(10));
			
			myHare.setHareMove(raceClock);
			ijapa.setMyMove(raceClock);
			myHare.move(everest);
			ijapa.move(everest);
			
			displayRaceStatus();

			
			System.out.println();
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		
		System.out.println(myHare.getHarePosition() +" "+ ijapa.getTortoisePosition());
		
		
	}
	
	public void displayRaceStatus() {
		
		for(int i = 0; i < everest.getTrackFloor().length; i++) {
			
			
			if(everest.getTrackFloor()[i] == RaceStatus.T && everest.getTrackFloor()[i] == RaceStatus.H) {
				
				System.out.print("OUCH");
				
			}
			else if(everest.getTrackFloor()[i] == RaceStatus.H) {
				
				System.out.print("H");
				
			}
			else if(everest.getTrackFloor()[i] == RaceStatus.T) {
				System.out.print("T");
			}
			else
				System.out.print("_");
			
			everest.getTrackFloor()[i] = null;
			
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
