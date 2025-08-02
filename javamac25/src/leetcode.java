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

class main 
{
    public static void main(String args [])
    {
    Solution s1 = new Solution ();
    int mynum = 121;

    s1.isPalindrome(mynum);
    }
}


