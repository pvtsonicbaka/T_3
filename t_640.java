public class t_640 {
    public static void main(String[] args) {
        skk obj = new skk();
        obj.set(10, 12);
        obj.swap(obj);
        obj.display();
    }
}
class skk{
    int x,y;
    void set(int a,int b){
        x=a;
        y=b;
    }
    void swap(skk a){
        int temp = a.x;
        a.x = a.y;
        a.y = temp;
    }
    void display(){
        System.out.println("x:"+x+"y"+y);
    }
}