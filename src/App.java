
import java.util.Scanner;

















   /* 
    public static void main (String [] args)       // vowel program
    {
         char ch= 'x';
        switch (ch)                               
        {                                          //first program of 2025 keep goin mano :)
            case 'a':
            System.out.println("vowel ");
            break;
            case 'e':
            System.out.println("vowel ");
            break;
            case 'i':
            System.out.println("vowel ");
            break;
            case 'o':
            System.out.println("vowel ");
            break;
            case 'u':
            System.out.println("vowel ");
            break;

            default :
            System.out.println("its a consonant");

      

        }



 
    }
}


public static void main (String args[])
{
    int n = 5;                             //factorial of a number
    int factorial=1;
    for(int i=1;i<=n;i++)
    {
        factorial= factorial*i;
        
    }
    System.out.println(factorial);
}
}

public static void main (String args[])
{
    for(int i=1;i<=5;i++)                                 // simple pattern program (right triangle)
    {
        for(int j=1;j<=i;j++)
        {
            System.out.print(" *");
        }
        System.out.println();
    }
}
}

public static void main (String args[])
{
    for(int i=5;i>=1;i--)                   // simple pattern program ( ulta inverted right triangle)
    {
        for(int j=1;j<=i;j++)
        {
            System.out.print(" *");
        }
        System.out.println();
    }
}
}


public static void main (String args [])
{
    int factorial = 1;
    int i=1;
    while( i<=5)                              //facorial using while loop (while loop basics)
    {
        factorial = factorial *i;
        i++;

    }
     System.out.println(factorial);

}
}
public static void main (String args [])
{
    int i=1;

    while(i<=10)
    {
        int j=1;
        while(j<=10)                                 //multiplication table using while loop
        {
            
            System.out.print(i*j + " ");  //multiplies each possibiltily per row i*j
            j++;
        }
        System.out.println();
        i++;
    }

   
}
}


class Employee 
{
    int age;
    String  name ;


void insert(int a, String  n)
{
     age= a;
     name =n; 
}

void display () {System.out.println(age + name);  }

}
class Main 
{
    public static void main (String args [])
    {

    
    Employee obj1 =new Employee();
    obj1.insert(20," Mano");
    obj1.display();
    }
}

class Rectangle
{
    int length;
    int breadth;

    void insert (int l,int b)
    {
        length=l;
        breadth =b;

    }

    void display(){ System.out.println(length *breadth);}
}
    class Main 
    {
        public static void main(String[] args) 
        {
        Rectangle obj1 = new Rectangle();
        obj1.insert(20,30);
        obj1.display();
        }
        
    }

class Check_even_odd
{
public static void Even_odd(int num)   // method (basically methods &functions are pretty much the same)
{
    if (num%2==0)
    {
        System.err.println("even");    //find odd even (Scanner used here;  simple input output problem )
    }
    else 
    {
         System.err.println("odd");
    }
}
}
class Main 
{
    public static void main(String args[])
    {
        Check_even_odd obj1 = new Check_even_odd();
        Scanner scan = new Scanner(System.in);
        System.out.println("enter number");
        int num =scan.nextInt();
        obj1.Even_odd(num);


    }
}
    


class Addition 
{
    public static void add(int a,int b )  // no data types here like int, char etc
    {
        
        int sum =a+b;
        System.out.println("sum is :"+sum);           // addtion of two numbers using scanner
    }
}

class main 
{
    public static void main (String args [])
    {
        Addition obj1 = new Addition();
        Scanner scan = new Scanner(System.in);
        System.err.println("enter the numbers");
        int a =scan.nextInt();
        int b =scan.nextInt();   // do it differently cannot at same time like a,b
        obj1.add( a,b);          // no data type needed in method call like(int a,int b)
       
    }
}



// class Display 
// {
//     public static void main(String[] args)   // static methods
//     {
//         show();                                 //since all is in one class we use static method name 
//     }
//     public static void show() {System.out.println("doesnt need an object to be called ");}
    
// }
class Display 
{
     static void show() {System.out.println("doesnt need an object to be called ");}

}

class Main 
{
    public static void main(String[] args) 
    { 
    Display.show();                //but since this has outside main func we use class name.show()
    }
}


public class Display
{
    String name; int age;
    void insert(String n, int a)
    {
       name=n;                                    // Method overloading (same func different parameters)
       age=a;
       System.out.println(name+" "+age );
    }
     
    char id;
    void insert(char i)
    {
        id=i;
        System.out.println(id );
       
    }
}

class main 
{
    public static void main(String[] args) 
    {
        Display obj1 =new Display();
        obj1.insert("mano",20);
        obj1.insert('m');
    }
}


class Boss
{
    int salary= 10000;                            //Inheritance 

}
class Employee extends Boss
{
    int id =2;
}

class main 
{
    public static void main(String[] args)
    {
        Employee obj1 = new Employee();
        System.out.println(obj1.salary); //simple inheritance (emp gets salary from boss class; using here emp object )
        
    }
}

class Vehicle
{
    Vehicle()
   { System.out.println("all vehicles included");}
}
class Cars extends Vehicle
{                                                            //multilevel inheritance
    Cars()
    { System.out.println("all cars included");}
}

class Bike extends Cars
{
    Bike()
     {System.out.println("all bikes included");}
}

class main 
{
    public static void main(String args[])
    {
        Bike obj1 = new Bike();       //multilev inheri where with just bike obj we printed each class constructor
    
    }
}


class Addition 
{
    void insert (int a, int b)
    {
        System.out.println(a+b);
    }
                                         // Method overloading(same func different parameters)

    void insert(int a , int b, char c)
    {
        System.out.println(a+b+c);
    }
}

class main 
{
    public static void main (String []args)
    {
        Addition obj1 = new Addition();
        obj1.insert(20,30);
        obj1.insert(10,20,'M');
    }
}


 class Subtraction 
{
    void Display()
    {
        System.out.println("not overrided");
    }                                       // Method overriding (same func but overweriting existing func)
}   
    class Multiplication extends Subtraction
    {
    void Display()
    {
        System.out.println("overrided");
    }
}


class main 
{
    public static void main (String []args)
    {
        Multiplication  obj1 = new Multiplication();
        obj1.Display();
    }
}



 class Array
 {                                             // Array basics 
    public static void main(String[] args) {
        
    
    int a[]=new int[5];       //the correct way to initialize                         

    for (int i=0;i<a.length;i++)
    {
        a[i]=i;                      //golden rule :always what is in parameter(upar) is in right side
        System.out.print(a[i]);
    } 
    }
 }

 

 class Array
 {                                             // for each loop (using only for TRAVERSING an array)
    public static void main(String[] args)
    {
        int arr[] = {1,2,3,4,5}; 

        for(int i:arr)          // only used for travesing an array not for printing 
        {
            System.out.println(i);          //always use this in for each loop 
            //System.out.println(arr[i]);   // using this one it will skip the first index 
        }

    
    
    
    }
 }


class Array
{
    void insert(int arr[])
    {                                    //passing array thorugh method 
        for(int i:arr)
        {
            System.out.print(i);
        }
    }
}

class main 
{
    public static void main (String args [])
    {
        Array obj1 = new Array();
        int arr[]={1,2,3,4,5};          //this how you insert array through method 
        obj1.insert(arr);
    }
}


class Array 
{
    void insert(int arr[])           //anononymous arrays (to initialize arrays inside method func itself)
    {
        for(int i:arr)
        {
            System.out.print(i);
        }
    }
}

class main 
{
    public static void main(String[] args)
    {
        Array obj1 =new Array();
        obj1.insert(new int[]{1,2,3,4,5});   // to initialize arrays inside method func itself (no need for seperate declaration like above one)
        
    }
}


class matrix 
{
    public static void main(String[] args) {         // 2D array (matrix)
        
    
    int arr[][]= {{1,2,3},{4,5,6},{7,8,9}};

    for (int i=0;i<3;i++)
    {
        for(int j=0;j<3;j++)
        {
            //arr[i][j]=[i][j];                   //cannot o it like this (invalid injava not possible)
            System.out.print(arr[i][j]+ " ");
        }
        System.out.println();        //Golden rule: always include this if you want rows to end after each iteration
    }
    }

}


class matrix_addition
{
    public static void main(String[] args) {
        
                                                  //marrix addition (same format for multiplication )
    int a[][]={{1,3,4},{3,4,5}};
    int b[][]={{1,3,4},{3,4,5}};

    int c[][]=new int[2][3];
    //int c[][]={};                 dont initialize like this 
    
    for(int i=0;i<2;i++)
    {
        for(int j=0;j<3;j++)
        {
            c[i][j]=a[i][j]+b[i][j];
            System.out.print(c[i][j]+" ");

        }
        System.out.println();
    }
    
}
}



class Matrix_multiplication 
{
    public static void main (String args[])       //matrix multiplication 
    {
        int a[][] ={{1,2,3},{4,5,6},{7,8,9}};
        int b[][] ={{1,2,3},{4,5,6},{7,8,9}};

        int c[][]= new int [3][3];

        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                 c[i][j]=a[i][j]*b[i][j];

                System.out.print(c[i][j]+" ");

            }
            System.out.println();

        }

    }
}




class Matrix_input  
{
    public static void main(String args[]){
                                                      //matrix array with taking user input a[i][j]
    int a[][]= new int[3][3];
    Scanner scan = new Scanner(System.in);
    for(int i=0;i<3;i++)
    {
        for(int j=0;j<3;j++)
        {
            System.out.print(" enter elements"+"("+i+","+j+"):");
            a[i][j] = scan.nextInt();
            
  
         
        }
    }
    System.out.println("the entered input array is ");
    for(int i=0;i<3;i++)
    {
       for(int j=0;j<3;j++)
       {
        System.out.print(a[i][j]+" ");
       }
       System.out.println();
    }

}
}



class array_sum                                     // Array sums      starting from here
{
    public static void main (String args [])
{

    int a[]={1,2,3,4,5};                             //sum of array elements    
    int sum = 0;

    for(int i=0;i<a.length;i++)
    {
        sum =sum +i;

    }
    System.out.println(sum);
}
}


import java.util.Arrays;
class Reverse
{                                                    //reversing elements of array
    public static void main(String[] args) {
        
    
    int arr[]= {1,2,3,4,5};
    for(int i=0;i<arr.length/2;i++)    // /2 used here because we will swap elements using mid element as pivot like 1st element will last , second element with second last etc
    {
        int t= arr[i];
        arr[i]=arr[arr.length - 1 - i];     // swapping element with its adjacent postion on other side ogf middle element  (-1 since its starting from 0 so decrease that extra from we use -1)
        arr[arr.length-1-i] = t;
    }

    System.out.print(Arrays.toString(arr));  // can use this to print reversed array by converting into string ******VERY USEFUL USE THIS ALWAYS FOR ARRAYS*****8 

//    for(int j=0;j<arr.length;j++)
//    {
//     System.out.print(arr[j] +" ");  // can use conventional loop to print reversed array also
//    }
}
}

import java.util.Arrays;
class array_merge
{
    public static void main(String[] args) {
        
                                                    //merging arrays
    int arr1[]={1,2,3,4,5};
    int arr2[]={6,7,8,9,10};

    int sizearr1= arr1.length;
    int sizearr2 = arr2.length;

    int arr3[]= new int [sizearr1+sizearr2];

    for(int i=0;i<arr1.length;i++)
    {
        arr3[i]=arr1[i];
    }
    for(int i=0;i<arr2.length;i++)
    {
        arr3[sizearr1+i]=arr2[i];
    }

    System.out.print(Arrays.toString(arr3));




}
}



class second_significant
{
    public static void main(String[] args) {      // to find 2nd largest element in an sorted matrix


{
    int matrix [][]={
        {1,2,3},
        {4,5,6},
        {7,8,9},
};

int rows = matrix.length;
int cols=matrix[0].length;

int largest = matrix [rows-1 ][cols-1];
int secondlargest = matrix[rows -1][cols -2];

for(int i=rows-1;i>=0;i--)
{
    for(int j=cols-1;j>=0;j--)
    {
        if(matrix [i][j]> largest )     //finding new largest element
        {
           secondlargest = largest;
           largest = matrix[i][j];
 

        }
        
            else if(matrix[i][j]>secondlargest && matrix[ i][j]<largest )    //finding 2nd largest element
            {
                matrix[i][j] = secondlargest;

            }
            
        }
  

    }
    System.out.println("the second largest element is:"+ secondlargest);

}
}
}




class kth_element
{
    public static void main(String[] args) {     //to find the kth element in an sorted matrix 
        
    
    int matrix [][] = {
        {1,2,3},
        {4,5,6},
        {7,8,9},
    };

    int k=4;   //kth element here is = 4th element
    int index = 0;
    
    int flat []= new int [matrix.length * matrix[0].length];

    for(int i=0;i<matrix.length;i++)             //this loop will convert matrix into simple 1D array then we will find the kth element (there is a more complicated way using priority queue and minheap but we are not at the level yet use this simple method )
    {
        for(int j=0;j<matrix[0].length;j++)
        {
            flat[index++] = matrix[i][j];
        }

    }

     Arrays.sort(flat);

     //System.out.println("the sorted array:"+flat); //on printing this it gives you the junk value of the array address because +flat converts the array into A string to be printed (so instead use .string(flat) like usual )
     
     System.out.println("the sorted array:" +Arrays.toString(flat));
     System.out.print("the kth(4th) element is :"+ flat[k-1]);  // here k-1 because the matrix starts from 0 so (k-1 = 3 i.e the 4th element)


}
}



class remove_duplicate      //hard question simple logic though

{public static void  main(String[] args) {       //to remove duplicate elements from arrays
    int arr [] = {1,2,3,4,4,5};

    int i =0 ;  //start of unique index (0)

    for(int j=1; j<arr.length;j++)
    {
        if(arr[j] != arr[i])
    {
        i++;
        arr[i]=arr[j];  //golden rule: this one copies the current value to next index value so to remove duplicates(see gpt to understand it took me a long time to get it hahah)
    }

    
}   
     //System.out.print(Arrays.toString(arr));   this will give error dont use (leftover 5 printed again instead use for loop)
     System.out.println("the array after removing duplicates ");
     
     for(int k=0;k<=i;k++)      //here we use <=i because of i has 5 as the last element if we use arr.length it will have 5 as leftover value so we use this(see gpt if dont get it)
     {
        System.out.print(arr[k]);
     }
   
   
    }

}



class only_once_element
{
    public static void main(String[] args) {
         
    int arr[]={1,1,2,2,3,4,4}; 

    int unique=0;                         //  XOR(bitwise):    using here 
                               //           a ^ a = 0 → XORing a number with itself cancels it out.
                               //           a ^ 0 = a → XORing a number with 0 gives the number back
    for(int i:arr)
    {
        unique = unique ^ i;   //this technique is used here since it is very simple and requires no sorting methods
    }
    System.out.println("the unique element = "+unique);
}
}



class palindrome           //       to find palindrome or not        (lol palindrome is if ulta same or not like 'eye')
{
    public static void main(String[] args) {
        
    
    int arr[]={1, 2, 3, 2, 1};
    
    int left = 0;
    int right = arr.length- 1;

    while(left <= right)
    {
        if(arr[left] != arr[right])                 //Compare arr[0] and arr[4] → both 1 (match)
                                                      //Compare arr[1] and arr[3] → both 2 (match)
                                                      //Compare arr[2] and arr[2] → both 3 (match)
                                                       //Now, left = 3, right = 1 → left > right
        {
            System.out.println("it is not palindrome");
            break;
        }
        left++;
        right--;

        if(left>right)                              //finally is the they have gone past the midpoint with left-- and right ++ they have overreached which means all the elements are equal in whole array
    {
        System.out.println(" it is  a palindrome");
    } 
    }
    

    }
}




//import java.util.Arrays;
import java.util.Random;
class shuffle_elements
{
    public static void main(String[] args) {
        
    
    int arr []={1,2,3,4,5,6};               

    Random rand = new Random();      

    for(int i = arr.length -1;i>=1;i--)    //  https://www.youtube.com/watch?v=i8kD33wx9Mo&t=115s (Fisher yates shuffle algo used here see this vid to understand and refresh )
    {
        int j = rand.nextInt(i+1);      // i+1 to include n(current element) since we arr.length in loop to make up for it 
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]= temp;

    }

    //System.out.print(Arrays.toString(temp));

    for(int z:arr)
    {
        System.out.print(z);
    }
    }

}




class orthogonal 
{                                               //   this code is WRONGGG : this will only find the vectors which are otho not the rows and  columns that are orthogonal o use the code below  
    public static void main(String[] args) {
        
    
    int matrix1 [][]= {{1,2},{3,4}};
    int matrix2 [][]= {{0,1},{-1,0}};

    int dotproduct=0;

    for(int i=0;i<matrix1.length;i++)     // for rows
    {
        for (int j=0;j<matrix2[0].length;j++)   // for columns 
        {


            dotproduct = dotproduct +matrix1[i][j]*matrix2[i][j];  //this will multiply each element and add them if 0 then it is orthogonal 
        }
    }

    if(dotproduct == 0)      //[1,0] = 0 
    {                        //[0,1]
        System.out.println("it is is orthogonal");

    }
    else
    {
        System.out.println("it is is not orthogonal");

    }
    }

}




class orthogonal
{
    public static void main(String[] args)       //  to find matrixes othogonal or not (correct method : including checking with each rows and columns)
    {
        // int[][] matrix1 = {{0, 1}, {-1, 0}};
        // int[][] matrix2 = {{0, -1}, {1, 0}};

        int[][] matrix1 = {{1, 0}, {0, 0}};
        int[][] matrix2 = {{0, 1}, {0, 0}};

        int count = 0;

        for(int i=0;i<matrix1.length;i++)
        {

            int dotproduct=  0;
            for(int j=0;j<matrix2[0].length;j++)
            {
                dotproduct = dotproduct + matrix1[i][j] * matrix2[i][j];

            }

            if(dotproduct != 0)
            {
                count++;
                break;
            }
        }

        if(count == 0)
        {
            System.out.println("it is orthogonal ");
        }
        else
        {
            System.out.println("it is not orthogonal ");

        }
        
    }
}

                             

class Solution {                                    // leetcode sum 1: two sum
    public int[] twoSum(int[] nums, int target) 
    {
        for(int i=0 ;i<nums.length;i++)
        {
            for(int j=1;j<nums.length;j++)
            {
                if(nums[i] + nums[j] == target)
                {
                    return new int []{i,j};
                }
            }
            
            
    
    } return new int []{};
}
}








class main 
{
    public static void main(String args [])
    {
        Solution s1 = new Solution();

        int mynums [] = {2,7,11,15};
        int mytarget = 9;
        s1.twoSum(mynums,mytarget);
    }
}



class Solution {                                     // leetcode sum 2: palindrome 
    public boolean isPalindrome(int x) 
    {
        String num_String = Integer.toString(x);
        
        int left = 0;
        int right = num_String.length() - 1;

        for(int i = 0;i<num_String.length();i++)
        {
            if(num_String.charAt(left) != num_String.charAt(right))
            {
                return false;
                //break;     dont need it ig 
                
            }
            left++;
            right--;
        } 

    //    if(left>right)
    //    {
    //     return true;           // this works in normal java or something not here in this compiler you need to just be upfront 
    //    }
    // } return new int [] {};

    return true;

    }
}

class main 
{
    public static void main(String args [])
    {
    Solution s1 = new Solution ();
    int mynum = 121;

    s1.isPalindrome(mynum);
    }
}


























class Check_Strings                                      //Print if the two given strings are equal or unequal
{
    public static void main(String[] args) {
        
    
    String String_1 = "Mano";

    String String_2 = "Bruno";
    
    
    
    for(int i=0;i<String_1.length();i++)
    {
        
            if(String_1.charAt(i) != String_2.charAt(i))
            {
                System.out.println("this is not Equal");
                break;
                
            }
            else
            {
                System.out.println("this is  Equal");
                break;

            }

        
    }
    
    }
}







class Frequency
{
    public static void main(String[] args) 
    {
        String String_1 = "Mano";
        char given_char = 'M';

        int count = 0;

        for(int i=0;i<String_1.length();i++)
        {
            //for(int j=1;j<String_1.length();j++)
            {
                if(String_1.charAt(i) == given_char)
                {
                    count++;

                }

            }

        
            
        }
        System.out.println("the Frequency is :"+count);
        
    }
}



class Factorial
{
    public static void main(String args []) 
    {
    int n = 5;                            
    int factorial=1;
    for(int i=1;i<=n;i++)
    {
        factorial= factorial*i;
        
    }
    System.out.println(factorial);
}
}



class Check_palindrome
{
    public static void main(String[] args) 
    {
        String palindrome = "eye";

        int left = 0;
        int right = palindrome.length() -1;

        while(left<=right)
        {
            if(palindrome.charAt(left) != palindrome.charAt(right))
            {
                System.out.println(" It is not a palindrome");
                break;
            }
            left++;
            right--;
            
        }

        if(left>right)
        {
            System.out.println(" It is a palindrome");
        }
    }
}




class Armstrong
{
    public static void main(String[] args) 
    {
        int arm[] = {153};                               // check this sum 
        String number = String.valueOf(arm[0]);
        int power = number.length();

        //int power = arm.length;
        int sum = 0;

        for(int i =0; i<arm.length;i++)
        {
            //sum = sum + arm[i] ^ power;
            sum = sum + (int)Math.pow(arm[i],power);
        }

        System.out.println(sum);
        // if(sum == arm[0])
        // {
        //     System.out.println(" it is armstrong");
        // }
    }
}




                                                               // 21st july onwards


class factors
{
    public static void main(String[] args) 
    {
        int digit = 6;

        for(int i =1 ;i<=digit;i++)
        {
            if(digit % i == 0)
            {
                System.out.println("the factors are: "+ i);
            }
            // else
            // {
            //     System.out.println("there are no factors ");
            // }

        }
        
    }
}



class no_of_vowels
{
    public static void main(String[] args)      // to find the no. of vowels 
    {
        String n = "Mano is a student"; 
        int count = 0;
        
        for(int i = 0;i<n.length();i++)
        {
            if(n.charAt(i) == 'a' || n.charAt(i) == 'e' || n.charAt(i) == 'i' || n.charAt(i) == 'o' || n.charAt(i) == 'u')
            {
                count++;
            }
        }


        System.out.println("the number of a's are: "+count);
    }
}



class Divisible
{
    public static void main(String[] args) 
    {
        int digit = 8;

        for(int i =1 ;i<=digit;i++)
        {
            if(digit % i == 0)
            {
                System.out.println("the divisible no. is "+ i);
            }
            // else
            // {
            //     System.out.println("there are no factors ");
            // }

        }
        
    }
}

 

class fibonacci
{                                        //  xxxxxxxxxxxxxxxxxx     WRONG xxxxxxxxxxxxxxxxxxxx
    public static void main(String[] args)                            //wrong logic (keep to see )
    {
        int fibo = 0;
        //for(int i=0;i<=10;i++)
        {
            
            for(int j=1 ;j<=10;j++) 
            {
                int i=0;
                //System.out.println("the fibonacci numbers are : "+ i+j);
                ++i;fibo = i+j;
                
                System.out.println("the fibonacci numbers are : "+ fibo);

            }
        }



        
    }
}



class fibonacci
{
    
    public static void main(String[] args) 
    {
        int first =0;
    
        int second =1;
        System.out.println(first);
        System.out.println(second);
        for(int i=0;i<=10;i++)               // remember the i in a loop need not always be used -senthil sir
        {
            //int second = 1;
            
            
            int t = first+second;            
            System.out.println(t);
            first = second;           // here in this question it simply adds the 1st &2nd and later gives the sum to second and this keeps on up until the loop is over (REMEMBER !! the loop doesnt need to be used it is there simply to iterate agai nand again)
            second =t;             //here t is the sum 
            //second++;
        }
        
    }
}


                        //      xxxxxxxxxxxx 22nd onwards  xxxxxxxxxxxxxx



class prime                   // prime - number divisble by 1 and itself only
{
    public static void main(String[] args) 
    {
        int n = 5;
        for(int i = 2;i<n;i++)
        {
            //if(n % i != 0 ||  n % n == 0 || n % 1==0 )           // dont do this B.S its already understood that a prime is only divisible by itself and 1 obviously
            
            
            if(n % i != 0  )          // this step ensures like if a even number like 4 comes up if it is == 0 then it will go to else and prints not prime 
            {
                System.out.println("it is a prime number");
                break;
            }
            else
            {
                System.out.println("it is a not prime number");
                break;
            }

        }

        
    }
}





class factors                                // this is for reference for the sum downstairs delete once complete 
{
    public static void main(String[] args) 
    {
        int digit = 6;

        for(int i =1 ;i<=digit;i++)
        {
            if(digit % i == 0)
            {
                System.out.println("the factors are: "+ i);
            }
            // else
            // {
            //     System.out.println("there are no factors ");
            // }

        }
        
    }
}





class perfect_number                        // perfect number - number which's     Sum of its proper divisors (excluding itself) = the number itself
{                                           
                                                             // Another famous example: 6
                                                             // Proper divisors: 1, 2, 3
                                                             // Sum = 1 + 2 + 3 = 6
                                                             //  So, 6 is also a perfect number
    public static void main(String[] args) 
    {
        int digit = 28;
        
        int sum = 0;
        for(int i = 1;i<digit ;i++)        // just use logic from factor sum simple sum only 
        {
            if(digit % i == 0)          // this will add all the factos or no.s that are divisible
            {
                sum = sum + i ;
            }
        }
        //System.out.println(sum);
        
        if(sum == digit)                 // if it equal to the digit itself its a perfect no. then
        {
            System.out.println("it is a perfect number");
        }
        else
        {
            System.out.println("it is not a perfect number");
        }

        
    }
}

class perfect_number_in_a_givenrange {
    public static void main(String[] args) 
    {
        //int digit = 28;
        
        
        for(int digit = 100 ; digit>1;digit--)
        {
            int sum = 0;                            // everything is fine just need to reset the sum afterr each digit is finished thats all 
        for(int i = 1;i<digit ;i++)        
        
        {
            if(digit % i == 0)          
            {
                sum = sum + i ;
            }
        }
        //System.out.println(sum);
        
        if(sum == digit)
        {
            System.out.println(sum +":it is a perfect number");
        }
        // else
        // {      
        //     System.out.println("it is not a perfect number");       // dont need this 
        // }
}
        
    }



class angram                         //angram - is  creating two or more different words from the same set of letters (like my name mano and onam)
{
    public static void main(String[] args) 
    {
        String String_1 = "mano";
        String String_2 = "onam"; 
                                                         //wrong
        //for(int i = 0;i<String_1.length();i++)
            int i = 0;

            int count = 0;
            for(int j =0 ;j<String_2.length();j++)
            {
                if(String_1.charAt(i) == String_2.charAt(j))
                {
                    i++;
                    count++;
                }
            }

            if(count == String_1.length())
            {
                System.out.println("it is a angram");
            }

        
    }
}


class angram                         //angram - is  creating two or more different words from the same set of letters (like my name mano and onam)
{
    public static void main(String[] args) 
    {
        String String_1 = "mano";
        String String_2 = "onam"; 

        //for(int i = 0;i<String_1.length();i++)
            int i = 0;

            int count = 0;
            for(int z = 0 ; z<String_1.length() ;z++)        // remember a loop's elements need not always be used sometimes they are there just to iterate again and again
            {
            for(int j =0 ;j<String_2.length();j++)
            {
                if(String_1.charAt(z) == String_2.charAt(j))
                {
                    i++;
                    count++;
                }
            }
            
            System.out.println(count);
            }

            if(count == String_1.length())
            {
                System.out.println("it is a angram");
            }

        
    }
}





class pangram                       // pangram - a sentence which contains each letter of the english alphabet
{
    public static void main(String[] args)
    {
        String String_1 = "the quick brown fox jumps over the lazy dog";
        int count = 0;
 
        for(int i = 0;i<String_1.length();i++)
        {
            if (String_1.charAt(i) == 'a' || String_1.charAt(i) == 'b' || String_1.charAt(i) == 'c' || String_1.charAt(i) == 'd' || String_1.charAt(i) == 'e' || String_1.charAt(i) == 'f' || String_1.charAt(i) == 'g' || String_1.charAt(i) == 'h' || String_1.charAt(i) == 'i' || String_1.charAt(i) == 'j' || String_1.charAt(i) == 'k' || String_1.charAt(i) == 'l' || String_1.charAt(i) == 'm' || String_1.charAt(i) == 'n' || String_1.charAt(i) == 'o' || String_1.charAt(i) == 'p' || String_1.charAt(i) == 'q' || String_1.charAt(i) == 'r' || String_1.charAt(i) == 's' || String_1.charAt(i) == 't' || String_1.charAt(i) == 'u' || String_1.charAt(i) == 'v' || String_1.charAt(i) == 'w' || String_1.charAt(i) == 'x' || String_1.charAt(i) == 'y' || String_1.charAt(i) == 'z') 
            {
                count++;
    
            }

            
        }
        if(count >=26)
        {
            System.out.println("it is a pangram");
        }
        else
        {
             System.out.println("it is not a pangram");
        }
        
    }
}

class pangram
{
    public static void main(String args [])
    {
        String String_1 = "a";
        
        boolean  alreadycounted = false;
        
        for(int i =0;i<String_1.length();i++)
        {
            char ch = String_1.char.At(i);
            
            case: 'a':
                if(alreadycounted == false)
                {
                    count++;
                    boolean alreadycounted = true;
                }
                
            
                
            
        }
        
    }
}










               //       xxxxxxxxxxxxxx    Array sums start here of 7_Array_Questions.txt      xxxxxxxxxxx



import java.util.Arrays;
class store_in_array
{
    public static void main(String[] args) 
    {
        int arr[] = {1,2,3,4};
        int arr2[] = new int[arr.length];

        for(int i = 0;i<arr.length;i++)
        {
            arr2[i] = arr[i]; 

        }

        System.out.println(Arrays.toString(arr2));
        
    }
}



import java.util.Arrays;           // do not forget this if you want to use Arrays.toString(arr)
class array_reverse_order
{
    public static void main(String[] args) 
    {
        int arr[] = {1,2,3,4,5};

        for(int i = 0;i<arr.length/2;i++)
        {
            int t = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = t;
        }
        System.out.println(Arrays.toString(arr));
        
    }
}



class srm_of_array_elements
{
    public static void main(String[] args) 
    {
        int arr[] = {1,2,3,4};
        int sum = 0;

        for(int i= 0 ;i<arr.length;i++)
        {
            sum = sum + arr[i];
        }

        System.out.println("the sum of array elements:"+ sum);

        
    }
}



import java.util.Arrays;
class store_elements_in_anotherarray
{
    public static void main(String[] args) 
    {
        int arr[] = {1,2,3,4};
        int arr2[] = new int[arr.length];

        for(int i = 0;i<arr.length;i++)
        {
            arr2[i] = arr[i]; 

        }

        System.out.println(Arrays.toString(arr2));
        
    }
}



class count_duplicate_elements
{
    public static void main(String[] args) 
    {
        int arr[] = {1,2,3,3,4};

        int count = 0;
        for(int i = 0;i<arr.length-1;i++)
        {
            //for(int j=1;j<arr.length-1;j++)           // dont use this as j=1 it sometimes the compiler may through some error safe to use i+1
            for(int j=i+1;j<arr.length-1;j++)
            {
                if(arr[i] == arr[j])
                {
                    count++;
                }
            }

        }
        System.out.println("the no. duplicate elements:"+ count);
        
    }
    


}


import java.util.Arrays;
class merge_two_arrays
{
    public static void main(String[] args)
    {
        int arr1[] = {1,2,3,4,5};
        int arr2[] = {6,7,8,9,10};

        int arr3[] =new int[arr1.length+arr2.length];

        for(int i = 0;i<arr1.length-1;i++)
        {
            arr3[i] = arr1[i];
        }

        for(int j=0 ;j<arr2.length-1;j++)
        {
            arr3[arr1.length+j] = arr2[j];
        }
        
        System.out.println("arr3:"+Arrays.toString(arr3));



        
    }
}



class merge_sort_practice    // follow this one better explained by me
{
    public static void main(String[] args)                   // explanation 2025-08-08-20-48-14.png
    {
        int arr_1[] = {1,3};
        int arr_2[] ={2,8};

        int arr_3[] = new int[arr_1.length+arr_2.length];

        int beg_1=0;        // starting indexes for arr_1 & arr_2
        int beg_2 =0;

        int last_1 =1;      // ending indexes for arr_1 & arr_2
        int last_2 =1;

        int current_3=0;    // starting index for arr_3

        while(beg_1<=last_1 && beg_2<=last_2)
        {
            if(arr_1[beg_1] < arr_2[beg_2])         // if element from arr_1 is smallest then puts it in arr_3
            {
                arr_3[current_3]=arr_1[beg_1];
                beg_1++;
                current_3++;
            }
            else 
            {
                arr_3[current_3]=arr_2[beg_2];   // if element from arr_2 is smallest then puts it in arr_3
                beg_2++;
                current_3++;
            }

        }

        if(beg_1<=last_1)               // this loop will run when there zrent any more elements left to  compare i.e only a single element is remaining so nothing to compare with here this will include these leftover values to arr_3
        {
            while(beg_1<=last_1)
            {
                arr_3[current_3]=arr_1[beg_1];
                beg_1++;
                current_3++;
            }
        }
        else if(beg_2<=last_2)
        {
            arr_3[current_3] =arr_2[beg_2];
            beg_2++;
            current_3++;
        }

        System.out.print("The Sorted list :");
        for(int z=0;z<arr_3.length-1;z++)
        {
            System.out.print(arr_3[z]+" ");
        }

        
    }
}







class merge_sort
{
    public static void main(String[] args) 
    {
        int arr1[] = {1,3};
        int arr2[] = {2,8};

        int arr3[] = new int[arr1.length+arr2.length];

        int beg_1 = 0;
        int beg_2 = 0;

        int last_1 = 1;
        int last_2 = 1;

        int current_3 = 0;

        while(beg_1<=last_1 && beg_2<=last_2)
        {
            if(arr1[beg_1]<arr2[beg_2])                 // add in arr3 if arr2 is larger than arr1 
            {
                arr3[current_3] = arr1[beg_1];
                beg_1++;
                current_3++;
            }
            else 
            {
                arr3[current_3] = arr2[beg_2];           
                beg_2++;
                current_3++;
            }                                         // this entire while loop will end when comparison run out later patch in the leftover values from arr1 and arr2
        }

        if(beg_1<= last_1)
        {
            while(beg_1<= last_1)
            {
                arr3[current_3] = arr1[beg_1];
                beg_1++;
                current_3++;
            }
        }

        else if(beg_2<= last_2)
        {
            while(beg_2 <=last_2)
            {
                arr3[current_3] = arr2[beg_2];
                beg_2++;
                current_3++;
            }
        }

        System.out.println("the sorted list is :");

        for(int x= 0;x<arr3.length;x++)
        {
            System.out.println(arr3[x]);
        }

        
    }
}




class Frequency_of_an_element                    // this is incomplete do this ask sir
{
    public static void main(String[] args) 
    {
        int arr[] = {1,2,3,4,5,4};

        for(int i = 0;i<arr.length;i++)
        {
            int count = 0;
            for(int j = 1;j<arr.length;j++)
            {
            
                if(arr[i] == arr[j])
                {
                    count++;

                }
                System.out.println("the frequency of"+i+"is:"+count);
            }
        }
        
    }
}






class seperate_odd_even
{
    public static void main(String[] args) 
    {
        int arr[] = {1,2,3,4,5};
        int arr_even[] = new int[arr.length];        // logic is alright but empty spaces are there fix it 
        int arr_odd[] =  new int[arr.length];
        
        for(int i = 0;i<arr.length -1 ;i++)
        {
            if(arr[i] % 2 == 0)
            {
                  arr_even[i] =arr[i];

            }
            else
            {
               arr_odd[i] =   arr[i];
            }
        }
        for(int k=0;k<arr_even.length;k++)
        {
            System.out.println("the even elements are:"+ arr_even[k]);
        }

        for(int w=0;w<arr_odd.length;w++)
        {
            System.out.println("the odd elements are:"+ arr_odd[w]);
        }
        
        
    }
}



class matrix_print
{
    public static void main(String[] args) 
    {
       int matrix [][]={
        {1,2,3},
        {4,5,6},
        {7,8,9},};
        
        
        for(int i = 0;i<matrix.length;i++)
        {
            for(int j = 0;j<matrix.length;j++)
            {
                System.out.println("matrix:" + matrix[i][j]);
            } 
            System.out.println();      
        
        }
    
        
    }
}




class add_two_matrices
{
    public static void main(String[] args) 
    {
        int matrix1 [][]={
        {1,2,3},
        {4,5,6},
        {7,8,9},};

        int matrix2 [][]={
        {1,2,3},
        {4,5,6},
        {7,8,9},};

        int matrix3[][] = new int[3][3];

        for(int i = 0;i<matrix1.length;i++)
        {
            for(int j = 0;j<matrix2[0].length;j++)
            {
                matrix3[i][j] = matrix1[i][j]  + matrix2[i][j];

            }
        }

        System.out.println("addition matrix" );
        for(int k = 0 ;k<matrix3.length;k++)
        {
            for(int w = 0;w<matrix3.length;w++)
            {
            System.out.print(matrix3[k][w]+ " ");
            }
            System.out.println();
    }
        
    }
}



class subtract_two_matrices
{
    public static void main(String[] args) 
    {
        int matrix1 [][]={
        {1,2,3},
        {4,5,6},
        {7,8,9},};

        int matrix2 [][]={
        {1,2,3},
        {4,5,6},
        {7,8,9},};

        int matrix3[][] = new int[3][3];

        for(int i = 0;i<matrix1.length;i++)
        {
            for(int j = 0;j<matrix2[0].length;j++)
            {
                matrix3[i][j] = matrix1[i][j]  -  matrix2[i][j];

            }
        }

        System.out.println("subtraction matrix" );
        for(int k = 0 ;k<matrix3.length;k++)
        {
            for(int w = 0;w<matrix3.length;w++)
            {
            System.out.print(matrix3[k][w]+ " ");
            }
            System.out.println();
    }
        
    }
}



class multiply_two_matrices
{
    public static void main(String[] args) 
    {
        int matrix1 [][]={
        {1,2,3},
        {4,5,6},
        {7,8,9},};

        int matrix2 [][]={
        {1,2,3},
        {4,5,6},
        {7,8,9},};

        int matrix3[][] = new int[3][3];

        for(int i = 0;i<matrix1.length;i++)
        {
            for(int j = 0;j<matrix2[0].length;j++)
            {
                matrix3[i][j] = matrix1[i][j]  *  matrix2[i][j];

            }
        }

        System.out.println("multiplication matrix" );
        for(int k = 0 ;k<matrix3.length;k++)
        {
            for(int w = 0;w<matrix3.length;w++)
            {
            System.out.print(matrix3[k][w]+ " ");
            }
            System.out.println();
    }
        
    }
}


class selection_sort_ascending 
{
    public static void main(String[] args) 
    {
        int arr[]={6,7,8,4,3,1,9,2};
        {
            for(int i = 0 ;i<arr.length;i++)
            {
                for(int j = i+1;j<arr.length;j++)
                {
                    if(arr[i] >arr[j])      // this step makes sure if current element is bigger than current+1 element then it would swap those elements 
                    {
                        int temp = arr[i];
                        arr[i] = arr[j];          // it puts the small value in the bigger values place
                        arr[j] = temp;                   // old value of i is put in j(i+1) value 
                    }
                }
            }

            System.out.println("the sorted array using selection sort :");
            for(int k = 0 ;k<arr.length;k++)
            {
                System.out.print(arr[k] + " ");
            
            }
        }



        
    }
}

class selection_sort_descending
{
    public static void main(String[] args) 
    {
        int arr[]={6,7,8,4,3,1,9,2};

        for(int i = 0;i<arr.length;i++)
        {
            for(int j = i+1;j<arr.length;j++)
            {
                if(arr[i]<arr[j])       //   this step makes sure if the current element is smaller than current+1 element then it stays the same since that is what we need in descending
                {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;                      // old i value in j(i+1) value
                }
            }
        }

        System.out.println("the sorted array using selection sort :");
            for(int k = 0 ;k<arr.length;k++)
            {
                System.out.print(arr[k] + " ");
            
            }
        
    }
}


class sum_of_right_diagonals
{
    public static void main(String[] args) 
    {
        int matrix [][]={
        {1,2,3},
        {4,5,6},
        {7,8,9},};

        for(int i = 0;i<2;i++)
        {
            for(int j = 0 ;j<2;j++)
            {
            if(matrix[i][j] == matrix[i][i])            // this loop will make sure that if matrix[i][j] match like 11 22 or 33 which are the indexes for the right diagonal elements then it will print them
            {
                System.out.println("the right diagonal elements are:" + matrix[i][i]);
            }

        }
    }
        
    }
}



class right_diagonal_elements 
{
    public static void main(String[] args) 
    {
        int matrix[][] ={{1,2,3,4,5},
                      {1,2,3,4,5},
                      {1,2,3,4,5},
                      {1,2,3,4,5},
                      {1,2,3,4,5},

        };

        for(int i =0; i<4;i++)
        {
            for(int  j =0;j<4;j++)
            {
                if(i+j == 4)
                {
                    System.out.println("the left diagonal elements are:"+matrix[i][j]);
                }
            }
        }


        
    }
}

class left_diagonal_elements 
{
    public static void main(String[] args) 
    {
        int matrix[][] ={{1,2,3,4,5},
                         {1,2,3,4,5},
                         {1,2,3,4,5},
                         {1,2,3,4,5},
                         {1,2,3,4,5},

        };

        for(int i =0; i<=4;i++)
        {
            for(int  j =0;j<=4;j++)
            {
                if(i+j == 4)
                {
                    System.out.println("the left diagonal elements are:"+matrix[i][j]);
                }
            }
        }


        
    }
}


class sum_of_rows_and_colunms
{                                              // incomplete
    public static void main(String[] args) 
    {
        int matrix [][]={
        {1,2,3},
        {4,5,6},
        {7,8,9},};
        
        int j=0;
        for(int i =0;i<=2;i<++)
        {
            if(matrix[i][j] == )



        }
        
    }
}




class buuble_sort
{
    public static void main(String[] args)         // incomplete
    {
        int arr[] = { 6,7,8,4,5,10};

        for(int i = 0 ;i<6-i-1;i++)
        {
            for(int j= i+1;j<6-i-1;j++)
            {

           
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            }
        }
        
    }
}



class integer_values_1to100
{
    public static void main(String[] args) 
    {
        int n =100;
        for(int i = 0;i<=n;i++)
        {
            if(i%10 != 0)
            {
                System.out.print(i+" ");

            }
            System.out.println();

        }
        
    }
}
class integer_values_1to100
{
    public static void main(String[] args) 
    {
        int  n =100;
        while(i>100)
        {
            if(i% 10 != 0)
            {
                System.out.println(i+" ");
                i++;
            }
            
        }
        
    }
}



//  xxxxxxxx 5B. forLoop.pdf sums start here

class odd_numbers
{
    public Static void main (String args[])
    {
        for(int i =10;i<=20;i++)
        {
            if(i%2 != 0)
            {
                System.out.print(i);

            }
            
        }
    }

}

class celsius_farenheit
{
    public static void main (String args[])
    {
        for(int i = 0;i<=100;i++)
        {
            int f =0;
            f = 9/5* i + 32;
            System.out.println("farenheit of"+i+": "+f );
        }
    }
}


class powers
{
    public static void main (String args[])
    {
        for(int i = 1;i<=10;i++)
        {
            for(int  j = 1;j<=10;j++)
            {
                int f = 0 ; 
                f= (int)Math.pow(i,j);
                System.out.println(i+"^"+j+" = "+f);
            }
            System.out.println();
        }
    }
}

class multiplication_by_user
{
    public static void main(String args[])
    {
        for(int i = 1;i<=10;i++)
        {
            for(int j = 1;j<=10;j++)
            {
                System.out.println(i+"*"+j+ " = "+i*j);
            }
            //System.out.println();
        }
    }
}


class question_5_a
{
    public static void main (String args [])
    {
        
        //System.out.print("1 ");
        for(int i = 1;i<=10;i++)
        {
            int sum = 1;
            if(i<=1)
            {
                System.out.print(sum+" ");
            }
            
            for(int j = 1;j<=i;j++)
            {
                //int k = 3;
                //int p = 3;
                sum = sum * 3;
               
            }
             System.out.print(sum+ " ");

        }
    }
}


class question_5_b
{
    public static void main(String args [])
    {
        for(int i = -2;i<=4;i++)
        {
            if(i%2 == 0 || -i%2 ==0)
            {
                System.out.print(i+" ");
            }
            // else if(-i % 2 ==0)
            // {

            // }
        }
    }
}

class question_5_f
 {
    public static void main(String args [])
    {
        int n = 10;
        for(int i = 1;i<n;i++)
        {
            for(int j = 0;j<=i;j++)
            {
                System.out.print("2");
            }
             System.out.print(" ");         // instead of printing in pyramid add " " this will print in spaces like 22 222 2222....
        }

    }
 }



class question_5_e
 {
    public static void main (String args [])
    {
        int sum = 11;
        for(int i = 1;i<=10;i++)
        {
            
            for(int j= 1;j<=i;j++)
            {
                
                sum = sum + sum+i*2;
            }
            System.out.print(sum+ " ");
        }
    }
 }

  class question_5_e
 {
    
    public static void main(String[] args) 
    {
        int sum = 11;                      // important summm     xxxxxxxxxxxx
        //for(int i = 1 ;i<=10;i++)
        
            for(int n = 1;n<=10;n++)
            {
                System.out.print(sum+ " ");
                sum = sum + (int)Math.pow(2,n-1);
            }
            
        
    }
 }

class question_5_d
 {
    public static void main(String[] args) 
    {
        int sum = 112;
        for(int i = 0;i<=14;i++)
        {
            sum = sum - 7;
            
            System.out.print(sum + " ");
        
        }
        
    }
}

class question_6_a
{
    public static void main(String[] args) 
    {
        int x;
        int sum = 1;
        System.out.print("1+");
        for(int i = 1;i<=10;i++)
        {
          System.out.print("x^"+ i);
        }
        
    }
}


class question_6_e           // 1 + 4 - 9 + 16 - 25 +36 - .......n terms
{
    public static void main(String[] args) 
    {
        int sum = 1;
        int interval = 3;
        for(int i = 1; i<=10;i++)
        {
            for(int j = 1;j<=10;j++)
            {
                if(i%2 == 0)
                {
                    System.out.print(sum);
                    System.out.print("+");
                    sum = sum + (interval+3);
                }
                else
                {
                     System.out.print(sum);
                    System.out.print("-");
                    sum = sum + (interval+3);

                }
                
            }
        }
        
        
    }
}






class question_6_e           // 1 + 4 - 9 + 16 - 25 +36 - .......n terms
{
    public static void main(String[] args) 
    {
        int sum = 4;
        int interval = 3;
        for(int i = 1; i<=5;i++)
        {
            //for(int j = 1;j<=10;j++)        // wrong not working
            
                interval = interval+2;
                sum = sum + (interval);

                System.out.print(sum+ " ");
               
            
        }
        
        
    }
}

class question_6_e
{
    public static void main (String args [])
    {
        int sum = 0;
        for(int i = 1;i<=10;i++)
        {
            if(i == 1)
            {
            sum =  (int)Math.pow(i,2);
            System.out.print(sum + " ");
                
            }
            else if(i % 2 == 0)
            {
                sum =  (int)Math.pow(i,2);
            System.out.print("+"+sum + " ");
            }
            else
            {
                sum =  (int)Math.pow(i,2);
            System.out.print("-"+sum + " ");
                
            }
            
        }
    }
}

class question_6_b
{
    public static void main(String[] args) 
    {
        //String  sum = "x";
        for(int i = 1 ; i<=5;i++)
        {
            if(i%2 == 0)
            {
                System.out.println("-");
            System.out.print("x"+ "^"+i);
            }
            else
            {
                 System.out.println("+");
                System.out.print("x"+ "^"+i);

            }
    }
        
    }
}



class question_6_c
{
    public static void main(String[] args) 
    {
        for(int i  =1;i<=5;i++)
        {
            System.out.print(i+"^2"+ "/"+i+ " ");
        }
        
    }
}

class question_6_d
{
    public static void main(String[] args) 
    {
        System.out.print("1 ");
        for(int i = 1;i<=5;i++)
        {
            if(i%2==0)
            {
                System.out.print("+");
                System.out.print("x^"+i+"/"+i+"!"+ " ");
            }
            else
            {
                System.out.print("-");
                System.out.print("x^"+i+"/"+i+"!"+ " ");
            }
            
            
        }
        
    }
}

               //    xxxxxx    file sums end here

class pattern_1
{
    public static void main (String args[])
    {
        // no . lines = 5
        // we need to run. i loop for lines and j loop prints the numbers
        for(int i =1; i<=5;i++)
        {
            for(int j = 5;j>=1;j--) // j loop prints the numbers not the i loop remember
            {
                if(j != i)
                {
                    System.out.print(j);
                }
                else
                {
                    System.out.print("*");
                }
            }
            System.out.println();
        
            
        }
    }
}



class pattern_2
{
    public static void main(String[] args) 
    {
        for(int i = 0 ; i<=8;i++)
        {
            for(int j = 1; j>=1;j--)
            {
                if(i % 2==0)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print("0");
                }

            }
        }
        
    }
}





//   xxxxxxxxxxxx   for loop advanced INSIDE OUT (questions from   5B. forLoop.pdf  ,Pattern_Programs-combined.pdf,  5C. NestedLoop.pdf)   xxxxxxxxxxxxx




  //            xxxxxxxxxxxxxxxxxxxx     ***************** IMPORTANT   ******************




  //    xxxxxxxxxxxxxx   how to solve any pattern program : https://www.youtube.com/watch?v=xzstcj3Cuso
class square_pattern

{
    public static void main(String[] args) 
    {
        int n = 5;
        for(int i = 0 ; i<=n;i++)   // rows = always use 1st loop for rows
        {
            for(int j = 0;j<=n;j++)  // columns = always use the 2nd loop for columns
            {
                System.out.print("*"+ " ");
            }
            System.out.println();

        }
        
    }
}


class right_triangle
{
    public static void main(String[] args) 
    {
        int n =5;
        for(int i = 0;i<=n;i++)  // rows = remember
        {
            for(int j = 0;j<=i;j++)          // columns = remmeber  2025-07-30-12-04-02.png <- look at this image and understand and it tells taht it will print the stars in same way the number as the no. of rows keeps increasing like 1,2,3,4 ..
            {
                System.out.print("*"+ " ");
            }
            System.out.println();
        }
        
    }
}





class ulta_right_traingle
{
    public static void main(String[] args) 
    {
        for(int i = 0 ;i<=5;i++)   //rows
        {
            for(int j =i;j<=5;j++)      // columns = this logic is more efficient when tring to print ulta trianglr than the one down form here using my logic  which alters the entire thing; instead this one just increments w.r.t to i loop which is increasing <=5 which prints in descending order
            {
                System.out.print("*"+ " ");  // logic used: 2025-07-30-12-27-15.png
            }
            System.out.println();
        }
        
    }
}







class ulta_right_traingle
{
    public static void main(String[] args) 
    {
        for(int i = 0 ;i<=5;i++)   //rows
        {
            for(int j =5;j>=i;j--)      // columns    = exact same logic just start with 5 and >than
            {
                System.out.print("*"+ " ");
            }
            System.out.println();
        }
        
    }
}

class left_traingle
{
    public static void main (String args [])
    {
        int n = 5;
        for(int i = 0;i<=n;i++)  // rows loop : dont change ever
        {
            for(int j = i ; j<=n;j++)
            {
                System.out.print(" ");  // this loop prints the ulta space traingle first and then the k loop prints the right triangle (which in fact is the normal left triangle but gives the illusion of right triangle)
            }
            for(int k = 0;k<=i;k++)
            {
                System.out.print("*");
            }
            
            System.out.println();
        }
    }
}

class ulta_left_triangle
{
    public static void main(String[] args)
    {
        int n = 5;
        for(int i = 0;i<=n;i++)
        {
            for(int j = 0;j<=i;j++)
            {
                System.out.print(" ");
            }
            for(int k = i;k<=n;k++)
            {
                System.out.print("*");
            }
            System.out.println();

        }
        
    }
    
}

class hill_pattern
{
    public static void main(String[] args) 
    {
        int n = 5;
        for(int i = 0;i<=n;i++)  // rows loop : never change
        {
            for(int j = i;j<=n;j++)   // simple first decreasing space loop
            {
                System.out.print(" ");
            }
            for(int k = 0;k<=i;k++)    // followed by increasing * loop
            {
                System.out.print("*");
            }
            for(int z= 0;z<=i;z++)     // then again another increasing * loop
            {
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
}

class ulta_reverse_hill_pattern
{
    public static void main(String[] args) 
    {
        int n = 5;
        for(int i = 0;i<=n;i++)
        {
            for(int j = 0;j<=i;j++)
            {
                System.out.print(" ");
            }
            for(int j = i;j<=n;j++)
            {
                System.out.print("*");
            }
            for(int k = i;k<=n;k++)
            {
                System.out.print("*");
            }
            System.out.println();

        }
        
    }
}


class diamond_pattern
{
    public static void main(String[] args) 
    {
        int n = 5;
        for(int i  = 0;i<=n;i++)  // loop for straight hill
        {
            for(int j = i;j<=n;j++)
            {
                System.out.print(" ");
            }
            //for(int k = 0;k<=i;k++)     xxxx      here we will not use <=i since we want to print the peak * also and also stop an extra line in middle from printing when printing the ulta hill 
            for(int k = 0;k<i;k++)
            {
                System.out.print("*");
            }
            for(int k = 0;k<=i;k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i =0;i<=n;i++)
        {
            for(int j = 0;j<=i;j++)
            {
                System.out.print(" ");
            }
            //for(int k =i;k<n;k++)         same reason as above see
            for(int k =i;k<n;k++)   
            {
                System.out.print("*");
            }
            for(int k =i;k<=n;k++)
            {
                System.out.print("*");
            }
        }

        
    }
}

class butterfly_star_pattern
{
    public static void main(String[] args) 
    {
        int n = 5;
        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print("*");
            }
            for(int z=i;z<=n;z++)
            {
                System.out.print(" ");
            }
            for(int x=i;x<=n;x++)
            {
                System.out.print(" ");
            }
            for(int y=0;y<=i;y++)
            {
                System.out.print("*");
            }
            System.out.println();

        }

        for(int i =0;i<=n;i++)
        {
            for(int j=i;j<=n;j++)
            {
                System.out.print("*");
            }
            for(int z=0;z<=i;z++)
            {
                System.out.print(" ");
            }
            for(int x=0;x<=i;x++)
            {
                System.out.print(" ");
            }
            for(int y=i;y<=n;y++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}




//                                  xxxxxxxxxxxxxxx    how to print number patterns in java

class left_triangle_increasing_numbers
{
    public static void main(String[] args) 
    {
        for(int i = 0,p= 1;i<=n;i++,p++)    // here we are using the p instead of conventional i value for loops since its better to keep it seperate and helps in when solving upcoming complex problems
        {
            for(int j =0 ;j<=i;j++)
            {
                System.out.print(p+" ");
            }
            System.out.println();
        
        }
        
    }
}


class left_decreasing_numbers_triangle
{
    public static void main(String[] args) 
    {
        int n =5;
        for(int i = 0,p=n;i<=n;i++,p++)
        {
            for(int j =0;j<=i;j++)
            {
                System.out.print(p);
            }
            System.out.println();

        }
        
    }
}

class left_triangle_incrementing_by_2
{
    public static void main(String[] args) 
    {
        int n=5;
        for(int i =0,p=0;i<=n;i++,p=p+2)         // since incrementing by 2 like 0 2 4 6.... we put p= p+2 
        {
            for(int j = 0;j<=i;j++)
            {
                System.out.print(p);
            }
            System.out.println();

        }
        
    }
}

class alternating_even_odd_left_traingle
{
    public static void main(String[] args) 
    {
        int n = 5;
        for(int i =1;i<=n;i++)
        {
            for(int j =1;j<=i;j++)
            {
                if(i%2 == 0)
                {
                    //System.out.print(i);                this is wrong since it prints just normally; pay attention in the entire left triangle it is just 1s and 2s
                    System.out.print("2");     
                }
                else
                {
                    
                    //System.out.print(i);                this is wrong since it prints just normally; pay attention in the entire left triangle it is just 1s and 2s
                    System.out.print("1");
                }
               
                
            }
             System.out.println();
        }
        
    }
}

class diamond_number_pattern
{
    public static void main(String[] args) 
    {
        int n = 5;
        for(int i = 1,p=1;i<=n;i++,p++)   // rows loop never change
        {
            for(int j=i;j<=n;j++)
            {
                System.out.print(" ");
            }
            for(int k=0;k<i-1;k++)
            {
                System.out.print(p);
            }
            for(int z=0;z<i;z++)
            {
                System.out.print(p);
            }
            System.out.println();
        }

        int n2 =9;
        for(int i =6,p=6;i<=n;i++)
        {
            for(int j =0;j<=i;j++)
            {
                System.out.print(" ");
            }
            for(int k =i;k<n-1;k++)
            {
                System.out.print(p);
            }
            for(int z=i;z<n;z++)
            {
                System.out.print(p);
            }
        }
        
    }
}




class diamond_number_pattern                 //  see 2025-08-01-18-46-45.png
{
    public static void main(String[] args) 
    {
        int n = 5;
        for(int i = 1,p=1;i<=n;i++,p++)   // first loop will print hill pattern up until 5
        {
            for(int j=i;j<=n;j++)
            {
                System.out.print(" ");
            }
            for(int k=0;k<i-1;k++)
            {
                System.out.print(p);
            }
            for(int z=0;z<i;z++)            
            {
                System.out.print(p);
            }
            System.out.println();
        }

        int n2 =9;
        for(int i =6,p=6;i<=n2;i++,p++)   // 2nd loop is to print ulta hill decreasing starting from 6 uptil single 9 at end
        {
            for(int j =n;j<=i;j++)
            {
                System.out.print(" ");
            }
            for(int k =i;k<=n2-1;k++)     // we use n2-1 so that we can reduce one column in the middle so that at the end there is a single digit 9 instead of 2 9s (99)
            {
                System.out.print(p);
            }
            for(int z=i;z<=n2;z++)
            {
                System.out.print(p);
            }
            System.out.println();
        }
        
    }
}

class diamond_number_pattern_2
{
    public static void main(String[] args) 
    {
        int  n = 5;
        for(int i = 0,p=1;i<n;i++,p++)  // 1st loop prints the hill pattern upto 5s
        {
            for(int j = i;j<=n;j++)
            {
                System.out.print(" ");
            }
            for(int k=0;k<=i-1;k++) // i-1 since we want to delete one column in middle to
            {
                System.out.print(p);
            }
            for(int z=0;z<=i;z++)
            {
                 System.out.print(p);
            }
            System.out.println();
        }

        int n2=1;
        for(int i =4,p1=4,x=2;i>=n2;i--,p1--,x++)   // here we re getting confused due to decreasing lower traingle logic ;  so then use a completetly fresh variable x to print the increasing space loop
        {                                           
                                                  // also we use x=2 so as to match the already +2 incremented 5s that end at last hill pattern

            for(int j=0;j<=x;j++)       // use fresh new variable x to print increasing space loop instead of i which is used for below logics and is getting clash so we use new variable x
            {
                System.out.print(" ");
            }
            for(int j =i;j>=n2;j--)
            {
                System.out.print(p1);
            }
            for(int z=i-1;z>=n2;z--)
            {
                System.out.print(p1);
            }
            System.out.println();

        }
        
    }
}

class diamond_number_pattern_2         //senthil sir code
{
    public static void main(String[] args) 
    {
        int  n = 5;
        for(int i = 0,p=1;i<n;i++,p++)  // 1st loop prints the hill pattern upto 5s
        {
            for(int j = i;j<=n;j++)
            {
                System.out.print(" ");
            }
            for(int k=0;k<=i-1;k++) // i-1 since we want to delete one column in middle to
            {
                System.out.print(p);
            }
            for(int z=0;z<=i;z++)
            {
                 System.out.print(p);
            }
            System.out.println();
        }

        int n2=4;
        int n3= 7;
        for(int i =0,p1=4;i<=4;i++,p1--)
        {
            for(int j=0;j<i+3;j++)
            {
                System.out.print(" ");
            }
            for(int j =n3;j>0;j--)
            {
                System.out.print(n2);
            }
            // for(int z=i-1;z>=n2;z--)
            // {
            //     System.out.print(p1);
            // }
            n2--;
            n3=n3-2;
            System.out.println();

        }
        
    }
}

class left_triangle_number_pattern
{
    public static void main(String[] args) 
    {
        for(int i=1;i<=5;i++)
        {
            int p=1;                      // her we use a p at start of 2nd loop so that at eachg j loop iteration it starts at 1 and prints to the reccuring limit ;   instead of coventinal * used before
            for(int j =1;j<=i;j++)
            {
                System.out.print(p++);
            }
            System.out.println();
        }
        
    }
}


class inverted_left_triangle
{
    public static void main(String[] args) 
    {
        int n =5;
        for(int i = 1;i<=n;i++)
        {
            int p=1;
            for(int j = i;j<=n;j++)
            {
                System.out.print(p++);
            }
            System.out.println();
        }
        
    }
}

class inverted_right_triangle
{
    public static void main(String[] args) 
    {
        int n=5;
        for(int i= 1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)            // incresing space loop 
            {
                System.out.print(" ");
            }
            int p=1;
            for(int z= i;z<=n;z++)
            {
                System.out.print(p++);
            }
            System.out.println();
        }

        
    }
} 

class hill_number_pattern
{
    public static void main(String[] args) 
    {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=i;j<=n;j++)
            {
                System.out.print(" ");
            }
            int p=1;
            for(int j=1;j<=i;j++)
            {
                System.out.print(p++);
            }
            //int p2=1;                       dont use any p2 or other digit here since its not recuuring no.s we're priting here ; we are printing incrementing numbers here
            for(int z=1;z<=i-1;z++)
            {
                System.out.print(p++);  // instead we just put p and in this 2nd loop it starts off from the leftover i values of the 1st loop and prints the succeding incrementing no.s  
            }
             System.out.println();
        }
        
    }
}

class diamond_number_pattern_3                  //  2025-08-03-22-08-56.png
{
    public static void main(String[] args) 
    {
        int n = 5;
        for(int i = 0;i<n;i++)
        {
            for(int j = i;j<=n;j++)         // this loop is the normal easy hill increasing pattern
            {
                System.out.print(" ");
            }
            int p =1;
            for(int z= 0 ;z<=i;z++)
            {
                System.out.print(p++);
            }
            for(int x= 0;x<=i-1;x++)
            {
                System.out.print(p++);
            }
            System.out.println();
        }

        // inverted part                    (this is the hard stuff since it has to continue from the second last row of the above hill not th last row)
        
        int n2=4;                  // we put 4 here instead of 5 here is because we dont want the middle part repeating again we want the second last row of the upper hill to be printing inverted here (so only 4 rows in total here)
        for(int l=1;l<=n2;l++)
        {
            for(int j=0;j<=l+1;j++)         // we use l+1 here since it is falling exactly one step behind in the inverted part so +1 so it can allign perfectly
            {
                System.out.print(" ");
            }
            int p2=1;
            for(int j=l;j<=n2;j++)
            {
                System.out.print(p2++);
            }
            for(int z=l;z<=n2-1;z++)       // -1 as always to reduce the one middle column
            {
                System.out.print(p2++);
            }
            System.out.println();
        
    }
}


}


class inverted_decresing                   // inverted part of the above problem
{
    public static void main(String args[])
    {
        int n2=5;
        for(int l=1;l<=n2;l++)
        {                                      // incomplete java editor
            for(int j=0;j<=l;j++)
            {
                System.out.print(" ");
            }
            int p2=1;
            for(int j=l;j<=n2;j++)
            {
                System.out.print(p2--);
            }
            for(int z=l;z<=n2-1;z++)
            {
                System.out.print(p2--);
            }
            System.out.println();
        }
      
         // inverted part
        int n2=4;                   
        for(int l=1;l<=n2;l++)
        {
            for(int j=0;j<=l;j++)
            {
                System.out.print(" ");
            }
            int p2=1;
            for(int j=l;j<=n2;j++)
            {
                System.out.print(p2++);
            }
            for(int z=l;z<=n2-1;z++)
            {
                System.out.print(p2++);
            }
            System.out.println();
        }
    }
}
 


class butterfly_star_pattern               // better little late than never
{
    public static void main(String[] args) 
    {
        int n = 5;
        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print("*");
            }
            for(int z=i;z<=n;z++)
            {
                System.out.print(" ");
            }
            for(int x=i;x<=n;x++)
            {
                System.out.print(" ");
            }
            for(int y=0;y<=i;y++)
            {
                System.out.print("*");
            }
            System.out.println();

        }

        for(int i =0;i<=n;i++)
        {
            for(int j=i;j<=n;j++)
            {
                System.out.print("*");
            }
            for(int z=0;z<=i;z++)
            {
                System.out.print(" ");
            }
            for(int x=0;x<=i;x++)
            {
                System.out.print(" ");
            }
            for(int y=i;y<=n;y++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

class butterfly_number_pattern
{
    public static void main(String[] args) 
    {
        int n=5;
        for(int i=0;i<=n;i++)
        {
            int p=1;
            for(int j=0;j<=i;j++)
            {
                System.out.print(p++);
            }
            for(int z=i;z<=n;z++)
            {
                System.out.print(" ");
            }
            for(int x=i;x<=n;x++)
            {
                System.out.print(" ");
            }
            int p2=1;
            for(int y=0;y<=i;y++)
            {
                System.out.print(p2++);
            }
            System.out.println();

        }
        // inverted part of butterfly
        
        int n2=4;               // we put 4 here instead of 5 here is because we dont want the middle part repeating again we want the second last row of the upper hill to be printing inverted here (so only 4 rows in total here)
        
        for(int l=0;l<=n2;l++)
        {
            int p2=1;
            for(int j=l;j<=n2;j++)
            {
                System.out.print(p2++);
            }
            for(int z=0;z<=l;z++)
            {
                System.out.print(" ");
            }
            for(int x=0;x<=l+2;x++)
            {
                System.out.print(" ");
            }
            int p3=1;
            for(int y=l;y<=n2;y++)
            {
                System.out.print(p3++);
            }
            System.out.println();
        }
        
    }
}

class left_triangle_decreasing_from5
{
    public static void main(String[] args) 
    {
        int n =5;
        
        for(int i = 1;i<=n;i++)
        {
            int p=5;
            for(int j =1;j<=i;j++)
            {
                System.out.print(p--);
            }
            System.out.println();

        }
    }
}

class right_triangle_decreasing_from5     // xxxxxxxxxxxxxxxx  easy but important logic xxxxxxxxxxxxxxxxxxxxxxxxxxxxxx 
{
    public static void main(String[] args)         // 2025-08-04-12-51-03.png
    {
        int n =5;
        for(int i = 1,k=n;i<=n;i++,k--)    // here since at each iteration the 1st element is decreasing or removed ;  so we use another variable which will remove the qst element of n and assign it to p so it can put it in decreasing loop(j=i;j<=n;j++) type loop and print that iteration
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print(" ");
            }
            int p=k;
            for(int z=i;z<=n;z++)
            {
                System.out.print(p--);
            }
            System.out.println();

        }
        
    }
}

class hill_pattern_increasing_then_decresing      //xxxxxxxxxxxxxxxx simple but important logic xxxxxxxxxxxxxxxxxxxxxxxxxxxxx
{
    public static void main(String[] args)        //2025-08-04-13-21-49.png
    {
        int n =5;
        for(int i=0;i<=n;i++)
        {
            for(int j=i;j<=n;j++)
            {
                System.out.print(" ");
            }
            int p=1;
            for(int z=0;z<=i;z++)
            {
                System.out.print(p++);      // here p++ to print normal incrementing traingle
            }
            for(int x=0;x<=i-1;x++)
            {
                System.out.print(p--);      // but here p-- to print the same triangle but decresing
            }
            System.out.println();
        }
        
    }
}

class floyd_traingle
{
    public static void main(String[] args) 
    {
        int n =5;
        for(int i=0,p=1;i<=n && p<=10;i++)
        {
            //int p=1;
            for(int j=0;j<=i;j++)           // super simple logic just print till 10 but put them at increasing logic and put println()
            {
                System.out.print(p++);
            }
            System.out.println();
        }
        
        
    }
}


//                        box patterns fro here 


class box
{
    public static void main(String[] args) 
    {
        for(int i=0;i<=5;i++)
        {
            for(int j=0;j<=5;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
}

class number_box
{
    public static void main(String[] args)
    {
        for(int i=0;i<=5;i++)
        {
            int p=1;
            for(int j=0;j<=5;j++)
            {
                System.out.print(p++);
            }
            System.out.println();
        }

        
    }
}
class number_box_2
{
    public static void main(String[] args)
    {
        int p=1;
        for(int i=1;i<=5;i++)
        {
            
            for(int j=1;j<=5;j++)
            {
                System.out.print(p);
                
            }
            p++;
            System.out.println();
        }

        
    }
}


class box_hollow
{
    public static void main(String[] args) 
    {
        int n=5;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==0 || i==4 || j==0 ||j==4)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
                
            }
            System.out.println();       // we place println() here instead of inside of 2nd loop like we normally do in triangles is because thats how squares or rectangles work they need to print one full row before moving to the next line 
                 
            
           // Golden Rule:  alaways put println() outside 2nd loop in square or rectangle problems
        }
        
    }
}


class pattern_number_28
{
    public static void main(String[] args) 
    {
        int n=5;
        for(int i=0;i<=n;i++)
        {
            for(int j =i;j<=n;j++)
            {
                System.out.print(" ");
            }
            int p=1;
            for(int z=0;z<=i-1;z++)
            {
                System.out.print(p--);
            }
            for(int x=0;x<=i;x++)
            {
                System.out.print(p++);
            }
            System.out.println();

        }
        
    }
}



class incresing_alternate
{
    public static void main(String args[])
    {
        int n=5;
        //int q = 1;
        for(int i=0,k=65,k2=1;i<=n;i++,k++,k2++)
        {
            for(int j=i;j<=n;j++)
            {
                System.out.print(" ");
            }
            int p=k;
            for(int z=0;z<=i;z++)
            {
                System.out.print((char)p--);
            }
            // int p2=k2;
            // for(int j=0;j<=i;j++)
            // {
            //     System.out.print(p2++);
            // }
            // System.out.println();
            int p2=66;
            for(int x=0;x<i;x++)
            {
                System.out.print((char)p2++);
            }
            System.out.println();
            
        }
    }
}

class question_15
{
    public static void main(String[] args) 
    {
        for(int i=0;i<=9;i++)
        {
            for(int j=0;j<=9;j++)
            {
                if(i==0 || i==9 ||j==0 ||j==9 )
                {
                    System.out.print("*");
                }
                else if(i==1&&j==1 || i==2&&j==2 || i==3&&j==3||i==4&&j==4 || i==5&&j==5 || i==6&&j==6 || i==7&&j==7 || i==8&&j==8)    // notice that its alternating * in the hollow part lile 1,1 2,2 3,3 and so on 
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        
    }
}


class question_30                            // incomplete wait finish basic box q first 
{
    public static void main (String args[])
    {
        int matrix[][] = new int[10][10];
        for(int i=0;i<=9;i++)  //rows
        {
            for(int j=0;j<=9;j++)   //columns
            {
                int digit =1;
                if(i % 2==0)
                {
                    matrix[i][j] = digit++;
                }
                else
            }
        }
    }
}

class question_30
{
    public static void main(String args[])
    {
        int n=10;
        int matrix[][] = new int[n][n];   // matrix[i][j] == rows then column always

        int digit=1;
        int left =0;         // use these two for only horizontal (left ->right || right -> left)
        int right =n-1;  // =9

        int top =0;         // use these for only vertical (top to bottom || bottom to top)
        int bottom = n-1;  // =9

        for(int i=left;i<=right;i++)  //this loop goes left->right 
        {
            matrix[top][i]=digit;  // notice here that the 
            digit++;
        }
        top++;  // top++ so that the boundary moves inward ; and dorsnt overwrite the no.s on the next iteration

        for(int j=top;top<=bottom;j++)
        {
            matrix[j][bottom]=digit;
            digit++;
        }
        right--;

        for(int z=right;z>=left;z--)  // why >= figure out gpt
        {
            matrix[right][z]=digit;
            digit++;
        }
        bottom--;
    }
}

class question_spiral_pattern_30          // Golden rule question  : 2025-08-07-20-47-20.png
{
    public static void main (String args [])     
    {
        int n=10;          // 2025-08-07-20-56-54.png
        int matrix[][]= new int[n][n];   // matrix[i][j] == rows then column always
        
        int digit=1;
        
        int left=0;                // use these two for only horizontal (left ->right || right -> left)
        int right = n-1;  //=9  
        
        int top=0;                // use these for only vertical (top to bottom || bottom to top)
        int bottom =n-1;  //=9
        
        while(left<=right && top<=bottom)    // this loop will run up untill the whole spiral is printed
        {
            for(int i=left;i<=right;i++)
            {
                matrix[top][i]=digit;
                digit++;                 
            }
            top++;                       // top++ so that the boundary moves inward ; and dorsnt overwrite the no.s on the next iteration
            for(int j=top;j<=bottom;j++)
            {
                matrix[j][right]=digit;
                digit++;
            }
            right--;                     // right-- so that it decreses each iteration and moves inward and doesnt overwrite in next iteration
            
            for(int z=right;z>=left;z--)
            {
                matrix[bottom][z]=digit;        // bottom first here in row bracke[] because watch closely row is same but columns are changing
                digit++;
            }
            bottom--;
            
            for(int x=bottom;x>=top;x--)
            {
                matrix[x][left]=digit;        // do understand these steps see respective images
                digit++;
            }
            left++;
        }
        
        for(int h=0;h<n;h++)     // to print matrix
        {
            for(int l=0;l<n;l++)
            {
                System.out.print(matrix[h][l]+ " ");
                
            }
            System.out.println();
        }
    }
}

class question_spiral_pattern_but_right_to_left_reverse   // same logic as the normal spiral but here we switch directions
{
    public static void main(String[] args)            //2025-08-07-20-56-31.png
    {
        int n=10;
        int matrix[][] = new int[n][n];
        int digit =1;

        int top = 0;
        int bottom =n-1;

        int left=0;
        int right=n-1;

        while(left<=right && top<=bottom)
        {
            for(int i=right;i>=left;i--)       // in this loop starts  from right to left;but here we will uselogic from like the bottom part of the normal spiral (see above for reference)
            {
                matrix[top][i]=digit;
                digit++;
            }
            top++;                            // but top ++ since we are still moving inwards    (same as for others)
            
            for(int j=top;j<=bottom;j++)     // in this loop moving from top to bottom but 
            {
                matrix[j][left]=digit;
                digit++;
            }
            left++;
            
            for(int z=left;z<=right;z++)     
            {
                matrix[bottom][z]=digit;
                digit++;
            }
            bottom--;
            
            for(int j=bottom;j>=top;j--)
            {
                matrix[j][right]=digit;
                digit++;
            }
            right--;
        }
        
        
        for(int h=0;h<n;h++)     // to print matrix
        {
            for(int l=0;l<n;l++)
            {
                System.out.print(matrix[h][l]+ " ");
                
            }
            System.out.println();
        }
        
    }
}



class merge_sort_practice
{
    public static void main(String[] args) 
    {
        int arr_1[] = {1,3};
        int arr_2[] ={2,8};

        int arr_3[] = new int[arr_1.length+arr_2.length];

        int beg_1=0;        // starting indexes for arr_1 & arr_2
        int beg_2 =0;

        int last_1 =1;      // ending indexes for arr_1 & arr_2
        int last_2 =1;

        int current_3=0;    // starting index for arr_3

        while(beg_1<=last_1 && beg_2<=last_2)
        {
            if(arr_1[beg_1] < arr_2[beg_2])         // if element from arr_1 is smallest then puts it in arr_3
            {
                arr_3[current_3]=arr_1[beg_1];
                beg_1++;
                current_3++;
            }
            else 
            {
                arr_3[current_3]=arr_2[beg_2];   // if element from arr_2 is smallest then puts it in arr_3
                beg_2++;
                current_3++;
            }

        }

        if(beg_1<=last_1)               // this loop will run when there zrent any more elements left to  compare i.e only a single element is remaining so nothing to compare with here this will include these leftover values to arr_3
        {
            while(beg_1<=last_1)
            {
                arr_3[current_3]=arr_1[beg_1];
                beg_1++;
                current_3++;
            }
        }
        else if(beg_2<=last_2)
        {
            arr_3[current_3] =arr_2[beg_2];
            beg_2++;
            current_3++;
        }

        System.out.print("The Sorted list :");
        for(int z=0;z<arr_3.length-1;z++)
        {
            System.out.print(arr_3[z]+" ");
        }

        
    }
}



import java.util.Arrays;
class selection_sort_practice
{
    public static void main(String[] args) 
    {
        int arr[]={6,7,8,4,3,1,9,2};
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]>arr[j])
                {
                    int temp =arr[i];
                    arr[i] = arr[j];
                    arr[j] =temp;
                }
            }
        }
        System.out.println("the sorted list using selection sort");

        System.out.print(Arrays.toString(arr)+" ");

    }
}

import java.util.Arrays;
class bubble_sort                            // little bit same as selection sort but difference here is that instead of checking one element with every other element it check xurrent and current+1 ; like (1,2) (2,3) ....
{
    public static void main(String[] args) 
    {
        int arr[] ={2,3,6,8,4,1};

        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp =arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1] =temp;
                }
            }
        }
        System.out.print("the sorted list using bubble sort: ");

        System.out.print(Arrays.toString(arr));
        
}
}


import java.util.Arrays; 
class insertion_sort
{
    public static void main(String[] args)
    {
        int arr []= {5,7,9,1,8,2};

        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]>arr[j])
                {
                    int temp = arr[j];   // smallest element
                    
                    for(int z=j;z>i;z--)  // this loop shifts 1 space right side so we can place the smallest element at the start
                    {
                        arr[z]=arr[z-1];  // shifts the current elment(i) to the current+1(j) place uptil one place is left at the start
                    }
                    arr[i]=temp;  // now that the after shifting the 1st element is free put the smallest element here
                    
                }
            }
        }

        System.out.print("the sorted list using insertion sort :");
        System.out.print(Arrays.toString(arr));
        
    }
}



import java.util.Arrays;

class sort_elements_in_descending_order_q12
{
    public static void main(String args[])
    {
        
   
    int arr[] ={2,3,9,8,1,4};
    
    for(int i=0;i<arr.length;i++)
    {
        for(int j=i+1;j<arr.length;j++)
        {
            if(arr[i]<arr[j])
            {
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
            
        }
        
    }
    System.out.print("Descending sorted list using selection sort");
        System.out.print(Arrays.toString(arr));
    }
}




class binary_search
{
    public static void main(String[] args)      // explanation : 2025-08-10-11-48-58.png
    {
        int arr[] = {1,2,3,4,8,10,15,22,25,26,29,30,40,45};

        int beg=0;
        int last=arr.length-1;

        
        int num=25;
        while(beg<=last)
        {
            int mid = (beg+last)/2;   //

        if(num>arr[mid])
        {
            beg =mid;
           // mid++;           // this step is useless we are not incrementing or decrementing based on if (noooo) we are manually reducing the indexes based on if and else if conditions  ; THIS IS  BINARY SEARCH !!!!!! 
        }
        else if(num<arr[mid])
        {
            last=mid ;
            //mid--;
        }
        else
        {
            System.out.print("num found at index: "+ mid);
            break;
        }
    }
        
    }
}

import java.util.Arrays;
class delete_element_at_desired_postion
{
    public static void main(String[] args) 
    {
        int arr[] ={1,2,3,4,5};
        int del_element =2;;

        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i] == del_element)
            {
                for(int j=i;j<arr.length-1;j++)
                {
                //int temp =arr[i];
                arr[j] =arr[j+1];
                }
                arr[arr.length-1]=0;;
                    break;
            }
            
        }
        
        System.out.print(Arrays.toString(arr));
        
    }
}

class second_largest_element_in_array
{
    public static void main(String[] args) 
    {
        int arr[]={1,3,6,8,4};
        int largest =1;
        int second_largest =3;

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>largest)      // finding largest then seocond largest
            {
               //largest = second_largest;    this is wrong since you are assigning two different values to largest at the same time see properly
                second_largest =largest;
                largest =arr[i];
            }
            else if(arr[i]>second_largest && arr[i]<largest)   // now finding new second largest if it exists
            {
                second_largest =arr[i];

            }
        }
         System.out.println("the largest element is : "+ largest);


        System.out.print("the second largest element is : "+second_largest);

        
    }
}

class second_smallest 
{
    public static void main(String[] args) 
    {
        int arr[] ={3,4,8,1,9};
        int smallest = 3;
        int second_smallest = 4;

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<smallest)
            {
                second_smallest = smallest;
                smallest =arr[i];
            }
            else if(arr[i]>second_smallest && arr[i]<smallest)
            {
                second_smallest =arr[i];
            }
        }

        System.out.println("the smallest element is : "+smallest);

        System.out.print("the second smallest element is: "+ second_smallest);
        
    }
}


import java.util.Arrays;
class transpose_of_given_matrix
{
    public static void main(String[] args) 
    {
        int matrix[][] ={ {1,2,3},
                          {4,5,6}

        };
        
        int matrix_transpose [][]= new int[3][2];

        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                matrix_transpose[j][i]= matrix[i][j];
            }
        }

        // System.out.print("the transpose matrix : "+ Arrays.toString(matrix_transpose));  // dont us this for matrixes it will give gibberish
        for(int z=0;z<matrix_transpose.length;z++)
        {
            for(int x=0; x<matrix_transpose[0].length;x++)
            {
                System.out.print(matrix_transpose[z][x]+ " ");
            }
            System.out.println();
        }


    }

}



class lower_triangular_matrix        // explantion : 2025-08-12-16-53-33.png
{
    public static void main(String[] args) 
    {
        int matrix [][] ={ {1,2,3},
                           {4,5,6},
                           {7,8,9}
        };

        for(int i=0;i<=2;i++)
        {
          //for(int j=i;j<=2;j++)              normally this would work here but in here its matrix and we need the even smaller part of the decresing right traingle (see image for explantion)
            for(int j=i+1;j<=2;j++)   
            {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
        
    }
}
class upper_triangulr_matrix           //explanation :2025-08-12-17-03-30.png
{
    public static void main(String[] args) 
    {
        int matrix [][] ={ {1,2,3},
                           {4,5,6},
                           {7,8,9}
        };

        for(int i=0;i<=2;i++)
        {
          //for(int j=0;j<i;j++)       // again like the above one this gives the bigger left traingle and we want the smaller inner left traingle so +1 to not include the 0 parts (see image for explanation)
            for(int j=0;j+1<=i;j++)
            {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
        
    }
}


class sparse_matrix
{
    public static void main(String[] args) 
    {
        int matrix[][] ={{0,0,7},
                         {0,0,0},
                         {4,0,0,}
                        
    };

        int count =0; 
        for(int i=0;i<matrix.length;i++) 
        {
            for(int j=0;j<matrix.length;j++)
            {
            if(matrix[i][j]== 0)
            {
                count++;
            }
        }
            
        }  
        
        if(count >= 5)
        {
            System.out.print("it is a sparse matrix");
        }
        else
        {
            System.out.print("it is a not sparse matrix");
        }
                
    }
}

class identity_matrix            // identity matrix is the matrix in which the the diagonals should be only 1s and the upper and lower traingular matrices should be 0s
{
    public static void main(String[] args) 
    {
        int matrix [][] ={{1,0,0},
                          {0,1,0},
                          {0,0,1}
    };
        
        int count =0;
        int count_upper =0;
        int count_lower=0;
        for(int i=0;i<matrix.length;i++)    // loop to calculate the diagonals 1s
        {
            if(matrix[i][i] ==1)
            {
                count ++;
            }
        }
        for(int i=0;i<=3;i++)        // loop to calculate the upper trianglar matrix
        {
            for(int j=i+1;j<=2;j++)
            {
                if(matrix[i][j]==0)
                {count_upper++;}
            }
        }
        for(int i=0;i<=2;i++)       // loop to calculate the lower triangular matrix
        {
            for(int j=0;j+1<=i;j++)
            {
                if(matrix[i][j]==0)
                {count_lower++;}
            }
        }

        if(count==3 && count_upper==3 && count_lower==3)
        {
            System.out.print("it is an identity matrix");
        }
        else
        {
            System.out.print("it is not an identity matrix");
        }
        

        
    }
}

class pair_with_given_pair_in_array
{
    public static void main(String[] args) 
    {
        int arr[] ={1,2,3,4,5,7};
        int sum =9;

        for(int i=0;i<arr.length;i++)
        {
            int k=0;
            for(int j=k;j<arr.length;j++)
            {
                if(arr[i] != arr[j])
                {
                    if(arr[i]+arr[j] == sum)
                {
                    System.out.println("the pair are :"+arr[i]+ " ,"+arr[j]);
                }
                    
                }
                

            }
        }
        
    }
}

class majority_element_of_an_array
{
    public static void main(String[] args) 
    {
        int arr[] ={4 ,8 ,4, 6, 7, 4, 4, 8};

        int max_count=0;
        int majority_element =-1;
        for(int i=0;i<arr.length;i++)
        {
            //int k=0;
            //int max_count=0;

             int count =0;
            for(int j=0;j<arr.length;j++)
            {
               
                
                //if(arr[i] != arr[j])
                
                    if(arr[i] == arr[j])
                    {
                        count++;
                    }
                    else if(count>max_count)
                    {
                        max_count =count;
                        majority_element=arr[i];
                    }
                    //majority_element=arr[i];
                

            }
            
        }
        System.out.print("the majority element is: "+ majority_element);
        
    }
}

class palindrome_sentence_or_not
{
    public static void main(String[] args) 
    {
        String palindrome ="malayalam is the wow language";

        String split_words[] = palindrome.split(" "); // this will split the string into an array of strings to be used like arr[i]

        for(int i=0;i<split_words.length;i++)      // this will iterate through each value of String like a array like arr[i]
        {
            String one_word = split_words[i];

            int left =0;
            int right = one_word.length()-1;

            while(left <= right)                // normal palindrome logic
            {
                if(one_word.charAt(left) != one_word.charAt(right))
                {
                    System.out.println(one_word+ " is not a palindrome");
                    break;
                }
                left++;
                right--;
            }

            if(left>right)
            {
                System.out.println(one_word+" is a palindrome");
            }
        }

        
    }
}

class reverse_each_word_of_string
{
    public static void main(String[] args) 
    {
        String word ="The distance between dream and reality is action";

        String split_words[] = word.split(" ");
                                                         // wrong logic here
        for(int i=0;i<split_words.length;i++)
        {
            String one_word = split_words[i];

            for(int j=0;j<one_word.length()/2;j++)
            {
                char temp = one_word.charAt(j);
                one_word.charAt(j) = one_word.charAt(one_word.length() -1 -j);
                one_word.charAt(one_word.length() -1 -j) =temp;


            }

        }
        
    }
}

class reverse_each_word_of_string
{
    public static void main(String[] args) 
    {
        String word ="The distance between dream and reality is action";

        String split_words[] = word.split(" ");

        for(int i=0;i<split_words.length;i++)
        {
            String one_word = split_words[i];
            
            //System.out.println(one_word+"     length:"+one_word.length());
            
            for(int j=one_word.length()-1;j>=0;j--)
            {
                System.out.print(one_word.charAt(j));
            }
            
            System.out.print(" ");
            //System.out.print(one_word)
            // for(int j=0;j<one_word.length()/2;j++)
            // {
            //     char temp = one_word.charAt(j);
            //     one_word.charAt(j) = one_word.charAt(one_word.length() -1 -j);
            //     one_word.charAt(one_word.length() -1 -j) =temp;


            // }

        }
        
    }
}

class first_and_last_capital_letter         // incomplete come bacj later
{
    public static void main(String[] args) 
    {
        String str = "The distance between dream and reality is action";

        String split_words [] =str.split(" ");


        for(int i=0;i<split_words.length;i++)
        {
            String one_word = split_words[i];

            for(int j=one_word.length()-1;j>=0;j--)
            {
                if(one_word.charAt(j) == one_word.length()-1 || one_word.charAt(j) == one_word.charAt(0))
                {
                    one_word.toUpperCase(one_word.charAt(j));

                }
            }
        }

        
    }
}


//              xxxxxxxxxxxxxxx   String and String manipulation basics (Stringbuffer and Stringbuilder)


class string_buffer_basics       // more on this down   
{
    public static void main(String[] args)     // String_methods_uses explained
    {
        StringBuffer str = new StringBuffer("Hello");

        //str.append(",world");                //append : it will put the value to inserted (or appended) at the end of the String 

        str.insert(5," , world");  // insert: it will put the value at the specific index provided (like here it inserts world at index 5)
 
       //str.delete(5,12)            this will only delete worl  not d because in delete the last index ois not included you have to go one more index (even out of bounds to delete the wanted index)
        str.delete(5,13);
        System.out.print(str);
        
    }
}

class string_upper_lowercase_basics_also_immutable_basics
{
    public static void main(String[] args) 
    {
        String original = "java";
        
        String another_modified = original.concat("programming");

        System.out.println(original); 
        System.out.println(another_modified);
        
        System.out.println("orginal string after concat used :  (remains unchanged) : "+original);
        
        original.toUpperCase();
        System.out.println("attempt to modify original (will not change) : "+original);
        
        another_modified.toUpperCase(); // this will not work since again it is not the original so create a new string then uppercase it 
        
        // System.out.print("attempt to modify the modified_string (will change since it is not the original) : "+ another_modified);
        
        String another_modified_UpperCase = another_modified.toUpperCase();  
        
          System.out.print("attempt to modify the modified_string (will change since it is not the original) : "+ another_modified_UpperCase);


        
    }

}

class comparison_using_equals_method     //equals() method : comapres the content inside the strings (ex: mano =mano || Mano != mano )
{
    public static void main(String[] args) 
    {
        String str1 = "mano"; 
        String str2 = "mano";
        String str3 = "Mano";

        boolean compare = str1.equals(str2);      // this will be true since mano and mano are equal 
        
        boolean compare_2 = str2.equals(str3);  // this will be false since the Mano != mano (because M != m) remember equals compares the content inside the String 

        System.out.println("str1 & str2 equal or not :"+compare);     // output : true
        System.out.println("str2 & str3 equal or not :"+compare_2);   // output : false


        
    }
}

class comparison_using_equal_to_equal_to_operator     // comparing using == operator 
{
    public static void main(String[] args) 
    {
        String str1 = "kohli";
        String str2 = "kohli";

        String str3 = new String("kohli");

        boolean compare_str1_str2 = str1 == str2;     // this is TRUE because when we create str2 with the same String content it sees that there is already a String "kohli" in the string pool and instead of creating a new one it just points to the str1 content int the String pool

        boolean compare_str2_str3 = str2 == str3;     // this is FALSE because when we create using "new" then we are creating in a new String pool then it doesnt matter if there is already a same String content ;  it will still create a new String pool for "kohli"

        System.out.println("comparing str1 and str 2 : "+compare_str1_str2);   

        System.out.println("comparing str2 and str 3 : "+compare_str2_str3);



        
    }
}

class comparisom_using_CompareTo_operators      // using compareTo() operator
{
    public static void main(String[] args) 
    {
        String str1 = "ratan";      
        String str2 = "ratata";   // the differing 1st element is n and t :   (n=110) & (t = 116) so (110-116) = -6

        System.out.print(str1.compareTo(str2));  // output = -6  ;  the compareTo method will always find and compare the ascii values of the first differing element only 


        
    }
}

class comparison_using_Startswith_endswith_methods     // using startsWith() and endsWith() methods
{
    public static void main(String[] args) 
    {
        String str1 ="Hello World";

      //String start = str1.startsWith(("Hello"));           xxxxxx Golden rule : startsWith() and endsWith() methods  always can only be used with boolean  
        
        boolean start = str1.startsWith(("Hello"));

        boolean end = str1.endsWith("World");

        System.out.println("str1 starts with Hello : "+ start);

        System.out.println("str1 ends with Hello : "+ end); 
    }
} 



//              xxxxxxxxxxxxxxxxxxxxxxxx   Different ways to concatenate  xxxxxxxxxxxxx 

class comparison_using_plus   // using + operator 
{
    public static void main(String[] args) 
    {
        String str1  = "virat" + "kohli" + 19;
        System.out.println(str1);      // the most rudimentart way to add strings    (although this is just initialization adding its pretty useless to be honest)
        
    }

}

class using_concat_method     // using concat() method
{
    public static void main(String[] args) 
    {
        String str1 = "Virat";

        String str2 = "Kohli ";

        String str_concat = str1.concat(str2);      // always remember this is not like arrays you always need to create a new instance every time you want to use these methods like concat you need to create a new string or use Stringbuilder(see down for this)

        System.out.println(str_concat);
        
    }
}

class using_stringBuilder
{
    public static void main(String[] args) 
    {
        String str1 = "Hello";
        String str2 ="World";

        StringBuilder str3 = new StringBuilder();
        //str3.concat(str1); // Golden rule cannot use concat() with StringBuilder or StringBuffer ( only for String exclusively)
        
        str3.append(str1);
        str3.append(str2);
        
        str3.insert(0,"18");  // insert: puts itn at the particular index

        str3.append(18);  // append : puts it at last of the string

        System.out.println(str3);


        
    }

}

class using_split_method
{
    public static void main(String[] args) 
    {
        String str1 ="Hello";
        String str2 = "World";

        String combine = String.join(" ",str1,str2);   // delimeter : its the differentiating element used like we do in split(" ")
        System.out.println(combine);
        
    }
}





//           how to use substrings in java

class using_substring_method
{
    public static void main(String[] args) 
    {
        String str1 = "Hello World";
    //                                                  now you might be thinking how can this work since strings are immmutable (or you need to use StringBuilder)  but here we are not changing the string or anything here we are simply printing the String indexes
    System.out.println(str1.substring(2));
    System.out.print(str1.substring(0,5));    // remember start index is includes(inclusive)  but the end index is not included(exclusive)  so use index_wanted +1
        
    }
}








//                xxxxxxxxxxxxxxxxxxxxxxxxxxx   some java methods used (which we havent done already or just done for practice)       xxxxxxxxxxxxxxxxxxxxxxxx




class using_Uppercase_lowercase
{
    public static void main(String[] args) 
    {
        String str1 = "hello";       
                     //   Golden rule: Methods like substring(), toUpperCase(), toLowerCase(), trim() replace() , startsWith() , endsWith() all return a new String instead of changing the original.  (basically these have immunity )

        System.out.println(str1.toUpperCase());  // see this works because we are not putting  new content inside the String inside ; we are only using or manipulating data that is already there
        
    }
}

class using_trim_method
{
    public static void main(String[] args) 
    {
        String str1 ="            sachin";

        System.out.print(str1.trim());    // trim() : it will remove all the spaces before and after the String
        
    }
}

class using_starts_With_and_endsWith
{
    public static void main(String[] args) 
    {
        String str1 = "Hello World";

        System.out.println(str1.startsWith("Hello"));   // output: true
        System.out.println(str1.endsWith("World"));    // output: true 


        
    }
}

class using_valueOf_method
{
    public static void main(String[] args) 
    {
        int a=10;
        String convert_to_String = String.valueOf(a);   // put it into another string like normally

        //System.out.print(valueOf(a));         this wont work since valueOf doesnt have immunity like the others
        System.out.println(convert_to_String);
    
        
    }
}

class using_replace_method
{
    public static void main(String[] args) 
    {
        String str1 = " java is language , java is platform independent";

        String replace_String = str1.replace("java", "kava");  // replace: replaces the first element with the second element
        
        //String replace_string_at_index = str1.replace(6,7," java"); // this works just  not in normal string use Stringbuilder it will work
        
        
        System.out.println(replace_String);
        
    }
}





//                xxxxxxxxxxxxxx  StringBuilder (fully explained) xxxxxxxxxxxx

class using_stringBuilder
{
    public static void main(String[] args) 
    {
        StringBuilder str1 = new StringBuilder();
      //StringBuilder str1 = new StringBuilder("java");       you can even initilaize like this in the declaration itself 

        str1.append("Hello");
        str1.insert(5,"World");

        str1.replace(1,2,"java");     // use can use replace() with indexes too but ONLY with Stringbuilder class

        str1.reverse();

        System.err.println(str1);
        
    }
}
//               xxxxxxxx     thats it       xxxxxxxxx


class splitting_string           // Golden rule question : how to simply manipulate Strings 
{
    public static void main(String[] args) 
    {
        String str1 = "java is platform independent";

        String split_words[] = str1.split(" ");

        for(int i=0;i<split_words.length;i++)
        {
            System.out.println(split_words[i]);
        }
        
        for(int i=split_words.length-1 ;i>=0;i--)
        {
            System.out.print(split_words[i] + " ");
        }
        
    }
}

// ASCII values (a-Z) and 1-9

// a = 97
// b = 98
// c = 99
// d = 100
// e = 101
// f = 102
// g = 103
// h = 104
// i = 105
// j = 106
// k = 107
// l = 108
// m = 109
// n = 110
// o = 111
// p = 112
// q = 113
// r = 114
// s = 115
// t = 116
// u = 117
// v = 118
// w = 119
// x = 120
// y = 121
// z = 122

// Uppercase letters (A-Z)
// A = 65
// B = 66
// C = 67
// D = 68
// E = 69
// F = 70
// G = 71
// H = 72
// I = 73
// J = 74
// K = 75
// L = 76
// M = 77
// N = 78
// O = 79
// P = 80
// Q = 81
// R = 82
// S = 83
// T = 84
// U = 85
// V = 86
// W = 87
// X = 88
// Y = 89
// Z = 90

// 0 = 48
// 1 = 49
// 2 = 50
// 3 = 51
// 4 = 52
// 5 = 53
// 6 = 54
// 7 = 55
// 8 = 56
// 9 = 57

import java.util.Scanner;
class split_alphabets_and_numbers       // Golden rule question
{
    public static void main(String[] args) 
    {
        System.out.println("enter string : ");
        Scanner str = new Scanner(System.in);

        String str1= str.nextLine();

        String str2 = "";
        String str3 = "";

        for(int i=0;i<str1.length();i++)
        {
            char split_into_char = str1.charAt(i); 

            // String split_string []= str1.split(" ");       use this only when you need to split entire Strings full of words (ex: java is platform independent) but in this sum there is only one string (ex: xyz456)  ; so when one string is there use char

            
            
            
            if(split_into_char >=97  && split_into_char <=122)   // loop for alphabets
            {
                str2 = str2 + split_into_char;     // you can even add like normal int or arrays
            }

            else if(split_into_char >= 48  &&  split_into_char<=57)
            {
                str3 = str3 + split_into_char;
            }
        }

        System.out.println("the alphabets: "+str2);

        System.out.println("the numbers: "+ str3);
        
    }
}

class convert_to_upper_if_lower_and_vice_verca
{
    public static void main(String[] args) 
    {
        String str = "Sachin Best Batsman in the World";

        for(int i=0;i<str1.length();i++)
        {
            char str1 = str.charAt(i);                  // isUpperCase() : ONLY checks if uppercase or not (this is only for checking whether uppercase or not )
                                       
                                                       //  toUpperCase() : converts to uppercase
            if(Character.isUpperCase(str1))
            {
                System.out.println(Character.toUpperCase(i));
            }
            else if(Character.isLowerCase(i))
            {
                System.out.println(Character.toUpperCase(i));
            }
        }
        
    }
}

class convert_to_upper_if_lower_and_vice_verca_using_ascii

{
    public static void main(String[] args) 
    {
        String str = "Sachin Best Batsman in the World";

        for(int i=0;i<str.length();i++)
        {
            char str1 = str.charAt(i);   // using char here instead of String since we need to check each letter of string in this q ; not the full word 

            if(str1 >=65 && str1<=90)   // loop for capital letters (A-Z)
            {
                System.out.println(Character.toLowerCase(str1));
            }
            else if(str1>=97 && str1<=122) // loop for smaller letters (a-z)
            {
                System.out.println(Character.toUpperCase(str1));  // Golden rule: always whilst referencing single characters we use Character keyword (since char doesnt have built in keywords like str1.Uppercase() or str1.Lowercase() ) that is why we use Character keyword (otherwise for string normal Str1.UpperCase would work fine) 
            }


        }        
    }
}

class convert_first_and_last_letter_to_capital  // Golden rule question  (very very very important) 
{
    public static void main(String[] args) 
    {
        String str = "The distance between dream and reality is action";

        //for(int i=0;i<str.length();i++)   just split once that is plenty
        
            String split_words[] = str.split(" ");

            for(int i=0;i<=split_words.length-1;i++) // this loop for iterating through words
            {
                String one_word = split_words[i];
                //if(one_word.charAt(j)== 0 && one_word.charAt(j) == one_word.length()-1)
                
                for(int j=0;j<=one_word.length()-1;j++) // this loop for iterating through each letter of word
                {
                if(j==0 || j==one_word.length()-1)
                {
                    //System.out.print(one_word.toUppercase());
                    System.out.print(Character.toUpperCase(one_word.charAt(j)));
                }
                else
                {
                    System.out.print(one_word.charAt(j));
                }
                }
                
                System.out.print(" ");  // for printing space in between the words
            }

    
        
    }
}

class convert_first_and_last_letter_to_capital    //   xxxxxxxxx wrong logic xxxxxxxxxxxxxxxxxxxxxxxxxxxx   (kept for reference of what went wrong)
{
    public static void main(String[] args) 
    {
        String str = "The distance between dream and reality is action";

        //for(int i=0;i<str.length();i++)   just split once that is plenty
        
            String split_words[] = str.split(" ");

            for(int j=0;j<=split_words.length;j++)
            {
                String one_word = split_words[j];
                //if(one_word.charAt(j)== 0 && one_word.charAt(j) == one_word.length()-1)
                if(j==0 || j==one_word.length()-1)
                {
                    //System.out.print(one_word.toUppercase());
                    System.out.print(Character.toUpperCase(one_word.charAt(j)));
                }
                else
                {
                    System.out.print(one_word.charAt(j));
                }
            }
            
            
    }
}


//          xxxxxxxxxxxxxx     char methods()   [isDigit(), isLetter(), isLetterOrDigit(), isWhitespace(), isUpperCase(), isLowerCase(), toUpperCase(), toLowerCase(), getNumericValue(), isAlphabetic() , toString()]        xxxxxxxxxxx

class using_isDigit_method        // Golden rule question
{
    public static void main(String[] args) 
    {
        char chr = '7';

        System.out.println(Character.isDigit(chr));    // remember for all char related stuff YOU ALWAYS NEED TO USE   xxxxxxxxxx  "Character" xxxxxxxxxx
        
    }
}

class using_isLetter_method
{
    public static void main(String[] args) 
    {
        char chr = 's';

        System.out.println(Character.isLetter(chr));
        
    }
}

class using_isLetterOr_digit_method
{
    public static void main(String[] args) 
    {
        char chr = 'L';
        char chr1 = ' ';   // false : since it comes true only for letters or digits (not even whitespaces)
        char chr2 = '-';   // false  : even whitespaces are invalid only those two 

        System.out.println(Character.isLetterOrDigit(chr));


        
    }
}

class using_isWhitespace_method
{
    public static void main(String[] args) 
    {
        char chr = ' ';
        char chr1 = '-';  // false: since it will only work for Whitespaces and nothing else

        System.out.println(Character.isWhitespace(chr));
        
    }
}

class using_isUpperCase_isLowerCase
{
    public static void main(String[] args) 
    {
        char chr = 'h';
                                                        // is_Whatever is always ONLY checks whether is UpperCase or LowerCase (never changes it or anything it is there to only check)
        System.out.println(Character.isLowerCase(chr));   
        System.out.println(Character.isUpperCase(chr));  // false
        
    }
}

class using_toUpperCase_toLowercase
{
    public static void main(String[] args) 
    {
        char chr = 's';
                                                    // to_Whatever is always used to convert to respective UpperCase or LowerCase 
        System.out.println(Character.toUpperCase(chr));
        System.out.println(Character.toLowerCase(chr));  // even if already lowercase it will still work and print 
        
    }
}
class using_getNumericValue_method    // getNumericValue() converts the char to int format    (ex '5' to 5 (int format))
{
    public static void main(String[] args) 
    {
        char chr = '9';    // will convert String num to Interger int ( '5' -> int 5)

        System.out.println(Character.getNumericValue(chr));   
        
    }
}

class using_int_explicitly          // although not a method but this is a cheeky(explicitly) way to get ascii values
{
    public static void main(String[] args) 
    {
        char chr = 'a';
        System.out.println((int)chr);
        
    }
}

class using_isAlphabetic        // checks whether alphabet or not
{
    public static void main(String[] args) 
    {
        char chr = 'a';
        char chr1 = '1';   // false : isAlphabetic only check if the char is alphabet or not (doesnt matter small or capital)

        System.out.println(Character.isAlphabetic(chr));
        
    }
}

class  using_toString_method          // .toString() method converts the char to String
{
    public static void main(String[] args) 
    {
        char chr = 'a';
        System.out.println(Character.toString(chr));
        
    }
}

class to_find_alphanumeric       // Alphanumeric : = Letters + Digits (alphanumeric is the part of the String that is either a letter or digit and nothing else)
{
    public static void main(String[] args) 
    {
        String str1 = "Hello123!@#";

        for(int i=0;i<str1.length();i++)
        {
            char chr = str1.charAt(i);

            if(Character.isLetterOrDigit(chr))
            {
                System.out.println("this is alphanumeric "+chr);
            }
            else
            {
                System.out.println("this is not alphanumeric: "+chr);
            }
        }
        
    }
}











//   xxxxxxxxxxxxxxxxxxxxxxxxxxxxxx   questions from 5_string manipulation-26-27.pdf      xxxxxxxxxxxxxxxxxxxxxxxxxxxxx

import java.util.Scanner;
class prompts_phone_number_check_valid_or_not_q1
{
    public static void main(String[] args) 
    {
        System.out.println("please enter no. in string in format 017-555-1212: ");
        Scanner sc = new Scanner(System.in);

        String str1 = sc.nextLine();

        //String split_words[] = str1.split("-");   

        // for(int i=0;i<str1.length();i++)        // no need to split each part into characters (can do but lengthy) ; here only need to confirm at indexes 3 & 7 whether they are '-' to be valid ( so just use str.charAt == index   ; thats it done)
        // {
        //     char chr = str1.charAt(i);

        //     System.out.print(chr);

        // }   

        if(str1.charAt(3) == '-' && str1.charAt(7) == '-')
        {
            System.out.print(" the no. is valid");
        }
        else
        {
            System.out.println("the no. is not valid");

        }

        
    }
}

import java.util.Scanner;
class extract_all_digits_from_String
{
    public static void main(String[] args) 
    {
    
        System.out.println("enter string : ");
        Scanner sc = new Scanner(System.in);

        String str1 = sc.nextLine();

        String str2= "";      // string for storing alphabets
        String str3 = "";      // string for storing digits
        String str4 = "";      // string for storing the sum
        
        int sum =0;

        for(int i=0;i<str1.length();i++)
        {
            char chr = str1.charAt(i);

            if(Character.isAlphabetic(chr))       // this loop check and puts the alphabets in the str2
            {
                 //str2 = chr;

                 str2 = str2 + Character.toString(chr);  //      Golden rule:    toString : used to convert char stuff to String
            }
            else                                  // this loop puts the numbers in the str3 for digits
            {
                str3 = str3+ Character.toString(chr);
            }
            if(Character.isDigit(chr))             // this loop is used to put the digits in sum part and add them 
            
                //str4 = str4 + Character.to(chr);
                //str4 =str4 + Character.getNumericValue(chr);  // this wont work this will just put the numbers in the string (not add them)
                 
                
                
                sum = sum + Character.getNumericValue(chr);   // we use .getNumericValue() func to convert the digit char ('5') to actual integers (int 5)    
            
        }
        
        System.out.print("the Alphabets :");
        for(int z=0;z<=str2.length()-1;z++)
        {
            System.out.print(str2.charAt(z));

        }
        System.out.println();
        System.out.print("the numbers: ");
        for(int x=0;x<=str3.length()-1;x++)~
        {
            System.out.print(str3.charAt(x));
        }
        System.out.println();

        System.out.print("the sum is:"+ sum);
        // for(int y=0;y<=str4.length()-1;y++)
        // {
        //     System.out.print(str4.charAt(y));
        // }
}
}


import java.util.Scanner;
class find_no_of_words_characters_alphanumeric_percentage_q3
{
    public static void main(String[] args) 
    {
        System.out.println("enter String: ");
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        //int count =0;
        //int count_alphanumeric =0;   // we used this initially but we needed to get percentages for the alphanumeic so we went with double since it gives in decimals
        
        double count =0;
        double count_alphanumeric =0;
        
        String split_words [] = str.split(" ");
        
        System.out.println("the number of words: "+ split_words.length);

        for(int i =0;i<str.length();i++)
        {
            // char chr  = split_words.charAt(i);  wont work explain once sum is over

            char chr = str.charAt(i);
            
            //System.out.println(chr);

            if(Character.isAlphabetic(chr))
            {
                count++;
            }
            else if(Character.isWhitespace(chr))
            {
                count++;
            }
            if(Character.isLetterOrDigit(chr))
            {
                count_alphanumeric++;
            }
            
        }

        System.out.println("the no. of characters including whitespaces and punctuation  : "+ count);

        System.out.println("the number of alphanumeric part: " + count_alphanumeric);
        
        double percentage = (count_alphanumeric/count)*100;
        
        System.out.println("the percentage of alphanumeric parts : "+ percentage);
        
        
    }
}

import java.util.Scanner;
class LowerCase_to_UpperCase_repeatedly_prompt_q_to_quit_q4
{
    public static void main(String[] args) 
    {
        
        
            for(int j=0;j<=10;j++)   // this loop will keep on printing up until q is given to give in if loop
            {
                System.out.println("enter the String or 'q' to quit");
                Scanner sc = new Scanner(System.in);

                String str1 = sc.nextLine();

                String str2 = "";
                //Char chr2 = '';
                String quit = "q";
                if(str1.equals(quit))  // if q comes it will leave the program 
                {
                    break;
                }
                else
                {
                    for(int i=0;i<str1.length();i++)
                    {
                        char chr = str1.charAt(i);

                        if(Character.isUpperCase(chr))
                        {
                            //Char chr2 = '';
                            //str2 =str + Character.toString 
                            char chr2 = Character.toLowerCase(chr);
                            str2 =str2 + Character.toString(chr2);
                        }
                        else
                        {
                            char chr3 = Character.toUpperCase(chr);
                            str2 = str2 + Character.toString(chr3);
                        }
                    }
                    System.out.print(str2);
                    
                }

        }

    }

}


import java.util.Scanner;
class extract_digits_from_string_and_add_with_integer_q5
{
    public static void main(String[] args) 
    {
        System.out.println("enter the string : ");
        Scanner sc = new Scanner(System.in);

        String str1 = sc.nextLine();

        System.out.println("enter the integer : ");
        Scanner sc2 = new Scanner(System.in);

        int int1 = sc2.nextInt();

        int sum = 0; // integers taken from String will be added here

        int total_sum = 0;  // sum of digits from String and integer given by user

        for(int i=0;i<str1.length();i++)
        {
            char chr = str1.charAt(i);

            if(Character.isDigit(chr))
            {
                sum = sum + Character.getNumericValue(chr);
            }

        }
        total_sum = sum +int1;

        System.out.println("the sum of digits from String: "+sum);
        System.out.println("the integer from user : "+int1);
        
        System.out.println("total sum = "+total_sum);


        
    }
}


import java.util.Scanner;
class compare_String_and_print_in_left_right_triangle
{
    public static void main(String[] args)            // wrong logic code kept for reference
    {
        System.out.println("enter String one");

        Scanner sc = new Scanner(System.in);

        System.out.println("enter String two : ");

        Scanner sc2 = new Scanner(System.in);

        String str1 = sc.nextLine();

        String str2 = sc2.nextLine();
        
        String str1_container ="";   // stores the first half
        String str2_container ="";

        if(str1.length()>str2.length())
        {
            for(int i=0;i<str1.length()/2 ;i++)
            {
                char chr1 = str1.charAt(i);
                str1_container = str1_container + Character.toString(chr1);
            }
            for(int j = str1.length()/2 ; j<=str1.length()-1;j++)
            {
                char chr2 = str1.charAt(j);
                str2_container = str2_container + Character.toString(chr2);
            }
        }

        String matrix1[][] ={{" "," "," "," ",""},
        {" "," "," ",""," "},
        {" "," ",""," "," "},
        {" ",""," "," "," "},
        {""," "," "," "," "}
                         
        };


        for(int x=0;x<str1_container.length();x++)
        {
            
        for(int i =0; i<=matrix1.length;i++)
        {
            for(int  j =0;j<=matrix1.length;j++)
            {
                if(i+j == 4)
                {
                       matrix1[i][j] = String.valueOf(str1_container.charAt(x));
                   
                }
            }
        }
    }
        for(int x=0;x<matrix1.length;x++)
        {
            for(int y = 0;y<matrix1.length;y++)
            {
                System.out.print(matrix1[x][y]);
            }
            System.out.println();
        }    

        
    }
}





import java.util.Scanner;
class compare_String_and_print_in_left_right_triangle
{
    public static void main(String[] args) 
    {
        System.out.println("enter String one");

        Scanner sc = new Scanner(System.in);

        System.out.println("enter String two : ");

        Scanner sc2 = new Scanner(System.in);

        String str1 = sc.nextLine();

        String str2 = sc2.nextLine();
        
        String str1_container ="";   // stores the first half
        String str2_container ="";

        if(str1.length()>str2.length())
        {
            for(int i=0;i<str1.length()/2;i++)
            {
                char chr1 = str1.charAt(i);
                str1_container = str1_container + Character.toString(chr1);
            }
            for(int j = str1.length()/2 ; j<=str1.length() -1;j++)
            {
                char chr2 = str1.charAt(j);
                str2_container = str2_container + Character.toString(chr2);
            }
        }

        String matrix1[][] ={{" "," "," "," ",""},
        {" "," "," ",""," "},
        {" "," ",""," "," "},
        {" ",""," "," "," "},
        {""," "," "," "," "}
                         
        };


        //for(int x=0;x<str1_container.length();x++)
        
            int k =0;
        for(int i =0; i<matrix1.length;i++)
        {
            for(int  j =0;j<matrix1[0].length;j++)
            {
                if(i+j == 4 && k < str1_container.length()) 
                {
                       matrix1[i][j] = String.valueOf(str1_container.charAt(k));
                       k++;
                   
                }
                
            }
        }
    
        for(int x=0;x<matrix1.length;x++)
        {
            for(int y = 0;y<matrix1.length;y++)
            {
                System.out.print(matrix1[x][y]);
            }
            System.out.println();
        }    

        
    }
}


import java.util.Scanner;
class compare_String_and_print_in_left_right_triangle
{
    public static void main(String[] args)          // this logic too long
    {
        System.out.println("enter String one");

        Scanner sc = new Scanner(System.in);

        System.out.println("enter String two : ");

        Scanner sc2 = new Scanner(System.in);

        String str1 = sc.nextLine();

        String str2 = sc2.nextLine();
        
        String str1_container ="";   // stores the first half
        String str2_container ="";
        
        String str2_container_reversed = "";

        if(str1.length()>str2.length())
        {
            for(int i=0;i<str1.length()/2;i++)
            {
                //char chr1 = str1.charAt(i);
                //str1_container = str1_container + Character.toString(chr1);
                str1_container =str1_container + str1.charAt(i);
            }
            for(int j = str1.length()/2 ; j<str1.length() ;j++)
            {
                // char chr2 = str1.charAt(j);
                // str2_container = str2_container + Character.toString(chr2);
                str2_container = str2_container + str1.charAt(j);
            }
        }
        
        for(int p=str2_container.length() -1;p>=0;p--)
        {
            str2_container_reversed = str2_container_reversed + str2_container.charAt(p);
        }
        //System.out.println(str2_container_reversed );

        String matrix1[][] ={{" "," "," "," ",""},
        {" "," "," ",""," "},
        {" "," ",""," "," "},
        {" ",""," "," "," "},
        {""," "," "," "," "}
                         
        };
        // System.out.println(str1_container);
        // System.out.println(str2_container);
 

        //for(int x=0;x<str1_container.length();x++)
        
            //int k =str2_container.length();
            int k=0;
            //System.out.print(k);
        for(int i =0; i<matrix1.length;i++)
        {
            for(int  j =0;j<matrix1[0].length;j++)
            {
                if(i+j == 4 && k <= str2_container_reversed.length()-1) 
                {
                      matrix1[i][j] = String.valueOf(str2_container_reversed.charAt(k));
                      k++;
                   
                }
                
            }
        }
    
        for(int x=0;x<matrix1.length;x++)
        {
            for(int y = 0;y<matrix1.length;y++)
            {
                System.out.print(matrix1[x][y]);
            }
            System.out.println();
        }    

        
    }
}




class print_greater_string_in_diagonal_q6 {
    public static void main(String[] args) {
        String str1 = "python";
        int n = str1.length();

        for (int i = 0; i < n / 2 ; i++) {    // only till middle
            for (int j = 0; j < n; j++) {
                if (j == i) {
                    System.out.print(str1.charAt(i));  // left diagonal
                } else if (j == n - 1 - i) {
                    System.out.print(str1.charAt(j));  // right diagonal
                } else {
                    System.out.print(" ");             // fill with spaces
                }
            }
            System.out.println(); // next line
        }
    }
}











// xxxxxxxxxxxxxxxxxxxxxxxxxxxxxx   STL JAVA COLLECTIONS (FOR LEETCODE)       xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx




import java.util.*;     // needed for vector libraries
class vectors
{
    public static void main(String[] args) 
    {
        Vector <String> vec1 = new Vector <String>();

        vec1.add("mon");
        vec1.add("tue");
        vec1.add("wed");
        vec1.add("thu");
        vec1.add("fri");
        vec1.add("sat");
        vec1.add("sun");

        for(String i : vec1)
        {
            System.out.print(vec1 + " ");
        }
        
        
    }
}

class vector_int
{
    public static void main(String[] args) 
    {
        //Vector <int> vec2  = new Vector <int>();    // in java collections we cannot declare like java primitives  ; so we print EXPLICITLY like Integer , Double , Character

        Vector <Integer> vec2  = new Vector <Integer>();

        vec2.add(1);
        vec2.add(2);
        vec2.add(3);
        vec2.add(4);
        
    }
}




//         xxxxxxxxxxxxxxxxxxxxxxxxx     ArrayList BASICS       xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
import java.util.*;
class Arrays_list
{
    public static void main(String[] args) 
    {
        ArrayList <String> l1 = new ArrayList<String>();

        l1.add("mon");
        l1.add("tue");
        l1.add("wed");
        l1.add("thu");
        l1.add("fri");
        l1.add("sat");
        l1.add("sun");
        
        Iterator it1 = l1.iterator();

        while(it1.hasNext())
        {
            System.out.println(it1.next());
        }
    }
}

//          xxxxxxxxxxxxxxxxxxxxxxxxxxxxxx  LinkedList BASICS   and LinkedList methods too    xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx


import java.util.LinkedList;     // always need this import header if you want to use LinkedList
class Linkedlistt  // try your best to not name the class same as the java collection youre using can lead to conflicts
{
    public static void main(String[] args) 
    {
        LinkedList<String> l1 = new LinkedList<String>();

        l1.add("mon");
        l1.add("two");
        l1.add("wed");
        l1.add("thu");
        l1.add("fri");
        l1.add("sat");

        System.out.println(l1);

        System.out.println("for each ");

        System.out.println("---------");

        for(String i : l1)
        {
            //System.out.println(l1);  // so when you put l1 instead of i it prints the entire list again and again for the times of (length of the linkedlist)
            System.out.println(i);
        }

        l1.addFirst("start of the week");  //  addFirst : adds element to the start of the LinkedList  
        l1.addLast("end of the week");    //  addLast : adds element to the end of the LinkedList

        
        
        
        for(int i=0;i<l1.size();i++)    // size()  : we use size here instead of length for LinkedList
        {
            System.out.println(l1.get(i));  // get() : get method to access the elements of the LinkedList
        }

        

        
    }
}

import java.util.LinkedList;

class all_LinkedList_methods_explanation
{
    public static void main(String[] args) 
    {
        LinkedList <String> l1 = new LinkedList <String>();

        l1.add("1");
        l1.add("2");
        l1.add("3");
        l1.add("4");
        l1.add("5");

        
        
        
        l1.addFirst("1.1");  //  addFirst : adds element to the start of the LinkedList  
        l1.addLast("5.5");    //  addLast : adds element to the end of the LinkedList

        l1.removeFirst();   // removeFirst() : it removes only the first element of the LL
        l1.removeLast();    // removeLast() :  it removes only the lastt element of the LL

        System.out.println(l1.getFirst()); // getFirst() : only gets the first element not changes
        System.out.println(l1.getLast());  // getLast() :  only gets the last element not changes



        l1.remove(2);    // remove(int index) : it removes the element at the desired index

        l1.set(2,"2.2"); // set(int index , value) : it updates the values at the desiresd index

        
        l1.contains(3);
        System.out.println(l1.contains(3)); // containes() : checks whether the element is there in the entire LL (if true returns true)



        for(int i = 0;i<l1.size();i++)
        {
            System.out.println(l1.get(i));
        }

        
    }
}



class find_largest_element_in_an_array   // leetcode question 
{
    public static void main(String[] args) 
    {
        int arr [] = {2,5,1,3,0};

        int largest = 2;
        int second_largest = 5;

        for(int i = 0;i<arr.length;i++)
        {
            if(arr[i] > largest)    // loop to check new largest element
            {
                second_largest = largest;
                largest = arr[i];
            }

            else if(arr[i]>second_largest && arr[i]< largest) // loop to check new second_largest element
            {
                second_largest = arr[i];
            }
        }


        System.out.print("the largest element is : "+ largest);

    

        
    }

}




import java.util.Arrays; 
class check_sorted_or_not_leetcode    // we are using insertion sort here
{                                       // wrong logic
    public static void main(String[] args)   // wrong we dont need to actually sort this (this is kept for reference )
    {
        int arr []= {3,4,5,1,2};

        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]>arr[j])
                {
                    int temp = arr[j];   
                    
                    for(int z=j;z>i;z--)  
                    {
                        arr[z]=arr[z-1];  
                    }
                    arr[i]=temp;  
                    
                }
            }
        }

        System.out.print("the sorted list  :");
        System.out.print(Arrays.toString(arr));
        
    }
}










import java.util.Arrays; 
class check_sorted_or_not_leetcode    // we are using insertion sort here
{
    public static void main(String[] args)             // kinda ok but incomplete logic 
    {
        int arr []= {3,4,5,1,2};

        for(int i=0;i<2;i++)
        {
            // for(int j=i+1;j<arr.length;j++)
            // { 
            //     if(arr[i]>arr[j])
                    int j = arr.length -1;
                    int temp = arr[j];   
                    
                    for(int z=j;z>0;z--)  
                    {
                        arr[z]=arr[z-1];  
                    }
                    arr[0]=temp;  
                    
                
            
        }

        System.out.print("the sorted list  :");
        System.out.print(Arrays.toString(arr));
        
    }
}



class check_sorted_or_not_leetcode   // leetcode question : 1752 : check if array is sorted and rotated
{
    public static void main(String[] args) 
    {
        int arr [] = {3,4,5,1,2};

        int rotation= 0;
        for(int i=0;i<arr.length -1;i++)
        {
            //for(int j=i+1;j<arr.length-1;j++)  dont use this loop it is uneccessary it will just repeat again and again (not needed)
            
                if(arr[i]>arr[i+1])    // lopp to check whether current and current +1 element (if it current is greater possibility of rotation point)
                {
                    rotation++;
                }
                
            
        }
                 if(arr[0] < arr[arr.length -1 ])  // loop to check if last and 1st element on rotation will result in PROPER array
                {
                    rotation++;
                }
        
       

        if(rotation == 1 && rotation ==0) // ==0 since if it is already proper array then no need to do anything (ex [1,1,1,] no rotation or checking needed)
        {
            System.out.println("sorted and then rotated");
        }
        else
        {
            System.out.println("it is neither");

        }
        
    }
}




class second_largest_and_second_smallest_elements_in_an_array
{
    public static void main(String[] args) 
    {
        int arr[] = {1,2,4,7,7,5};

        int largest = 1;
        int second_largest =2;
        int smallest  = 4;
        int second_smallest = 7;

        for(int i=0;i<arr.length;i++)
        {
            if(arr.length > 1)
            {
            if(arr[i] > largest)  // loop to find largest element
            {
                second_largest = largest ;
                largest = arr[i];
            }

            else if (arr[i]>second_largest && arr[i] < largest)
            {
                second_largest = arr[i];
            }
            
            // else if (arr[i] < smallest)   this is the reason the code was not running because of successive else if parts ; (so just split into two if else if's for largest and smallest)

             if(arr[i] < smallest)    // loop to find smallest  
            {
                second_smallest = smallest;
                smallest  = arr[i];
            }
            else if(arr[i] >smallest && arr[i] <second_smallest && arr[i] != smallest) // loop to find second smallest
            {
                second_smallest = arr[i];
            }
        }
         else
        {
            largest = -1;
            second_largest = -1;
            smallest = -1;
            second_smallest =-1;
            break;
        }
        }
       

        System.out.println("largest element : "+largest);

        System.out.println("the second largest element : " + second_largest);

        System.out.println("the smallest element : "+smallest);
        
        System.out.println("the second smallest element : "+ second_smallest);




        
    }
}

class check_array_element_and_return_index
{
    public static void main(String[] args) 
    {
        int arr[] = {5,4,3,2,1};

        int num = 5;
        int count =0;

        for(int i = 0;i<arr.length;i++)
        {
            if(arr[i] == num)
            {
                System.out.println(i);
                count++;
                break;
                
                
            }
        }
        
        if(count < 1)
        {
            System.out.println("-1");
        }
        
    }
}









class max_consecutive_ones_in_an_array  // leetcode 485. Max Consecutive Ones
{                                      // simple question 
    public static void main(String[] args) 
    {
        
        int arr []= {1,1,0,1,1,1};
        int count =0;
        int present_max = 0;
        for(int i = 0;i<arr.length;i++)
        {
            if(arr[i] == 1)   // if it is =1 then count++
            {
                count++;
            }
            else      // when it hits 0 then it hits reset so as to close the first set of consecutives
            {
                count = 0;

            }

            if(present_max < count) // if present set of consecutives have higher count then put it in present_max
            {
                present_max = count;
            }

            

        }

        System.out.println("the longest consecutive ones are : "+present_max);
            
        
    }
}


import java.util.Arrays;
class rotate_array_at_k_position   // leetcode problem : 189 Rotate an array
{
    public static void main(String[] args) 
    {
        int arr[] {1,2,3,4,5,6,7};         // incomplete wrong logic coma back and explain this

        int k = 3;  // no. of switches

        for(int i = k;i<arr.length;i++)
        {
            int t = arr[i];
            arr[i] = arr[0];
            arr[0] = t;

        }

        System.out.println(Arrays.toString(arr));
        
    }
}

import java.util.Arrays;
class rotate_array_at_k_position     // leetcode 189. Rotate Array (38/39 test cases run properly but last test case is crazy)

{
    public static void main(String[] args) 
    {
        int arr [] = {1,2,3,4,5,6,7};

        int k=3;

        for(int i=0;i<k;i++)
        {
            int temp = arr[arr.length-1];   // last element stuff

            for(int z =arr.length -1;z>0;z--)
            {
                arr[z] = arr[z-1];
            }
            arr[0] = temp;  // assign the last element of array to 1st to rotate

            System.out.println(Arrays.toString(arr));

        }

        
        
    }
}

class reverse_words_in_a_String
{
    public static void main(String[] args) 
    {              
        String word  = "the sky is blue";      // this code logic will work only if no spaces are there in String (WILL NOT WORK FOR THIS   "a good   example")

        String split_words [] = word.split(" ");

        for(int i = 0;i<split_words.length;i++)
        {
            String one_word = split_words[i];

            for(int j=one_word.length();j>=0;j++)
            {
                System.out.println(one_word);

            }
        }

        
    }
}

class reverse_words_in_a_String       // leetcode 151. Reverse Words in a String

{
    public String reverseWords(String s) 
    {
         //String s  = "the sky is blue";

        String split_words [] = s.split(" ");
        String result = "";
        int j;
        for(j=split_words.length-1;j>=0;j--)
        {
            //System.out.print(split_words[j] + " ");


            if(split_words[j].equals(""))    // this will remove all the spaces in between the first and last words
            {
                result = result + split_words[j];

            }
            //result = result + split_words[j];
            else
            {
                result = result + split_words[j] + " ";
            }  
        }
        return result.trim();   // this will remove all spaces before and after the 1st and last word
    }
}


class missing_number_in_an_array 
{
    public static void main(String[] args) 
    {
        int arr [] = {3,0,1};

        int range = arr.length;

        int series_length = range * (range+1)/2;    // using simple n(n+1)/2 formula t

        int sum_of_arr_elements = 0 ;

        for(int i = 0;i<arr.length;i++)
        {
            sum_of_arr_elements = sum_of_arr_elements + arr[i];      
        }
        int missing_digit = series_length-sum_of_arr_elements; //to get the missing digit : if we subtract the given elments from the entire series then (the missing digit should be left out and that would be the ans)

        System.out.println("the missing element is : " + missing_digit);

        
    }
}


class String_to_integer_atoi_but_using_simple_logic  // leetcode: 8. String to Integer (atoi)
{
    public static void main(String[] args)   // this code works fine with all the test cases but will not work on leetcode since it expects everything in return ; and my answer is in string and i cannot convert it to int (since it has - + signs in it (so im just leaving it))
    {
        String s = "-1123u3761867";

        String str1 = s.trim();

        String  result ="";

        for(int i = 0;i<str1.length();i++)  // this question was solved with my logic and not atoi
        {
            char chr = str1.charAt(i);
            
            
            if(chr == '-'|| chr == '+' || Character.isDigit(chr))
            {
                result = result + Character.toString(chr);
            }
            else
            {
                break;
            }
        }
        
        System.out.print(result);
            
    }
}










class single_number   // leetcode : 136. Single Number 
{
    public static void main(String[] args) 
    {
        int arr [] = {4,1,2,1,2};
        int max_count = 1;

        int single_element = 0; //  stores the single occuring element 

        for(int i = 0;i<arr.length;i++)
        {
            int count =0;
            //int j =0;
            for(int j = 0;j<arr.length;j++)
                if(arr[i] == arr[j])
                {
                    count++;
                }
                
            
            //System.out.println(count);

            if(max_count == count)
            {
                single_element = arr[i];
            }
        }
        System.out.print("the single occuring element is : "+single_element);
    }
}

class Find_the_Index_of_the_First_Occurrence_in_a_string
{
    public static void main(String[] args)     // wrong logic (almost right)    (kept for reference)
    {
        //String haystack = "sadbutsad";
        //String needle = "sad";              // the logic is almost there but this logic will only run for cases where the needle part is included first in the haystack part(meaning ex: sad starts from the 1st index of haystack so this will work not for other cases where it may start in the middle )
        int count = 0;
        int needle_length = needle.length();   // for correct logic look down 

        for(int i = 0;i<needle.length();i++)
        {
            char chr1 = needle.charAt(i);
            char chr2 = haystack.charAt(i);

            if(chr1 == (chr2))
            {
                count++;
                //System.out.println(count);
            }
        }

        if(count == needle_length)
        {
            //System.out.println("the String needle was found at index : 0");
            return 0;
        }
        else
        {
            //System.out.println("-1");
            return -1;
    }
}
}

class Find_the_Index_of_the_First_Occurrence_in_a_string  // leetcode: 28. Find the Index of the First Occurrence in a String

{                                      // Golden rule question : very very very important qs
    public static void main(String[] args) 
    {
        //String haystack = "Hello";

        //String needle = "ll";

        int haystack_length = haystack.length();

        int needle_length = needle.length();
        int result =0;

        if(haystack_length >= 1 && needle_length >=1)
        {
        for(int i = 0 ;i<= haystack_length - needle_length;i++)
        {
            int count =0;
            
            for(int j = 0,k=i ;j<needle.length();j++,k++)   // each time the j part(needle) will start from first index of it again and again for each index of of haystack ; and if it matches then IT GOES INTO IF LOOP 
            {
                if(haystack.charAt(k) == needle.charAt(j))  
                {
                    count++;

                }
                else
                {
                    break;
                }
            }

            if(count == needle.length())
            {
                //System.out.println("first occurence at index : "+ count);
                //result = count;  // xxxxx NO dont put equal to count (put the correct index i in here ; cause at times the count may not be accurate)
                result = i;
                return result;  // once this prints (dont worry it will not go into return -1 )
                
            }
        }
        //System.out.println("-1 not found");
        // if(result != needle.length())      // works only on vs code 
        // {
        //     //System.out.println("-1 not found");
        //     //return -1;
        // }
        
        
        return -1;   // YES this works only when you cannot find the index then it prints -1
        }

        else  // this loop is only for and works when the string lengths are less than one in either haystack or needle
        {
            return 0;
        }
        
    }
}


class Longest_Consecutive_Sequence   // leetcode 128. Longest Consecutive Sequence
{
    public int longestConsecutive(int[] nums)    // little complex question 
    {
        //int nums [] = {0,3,7,2,5,8,4,6,0,1};

        Arrays.sort(nums);  // now nums = {1,2,3,4,100,200}

        //int min_element = 20;
        //int count =0; this is wromg giving error
        int count =1;  // since lots of conflicts downstairs just include the count++ stuff here itself
        int max_count =1;  // will store the longest sequence yet
        
        if(nums.length != 0)
        {
        for(int i=0;i<nums.length-1;i++)
        {
            if(  nums[i] != nums [i+1] && nums[i] +1 == nums[i+1]  )
            {
                count++;
                if(count>max_count) // if current streak is larger put it in max_count so that if new streak is found then we could put that in
                {
                    max_count = count;
                }
        
            }
            else if(nums[i] != nums[i+1]) // if the streak is broken 
                {
                    count = 1;  // reset count so that we could find new streak if any
                }
        }
        //count++;
        // if(count > max_count)
        // {
        //     return count; // old streak is biggest
        // }
        // else
        // {
        //     return max_count;  // new streak is biggest
        // }
        // }
        
            return max_count;
        }
        else
        {
            return 0;
        }
}
}

*/



class Sort_Matrix_by_Diagonals
{
    public static void main(String[] args) 
    {
        int matrix [][] = {{1,7,3},
                       {9,8,2},
                       {4,5,6}
        };


        int i =0 ;

        if(i<=1)
        {
            if(matrix[i][i+1] > matrix[i+1][i+2])
            {
                int temp = matrix[i][i+1];
                matrix[i][i+1] = matrix[i+1][i+2];
            }
            i++;
        }
        System.out.print(matrix[0][1] + " ");
        System.out.print(matrix[1][2] + " ");

    
    }
}








class Sort_Matrix_by_Diagonals    // this code right but will only work for positive matrixes ;not fot -ve values 
{
    public static void main(String[] args)   //see downstairs for correct logic
    {
        int matrix [][] = {{1,7,3},
                          {9,8,2},
                          {4,5,6}
        };
        //int matrix[][] = {{0,1}, {1,2}};

        int n = matrix.length; // we use this so that all matrices of >=3 length will work
        int i =0 ;

        //if(i<=1) // this will only work for 3x3 matrix since its harcoded to work only for that
        if(n>2 && i<=n-2)
        {
            if(matrix[i][i+1] > matrix[i+1][i+2])
            {
                int temp = matrix[i][i+1];
                matrix[i][i+1] = matrix[i+1][i+2];
                matrix[i+1][i+2] = temp;
            }
            i++;
        }
        // System.out.print(matrix[0][1] + " ");
        // System.out.print(matrix[1][2] + " ");
        int j=0;
        
        //if(j<2). // wont work because it only runs once 
        //while(j<2). // this will only work for 3x3 matrix since i harcoded it initially for that only
        while(j<n-1)
        {
        if(matrix[j][j] < matrix[j+1][j+1])
        {
            int temp_1 = matrix[j][j];
            matrix[j][j] = matrix[j+1][j+1];
            matrix[j+1][j+1] = temp_1;
            
        }
        j++;
        }
        // System.out.print(matrix[0][0] + " ");
        // System.out.print(matrix[1][1] + " ");
        // System.out.print(matrix[2][2] + " ");
        
        int z=0;
        //int temp_3 = 0;
        
            //if(matrix[z+1][z] < matrix[z+2][z+1])  // again will work only for 3x3 (just need to include n part thats all)
            if(n>2 && matrix[z+1][z] < matrix[z+2][z+1])
            {
                int temp_3 = matrix[z+1][z];
                matrix[z+1][z] = matrix[z+2][z+1];
                matrix[z+2][z+1] = temp_3;
            }
        
        
        // System.out.print(matrix[1][0] + " ");
        // System.out.print(matrix[2][1] + " ");
        
        for(int k=0;k<matrix.length;k++)
        {
            for(int l=0;l<matrix.length;l++)
            {
                System.out.print(matrix[k][l] + " ");
            }
            System.out.println();
        }
        
    
    }
}


class Sort_Matrix_by_Diagonals   // incomplete comeback later stronger
{
    public static void main(String[] args) 
    {
        int matrix [][] = {{1,7,3},
                          {9,8,2},
                          {4,5,6}
        };

        int arr_1[] = new int[3];
        for(int i =0;i<=2;i++)
        {
            arr_1[i] = matrix[i][i] ;
        }
        Arrays.sort(arr_1);
        for(int j=0;j<arr_1.length;j++)
        {
            System.out.print(arr_1[i]);
        }
        
        
    }
}




class Length_of_the_Longest_Alphabetical_Continuous_Substring
{
    public static void main(String[] args) 
    {
        String str = "abacaba";

        int count =0;
        int max_count = 0;

        for(int i =0;i<str.length();i++)
        {
            if(str.charAt(i+1) - str.charAt(i) == 1)
            {
                count++;
            }
            else
            {
                count =0; // reset
            }

            if(count > max_count)
            {
                max_count = count;
            }
        }

        System.out.print(" length of longest substring : "+ max_count);
        
    }
}








class Length_of_the_Longest_Alphabetical_Continuous_Substring
{
    public static void main(String[] args) 
    {
        String s = "abacaba";
        int count = 1;
        int max_count = 1;
        for(int i =0;i<s.length() ;i++)
        {
            if(s.charAt(i+1) - s.charAt(i) == 1)
            {
                count++;
            }
            else
            {
                count = 1;
            }
        }
        System.out.println("the length of the longest sequence : "+count);
        
    }
}





import java.util.Arrays;
class Sort_Matrix_by_Diagonals 
{
    public static void main(String[] args) 
    {
        int matrix [][] = {{1,7,3},
                          {9,8,2},
                          {4,5,6}
        };

        int arr_1[] = new int[3];
        int arr_2 [] = new int[3];
        for(int i =0;i<=2;i++)
        {
            arr_1[i] = matrix[i][i] ;
        }
        Arrays.sort(arr_1);
        
        //int arr_2 []= new int [3];
        int l=0;
        for(int j=arr_1.length-1;j>=0;j--)
        {
            arr_2[l] = arr_1[j];
            l++;
        }
        int k=0;
        for(int i =0;i<=2;i++)
        {
            arr_1[i] = arr_2[k] ;
            k++;
        }
        int p=0;
        for(int i =0;i<=2;i++)
        {
            matrix[i][i] = arr_1[p];
            p++;
        }
        int u=0;
        int arr_3 [] = new int[2];
        for(int i=0;i<2;i++)
        {
             arr_3[u] = matrix[i][i+1]  ;
            u++;
        }
        
        Arrays.sort(arr_3);
        int y=0;
        for(int i=0;i<2;i++)
        {
            matrix[i][i+1] = arr_3[y];
            y++;
        }
        
        
        // for(int i =0;i<arr_3.length;i++) // print arrays
        // {
        //     System.out.print(arr_3[i]);
        // }
        
        
        // for(int e=0;e<matrix.length;e++) // print matrix
        // {
        //     for(int g=0;g<matrix[0].length;g++)
        //     {
        //         System.out.print(matrix[e][g]+ " " );
        //     }
        //     System.out.println();
        // }
        
        
        
            
        }
}
        
        



import java.util.Arrays;
class Sort_Matrix_by_Diagonals    // 100 % correct code for any 3x3 value (just need to configure for any length n matrix)
{
    public static void main(String[] args) 
    {
        // int matrix [][] = {{1,7,3},
        //                   {9,8,2},
        //                   {4,5,6}
        // };
        int matrix[][] ={{-1,-2,-3},{-3,-3,-2},{-4,-4,0}
        };

        int arr_1[] = new int[3];
        int arr_2 [] = new int[3];
        for(int i =0;i<=2;i++) // loop for main diagonal
        {
            arr_1[i] = matrix[i][i] ;// feeding to be sorted 
        }
        Arrays.sort(arr_1);
        
        //int arr_2 []= new int [3];
        int l=0;
        for(int j=arr_1.length-1;j>=0;j--)
        {
            arr_2[l] = arr_1[j];//feeding sorted array backwards for descending in main diagonal
            l++;
        }
        int k=0;
        for(int i =0;i<=2;i++)
        {
            arr_1[i] = arr_2[k] ;//feeding descending into arr_1 back so that it could be transfered to main diagonal( unncessary fixcc this later)
            k++;
        }
        int p=0;
        for(int i =0;i<=2;i++)
        {
            matrix[i][i] = arr_1[p];//feeding des sorted to main
            p++;
        }
        int u=0;
        int arr_3 [] = new int[2];
        for(int i=0;i<2;i++)//feeding upper dia into arr_3
        {
             arr_3[u] = matrix[i][i+1];
            u++;
        }
        
        Arrays.sort(arr_3); // sort arr_3(here it alredy wants ascending only so just put it directly in upper matrix)
        int y=0;
        for(int i=0;i<2;i++)
        {
            matrix[i][i+1] = arr_3[y];//feed ascen values into upper matrix
            y++;
        }
        
        int arr_4 [] = new int[2];
        int q=0;
        for(int i =1;i<3;i++)
        {
            arr_4[q] = matrix[i][i-1];//feed lower matrix values for sorting
            q++;
        }
        Arrays.sort(arr_4);
        
        int v= 0;
        int arr_5 [] = new int[2];
        for(int i=arr_4.length-1;i>=0;i--)
        {
            arr_5[v] = arr_4[i];
            v++;
        }
        
        
        
        
        // for(int i =0;i<arr_3.length;i++) // print arrays
        // {
        //     System.out.print(arr_5[i]);
        // }
        
        
        for(int e=0;e<matrix.length;e++) // print matrix
        {
            for(int g=0;g<matrix[0].length;g++)
            {
                System.out.print(matrix[e][g]+ " " );
            }
            System.out.println();
        } 
        
        
        
            
        }
}



import java.util.Arrays;
class Sort_Matrix_by_Diagonals   // 100 % working for any n length matrix (any +ve or -ve values)      !!!!!!!!!!!!!!!!1
{
    public static void main(String[] args) 
    {
        // int matrix [][] = {{1,7,3},
        //                   {9,8,2},
        //                   {4,5,6}
        // };
        int matrix[][] ={
            { -1, -2, -3, -4 },
            { -3, -3, -2, -1 },
            { -4, -4,  0,  5 },
            {  9,  8,  7,  6 }
        };
        int n = matrix.length;
        
        // int arr_1[] = new int[3];
        int arr_1[] = new int[n];
        //for(int i =0;i<=2;i++) // loop for main diagonal
        for(int i =0;i<n;i++)
        {
            arr_1[i] = matrix[i][i] ;// feeding to be sorted 
        }
        Arrays.sort(arr_1);
        
        //int arr_2 []= new int [3];
        int arr_2 []= new int [n];
        int l=0;
        for(int j=arr_1.length-1;j>=0;j--)
        {
            arr_2[l] = arr_1[j];//feeding sorted array backwards for descending in main diagonal
            l++;
        }
        // int k=0;
        // for(int i =0;i<=n;i++)
        // {
        //     arr_1[i] = arr_2[k] ;//feeding descending into arr_1 back so that it could be transfered to main diagonal( unncessary fixcc this later)
        //     k++;
        // }
        int p=0;
        for(int i =0;i<n2;i++)
        {
            matrix[i][i] = arr_2[p];//feeding des sorted to main   ( the above loop is useless so directly we do this)
            p++;
        }
        int u=0;
        // int arr_3 [] = new int[2];
         // upper diagonal always has (n-1) elements
        int arr_3 [] = new int[n-1];
        // for(int i=0;i<2;i++)//feeding upper dia into arr_3
        for(int i=0;i<n-1;i++)
        {
             arr_3[u] = matrix[i][i+1];
            u++;
        }
        
        Arrays.sort(arr_3); // sort arr_3(here it alredy wants ascending only so just put it directly in upper matrix)
        int y=0;
        // for(int i=0;i<2;i++)
        for(int i=0;i<n-1;i++)
        {
            matrix[i][i+1] = arr_3[y];//feed ascen values into upper matrix
            y++;
        }
        // lower diagonal also has (n-1) elements
        // int arr_4 [] = new int[2];
         int arr_4 [] = new int[n-1];
        int q=0;
        // for(int i =1;i<3;i++)
        for(int i =1;i<n;i++)
        {
            arr_4[q] = matrix[i][i-1];//feed lower matrix values for sorting
            q++;
        }
        Arrays.sort(arr_4);
        
        int v= 0;
        // int arr_5 [] = new int[2];
        int arr_5 [] = new int[n-1];
        for(int i=arr_4.length-1;i>=0;i--)
        {
            arr_5[v] = arr_4[i];
            v++;
        }
        
        //loop to update lower matrix from sorted arr_5
        for(int i =1;i<n;i++)
        {
            matrix[i][i-1] = arr_5[i-1];
        }
        
        
        
        
        // for(int i =0;i<arr_3.length;i++) // print arrays
        // {
        //     System.out.print(arr_5[i]);
        // }
        
        
        // for(int e=0;e<matrix.length;e++) // print matrix
        for(int e=0;e<n;e++)
        {
            // for(int g=0;g<matrix[0].length;g++)
            for(int g=0;g<n;g++)
            {
                System.out.print(matrix[e][g]+ " " );
            }
            System.out.println();
        }
             
        }
}



class Shortest_Palindrome       // this code works for 100% for every test case does all (left to right) & (right to left) but leetcode particularly doesnt ask for left to right (so see down for correct version without it)
{
    public static void main(String[] args) // SEE DOWN FOR CORRECT VERSION !!!!
    {
        String str = "abcbaba";
        
         String max_string = ""; // used to get the shortest mini palindrome (right to left)
         String max_string_2 =""; // used to get the shortest mini palindrome (left to right)
         String str2 = ""; // to store right to left shortest palindrome
         String str3 = "";// to store left to right shortest palindrome
         

        int s_length = str.length()-1;

//      ********** right to left part ************

        //for(int i =s_length;i>=0;i--)
        for(int i =str.length();i>0;i--)
        {
            //str2 = str.substring(0,s_length);
            str2 = str.substring(0,i);
            
           // s_length--;
           
            
            if(str2.isEmpty()) // see if needed
            {
                break;
            }

        int left = 0;
        int right = str2.length() - 1;

        for(int j = 0;j<str2.length();j++)
        {
            if(str2.charAt(left) != str2.charAt(right))
            {
              break;
                
            }
            left++;
            right--;
        }
       
        if(left >=right)
        {
            max_string = str2;
            System.out.println(max_string);
        }
        
        }
        
//       ********** right to left part   **********   
        
        for(int x= 0;x<str.length();x++)
        {
            str3 = str.substring(x);
            
            if(str3.isEmpty())
            {
                break;
            }
            
            int left1 = 0;
            int right1 = str3.length()-1;
            
            for(int y = 0;y<str3.length();y++)
        {
            if(str3.charAt(left1) != str3.charAt(right1))
            {
              break;
                
            }
            left1++;
            right1--;
        }
        
         if(left1 >=right1)
        {
            max_string_2 = str3;
            
             if(!max_string_2.equals(max_string))
        {
            System.out.println(max_string_2);
        }
            
        }
        //System.out.println(str3);
        
       
        //System.out.println(max_string_2);
        }
        
      
        
        
        
    }
    
    
}


class Shortest_Palindrome   // 100 % working in leetcode (just last 2 testcases ran out of time limit) but working !!!!
{
    public static void main(String[] args) 
    {
        String str = "aabba";
        
         String max_string = ""; // used to get the shortest mini palindrome (right to left)
         String max_string_2 =""; // used to get the shortest mini palindrome (left to right)
         String str2 = ""; // to store right to left shortest palindrome
         String str3 = "";// to store left to right shortest palindrome
         

        int s_length = str.length()-1;

//      ********** right to left part ************

        //for(int i =s_length;i>=0;i--)
        for(int i =str.length();i>0;i--)
        {
            //str2 = str.substring(0,s_length);
            str2 = str.substring(0,i);
            
           // s_length--;
           
            
            if(str2.isEmpty()) // see if needed
            {
                break;
            }

        int left = 0;
        int right = str2.length() - 1;

        // for(int j = 0;j<str2.length();j++) //error giving explain later(not really)
        while(left<right)
        {
            if(str2.charAt(left) != str2.charAt(right))
            {
              break;
                
            }
            left++;
            right--;
        }
       
        if(left >=right)
        {
            max_string = str2;
            break;
            //System.out.println(max_string);
        }
        
        }
        
        String non_palindrome = "";
        for(int k = max_string.length();k<str.length();k++)
        {
            non_palindrome = non_palindrome + str.charAt(k);
        }
        
        String reverse_non ="";
        for(int p=non_palindrome.length()-1;p>=0;p--)
        {
            reverse_non = reverse_non + non_palindrome.charAt(p);
        }
        
        String shortest_palindrome = reverse_non + str;
        System.out.println(shortest_palindrome);
//       ********** left to right part   **********   

// THIS PART WAS ADDED ONLY BECAUSE SENTHIL SIR ASKED ; NOT NEEDED NOR ASKED IN LEETCODE !!!!!!!!!!!!!!!
        
        // for(int x= 0;x<str.length();x++)
        // {
        //     str3 = str.substring(x);
            
        //     if(str3.isEmpty())
        //     {
        //         break;
        //     }
            
        //     int left1 = 0;
        //     int right1 = str3.length()-1;
            
        //     for(int y = 0;y<str3.length();y++)
        // {
        //     if(str3.charAt(left1) != str3.charAt(right1))
        //     {
        //       break;
                
        //     }
        //     left1++;
        //     right1--;
        // }
        
        //  if(left1 >=right1)
        // {
        //     max_string_2 = str3;
            
        //      if(!max_string_2.equals(max_string))
        // {
        //     System.out.println(max_string_2);
        // }
            
        // }
        // //System.out.println(str3);
        
       
        // //System.out.println(max_string_2);
        // }
        
      
        
        
        
    }
    
}


class longest_subarray_length     //  Problem Statement: Given an array and a sum k, we need to print the length of the longest subarray that sums to k.  Examples

// Example 1:
// Input Format: N = 3, k = 5, array[] = {2,3,5}
// Result: 2
// Explanation: The longest subarray with sum 5 is {2, 3}. And its length is 2.

// Example 2:
// Input Format: N = 5, k = 10, array[] = {2,3,5,1,9}
// Result: 3
// Explanation: The longest subarray with sum 10 is {2, 3, 5}. And its length is 3.


{
    public static void main(String[] args) 
    {
        int arr []= {2,3,5,1,9};

        int k = 10;
        int sum =0;
        int count =0;
        int num =2;

        for(int i=0;i<arr.length;i++)
        {
            for(int j =i+1;j<arr.length;j++)
            {
                sum = sum + arr[i] + arr[j];
                
                // int arr2 [] = new int [arr.length];
                // arr2 = arr[i]+arr[j];
                
                
                if(sum == k)
                {
                    count++;
                    break;
                }
                
            }
            count++;
        }

        System.out.println("the length of the longest subarray is : "+(count-num));

        
    }

}

class Majority_Element    // leetcode question 
{
    public static void main(String[] args) 
    {
        int arr [] = {2,2,1,1,1,2,2};

        int occurence = arr.length/2;
        int count =0;

        int max_count_element=0;
        
        for(int i =0;i<arr.length;i++)
        {
            for(int j =i+1;j<arr.length;j++)
            {
                if(arr[i] == arr[j])
                {
                    count++;
                }
            }

            if(count > occurence)
            {
                max_count_element = arr[i];
                break;
            }
        }

        System.out.println("the the element that appears more than n/2 times : "+max_count_element);
    }
}


class Longest_Palindromic_Substring  // 100% right logicv but time limit exceeded (95/142)  
{
    public static void main(String[] args)     // COME BACK TO THIS AND OPTIMIZE TIME COMPLEXITY ; IM GOING TO LEARN HOW TO OPTIMIZE DOWNSTAIRS SEEEEEE !!!!!!!!!!!!
    {
        String str = "babad";
        String str2 = "";

        String max_string = "";  // the string which will store the the longest substring

        for(int i =0;i<str.length();i++)
        {
            str2 = str.substring(i);

            if(str2.isEmpty())
            {
                break;
            }

            int left = 0;
            int right = str2.length();

            for(int j=0;j<str2.length();j++)
            {
                if(str2.charAt(left) != str2.charAt(right))
                {
                    break;
                }
                left++;
                right--;

                if(left >= right)
                {
                    max_string = str2;
                }
            }

        }

        System.out.println("the longest substring is : "+ max_string);

        
    }
}







      XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX


//         ****************XXXXXXXXXX    HOW TO OPTIMIZE TIME COMPLEXITIES !!!!!!!!   ********************XXXXXXXXXXXXXXXX




//                      INSTEAD OF BFS  FROM NOW ON USE THESE CONCEPTS THEY WILL AUTOMATICALLY REDUCE COMPLEXITIES !!!!!!!!!!!!!!!!1



//           XXXXXXXXXXXXXXXXXXXXXX      VECTOR BASICS       XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX


import java.util.*;
class vector_basics
{
    public static void main(String[] args) 
    {
        Vector <String> vec = new Vector <String>();

        vec.add("mano");
        vec.add("bruno");
        vec.add("trueno");

        vec.addElement("suno"); // addElement : will append at last of the vector 
        
        vec.insertElementAt("kruno",1); // insertElementAt : will insert at specific index given 



        for(String i : vec)    // Golden rule : THIS IS THE EASIEST WAY TO PRINT VECTORS 
        {
            System.out.println(i);
        }


        
        Vector <Vector<String>> vec2 = new Vector<Vector<String>>(); //this is like putting a container inside another container ; (so like putting a vector inside another vector) when trying to import a prexisting vector inside a new one  
        
        vec2.addElement(vec);










        //  same but with int data type 


         // Vector <Vector<String>> vec2 = new Vector<Vector<String>>(); //this is like putting a container inside another container ; (so like putting a vector inside another vector) when trying to import a prexisting vector inside a new one  
        
        // vec2.addElement(vec);
        
        
        Vector <Integer> vec = new Vector<Integer>();
        vec.add(1);
        vec.add(2);
        vec.add(3);
        
        // for(int i : vec)
        // {
        //     System.out.println(i);
        // }
        
        System.out.println(vec.get(0)); // get() : is used to fetch the values at the desired indexes 
        
        
        vec.sort(null); // whilst sorting we need to put null inside to make it work 
        
        for(int i : vec)
        {
            System.out.println(i);
        }
        
    }
}










//                XXXXXXXXXXXXXXXXXXXXXXXXXXXXXX STACK BASICS    XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX



import java.util.*;
class stack_basics
{
    public static void main(String[] args) 
    {
        Stack <String> st = new Stack <String>();

        st.add("mon");
        st.add("tue");
        st.add("wed");
        
    
        // for( String i : st)
        // {
        //     System.out.println(i);  // you can print it like this too (NO PROBLEM)
        // }
        
        
        XXXXXXX     THIS IS WIDELY PRACTICED WAY BUT LETS NOT USE THIS STICK TO THE ABOVE ONE         XXXXXXXXXXXXXXX
        
        
        Iterator <String> it = st.iterator();
        
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
        
        
    }
}








 //       XXXXXXXXXXXXXXXXXXXXXXXXXXX    PRIORITY QUEUE basics      XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX



 import java.util.*;
 class priority_queue_basics
 {
    public static void main(String[] args) 
    {
        Queue<String> pq = new PriorityQueue <String>();

        pq.add("2");
        pq.add("1");
        pq.add("3");
        
        // pq.add("delhi");  // for non number parts it organizes based on the first letter of the words
        // pq.add("chennai");
        // pq.add("mumbai");

        for(String i : pq)    // used this always ITS VERY EASY COMPARED TO USING iterator !!!!!!!!!!!1
        {
            System.out.println(i);
        }
        
        
        System.out.println("------");
        // String str = pq.peek();  // peek() : used to show only the 1st index value of the priority queue 
        // System.out.println(str);
        
        
        Iterator <String> it = pq.iterator();  // basically we use iterator so that to just know that we can use by this method too ; but its not that important
        
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
        
        
    }
 }







 //           XXXXXXXXXXXXXXXXXXXXX   ArrayDeque basics XXXXXXXXXXXXXXXXXXXXXXXXXXXXX



  import java.util.*;
 class ArrayDeque_basics    // the difference between priority queue and Deque is that PQ will sort things automatically whereas Deque is just manual (which will print as it is )  otherwise syntax wise they both are the same
 {
    public static void main(String[] args) 
    {
        Deque <String> dq = new ArrayDeque <String> ();

        dq.add("2");
        dq.add("1");
        dq.add("3");

        for(String i : dq)
        {
            System.out.println(i);
        }
        
        System.out.println("-------");
        
        Iterator <String> it = dq.iterator();
        
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
        
    }
 }










 //         XXXXXXXXXXXXXXXXXXXXXXXXXXX     HASHMAP basics    XXXXXXXXXXXXXXXXXXXXXXXXX




  import java.util.*;
 class Hashmap_basics 
 {
    public static void main(String[] args) 
    {
        HashMap <Integer,String> hm = new HashMap<Integer,String>();

        hm.put(1,"mano");
        hm.put(2,"bruno");
        hm.put(3,"kruno");

        //for(String,Integer : hq)  // like we normally did using for loopp it wont work for these ; (since they have dual values )

        System.out.println(hm.get(1));
        System.out.println(hm.get("mano")); //--> this will give null since get() func is only used to get values NOT KEY VALUE !!!!!!!!!!!
        
       // map.entry : is like an iterator for hashmap 
        
        //e: is the object with which we will use functions inside the hashmap
        
        // entryset() : will give us access to the contents of the hashmap
        
        for(Map.Entry<Integer,String> e : hm.entrySet() )
        {
            System.out.println("key : "+ e.getKey()+ " Value : "+e.getValue());
        }
        

        
    }
 }












 //          XXXXXXXXXXXXXXXXXXXXXXXXXXX   JAVA COLLECTIONS      XXXXXXXXXXXXXXXXXXXXXXXXXXX

ArrayList<> : is like a linked list 

collection : its like a super class which contains all of these functions like (list,set,SortedSet etc)

 
 //          XXXXXXXXXXXXXXXXXXXXXX using collections (itself)  XXXXXXXXXXXXXXXXXXX

AT TIMES WE CAN LIKE DIRECTLY PUT Collections KEYWORD AT THE START AND JUST PUT THE DESIRED FUNC YOU WANT TO USE LIKE SET ETC AT THE END 
        (ok this only works for a selected few (also if it is already a java collection then it wont work))



        //collections : normal (no sorting , all duplicates allowed)
import java.util.*;
 class using_collections
 {
    public static void main(String[] args) 
    {
        Collection <String> cl = new ArrayList<>();

        cl.add("2");
        cl.add("1");
        cl.add("3");

        System.out.println("collections : "+cl);
        

    }
 }



 //       XXXXXXXXXXXXXXXXXXXXXXXX    LIST JAVA COLLECTION     XXXXXXXXXXXXXXXXXXXXXXXX



             //LIST : no sorting ; duplicates allowed 
import java.util.*;
 class using_list_in_java_collections
 {
    public static void main(String[] args) 
    {
        List <String> li = new ArrayList<>();

        li.add("2");
        li.add("1");
        li.add("3");

        System.out.println("list : "+li);


        
    }
 }



 






 //        XXXXXXXXXXXXXXXXXXXXXXXXX    SET AND SORTEDSET  JAVA COLLECTION      XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX



               // Set : sorted  , removes duplicates as well
               //SortedSet : does the same as set ig ; check with sir and update
  import java.util.*;
 class using_set_and_SortedSet_in_java_collections
 {
    public static void main(String[] args) 
    {
        Set <String> se = new HashSet<>();

        se.add("2");
        se.add("1");
        se.add("3");
        se.add("3");

        System.out.println("Set : "+se);
        
        SortedSet <String> ss = new TreeSet<>();      // does the same as the above one ; check with sir and tell me
        
        ss.add("2");
        ss.add("1");
        ss.add("3");
        ss.add("3");
        
        System.out.println("SortedSet : "+ss);
        
    }
 }


 class Longest_Common_Subsequence       // incomplete ; COME BACK AND SOLVE THIS !!!!!!!!!
{
    public static void main(String[] args) 
    {
        String str = "ezupkr";

        String match = "ubmrapg";
        int count =0;
        int last_index = -1;

        for(int i =0;i<match.length();i++)
        {
            char match2 = match.charAt(i);

            for(int j =last_index+1 ;j<str.length();j++)
            {
                char str2 = str.charAt(j);

                if(str2 == match2)
                {
                    System.out.println(str2);
                    count++;
                    last_index= j;
                }
            }
        }
        System.out.println("count : "+count);
        
    }
}

import java.util.*;//kept for reference
class _3Sum                  // this logic is wrong!!! ; i mean the 3_sum logic is fine but the list logic is wrong ; the check internet and gpt they all told me you need two diff list (list inside list to pull this sum off)
{
    public static void main(String[] args) 
    {
        int arr [] = {-4,-2,-2,-2,0,1,2,2,2,3,3,4,4,6,6};

//My Output : [[-4,-2,6],[-4,0,4],[-4,1,3],[-4,2,2],[-2,-2,4],[-2,0,2]] 

        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                for(int k =0;k<arr.length;k++)
                {
                    if(i != j && j!=k && i != k)
                    {
                    // if(arr[i] != arr[j] && arr[j] != arr[k] && arr[i] != arr[k])
                    // {
                        if(i<j && j<k)
                        {
                    
                    if(arr[i]+arr[j]+arr[k]  == 0)
                    {
                        // System.out.println(arr[i] +" "+ arr[j] +" "+ arr[k]);
                        List<List<int>> li =  new ArrayList<>();
                        
                        li.add(arr[i]);
                        li.add(arr[j]);
                        li.add(arr[k]);
         
                    
                    }
                    }
                   // }
                    }
                
                }
            }
        }
        
        //  List<List<<Integer>> li = new  List<List<Integer>>();
         
         
        
        
        
    }
}



import java.util.*;
class _3Sum          // leetcode question :   100% working but time limit exceeded at last testcase (to be optimised later)  
{
    public static void main(String[] args) 
    {
        int arr [] = {-4,-2,-2,-2,0,1,2,2,2,3,3,4,4,6,6};
        List <List<Integer>> outer = new ArrayList<>();

//My Output : [[-4,-2,6],[-4,0,4],[-4,1,3],[-4,2,2],[-2,-2,4],[-2,0,2]] 

        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                for(int k =0;k<arr.length;k++)
                {
                    if(i != j && j!=k && i != k)
                    {
                    // if(arr[i] != arr[j] && arr[j] != arr[k] && arr[i] != arr[k])
                    // {
                        if(i<j && j<k)
                        {
                    
                    if(arr[i]+arr[j]+arr[k]  == 0)
                    {
                       List<Integer> inner = Arrays.asList(arr[i],arr[j],arr[k]);
                       
                       Collections.sort(inner);
                       if(!outer.contains(inner))
                       {
                           outer.add(inner);
                       }
                        
                    
                    }
                    }
                   // }
                    }
                
                }
            }
        }
        
        //  List<List<<Integer>> li = new  List<List<Integer>>();
         
         
        
        System.out.println(outer);
        
    }
}




class Two_Sum   // leetcode question : PS this was the first sum i ever did in leetcode ; which i failed ; now i did it by myself and i succeded  (woww MANO BE PROUD OF YOURSELF !!!!!)
{
    public static void main(String[] args) 
    {
        int arr[] = {2,7,11,15};

        int target = 9;

        for(int i =0;i<arr.length;i++)
        {
            for(int j=1;j<arr.length;j++)
            {
                if(arr[i] +arr[j] == target)
                {
                    System.out.println(i+" "+j);
                }
            }
        }
}
}


class _3Sum_Closest   // leetcode question 
{
    public static void main(String[] args) 
    {
        int arr [] = {1,1,1,0};
        int target = 1;
        int closest_sum = arr[0] +arr[1] + arr[2]; // The actual triplet sum that’s closest to the target  ( here we just have taken the 1st 3 as just intiliazation ; it will keep updating as the code goes)
         int closest_diff_yet = 0 ;
        
        
        for(int i=0; i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                for(int k=j+1;k<arr.length;k++)
                {
                    int current_sum = arr[i] + arr[j] + arr[k];
                    
                    int current_diff = 0 ;   // it shows : How far the current triplet is from the target
                    
                    if(current_sum > target )
                    {
                        current_diff = current_sum - target;
                    }
                    else
                    {
                        current_diff = target - current_sum;
                    }
                    
                    
                    
                    //int closest_diff_yet;  // it shows : How far the best triplet so far is from the target
                    
                    if(closest_sum > target)
                    {
                        closest_diff_yet = closest_sum - target;
                    }
                    else
                    {
                        closest_diff_yet = target - closest_sum;
                    }
                    
                    
                    if(current_diff < closest_diff_yet )
                    {
                        closest_sum = current_sum ;
                    }
                }
            }
        }
        
        
        
        //System.out.println("the closest sum is : "+ closest_diff_yet);  // we wont print this since the questions asks not the closest diffence we got ; but the actual difference we got from a  triplet that is closest to target(i.e closest_sum)
        System.out.println("the closest sum is : "+ closest_sum);

    }
}


class Number_of_Arithmetic_Triplets  // leetcode question 
{
    public static void main(String[] args) 
    {
        int arr [] = {0,1,4,6,7,10};

        int diff = 3;

        for(int i =0;i<arr.length;i++)
        {
            for(int j = i+1;j<arr.length;j++)
            {
                for(int k=j+1;k<arr.length;k++)
                {
                    //if(i!=j && j!= k && i !=k)
                    
                        if(arr[j] - arr[i] == diff && arr[k] - arr[j] == diff)
                        {
                            System.out.println("the indexes: "+i+" "+j+" "+k );
                        }
                    
                }

            }
        }
         
    }
}


class Number_of_Unequal_Triplets_in_Array  // leetcode question 

{
    public static void main(String[] args) 
    {
        int arr [] = {4,4,2,4,3};

        //int diff = 3;

        for(int i =0;i<arr.length;i++)
        {
            for(int j = i+1;j<arr.length;j++)
            {
                for(int k=j+1;k<arr.length;k++)
                {
                    //if(i!=j && j!= k && i !=k) // this is not needed since we need to be comparing the arr[i i.e values not their indexes]
                    
                        if( arr[i]!=arr[j] && arr[j]!=arr[k] && arr[i] != arr[k])
                        {
                            System.out.println("the triplet : "+arr[i]+" "+arr[j]+" "+arr[k] );
                        }
                    
                }

            }
        }
         
    }
}


class Count_Good_Triplets   // leetcode question
{
    public static void main(String[] args) 
    {
        int arr [] = {3,0,1,1,9,7};
        int a=7;
        int b=2;
        int c=3;

        for(int i =0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                for(int k=j+1;k<arr.length;k++)
                {
                    if((arr[i]-arr[j] <=a && arr[i]-arr[j]>= -a) &&
                        (arr[j]-arr[k] <=b && arr[j]-arr[k]>=-b )&&
                        (arr[i]-arr[k]<=c) && arr[i]-arr[k]>=-c)
                    {
                        System.out.println("the triplets : "+arr[i]+" "+arr[j]+" "+arr[k]);
                    }
                }
            }

        }
        
    }
}

class Count_Special_Quadruplets   // leetcode question
{
    public static void main(String[] args) 
    {
        int arr [] = {1,2,3,6};

        for(int a=0;a<arr.length;a++)
        {
            for(int b=a+1;b<arr.length;b++)
            {
                for(int c=b+1;c<arr.length;c++)
                {
                    for(int d=c+1;d<arr.length;d++)
                    {
                        if(arr[a]+arr[b]+arr[c] == arr[d])
                        {
                            System.out.println("the quadruplet indexes : "+a+" "+b+" "+c);
                        }

                    }
                    
                }
            }
        }
        
    }
}

class Count_Increasing_Quadruplets   // leetcode quwstion (time limit exceeded)
{
    public static void main(String[] args) 
    {
        int arr [] ={1,3,2,4,5};

        for(int i=0;i<arr.length;i++)
        {
            for(int k=i+1;k<arr.length;k++)
            {
                for(int j=k+1 ;j<arr.length;j++)
                {
                    for(int l=j+1;l<arr.length;l++)
                    {
                        if(arr[i]<arr[j] && arr[j]<arr[k] && arr[k]<arr[l])
                        {
                            System.out.println("the indexes of triplets : "+i+" "+k+" "+j+" "+l);
                        }

                    }
                    

                }
            }
        }
        
    }
}




class Increasing_Triplet_Subsequence
{
    public static boolean main(String[] args) 
    {
        int arr [] ={1,2,3,4,5};

        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                for(int k= 0 ;k<arr.length;k++)
                {
                    if(arr[i]<arr[j] && arr[j] <arr[k])
                    {
                        return true;
                    }
                    else
                    {
                        return false;
                    }
                }
            }
        }
        
    }
}

//delete this //
//delete this ////delete this //
//delete this ////delete this ////delete this ////delete this ////delete this ////delete this ////delete this ////delete this //
//delete this ////delete this ////delete this ////delete this ////delete this ////delete this ////delete this ////delete this //
//delete this ////delete this ////delete this ////delete this ////delete this ////delete this ////delete this ////delete this //
//delete this ////delete this ////delete this ////delete this ////delete this ////delete this ////delete this ////delete this //
//deletegit this ////delete this ////delete this ////delete this ////delete this ////delete this ////delete this ////delete this //
//deletegit this ////delete this ////delete this ////delete this ////delete this ////delete this ////delete this ////delete this //
//deletegit this ////delete this ////delete this ////delete this ////delete this ////delete this ////delete this ////delete this //
//deletegit this ////delete this ////delete this ////delete this ////delete this ////delete this ////delete this ////delete this //
//deletegit this ////delete this ////delete this ////delete this ////delete this ////delete this ////delete this ////delete this //
















        
        
        
        
        
        
        
        
    

        
        
        
        
        
        
        
        
        
    

        
        
        
        
        
        
        
    




















































































