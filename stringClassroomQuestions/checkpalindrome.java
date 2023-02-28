package stringClassroomQuestions;

public class checkpalindrome {
public static void main(String[] args) {
	System.out.println(check("nitin "));
}
public static boolean check(String str) {
	int i=0;
	int j=str.length()-1;
	
	while(i<j) {
		if(str.charAt(i)==str.charAt(j)) {
		return true;	
		}
		i++;
		j--;
	}
	return false;
}
	



}
