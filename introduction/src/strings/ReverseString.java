package strings;

public class ReverseString{
	public static void main(String[] args) {
		
		
		String a = "the sky is blue";
		
		 int i  = a.length() - 1;
		 String ans = "";
		 
		 while(i >= 0){
		 
		 while(i >= 0 && a.charAt(i) == ' ') i--;
		 
		 int j = i;
		 if(i < 0) break;
		 
		 while(i >= 0 && a.charAt(i) != ' ') i--;
		 
		 if(ans.isEmpty()){
		 ans = ans.concat(a.substring(i+1, j+1));
		 }else{
		 ans = ans.concat("  " +a.substring(i+1, j+1));
		 }
		 }
		 return ans;
}

}