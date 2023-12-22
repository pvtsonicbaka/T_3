public class t_577 {
    public static void main(String[] args) {
        int a[] = {4,3,7,1,0,9};

        iii pp = new iii();
        System.out.println(pp.sort(a,a.length));


    }
}
class iii{
    int sort(int a[],int n){
        if(n==1)
        return a[0];
    return Math.min(a[n-1], sort(a,n-1));
    }
}