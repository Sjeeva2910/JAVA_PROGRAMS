class LowerCase {
    public String toLowerCase(String s) {
        String lowercase="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            lowercase=lowercase+Character.toLowerCase(ch);
        }
        return lowercase;
    }
        public static void main(String args[]){
            String s="Dhanush";
            LowerCase obj=new LowerCase();
            String result=obj.toLowerCase(s);
            System.out.println(result);
        }
        
}