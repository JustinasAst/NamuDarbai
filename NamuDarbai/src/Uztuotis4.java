
public class Uztuotis4 {
	public static void main(String[] args) {
		boolean bl1 = 9 > 4;
		boolean bl2 = 7 > 45;
		boolean bl3 = 4 < 8;
		boolean bl4 = 1 == 9;
		boolean bl5 = 5 != 6;
		boolean bl6 = 8 > 4;
		
		if (bl1) {
			System.out.println("bl1");
		}
		
		if(bl2) {
			System.out.println("bl2");
		}
		
		if(bl3) {
			System.out.println("bl3");
		}
		if(bl4) {
			System.out.println("bl4");
		}
		if (bl5) {
			System.out.println("bl5");
		}
		if(bl6) {
			System.out.println("bl6");
		}
		
		int sk = 6;
		int sk2 = 7;
		
		if (sk == sk2) {
			System.out.println("lygios");
			
		}
		
		if (sk < sk2) {
			System.out.println("Pirma mazesne");
		}
		if(sk > sk2) {
			System.out.println("Pirma didesne");
			
		}
		
		if (sk <= sk2) {
			System.out.println("mazene arba lygu");
		}
		
		if (sk >=sk2) {
			System.out.println("didesne arba lygu");
		}
		
	}

}
