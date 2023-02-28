package stringClassroomQuestions;

public class printingSubString {
public static void main(String[] args) {
	String str="Aditya";
//	System.out.println(subString(str));
	subString(str);
}
//public static String subString(String str) {
//	String ans="";
//	for(int i=0;i<str.length();i++) {
//		for(int j=i+1;j<str.length();j++) {
//			ans=ans+"\n"+str.substring(i,j);
//			
//		}
//	}
//	return ans;
//}

//printing subString


//}
public static void subString(String str) {
	for(int i=0;i<str.length();i++) {
		for(int j=i+1;j<str.length();j++) {
	System.out.println(str.substring(i,j));
			
		}
	}
}
}
