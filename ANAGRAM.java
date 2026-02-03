import java.util.*;
class ANAGRAM {
    public boolean isAnagram(String s, String t) {
       char A[]=s.toCharArray();
       char B[]=t.toCharArray();
       Arrays.sort(A);
       Arrays.sort(B);
       if(Arrays.equals(A,B)){
        return true;
       }
       return false;
    }
        public static void main(String args[]){
            String s="listen";
            String t="silent";
            ANAGRAM obj=new ANAGRAM();
            boolean result=obj.isAnagram(s,t);
            System.out.println(result);
        }
}