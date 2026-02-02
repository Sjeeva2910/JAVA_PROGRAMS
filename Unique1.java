public class Unique1 {
    public int firstUniqChar(String s) {
        for(int i=0;i<s.length();i++){
            char l=s.charAt(i);
            boolean unique=true;
            for(int j=0;j<s.length();j++){
                if(i!=j&&s.charAt(j)==l){
                    unique=false;
                    break;
                }
            }
            if(unique){
                return i;
            }
        }
        return -1;
    }
        public static void main(String args[]){
            String s="aabbcdd";
            Unique1 obj=new Unique1();
            int result=obj.firstUniqChar(s);
            System.out.println(result);
        } 
    
}
