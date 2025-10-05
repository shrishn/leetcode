public class Solution{
    public static void main(String[] args){
        String s="abc",t="ahbgdc";
        boolean result=isSubsequence(s,t);
        String resultPrint=result?"True":"False";
        System.out.println(resultPrint);
    }
     public static boolean isSubsequence(String s, String t) {
        int i=0,j=0;
        while(i<s.length()&&j<t.length()){
            char charS=s.charAt(i);
            char charT=t.charAt(j);
            if(charS==charT){
                i++;j++;
            }
            else{
                j++;
            }
        }
        return i >= s.length();
    }
}