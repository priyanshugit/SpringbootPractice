package ArrayPrograms;

public class FindMinMax {
    public static void main(String[] args) {
        int[] arr = {20, 10, 40, 30, 50, 60};
        findMinMax(arr);
    }
    public static void findMinMax(int[] a)
    {
        int max = a[0];
        int min = a[0];
        for(int i=1; i<a.length; i++){
            if(a[i]>max){
                max = a[i];
            } else if (a[i]<min) {
                min = a[i];
            }
        }
        System.out.println("Max: "+max);
        System.out.println("Min: "+min) ;
    }
}
