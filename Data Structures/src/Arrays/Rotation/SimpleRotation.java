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
        if(d>0)
            rotateArrayLeft(arr, d);
        if(d<0)
            rotateArrayRight(arr, -d);
        System.out.println (Arrays.toString (arr));
    }

    public static void rotateArrayLeft(int[] arr, int d)
    {
        System.out.println ("Left Rotation");
        int n = arr.length;
        int[] temp = new int[d];
        //copying the first 'd' elements into the temp array
        System.arraycopy (arr, 0, temp, 0, d);
        //shifting the last 'n-d' elements to the front 'd' positions
        if (n - d >= 0) System.arraycopy (arr, d, arr, 0, n - d);
        //copying the first 'd' elements back into the array
        System.arraycopy (temp, 0, arr, n-d, d);
    }

    public static void rotateArrayRight(int[] arr, int d)
    {
        System.out.println ("Right rotation");
        int n = arr.length;
        int[] temp = new int[d];
        //copying last 'd' elements into the temp array
        System.arraycopy (arr, n-d, temp, 0, d);
        //shifting forward the first 'n-d' elements by d positions
        System.arraycopy (arr, 0, arr, d, n-d);
        //copying back the elements from the temp array into the array
        System.arraycopy (temp, 0, arr, 0, d);

    }
}
