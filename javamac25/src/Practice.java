/* 

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






























