public class t_576 {
    public static void main(String[] args) {
        int n =9;
        sys a = new sys();
        System.out.println("1 \n"+"1 ");
        a.fibo(1, 2, n-3);
    }
}
class sys{
    void fibo(int a,int b,int n ){
        if(n==0)return;
        System.out.println(a+b+" ");
        fibo(b, a+b, n-1);
    }
}