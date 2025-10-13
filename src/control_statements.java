/* 


                        //  xxxxxxxxxxx  full control statements basics


                        public class control_statements 
{
    public static void main(String[] args)
    {
        int x = 222;

        if(x ==10)                          // if else if ladder
        {
            System.out.println("yes");       // will print when if is true
        }
        else if( x == 100)
        {
            System.out.println("no");        //  another if statement which will print regardless of 1st if is true or not
        }
        else
        {
            System.out.println("x=222 ");     // else will print only when both the if and else if statements are false only then will it print
        }
        
    }
    
}



class nested_if
{
    public static void main(String[] args) 
    {
        String x= "meerut";

        if(x=="meerut")
        {
            if(2%2 == 5)
            {
            System.out.println("1");            // in nested if the inside if will print only when the 1st loop is true
            }
            else
            {
                System.out.println("f this world");    // this else part only works when next to the inside if ; next to the outside loop it doesnt work
            }
        }
        // else
        // {
        //     System.out.println("f this world");  
        // }
    
        
    }
}





class switch_cases                 // switch sums start here
{
    public static void main(String[] args) 
    {
        int n  = 10;

        switch(n)
        {
            case 10:                    // rember always the conditions or statements come before : symbol remember that 
            System.out.println("10");

            break;                         // always remember to put the break statement inside a true case ;because if you dont it will print the succeding cases reagrdless of true or not

            case 20:
            System.out.println("20");

        }
        
    }
}



class switch_months
{
    public static void main(String[] args) {
        
   
    int month = 4;

    String month_name = "";

    switch(month)
    {
        case 1:
        System.out.println("its  jan");
        break;

        case 2:
        System.out.println("its  feb");
        break;

        case 3:
        System.out.println("its  mar");
        break;
        
        case 4:
        System.out.println("its  apr");
        break;

        case 5:
        System.out.println("its  may");
        break;
        
        case 6:
        System.out.println("its  jun");
        break;

        // so on  .......


    }
}
}


class switch_with_string
{
    public static void main(String[] args) 
    {
        String level = "expert";

        switch(level)
        {
            case "expert" : 
            System.out.println("expert level");
            break;

            ca
        }

        
    }
}



class for_loops
{
    public static void main(String[] args)     // Golden rule: silly but imp loop concept misconception
    {
        for(int i =1; i<=3;i++)       // you might be perplexed why i loop prints like that and j loop diffrently no problem just look down for explantion
        {
            for(int j = 1 ; j<=3;j++)
            {
                System.out.println(i+" "+j);  // here j loop prints the normally while i loop prints same thrice is because i loop will not increment up until j loop finishes  ; i know its confusing but soooo silly dont worry we all make mistakes mano
            }
        }
        
    }
}



class pyramid_pattern
{
    public static void main(String[] args) 
    {
        for(int i = 0;i<=4;i++)
        {
            for(int j = 4;j>=i;j--)              // just the opposite it has to decrement from 5 to 1* in the end
            {
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
}
     



class int_i_arr
{
    public static void main (String args[]) 
    {
    int arr[] = {1,2,3,4};
    for(int i : arr)
    {
        System.out.print(i);
    }
    }
}



                 // xxxxxxxxxxx   0_1_for_programs.txt sums xxxxxxxxx

class range_1to10
{
    public static void main(String[] args) 
    {
        for(int i = 1;i<=10;i++)
        {
            System.out.print(i+ " ");
        }
        
    }
}

class range_25to40
{
    public static void main(String[] args) 
    {
        for(int i = 25;i<=40;i++)
        {
            System.out.print(i+ " ");
        }
        
    }
}

class range_10to1
{
    public static void main(String[] args) 
    {
        for(int i = 10 ;i>=1;i--)
        {
            System.out.print(i+" ");
        }
        
    }
}
   

    class range_40to25
    {
        public static void main(String[] args) 
        {
            for(int i = 45;i<=25;i++)
            {
                System.out.println(i+" ");
            }
            
        }
    }

class divisible_by_3and4
{
    public static void main(String[] args) 
    {
        for(int i = 10;i<=50;i++)
        {
            if(i % 3 == 0 && i% 4==0)
            {
                System.out.print(i+" ");
            }
        }
        
    }
}
class display_even_fromrange_25to40
{
    public static void main(String[] args) 
    {
        for(int i = 25;i<40;i++)
        {
            if(i%2 == 0)
            {
                System.out.print(i +" ");
            }
        }
        
    }
}

class alternate_values_from_25to40
{
    public static void main (String args [])
    {
        for(int i = 25;i<=40;i++)
        {
            System.out.print(i+" "+ i+2);
        }
    }

}

class divisible_by456
{
    public Static void main (String args [])
    {
        for(int i = 5;i<=100;i++)
        {
            if(i %4 == 0 && i% 5 == 0 && i% 6 ==0)
            {
            System.out.println(i+"");
            }
        }
    }
}

*/
               //  xxxxxxxx 5B. forLoop.pdf sums start here

class odd_numbers
{
    publi
}


