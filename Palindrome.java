class Solution {
    public boolean isPalindrome(String s) {
        int left=0;
        int right=s.length()-1;
        while(left<right){
            char L=s.charAt(left);
            char R=s.charAt(right);
            if(!Character.isLetterOrDigit(L)){
                left++;
                continue;
            }
            if(!Character.isLetterOrDigit(R)){
                right--;
                continue;
            }
            if(Character.toLowerCase(L)!=Character.toLowerCase(R)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
public class Palindrome{
        public static void main(String args[]){
            String s="race a car";
            Solution obj=new Solution();
            boolean result=obj.isPalindrome(s);
            System.out.println(result);
        }
        
    
}