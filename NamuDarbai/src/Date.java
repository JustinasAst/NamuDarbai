import java.util.Scanner;
public class Date {
	public static void main(String[] args) {
				
		double diena = 1440;
		double metai = 525600;

		System.out.println("Irasykite minuciu skaiciu");
		Scanner klavetura = new Scanner(System.in);
		double minute = klavetura.nextDouble();
		
		System.out.println(minute / diena + " dienos");
		System.out.println(minute / metai + " metai");

	}
	

}
