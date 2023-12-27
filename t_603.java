public class t_603 {
    public static void main(String[] args) {
        Areaa a  = new Areaa(); 
        System.out.println("circle:"+a.area(20)+"\ntriange:"+a.area(2, 1)+"\nrecctangle:"+a.area(5f,6f ));
         
    }
}
class Areaa{
    double  area(int r ){//circle
        return 3.14*r*r; 
    }
    double area(int a,int b){//triange
        return 0.5 *a*b;
    }
    float area(float a,float b){{//rectanfk
        return a*b;
    }}
}