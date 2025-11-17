import java.util.HashSet;
class ContainsDuplicate {

    public boolean containsDuplicate(int[] nums){
        HashSet<Integer> arr=new HashSet<>();
        for(int i:nums){
            if(arr.contains(i)){
                return true;
            }
            else{
                arr.add(i);  
            }
        }
        return false;
    }


        public static void main(String args[]){
            ContainsDuplicate obj=new ContainsDuplicate();
            int nums[]={1,2,3,1};
            boolean result=obj.containsDuplicate(nums);
            System.out.println(result);

        }
}
