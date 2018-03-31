import java.util.Arrays;

public class Task12 {
    public static void main(String [] args) {
		
    	
    	int [] paversti = { 1,2,3 };
		
    	String n = arrayToString(paversti);
		
    	System.out.println(n);
	}
    
    public static String arrayToString(int[] array) {
    	
    	return Arrays.toString(array);
    	
    }
   
}

