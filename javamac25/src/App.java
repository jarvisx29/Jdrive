









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
        arr[i]=arr[arr.length - 1 - i];     // swapping element with its adjacent postion on other side ogf middle element
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

*/



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

*/





















































