
public class ValidateString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s =  "madam";
		boolean res = is_reve(s);
		System.out.println(res);

	}

	public static boolean is_reve(String s) {
		
		String sr = "";
		for(int i= s.length()-1;i>=0;i--) {
			sr+=s.charAt(i);
		}

return s.equals(sr);
	}
}
