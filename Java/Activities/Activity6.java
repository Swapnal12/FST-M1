package Activities;

public class Activity6 {

	public static void main(String[] args) throws InterruptedException {

    Plane plane=new Plane(10);
    plane.onboard("John");
    plane.onboard("steve");
    plane.onboard("Anna");
    
    System.out.println("Plane took off at :"+plane.takeOff());
    
    System.out.println("People on the plane :"+plane.getPassesngers());
    
    Thread.sleep(5000);
    
    plane.land();
    
    System.out.println("Plane Landed at :" +plane.getLastTimeLanded());
    
    System.out.println("People on plane after landing :" +plane.getPassesngers());
    

	}

}
