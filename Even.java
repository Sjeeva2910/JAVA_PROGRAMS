class Even {
    public int findNumbers(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            int num=nums[i];
            int numcount=0;
            while(num>0){
                numcount++;
                num=num/10;
            }
            if(numcount%2==0){
                count=count+1;
            }
        }
        return count;
    }
       
        public static void main(String args[]){
            int [] nums={12,34,56,101};
            Even obj=new Even();
            int result=obj.findNumbers(nums);
            System.out.println(result);
        }
}