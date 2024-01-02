package general_assignment;

public class smallestOf_array {
	public static void main(String[] args) {
        int[] array = {23, 45, 12, 46, 67, 11};
        int smallest=array[0];
         for(int i=0; i<array.length; i++) {
        	 if(array[i]<smallest) {
        		 smallest=array[i];
        	 }
         }
           System.out.println(smallest);
	}
}
