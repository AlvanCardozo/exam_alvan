package exam107;

public class vehicle_107 {
	String brand;
	int speed;
	
	vehicle_107(String brand,int speed){
		this.brand=brand;
		this.speed=0;
	}
	
	int decrease_speed(int decr) {
		this.speed= speed-decr;
		return speed;
	}
	
	public static void main(String[] args) {
		
	}

}
