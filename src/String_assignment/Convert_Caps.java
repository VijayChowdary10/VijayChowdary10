package String_assignment;

public class Convert_Caps {
	public static void main(String[] args) {
	    String string = new String("hello iam vijay");
	    char ch[] = new char[string.length()];
	    
	    for (int i = 0; i < string.length(); i++) {
	        ch[i] = string.charAt(i);
	        
	        if (ch[i] == ' ' && i + 1 < string.length()) {
	            ch[i + 1] = Character.toUpperCase(string.charAt(i + 1));
	            i++; // Skip the next character
	        }
	    }
	    ch[0]= Character.toUpperCase(string.charAt(0));
	    String str = new String(ch); // Convert char array to string
	    string =str;
	    System.out.println(string);
	}
}
