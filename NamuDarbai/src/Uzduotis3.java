
public class Uzduotis3 {
	public static void main(String[] args) {
		
		 char raide = 'A';
		 char raide2 = 'B';
		 byte dviduris = 2;
		 byte keturduris = 4;
		 short jaunas = 20;
		 short senas = 70;
		 int desimtukas = 10;
		 int vienuoliktukas = 11;
		 long daugVienetu = 11111111;
		 long daugDvejetu = 22222222;
		 float suRaide = 3.4f;
		 float suRaide1 = 4.3f; 
		 double suKableliu = 4.2;
		 double suKableliu2 = 5.3;
		 
		 boolean raidziuPalyginimas = raide == raide2;
		 System.out.println(raidziuPalyginimas);
		 
		 boolean autoDurys = dviduris < keturduris;
		 System.out.println(autoDurys);
		 
		 boolean amzius = jaunas > senas;
		 System.out.println(amzius);
		 
		 boolean skaicius = desimtukas != vienuoliktukas;
		 System.out.println(skaicius);
		 
		 boolean skaiciai = daugVienetu < daugDvejetu;
		 System.out.println(skaiciai);
		 
		 boolean floatas = suRaide >= suRaide1;
		 System.out.println(floatas);
		 
		 boolean double1 = suKableliu < suKableliu2;
		 System.out.println(double1);
		 
		 
	}

}
