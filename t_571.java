import java.util.Scanner;

public class t_571 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("enter a :");
        int a = sc.nextInt();
        System.out.println("enter b:");
        int b = sc.nextInt();
        idk s = new idk();
        System.out.println(s.HCF(a, b));
        sc.close();
    }
}
class idk{
    int HCF(int a ,int b ){
        
        if(a==b){
            return a;
        }
        if(a>b){
            return HCF(a-b, b);
        }
        return HCF(a, b-a);
        
    }
    
}
