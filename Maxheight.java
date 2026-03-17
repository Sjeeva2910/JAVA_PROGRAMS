class Maxheight {

    public int largestAltitude(int[] gain) {

        int height = 0;
        int max = 0;

        for(int i=0;i<gain.length;i++){

            height = height + gain[i];

            if(height > max){
                max = height;
            }
        }

        return max;
    }

    public static void main(String args[]){

        int gain[] = {-5, 1, 5, 0, -7};

        Maxheight obj = new Maxheight();

        int result = obj.largestAltitude(gain);

        System.out.println(result);
    }
}