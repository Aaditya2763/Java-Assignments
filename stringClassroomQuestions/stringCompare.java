package stringClassroomQuestions;

public class stringCompare {
public static void main(String[] args) {
	String s1="abc";
	String s2="abc";
	char a1='a';
	char a2='a';

	//this will give integer value
	System.out.println(a2-a1);
//	inbuilt java function to compare string
	System.out.println(s1.compareTo(s2));
	System.out.println(compare(s1, s2));
	
}
public static int compare(String s1,String s2) {
	int len = Math.min(s1.length(), s2.length());
	for (int i = 0; i < len; i++) {
		if (s1.charAt(i) != s2.charAt(i)) {
			return s1.charAt(i) - s2.charAt(i);
		}
	}
	return s1.length() - s2.length();

}

}
