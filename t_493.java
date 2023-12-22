public class t_493 {
    public static void main(String[] args) {
        circle a = new circle();
        a.n =  5;
        a.area();
    }
}
class circle {
    int n;
    void area(){
        System.out.println(n*3.14*n);
    }
}

