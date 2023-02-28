package stringClassroomQuestions;

public class stringDemo1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//variable created at string pool
		String s = "hello";
		String s1 = "hello";
		// here s and s2 both refer to  same  address because the data is same in both the variables
		System.out.println(s);
		System.out.println(s == s1);
		System.out.println(s.equals(s1));
	//	------------------------------------
		//variable created at heap;
		String s2 = new String("hello");
		String s3 = new String("hello");
		System.out.println(s2);
	// s2 and s3 are created at different address in heap that is why false is displayed in console
		System.out.println(s2 == s1);
		System.out.println(s3 == s1);
		
		String s4 = s3;
		
//		
		

		
		System.out.println(s.charAt(2));
     	System.out.println(s1.length());
        System.out.println(equals(s, s2));
        System.out.println(equals(s, s1));// apna wala 
        //compare the content present in the given parameters
        System.out.println(s.equals(s1));//  java wala
        //== check the address of the given parameters
        System.out.println(s==s4);

	}
	
	public static boolean equals(String s1, String s2) {
		if(s1==s2) {
			return true;
		}
		if(s1.length()!=s2.length()) {
			return false;
		}
		for (int i = 0; i < s1.length(); i++) {
			if(s1.charAt(i)!=s2.charAt(i)) {
				return false;
			}
		}
		return true;
		
		
	}

}
