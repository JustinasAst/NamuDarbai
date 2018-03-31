import java.util.Scanner;
public class Task4 {
	public static void main(String[] args) {
		System.out.println("Ivesti teksta didziosiomis raidemis");
		Scanner klavetura = new Scanner(System.in);
		String text = klavetura.nextLine();
		
		System.out.println(text.toUpperCase());
		System.out.println("Teksto ilgis: " + text.length());
		System.out.println("Paskutinis teksto zodis: " + text.substring(text.lastIndexOf(' ')));
		System.out.println("Visos raides a pakeisti i W: " + text.replace('a', 'W'));
		System.out.println(" Visas raides e pakeiciau i RAIDE: " + text.replace("e", "RAIDE") );

		String[] textParts = text.split(" ");
		String firstWord = textParts[0];
		textParts[0] = textParts[textParts.length - 1];
		textParts[textParts.length - 1] = firstWord;
		System.out.println("Sukeisti zodziai: " + String.join(" ", textParts));		
		
	}

}
