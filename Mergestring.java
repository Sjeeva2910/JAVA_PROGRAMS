class Mergestring {
    public String mergeAlternately(String word1, String word2) {
        String result="";
        int i=0;
        while(i<word1.length()||i<word2.length()){
            if(i<word1.length()){
                result=result+word1.charAt(i);
            }
            if(i<word2.length()){
                result=result+word2.charAt(i);
            }
            i++;
        }
        return result;
    }
        public static void main(String args[]){
            String word1="abc";
            String word2="efg";
            Mergestring obj=new Mergestring();
            String result=obj.mergeAlternately(word1,word2);
            System.out.println(result);
        }
}