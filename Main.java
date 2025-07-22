import java.util.*;


class MergeSort {

    public static void merge(int arr[],int lb,int mid ,int ub){
        int B[] = new int[ub-lb+1];
        int i = lb;
        int j = mid+1;
        int k = 0;

        while(i <= mid && j <= ub) {
            if (arr[i] <= arr[j]) {
                B[k++] = arr[i++];
            } else {
                B[k++] = arr[j++];
            }
        }

        while(i <= mid){
            B[k++] = arr[i++];
        }
        while(j <= ub){
            B[k++] = arr[j++];
        }

        for(k = 0 , i = lb ; k< B.length ; k++,i++)
            arr[i] = B[k];
    }

    public static void mergeSort(int arr[] , int lb , int ub){
        if(lb >= ub){
            return;
        }
        else{
            int mid = lb + (ub-lb)/2;
            mergeSort(arr,lb,mid);
            mergeSort(arr,mid+1,ub);
            merge(arr,lb,mid,ub);
        }

    }

}



public class Main {
    public static void main(String args[]){
        int arr[] = {5,15,24,8,1,16,10,20};
        int n = arr.length;


        MergeSort.mergeSort(arr,0,n-1);

        for(int i =0 ;  i < n ; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
}
