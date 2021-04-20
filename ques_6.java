import java.util.Scanner;

public class ques_6 {
    public int findNearestPalindrome(int n){
        int lowerPalindrome = getLowerPalindrome(n);
        int higherPalindrome = getHigherPalindrome(n);
        if(Math.abs(n-lowerPalindrome)<Math.abs(n-higherPalindrome))
            return lowerPalindrome;
        else
            return higherPalindrome;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to get the nearest Palindrome.");
        System.out.println(new ques_6().findNearestPalindrome(sc.nextInt()));
    }

    public int getLowerPalindrome(int n){
        int ans=0;
        for(int i=n-1;i>=0;i--) {
            int rem, rev = 0; int origNum = i; int a = i;
            while ( a!= 0) {
                rem = a % 10;
                rev = rev * 10 + rem;
                a /= 10;
            }
            if(origNum==rev){
                ans=origNum;
                break;
            }
        }
        return ans;
    }

    public int getHigherPalindrome(int n){
        int ans=0;
        for(int i=n+1;i<Integer.MAX_VALUE;i++) {
            int rem, rev = 0; int origNum = i; int a = i;
            while ( a!= 0) {
                rem = a % 10;
                rev = rev * 10 + rem;
                a /= 10;
            }
            if(origNum==rev){
                ans=origNum;
                break;
            }
        }
        return ans;
    }
}
