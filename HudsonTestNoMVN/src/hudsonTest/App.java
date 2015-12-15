package hudsonTest;

public class App {

	public static void main(String[] args) {
		double fahr = 32;
		double celc = 100;
		celc = Fahreneit.convertFahrToCelcius(fahr);
		System.out.println("Result:"+fahr+" Fahreneit are "+celc+" celcius");
	}
}
