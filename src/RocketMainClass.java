
public class RocketMainClass {

	public static void main(String[] args) {
	
	Rocket r = new Rocket();
	r.setState(new LaunchState(r));
	r.rocketstateOff();
	r.rocketstateOn();
	
	r.setState(new GroundState(r));
	r.rocketstateOff();
	r.rocketstateOn();
	
	r.setState(new MoveState(r));
	r.rocketstateOff();
	r.rocketstateOn();
	
	r.setState(new StopState(r));
	r.rocketstateOff();
	r.rocketstateOn();
	
	}
	
}