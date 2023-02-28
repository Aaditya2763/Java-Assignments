package stringClassroomQuestions;

public class reverseString {
public static void main(String[] args) {
	String s=" This is a good    example         ";
	reverse(s);
}
public static void reverse(String str) {
    str=str.trim();
    // \s+ is a regex which is used to capture string/character after space 
    String []arr= str.split("\s+");
    for(int i=arr.length-1;i>=0;i--) {
    	System.out.print(arr[i]);
    }
    
    //loop to print character from last 
//    for(int i=str.length()-1;i>=0;i--) {
//    	System.out.print(str.charAt(i));
//    }
}
}
