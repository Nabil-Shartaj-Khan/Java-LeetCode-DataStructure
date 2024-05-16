package LeetCode;

public class DivNonDivSumDiff {


    public static void main(String[] args) {

        System.out.println(diffOfSum(2,5));
    }

    public static int  diffOfSum(int n,int m){

        int x=n/m;
        int num2=x*m*(x+1)/2;
        int num1=n*(n+1)/2-num2;

        return num1-num2;
    }
}
