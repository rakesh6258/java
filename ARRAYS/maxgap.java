import java.util.Arrays;

public class maxgap {
    public static void main(String args[]){
        int[] arr1={3,6,9,1};
        System.out.println(maxgapp(arr1));
    }
    static int maxgapp(int[] arr2){
        if(arr2 ==null || arr2.length<2){
            return 0;
        }
        else{
            Arrays.sort(arr2);
            int maxgap=0;
            for(int i=1;i<arr2.length;i++){
                int gap=arr2[i]-arr2[i-1];
                if(gap>maxgap){
                    maxgap=gap;
                }
            }
            return maxgap;
        }
    }
}