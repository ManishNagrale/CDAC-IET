package demo2;
import java.util.Date;

public class TestVehicle {

	public static void main(String[] args) {
		Vehicle v1=new Vehicle(1,"Bhushan","4 wheeler",new Date());
		System.out.println(v1);
		Vehicle v2=new Vehicle(12,"Mayur","2 wheeler",new Date());
		System.out.println(v2);
	}

}
