package Activities;

public class Cycle implements BicycleParts ,BicycleOperations{
	
	public int gears;
	public int currentspeed;
	public Cycle(int gears, int currentspeed) {
		super();
		this.gears = gears;
		this.currentspeed = currentspeed;
	}
	
	@Override
	public void applyBrake(int decrement) {
		
		currentspeed=currentspeed-decrement;
		System.out.println("Current speed :" +currentspeed);
	}
	@Override
	public void speedUp(int increment) {
		currentspeed=currentspeed+increment;
		System.out.println("Current speed :" +currentspeed);
		
	}
	public String bicycleDesc() {
	    return("No of gears are "+ gears + "\nSpeed of bicycle is " + currentspeed);
	}
	

	
	}

class MountainBike extends Cycle
{
	public int seatHeight;

	public MountainBike(int gears, int currentspeed, int startHeight) {
		super(gears, currentspeed);
		seatHeight=startHeight;
	}
	
	public void setHeight(int newValue) {
        seatHeight = newValue;
    }

    public String bicycleDesc() {
        return (super.bicycleDesc()+ "\nSeat height is " + seatHeight);
    } 
	
}
	
	


