package BasicSorting;

public class SelectionSort {
    public static void main(String[] args) {
        int a[]={1,2,0,9,-6,8};
        int n=a.length;
        int minindex=-1;
        for(int i=0; i<n-1; i++){
            int min =Integer.MAX_VALUE;
            int mindex=-1;
            for(int j=i; j<n; j++){
                if(a[j]<min){
                    min=a[j];
                    minindex=j;
                }
            }
            int temp = a[i];
            a[i]=a[minindex];
            a[minindex]=temp;
        }
        for(int ele:a){
            System.out.print(ele+" ");
        }
    }
}
