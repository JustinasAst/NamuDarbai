import java.util.Scanner;
public class Task3 {
	public static void main(String[] args) {
		Scanner klavetura = new Scanner(System.in);
		
		int  sk1, sk2, sk3, sk4, sk5, ats;
		
		System.out.println("Iveskite pirma skaiciu");
		sk1 = klavetura.nextInt();
		
		System.out.println("Iveskite antra skaiciu");
		sk2 = klavetura.nextInt();
		
		System.out.println("Iveskite trecia skaiciu");
		sk3 = klavetura.nextInt();
		
		System.out.println("Iveskite ketvirta skaiciu");
		sk4 = klavetura.nextInt();
		
		System.out.println("Iveskite penkta skaiciu");
		sk5 = klavetura.nextInt();
		
		ats = sk1 + sk2 + sk3 + sk4 + sk5;
		
		System.out.println("Penkiu pasirinktu skaitmenu suma yra " + ats);
		
		
	}
	
}
