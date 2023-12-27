import java.util.Scanner;

public class t_624 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        Account a[] = new Account[3];
        for(int i=0;i<a.length;i++){
            a[i] = new Account();
            a[i].set();
        }
        for(int i=0;i<a.length;i++){
            a[i].display();
        }
        System.out.println("input for search id:");
        int i = sc.nextInt();
        a[0].search(i,a);
    }
}
class Account{
    Scanner sc = new Scanner(System.in);
    int id,balance;
    String name;
    void set(){
        System.out.println("name");
        name = sc.nextLine();
        System.out.println("id");
        id = sc.nextInt();
        System.out.println("balance");
        balance = sc.nextInt();
    }
    void display(){
        System.out.println("id:"+id+"\nname:"+name+"\nbalae:"+balance);
    }
    void search(int i,Account k[]){
        for(int j=0;j<k.length;j++){
            if(k[j].id==i){
                k[j].display();
                return;
            }
        }
        System.out.println("not found");
    }
}
