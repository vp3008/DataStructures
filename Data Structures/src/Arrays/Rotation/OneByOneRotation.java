package Arrays.Rotation;

import java.util.Arrays;
import java.util.Scanner;

public class OneByOneRotation {
    public static void main (String[] args){
        Scanner scan =  new Scanner (System.in);
        System.out.println ("Array length");
        int n = scan.nextInt ();
        int[] arr = new int[n];
        System.out.println ("Array Elements");
        for(int i=0;i<n;i++)
            arr[i] = scan.nextInt ();

        System.out.println ("Number of rotations");
        int d = scan.nextInt ();
        for(int i=1;i<=d;i++)
        {
            int last = arr[n-1];
            System.arraycopy (arr, 0, arr, 1, n - 2 + 1);
            arr[0]=last;
        }
        System.out.println (Arrays.toString (arr));
    }
}
