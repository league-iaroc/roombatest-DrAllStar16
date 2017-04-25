package level2;

import level1.Sonar;
import processing.core.PApplet;

public class Challenge extends Head {
	Roomba roomba;
	
	static int speed = 500;

	public static void main(String[] args) {
		PApplet.main("level2.Processing");
	}

	public Challenge(Roomba roomba) {
		super(roomba);
		Sonar sonar = new Sonar(roomba);
	}

	public void initialize() {

	goStraight(3000);
	
}


	

	public void loop() {
	
	}
	private void goStraight(int howlong){
		driveDirect(speed,speed);
		sleep(howlong);
		
		
	}
	
	}
                                
