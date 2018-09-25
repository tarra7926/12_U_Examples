package grade12examples;

import java.util.Scanner;

/**
 *
 * @author tarra7926
 */
public class MaximizeRecursion {

    public int mostSugar(int index, int[] pies) {
        //if you have gone through everything
        if (index >= pies.length) {
            return 0;
        }
        // eat the pie or not
        int eatPie = pies[index] + mostSugar(index + 2, pies);
        int leavePie = mostSugar(index + 1, pies);
        //which is better
        if (eatPie > leavePie) {
            return eatPie;
        } else {
            return leavePie;
        }
    }

    public int combin(int index, int[] people, int groupSize) {
        //I hace formed a group
        if (groupSize == 0) {
            return 1;
        }

        //ran out of people
        if (index >= people.length) {
            return 0;
        }
        int using = combin(index + 1, people, groupSize - 1);
        int notUsing = combin(index + 1, people, groupSize);
        
        return using + notUsing;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //a variable to test the method
        MaximizeRecursion test = new MaximizeRecursion();
        //a scanner for user input
        Scanner input = new Scanner(System.in);

        int[] pies = {13, 34, 22, 3, 25};
        int best = test.mostSugar(0, pies);
        System.out.println("Most Sugar " + best);
        int[] people = {1, 2, 3, 4};
        int groups = test.combin(0, people, 2);
        System.out.println("num groups" + groups);
    }
}
