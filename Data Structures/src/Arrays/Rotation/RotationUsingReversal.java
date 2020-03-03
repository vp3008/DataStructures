package Arrays.Rotation;

import java.util.Arrays;
import java.util.Scanner;

public class RotationUsingReversal {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println ("Array length");
        int length = scan.nextInt ();

        int[] array = new int [length];

        System.out.println ("Elements");
        for(int i=0;i<length;i++)
            array[i] = scan.nextInt ();

        System.out.println ("Number of rotations");
        int rotations = scan.nextInt ();

        rotateArray (array, length, rotations);

        System.out.println (Arrays.toString (array));
    }

    public static void reverse(int[] array, int start, int last)
    {
        int temp;
        while(start < last)
        {
            temp = array[start];
            array[start] = array[last];
            array[last] = temp;
            start++;
            last--;
        }
    }

    public static void rotateArray(int[] array, int length, int rotations)
    {
        if(rotations == 0)
            return;
        reverse(array, 0, rotations-1);
        reverse (array, rotations, length-1);
        reverse (array, 0 ,length-1);
    }
}
