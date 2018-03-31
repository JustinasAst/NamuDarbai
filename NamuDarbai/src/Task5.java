import java.util.Scanner;
public class Task5 {
	public static void main(String[] args) {
		
		
		String[] Menesiai = {"Sausis", "Vasaris", "Kovas", "Balandis", "Geguzis", "Birzelis", "Liepa", "Rugpjutis", "Rugsejis", "Spalis", "Lapkritis", "Gruodis" };
		
		System.out.println("Isviso menesiu yra " + Menesiai.length);
		System.out.println("Pirmas monuo yra " + Menesiai[0]);
		System.out.println("Paskutinis menuo yra " + Menesiai[Menesiai.length -1]);
		System.out.println("Irasykite menesi skaiciumi");
		 
	    Scanner scanner = new Scanner(System.in);  
	    int sk1 = scanner.nextInt(); 
	    
	    System.out.println(" Pasirinktas menuo yra " + Menesiai[sk1-1] );
	    System.out.println(" sekantis menuo yra " + Menesiai[sk1] );  
	    
	    int buvesMenuo = sk1 -2;
	    if (buvesMenuo < 0) {
	    	buvesMenuo = 12 + (sk1 -2);
	    }
	    System.out.println(" buves menuo yra " + Menesiai[buvesMenuo] );
	
	}

}
