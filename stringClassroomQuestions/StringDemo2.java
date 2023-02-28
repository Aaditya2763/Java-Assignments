package stringClassroomQuestions;

public class StringDemo2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
// hard coded fixed values are called literals
		String s = "hello";
		//string +string always gives String
		s = s + "bye";
		//string +integer always gives String
		s=s+90;
		//string +char always gives String
		s=s+'a';
		System.out.println(s);
		
		String s1 = new String("hello");
		s1 = s1 + "bye";
		System.out.println(s1);

		//this will create at string pool having a particular address
		String s2 = "hello" + "bye";
		//s3 contains the address of s2
		String s3 = s2;
		//but here s2 is expended with okay sting  and its lead to create a new address for the s2 variable 
		//and the address of s2 created at line no 21 is different from the address create line no 26
		s2 = s2 + "okay";
		System.out.println(s2 == s3);
		System.out.println(s2);
		System.out.println(s3);

	}
}
