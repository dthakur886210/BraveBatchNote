public class ClimbingStairs {
    //leetcode recursion climbing stairs... starting question
    //https://leetcode.com/problems/climbing-stairs/
    //This problem is of dynamic programming, thats why with normal recursion it will give TLE error..

//    You are climbing a staircase. It takes n steps to reach the top.
//
//    Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
//
//
//
//    Example 1:
//
//    Input: n = 2
//    Output: 2
//    Explanation: There are two ways to climb to the top.
//1. 1 step + 1 step
//2. 2 steps

    public static void main(String[] args) {
        System.out.println(climbingStairs(5));
    }
    public  static int climbingStairs(int n ){
        if( n ==0) return 1;
        if (n < 0) return 0;
        int oneStep = climbingStairs(n-1);
        int twoSteps = climbingStairs(n-2);
        return oneStep+twoSteps;
    }
}
