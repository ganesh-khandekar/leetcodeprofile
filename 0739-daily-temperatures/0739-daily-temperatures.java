class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int i=0,j=1,current=0;
        int[] arr = new int[temperatures.length];

        while(i<temperatures.length){
            if(current==temperatures[i]){
                if((arr[i-1]-1)<=0){
                arr[i]=0;
                }else{
                    arr[i]=arr[i-1]-1;
                }
                 i++;
                j=i+1;
            }
            else if(j==temperatures.length){
                current=temperatures[i];
                arr[i]=0;
                i++;
                j=i+1;
            }else if(temperatures[i]<temperatures[j]){
                current=temperatures[i];
                arr[i]=j-i;
                i++;
                j=i+1;
            }else{
                j++;
            }
        }
        return arr;
    }
}