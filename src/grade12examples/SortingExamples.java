package grade12examples;

import java.util.Scanner;

/**
 *
 * @author tarra7926
 */
public class SortingExamples {

    public void swap(int[] n, int pos1, int pos2) {
        int temp = n[pos1];
        n[pos1] = n[pos2];
        n[pos2] = temp;
    }

    public void bubbleSort(int[] n) {
        //have we swapped something
        boolean swap = true;
        //keep going if we have swapped
        while (swap) {
            //asssume we didn't swap
            swap = false;

            //go dowwn the list looking for swaps
            for (int i = 0; i < n.length - 1; i++) {
                //do we have to swap those pairs
                if (n[i] > n[i + 1]) {
                    swap(n, i, i + 1);
                    //let it know you swapped
                    swap = true;
                }
            }
        }
    }

    public void selectionSort(int[] n) {
        //go through the list
        for (int i = 0; i < n.length - 1; i++) {             //n-1
            //minimum position 
            int min = i;                                     //1
            //go through looking for small
            for (int j = i + 1; j < n.length; j++) {         //n
                if (n[min] > n[j]) {                           //1
                    min = j;                                 //1
                }
            }
            swap(n, i, min);                                  //3
        }

    }

    public void insertionSort(int[] n) {
        for (int i = 0; i < n.length - 1; i++) {
            int j = i + 1;
            //while something is out of position
            while (j > 0 && n[j] < n[j - 1]) {
                swap(n, j, j - 1);
                j--;
            }
        }
    }

    public int linearSearch(int num, int[] n) {
        for (int i = 0; i < n.length; i++) {
            if (n[i] == num) {
                return 1;
            }
        }
        return -1;
    }

    public int binarySearch(int num, int[] n) {
        int start = 0;
        int end = n.length;
        while(start <= end){
            int mid = (start + end)/2;
            if(mid == num){
                return mid;
            }else if(n[num] < num){
                start = mid + 1;
            }else{
                end = mid;
            }
            
        }
        return -1;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // A scanner for user input
        Scanner input = new Scanner(System.in);
        //arrray of ten numbers
        int[] nums = new int[10];

        //randomly assign values
        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int) (Math.random() * 101);
        }
        SortingExamples test = new SortingExamples();
        System.out.println("before");
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);

        }
        test.insertionSort(nums);
        System.out.println("after");
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);

        }
        int location = test.binarySearch(5, nums);
        if(location !=-1){
            System.out.println("Found at" + location);
        }else{
            System.out.println("not found");
        }
    }
}
