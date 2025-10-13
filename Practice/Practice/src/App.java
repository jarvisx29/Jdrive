
import java.util.Scanner;

 /*
 import java.util.Arrays;


class Matrix_generate
{
    public static void main(String[] args) 
    {
        int a[][]={{1,3,4},{3,4,5}};
        int b[][]={{1,3,4},{3,4,5}};         // put this in main folder exchange the wrong sum
        
        int c[][] = new int[a.length][a[0].length];

        for(int i = 0 ;i<a.length;i++)
        {
            //for(int j = 0 ;j<b.length;j++)   // remember this is wrong here use b[0].length since its 2x3 matrices ; this would have been fine if it was 3x3 cause everything is same
            for(int j = 0 ;j<b[0].length;j++)              
            {
                //System.out.println(arr[i][j]+ " ");
                c[i][j] = a[i][j] * b[i][j];
                System.out.println(c[i][j]);

            }
            //System.out.println();

            

        }
        // for(int i: c)
        // {
            System.out.println(Arrays.toString(c));
        // }
        
    }

}

*/


class App
{
    public static void main(String[] args) 
    {
        int a [][] = new int [3][3];

        Scanner scan = new Scanner(System.in);       // scan is basically obj1 here 

        for(int i=0;i<a.length;i++)         // loop for taking in user input
        {
            for(int j=0;i<a[0].length;j++)

            {
                System.out.println("enter array elements:");
                a[i][j] = scan.nextInt();
                

            }
            
        }
      System.out.println(" array elements are : ");
        for(int i=0;i<a.length;i++)         // loop for taking in printing user input
        {
            for(int j=0;i<a[0].length;j++)

            {
                
                System.out.println(a[i][j]);
                

            }
            System.out.println();
            
        }


        
        
    }
}