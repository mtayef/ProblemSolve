package algorithmLearn; 

class  LongestCommonSubsequence 
{ 
	public static String lcs(String a, String b){
	    int aLen = a.length();
	    int bLen = b.length();
	    if(aLen == 0 || bLen == 0){
	        return "";
	    }else if(a.charAt(aLen-1) == b.charAt(bLen-1)){
	        return lcs(a.substring(0,aLen-1),b.substring(0,bLen-1))
	            + a.charAt(aLen-1);
	    }else{
	        String x = lcs(a, b.substring(0,bLen-1));
	        String y = lcs(a.substring(0,aLen-1), b);
	        return (x.length() > y.length()) ? x : y;
	    }
	}
      
    // driver program 
    public static void main (String[] args)  
    { 
        String X = "AGGTAB"; 
        String Y = "GXTXAYB"; 
        
        System.out.println(lcs(X, Y)); 
    } 
} 
