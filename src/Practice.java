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


//(upper part contains this not bellow)
//   xxxxxxxxxxxx   for loop advanced INSIDE OUT (questions from   5B. forLoop.pdf  ,Pattern_Programs-combined.pdf,  5C. NestedLoop.pdf)   xxxxxxxxxxxxx


class right_triangle
{
    public static void main(String[] args) 
    {
        int n = 5;

        for(int i = 0 ;i<=n ;i++)
        {
            for(int j = 0 ; j<=i;j++)
            {
                System.out.print("*"+" ");
            }
             System.out.println();
        }
       
        
    }
}

class right_sided_traingle
{
    public static void main(String[] args) 
    {
        int n= 5;

        for(int i = 0 )
        
    }
}


class right_traingle_first_ulta traingle
{
    public static void main(String[] args) 
    {
        int n = 5;
        for(int i = 0;i<=n ;i++)
        {
            for(int j = i ; j<=n;j++)
            {
                System.out.println(" ");
            }

            for(int k = 0;k<=i;k++)
            {
                System.out.println("*");
            }

            System.out.println();
        }
        
    }

}

class ulta_right_traingle
{
    public static void main(String[] args) 
    {
        int n = 5;

        for(int i=0;i<=n;i++)
        {
            for(int k=0 ; k<=i;k++)
            {
                System.out.print(" ");
            }
            for(int j=i;j<=n;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
}


// integers taken from String will be added here

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


class Determine_if_Two_Events_Have_Conflict  // leetcode question 100% working  (paste the image from college rough copy DONT FORGET !!!!!!!!!!)
{
    public static void main(String[] args) 
    {
       //String str1 [] = {{"01:15"},{"01:15"}};     this is wrong put the braces after String
        String []event1  = {"01:00","02:00"};
         String [] event2  = {"01:20","03:00"};
        //  String str1 = "01:15";
        //  String str2 = "02:00";


          //System.out.println(str1.compareTo(str2));

         String start1 = event1[0];
         String end1 = event1[1];

         String start2 = event2[0];
         String end2 = event2[1];

         int count=0;


         if(start2.compareTo(end1)<=0)
         {
            count++;
         }
         if(start1.compareTo(end2)<=0)    // 2025-12-05-10-27-22.png  see this one it tells why i used this one (even though it went opposite to my thinking ; since it eliminates the scenarious where there may be fake overlaps i.e it might go round the clock sometimes)
         {
            count++;
         }


         if(count==2)
         {
            System.out.println("overlap");
         }
         else
         {
            System.out.println("no overlap");
         }


            
        }
}

class Non_overlapping_Intervals
{
    public static void main(String[] args) 
    {
        int arr[][] = {{1,2},{2,3},{3,4},{1,3}};


        
    }
}


import java.util.*;
class vector_basics 
{
    public static void main(String[] args) 
    {
        Vector <String> vec = new Vector <String>();

        vec.add("mano");
        vec.add("bruno");
        vec.add("kruno");

        vec.addElement("suno")

        for(String i : vec)
        {
            System.out.println(i);
        }
    }
}

import java.util.*;
class stack_basics 
{
    public static void main(String[] args) 
    {
        Stack <String> st = new Stack <String>();

        st.add("mano");
        st.add("bruno");
        st.add("kruno");

        for(String i : st)
        {
            System.out.println(i);

        }
        
    }
}

import java.util.*;
class PriorityQueue_basics
{
    public static void main(String[] args) 
    {
        Queue <String> pq = new PriorityQueue <String>();

        pq.add("2");
        pq.add("1");
        pq.add("3");

        for(String i : pq)
        {
            System.out.println(i);
        }
        
    }
}



import java.util.*;
class Hashmap_basics
{
    public static void main(String[] args) 
    {
        HashMap <Integer,String> hm =  new HashMap<Integer,String>();

        hm.put(1,"mano");
        hm.put(2,"bruno");


        System.out.println(hm.get(1));
        System.out.println(hm.get("mano"))

        for(Map.Entry<Integer,String> e : hm.entrySet())
        {
            System.out.println("key : " + e.getKey()+"value : "+ e.getValue());

        }  
    }
}


import java.util.*;
class fisher_yates
{
    public static void main(String[] args) 
    {
        int arr[] = {1,2,3,4,5,6};

        Random rand = new Random();

        for(int i =arr.length-1 ; i>1;i--)
        {
            int j = rand.nextInt(i+1);
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        for(int num : arr)
        {
            System.out.println(num);
        }
        
    }
}


class Shuffle_an_Array        // leetcode question : working for 100 % testcases
{
    public static void main(String[] args) 
    {
        class Solution {
    int arr[];
    int original [];
    Random rand;

    public Solution (int[] nums)
        {
            arr = new int[nums.length];
            original = new int[nums.length];

            for(int i =0 ;i<nums.length;i++)
            {
                original[i] = nums[i];
                arr[i] = nums[i];
            }


             rand = new Random();

        }

        public int[] reset()
        {
            for(int i =0;i<original.length;i++)
            {
                arr[i] = original[i];
            }
            return arr;
        }

        public int [] shuffle()
        {
            for(int i = arr.length-1;i>0;i--)
            {
                int j = rand.nextInt(i+1);
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j]= temp;
            }
            return arr;
        }
}

        
    }
}







import java.util.*;
class Check_if_element_exists
{
    public static void main(String[] args) 
    {
        int arr [] = {1,2,3,4,5};
        int k =4;

        ArrayList<Integer> ar = new ArrayList<>();

        for(int num : arr)
        {
            ar.add(num);
        }
        // for(int digit : ar)
        // {
        //     if(ar.contains(k))
        //     {
        //         System.out.println("yes");    // ALL THIS IS NOT NEEDED !!!!!!!!!!!!!!!!!
        //     }
        //     else
        //     {
        //         System.out.println("no");
        //     }
            
        // }

        // just use 

        if(ar.contains(k))    // just directly use contains without any for loop (THATS HOW ITS DONE IN ar !!!!!!!!!!!!1)
        {
            System.out.println("yes");
            return;
        }
        System.out.println("no");
    }
}


class priority_stuff
{
    
}




import java.util.*;
class stack_basics_again
{
    public static void main(String[] args) 
    {
        int arr[] = {1,2,3,4,5};

        Stack <Integer> st = new Stack <>();

        for(int num :arr)
        {
            st.push(num);
        }
        System.out.println(st);
        
        System.out.println(st.peek());
        
        System.out.println(st.pop());
        
        System.out.println("after pop "+st);
        
        if(st.isEmpty())
        {
            System.out.println("true");
            return;
        }
        System.out.println("false");
        
    }
}


// push pop peek isempty implement 


class stack
{
    int arr[] = {1,2,3,4,5};

}

void insert()



//1st page 

import java.util.*;
class First_Missing_Positive
{
    public static void main (String args []) // n(n-1); this would not work 
    {
        int arr[] = {1,2,2,1,3,1,0,4,0};
        
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        
        for(int i=0;i<arr.length;i++)
        {
            if(arr.length<2 && arr[i] !=1)
            {
                System.out.println("1");
                return;
            }
            if(arr[i] ==0 && arr[i+1] !=1)
            {
                System.out.println("1");
                return;
            }
        }

        ArrayList<Integer> ar = new ArrayList<>();

        for(int i=0;i<arr.length;i++)
        {

            if(arr[i] > 0 && !ar.contains(arr[i]))
            {
                ar.add(arr[i]);
            }

        }
        if(!ar.contains(1))
        {
            System.out.println("1");
            return;
        }
        
        System.out.println(ar);
        
        int digit=0; ;
        
        for(int i=0;i<ar.size()-1;i++)
        {
            int j=i+1;
            int current_element = ar.get(i);
            if(current_element+1 != ar.get(j))
            {
                digit = current_element;
                break;
            }
            //j++;
        }
        
        if(digit == 0)
        {
            digit = ar.get(ar.size()-1);
        }
        
        System.out.println(digit+1);
        
    }
}



//2nd page 


import java.util.*;
class Intersection_of_Two_Arrays_II
{
    public static void main (String args [] )
    {
        int nums1[] = {1,2,2,1};
        
        int nums2[] = {2,2};

        ArrayList <Integer> ar = new ArrayList<>();
        ArrayList<Integer> ar_2 = new ArrayList<>();

        for(int num :nums1)
        {
            ar.add(num);
        }

        for(int i=0;i<nums2.length;i++)
        {
            if(ar.contains(nums2[i]) && !ar_2.contains(nums2[i]))
            {
                ar_2.add(nums2[i]);
            }
        }

        int l;
        int count =0;
        for(int k =0;k<ar_2.size();k++)
        {
            int current_element = ar_2.get(k);
            
            for( l=k+1;l<ar_2.size();l++)
            {
                if(ar_2.get(l) == current_element)
                {
                    //ar_2.remove(l);
                    count++;
                    //l--;
                }
                
            }
            if(count >2 && ar_2.size()<3)
            {
                ar_2.remove(l);
                l--;
            }
        }

        System.out.println(ar_2); 
        // return ar_2;

        int final_arr[] = new int[ar_2.size()];
        
        for(int p=0;p<ar_2.size();p++)
        {
            final_arr[p] = ar_2.get(p);
        }
        for(int numm : final_arr)
        {
            System.out.println(numm);
        }
        // return final_arr;
        //System.out.println(final_arr);
       
    }
}



//3rd page


import java.util.*;
class Maximum_Size_of_a_Set_After_Removals
{
    public static void main (String args [])
    {
        int arr_1 []= {1,2,3,4,5,6};
        int arr_2 []= {2,3,2,3,2,3};
        
        ArrayList<Integer> ar = new ArrayList<>();
        ArrayList<Integer> ar_2 = new ArrayList<>();
        
        for(int num : arr_1)
        {
            if(!ar.contains(num))
            {
              ar.add(num);  
            }
        }
        for(int numm : arr_2)
        {
            if(!ar.contains(numm))
            {
                ar.add(numm);
            }
            
        }

        // for(int i=0;i<arr_1.length/2;i++)
        // {
        //     if(!ar.contains(arr_1[i]) && (!ar.contains(arr_2[i])))
        //     {
        //         ar.add(arr_1[i]);
        //         ar.add(arr_2[i]);
                
        //     }
            
        // }
        
        System.out.println(ar);
        System.out.println(ar.size());
    }
}




//4th page

import java.util.*;
class Kth_Distinct_String_in_an_Array
{
    public static void main(String args [])
    {
        String s1 [] = {"d","b","c","b","c","a"};

        int k =2;

        LinkedHashMap<String,Integer> hm = new LinkedHashMap<>();
        ArrayList<String> ar = new ArrayList<>();

        for(int i=0;i<s1.length;i++)
        {
            String s1_single = s1[i];
            hm.put(s1_single,hm.getOrDefault(s1_single,0)+1);
        }
        System.out.println(hm);
        
        int count =0;
        for(String key : hm.keySet())
        {
            if(hm.get(key) == 1)
            {
                ar.add(key);
                count++;
            }
        }
        System.out.println(ar);
        // System.out.println(count);
        
        
        if(count <k)
        {
            System.out.println("empty");
        }
        else
        {
            String result = ar.get(k-1);
            System.out.println(result);
        }
        
        
    }
}


//5th 

import java.util.*;
class stack_basics_again
{
    public static void main(String[] args) 
    {
        int arr[] = {1,2,3,4,5};

        Stack <Integer> st = new Stack <>();

        // for(int num :arr)
        // {
        //     st.push(num);
        // }
        // System.out.println(st);
        
        // System.out.println(st.peek());
        
        // System.out.println(st.pop());
        
        // System.out.println("after pop "+st);
        
        // if(st.isEmpty())
        // {
        //     System.out.println("true");
        //     return;
        // }
        // System.out.println("false");
        
    }
}


import java.util.*;
class stack_basics_again
{
    public static void main (String args [])
    {

        int arr = {1,2,3,4,5};

        Stack<Integer> st = new Stack<>();

        for(int num : arr)
        {
            st.push(arr);
        }
        System.out.println(st);



    }
}




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

























