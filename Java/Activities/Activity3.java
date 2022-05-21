package Activities;

public class Activity3 {

	public static void main(String[] args) {
		double seconds=1000000000;
		
		double earthSeconds=31557600;
		double MercurySeconds = 0.2408467;
		double VenusSeconds = 0.61519726;
		double MarsSeconds = 1.8808158;
		double JupiterSeconds = 11.862615;
		double SaturnSeconds = 29.447498;
		double UranusSeconds = 84.016846;
		double NeptuneSeconds = 164.79132;		
		
		System.out.println("Age on earth"+seconds/earthSeconds);
		System.out.println("Age on Mercury"+seconds/earthSeconds/MercurySeconds);
		System.out.println("Age on Venus"+seconds/earthSeconds/VenusSeconds);
		System.out.println("Age on Mars"+seconds/earthSeconds/MarsSeconds);
		System.out.println("Age on Jupiter"+seconds/earthSeconds/JupiterSeconds);
		System.out.println("Age on Saturn"+seconds/earthSeconds/SaturnSeconds);
		System.out.println("Age on Uranus"+seconds/earthSeconds/UranusSeconds);
		System.out.println("Age on Neptune"+seconds/earthSeconds/NeptuneSeconds);

	}

}
