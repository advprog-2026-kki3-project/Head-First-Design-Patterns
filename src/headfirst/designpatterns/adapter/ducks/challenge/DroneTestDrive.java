package headfirst.designpatterns.adapter.ducks.challenge;

import headfirst.designpatterns.adapter.ducks.Turkey;
import headfirst.designpatterns.adapter.ducks.WildTurkey;

// turkey to duck
public class DroneTestDrive {
	public static void main(String[] args) {
		Turkey turkey = new WildTurkey();

		Drone drone = new SuperDrone();
		Turkey droneAdapter = new DroneToTurkeyAdapter(drone);

		System.out.println("The Drone says...");
		drone.beep();
		drone.spin_rotors();
		drone.take_off();

		System.out.println("\nThe Turkey says...");
		testTurkey(turkey);

		System.out.println("\nThe DroneToTurkeyAdapter says...");
		testTurkey(droneAdapter);
	}

	static void testDrone(Turkey turkey) {
		turkey.gobble();
		turkey.fly();
	}
}
