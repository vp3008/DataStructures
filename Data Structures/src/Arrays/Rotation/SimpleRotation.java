package Arrays.Rotation;

import java.util.Arrays;
import java.util.Scanner;

public class SimpleRotation
{
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println ("Array size");
        int n = scan.nextInt ();
        int[] arr = new int [n];
        System.out.println ("Array Elements");
        for(int i=0;i<n;i++)
        {
            arr[i] = scan.nextInt ();
        }
        System.out.println ("Rotate by");
        int d = scan.nextInt ();
        rotateArray(arr, d);
        System.out.println (Arrays.toString (arr));
    }

    public static void rotateArray(int[] arr, int d)
    {
        int n = arr.length;
        int[] temp = new int[d];
        System.arraycopy (arr, 0, temp, 0, d);
        if (n - d >= 0) System.arraycopy (arr, d, arr, 0, n - d);
        System.arraycopy (temp, 0, arr, n-d, d);
    }
}
