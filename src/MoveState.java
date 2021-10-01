
public class MoveState implements State {

    Rocket rocket;
	
	
	public MoveState(Rocket rocket) {
		this.rocket = rocket;
	}

	@Override
	public void rocketstateOn() {
		System.out.println("Rocket Move State On");
	}

	@Override
	public void rocketstateOff() {
		System.out.println("Rocket Move State Off");

	}

}
