
public class StopState implements State {

    Rocket rocket;
	
	
	public StopState(Rocket rocket) {
		this.rocket = rocket;
	}

	
	@Override
	public void rocketstateOn() {
		System.out.println("Rocket Stop State On");
	}

	@Override
	public void rocketstateOff() {
		System.out.println("Rocket Stop State Off");

	}

}
