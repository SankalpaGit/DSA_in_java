package Day9;

public class TimeComplex {
 
    public static int sum(int n){
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
    
    public static void main(String[] args) {
        int n =10;
        System.out.println("sum of first " + n + " snumber is " + sum(n));
    }
}
