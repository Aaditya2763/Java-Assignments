package stringClassroomQuestions;

public class palindromeSubString {
public static void main(String[] args) {
	String str="nitin";
	System.out.println(str.length());
	palSubString(str);
}
public static boolean palindrome(String str) {
	int i=0;
	int j=str.length()-1;
	while(i<j) {
		if(str.charAt(i)!=str.charAt(j)) {
			return false;
		}
		i++;
		j--;
	}
	return true;
	
}
public static void palSubString(String str) {
 // we can also maintain the count globally
	int count=0;
	for(int i=0;i<str.length();i++) {
		//in string we can iterate a loop up to string length size
		for(int j=i+1;j<=str.length();j++) {
			
			String s1=str.substring(i,j);
	if(palindrome(s1)==true){
		System.out.println(s1);
		count++;
	}
			
		}
	}
	System.out.println(count);
}

}
