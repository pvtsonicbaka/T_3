import java.util.Scanner;

public class t_656 {
    public static void main(String[] args) {
        Distance a = new Distance();
        Distance b =new Distance();
        a.get();
        b.get();
        System.out.println("----------------display-----------------------");
        a.show(a.km,a.m);
        b.show(b.km, b.m);
        Distance c = new Distance();
        c = a.add(a,b);
        c.show(c.km, c.m);
    }
}
class Distance{
    int km,m;
    Scanner sc = new Scanner(System.in);
    void get(){
        System.out.println("type km:");
        km = sc.nextInt();
        System.out.println("type meter");
        m = sc.nextInt();
    }
    void show(int a ,int b){
        System.out.println("distance:"+a+"."+b +" km");
        //System.out.println("meter"+m);
    }
    Distance add(Distance obj1,Distance obj2){
        Distance obj = new Distance();
        obj.km = obj1.km+obj2.km;
        obj.m = obj1.m+obj2.m;
        if(obj.m>=1000){
            obj.km+=1;
            obj.m-=1000;
        }
        return obj; 
    }
}
