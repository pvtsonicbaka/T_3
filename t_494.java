import java.util.Scanner;

public class t_494 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        ransom a = new ransom();
        a.a =n;
        a.umm();sc.close();
    }
}
class ransom{
    int a ;
    int count = 0;
    void umm(){
        while(a!=0){
            count++;
            a/=10;
        }
        System.out.println(count);
    }
}