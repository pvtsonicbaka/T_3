public class t_574 {
    public static void main(String[] args) {
        int n = 8;
        idk a = new idk();
        System.out.println(a.decimalToBinary(n));
    }
    
}
class idk{
    int decimalToBinary(int n){
        if(n==0)return 0;
        return n%2 +10* decimalToBinary(n/2);
    }
}