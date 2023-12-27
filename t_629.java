import java.util.Random;
//import java.util.Scanner;

public class t_629 {
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        Random r= new Random(); 
        int a[] = new int[6];
        for(int i=0;i<a.length;i++){
            a[i] = r.nextInt(10);
        }
        idk b = new idk();
        b.display(a);
        b.swap(a);
        b.display(a);
    }
}
class idk{
    void display(int a[]){
        for(int i=0;i<a.length;i++){
           System.out.print(a[i]);

        }
        System.out.println();
    }
    void swap(int a[]){
        int idk = a.length-1;
        for(int i=0;i<a.length/2;i++){
            int temp = a[i];
            a[i] = a[idk];
            a[idk]=temp;
            idk--;
        }
    }
}
