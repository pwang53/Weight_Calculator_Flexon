/**
 * Contributor: Peiqi Wang
 * Github: https://github.com/pwang53
 * Date: 06/29/2020
 *
 * Convert a given number of pounds to kilograms
 * 1. Create a variable to store the 100 pounds
 * 2. Calculate the number of Kilograms for the number 100 pounds and store in a variable.
 * 3. Print out the result.
 *
 * NOTES: 1 pound is equal to 0.45359237 kilograms.
 **/

package Calculator;
import java.util.*;

public class ProjectMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float standardPound = 100;
        float standardKilograms = 45.35927f;
        float ratio = standardKilograms / standardPound;
        float input = 0;

        System.out.println("Weight Calculator: Convert pounds to kilograms");
        System.out.println("Please Input pounds: ");
        try {
            input = sc.nextFloat();
        } catch (Exception e) {
            System.out.println("Please Input only numbers, exit the app and retry");
        }

        float afterCalculated = input * ratio;
        System.out.println(input + " pounds = " + afterCalculated + " kilograms");

    }
}
