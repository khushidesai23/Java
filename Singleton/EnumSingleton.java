//Enum Singleton
//Khushi Desai
//21BCP264
public class EnumSingleton{
    public static void main(String[] args){//to do auto-generated method stub
       country obj1 = country.INSTANCE;//creating an object of the enum class
       System.out.println(obj1.getStr());

       obj1.setStr("India");
       System.out.println(obj1.getStr());

       country obj2 = country.INSTANCE;
       obj2.setStr("USA");
       System.out.println(obj2.getStr());
    }
}
//creating a enum class
enum country{
    INSTANCE;
    String str;

    public String getStr(){
       return str;
    }

    public void setStr(String str){
        this.str = str;//this keyword is used to refer to the current object
    }
}