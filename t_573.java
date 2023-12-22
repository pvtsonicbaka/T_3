import java.util.Scanner;

public class t_573 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 2;
        int m = 3;
        recursion a = new recursion();
        System.out.println(a.power(n, m));
        sc.close();
    }
}
class recursion{
    int power(int n,int m){
        if(m==0){
            return 1;
        }
        return n*power(n, m-1);
    }
}