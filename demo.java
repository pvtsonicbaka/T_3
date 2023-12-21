public class demo {
    public static void main(String[] args) {
        k a = new k();
        System.out.println(a.iss(211,0));
    }

}
 class k{
    
    int iss(int n,int temp){
        if(n==0)return temp;
        temp+=n%10;
        return iss(n/10, temp);
        
        
    }
 }