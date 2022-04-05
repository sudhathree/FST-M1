package activities;

public class Activity1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Car c= new Car();
		c.colour= "Black";
		c.make= 2014;
		c.transmission="Manual";
		System.out.println("Different variables from class are: "+ c.colour + " "+c.doors+" "+ c.make+" " +c.transmission+" "+c.tyres );
		c.displayCharacteristics();
		c.acceralate();
		c.brake();
	}

}
