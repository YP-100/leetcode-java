public class Solution {

    public static int reverse(int x) {
        int rev = 0;

        while (x!=0) {
            int rem = x%10;
            x = x/10;

            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE/10 && rem> Integer.MAX_VALUE%10)) {
                return 0;
            }


            if (rev < Integer.MIN_VALUE /10 || (rev == Integer.MIN_VALUE/10 && rem< Integer.MIN_VALUE% 10)) {
                return 0;
            }
            rev = rev*10 + rem;
        }

        return rev;
    }

    public static void main(String[] args) {
        System.out.println(reverse(-554));         
        System.out.println(reverse(5404));          
        System.out.println(reverse(5840));          
        System.out.println(reverse(1534236469));    
        System.out.println(reverse(-123));          
        System.out.println(reverse(120));           
    }
}