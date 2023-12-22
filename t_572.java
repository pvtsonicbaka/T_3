import java.util.Scanner;

public class t_572 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("enter num:");
        int n = sc.nextInt();
        name a = new name();
        System.out.println(a.fact(n));
        sc.close();
    }
}
class name {
    int fact(int n){
        if(n==0 || n==1)
        return 1;
        return n*fact(n-1);
    }
}
