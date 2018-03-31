import java.util.Scanner;

public class Uzduotis6 {
	public static void main(String[] args) {
		Scanner klavetura = new Scanner(System.in);
		
		int i = klavetura.nextInt();
		
		
		if (0 <= i && i <=10) {
			
			System.out.println(i + " tarp 0 ir 10");
		}
		
         if (11 <= i && i <=20) {
			
			System.out.println(i + " tarp 11 ir 20");
			
	    }
         if (21 <= i && i <=30) {
 			
 			System.out.println(i + " tarp 21 ir 30");
 			
 	    }
         if (i > 30 ) {
 			
 			System.out.println(i + " daugiau nei 30");
 			
 	    }
         System.out.println("Ivesk spalva"); 
         klavetura = new Scanner(System.in);
         String spalva = klavetura.nextLine();
         
         if(spalva.equalsIgnoreCase("BLACK")) {
        	 System.out.println("You must be goth");
         }else if(spalva.equalsIgnoreCase("WHITE")){
        	 System.out.println("You are a very pure person");
        	 
         }else if(spalva.equalsIgnoreCase("RED")){
        	 System.out.println( "You are fun and outgoing" );
        	 
         }else if(spalva.equalsIgnoreCase("BLUE")){
            	 System.out.println( "You're not a Chelsea fan, are you" );
      }
	}
 }
