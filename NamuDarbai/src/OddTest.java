import java.util.Scanner;

public class OddTest {

	public static void main(String args[]) {
		
		int number;
		System.out.println("Irasyk skaiciu ");
		Scanner klavetura = new Scanner(System.in);
		number = klavetura.nextInt();

		boolean answer = isOdd(number);
		System.out.println(answer);
	}
	public static boolean isOdd(int number) {
		return number % 2 != 0;
	}

}
