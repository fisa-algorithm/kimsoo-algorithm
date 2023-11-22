package algoritm;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader; 


public class prog1{
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String str; 
		while ((str = reader.readLine()) != null) 
		{       
			int cntp = 0;
			int cnty = 0;
			
			for(int i = 0; i<str.length() ;i++) {
				if(str.charAt(i)=='p' || str.charAt(i)=='P') {
					cntp++;
				}
				else if(str.charAt(i)=='y' || str.charAt(i)=='Y') {
					cnty++;
				}
			}
			
			if(cntp==0&&cnty==0)
				System.out.println("true");
			else if(cntp==cnty)
				System.out.println("true");
			else
				System.out.println("false");
			System.out.println(cntp);
			System.out.println(cnty);
		}
		
	}
}


//프로그래머스
//class Solution {
//    boolean solution(String s) {
//        boolean answer = true;
//		      
//			int cntp = 0;
//			int cnty = 0;
//			
//			for(int i = 0; i<s.length() ;i++) {
//				if(s.charAt(i)=='p' || s.charAt(i)=='P') {
//					cntp++;
//				}
//				else if(s.charAt(i)=='y' || s.charAt(i)=='Y') {
//					cnty++;
//				}
//			}
//			
//			if(cntp==0&&cnty==0)
//				answer=true;
//			else if(cntp==cnty)
//				answer=true;
//			else
//				answer=false;
//		
//
//        return answer;
//    }
//}