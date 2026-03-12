package headfirst.designpatterns.adapter.ducks.challenge;

import headfirst.designpatterns.adapter.ducks.Turkey;

public class DroneToTurkeyAdapter implements Turkey {
	Drone drone;

	public DroneToTurkeyAdapter(Drone drone) {
		this.drone = drone;
	}

	public void gobble() {
		drone.beep();
	}

	public void fly() {
		drone.spin_rotors();
		drone.take_off();
	}
}
