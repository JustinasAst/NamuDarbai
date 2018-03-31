
public class OperUzduotis2 {
	public static void main(String[] args) {
		int i = 45;
		
		System.out.println(padidinkIrGrazink(i));
		System.out.println(grazinkIrPadidink(i));
		System.out.println(i);

	}
	
	public static int padidinkIrGrazink(int i) {
		return ++i;
	}
	
	public static int grazinkIrPadidink(int i) {
		i++;
		return i;
	}

}
