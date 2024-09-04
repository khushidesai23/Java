//KHUSHI DESAI
//21BCP264
public class Q4 {
public static void main(String[] args) {
    
    cons obj =new cons();
    System.out.println("calling constructor without arguments");
    
    System.out.println(obj.area());
    cons obj1 =new cons(7);
    
    System.out.println("calling constructor with one argument");
    System.out.println(obj1.area());
    
    cons obj2 =new cons(5,7);
    
    System.out.println("calling constructor with two argument");
    
    System.out.println(obj2.area());
    
    }
}
    
class cons{
    
    int l, b, v;
    
    cons(){
    
    this.l=6;
    this.b=15;
    
    }
    
    cons(int x){
    
    this.l=x;
    this.b=x;
    
    }
    
    cons(int x,int y){
    
    this.l=x;
    this.b=y;
    
    }
    
    int area(){
    
    return l*b;
       
    }
    
}