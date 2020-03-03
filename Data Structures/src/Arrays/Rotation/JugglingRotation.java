package Arrays.Rotation;

import java.util.Arrays;
import java.util.Scanner;

public class JugglingRotation {
    public static void main (String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println ("Array length");
        int n = scan.nextInt ();
        int[] array =  new int[n];
        System.out.println ("Array elements");
        for (int i=0;i<n;i++)
            array[i] = scan.nextInt ();
        System.out.println ("Number of rotations");
        int rotations = scan.nextInt ();

        rotateArray(array, n, rotations);
        System.out.println (Arrays.toString (array));
    }

    public static void rotateArray(int[] arr, int n, int k)
    {
        int gcd = findGcd (n, k);
        int temp, j, d;
        for(int i=0;i<gcd;i++)
        {
            temp = arr[i];
            j = i;
            while(true)
            {
                d = j + k;
                if(d >= n)
                    d -= n;
                if(d==i)
                    break;
                arr[j] = arr[d];
                j = d;
            }
            arr[j] =temp;
        }
    }

    public static int findGcd(int a, int b)
    {
        if(b==0)
            return a;
        return findGcd (b, a%b);
    }
}
