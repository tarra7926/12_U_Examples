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
    
    public void selectionSort(int[] n){
        //go through the list
        for (int i = 0; i < n.length - 1; i++) {
            //minimum position
            int min = i;
            //go through looking for small
            for (int j = i + 1; j < n.length; j++) {
                if(n[min] > n[j]){
                    min = j;
                }
            }
            swap (n,i,min);
        }
        
    }
    
    public void insertionSort(int[] n){
        for (int i = 0; i < n.length - 1; i++) {
            int j = i + 1;
            //wjile something is out of position
            while(j > 0 && n[j] < n[j-1]){
                swap(n, j, j-1);
                j--;
            }
        }
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
    }
}
