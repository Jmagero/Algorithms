import java.util.*;
class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
    int[] arr = {5,8,1,3,4};
    insertionSort(arr);
    printArray(arr);
  }

  public static int[] selectionSort(int[] arr){
    for(int i=0; i<arr.length; i++){
      int min = arr[i];
      for(int j = i+1; j < arr.length; j++){
        if(arr[j] < min){
          min = arr[j];
          int temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp;
        }
      }
      
    }
    return arr;

  }

  public static int[] insertionSort(int[] arr){
    for(int i = 0; i < arr.length; i++){
      int temp = arr[i];
      int j = i-1;
      while (j >= 0 && arr[j] > temp){
        arr[j+1] = arr[j];
        j--;
      }
      arr[j+1] = temp;
    }
    return arr;
  }

  
  public static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
 
}