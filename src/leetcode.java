class Solution {                                       // leetcode sum 1: two sum
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


class String_to_integer_atoi_but_using_simple_logic
{
    public static void main(String[] args) 
    {
        String s = "-042";

        String str1 = s.trim();

        String  result ="";

        for(int i = 0;i<str1.length();i++)
        {
            char chr = str1.charAt(i);

            if(!Character.isAlphabetic(chr))
            {
                result = result + Character.toString(chr);
            }
            else if(Character.isLetter('-') || (Character.isLetter('+')))
            {


            }
        }
        
    }
}








class String_to_integer_atoi_but_using_simple_logic
{
    public static void main(String[] args) 
    {
        String s = "-1337c0d3";

        String str1 = s.trim();

        String  result ="";

        for(int i = 0;i<str1.length();i++)
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







