package february13;

import java.util.Arrays;
import java.util.Collections;

public class ChallengeForLoop {
    public static void main(String[] args) {

        int[] myArray5 = {1, 5, 3, 9, 8, 16, 7, 8, 49, 3, 1, 3};

        // change primitive integer array in integer Wrapper use stream() method and boxed() method
        Integer[] numb = Arrays.stream(myArray5).boxed().toArray(Integer[]::new);

        // find the max number in collection use method asList
        System.out.println(Collections.max(Arrays.asList(numb)));

        System.out.println(" ");
        System.out.println(" ");

        // add new idea for solved problem
        int position = 0;
        int max = 0;
        for (int index = 0; index < myArray5.length; index++){
            if (myArray5[index] > max){
                max = myArray5[index];
                position = index;
            }
        }
        System.out.println("Max number from array is: " + max + " and index is: " + position);
    }
}
