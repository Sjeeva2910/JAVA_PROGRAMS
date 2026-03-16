class Lengthsub{

    public int sumOddLengthSubarrays(int[] arr) {

        int result=0;

        for(int i=0;i<arr.length;i++){
            int sum=0;
            int length=0;

            for(int j=i;j<arr.length;j++){
                length=length+1;
                sum=sum+arr[j];

                if(length%2==1){
                    result=result+sum;
                }
            }
        }

        return result;
    }

    public static void main(String args[]){
        int arr[]={1,4,2,5,3};
        Lengthsub obj=new Lengthsub();
        int result=obj.sumOddLengthSubarrays(arr);
        System.out.println(result);
    }
}