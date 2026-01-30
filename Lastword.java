public class Lastword {
    public int lengthOfLastWord(String s) {
        int result=0;
        String words[]=s.split(" ");
        for(int i=words.length-1;i>=0;i--){
            String word=words[i];
            if(!s.trim().isEmpty()){
              result=word.length();
              return result;
            }
        }
        return 0;
    }
        public static void main(String args[]){
            Lastword obj=new Lastword();
            String s="i will place";
            int result=obj.lengthOfLastWord(s);
            System.out.println(result);
        }  
}
    

