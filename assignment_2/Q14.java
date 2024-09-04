//KHUSHI DESAI
//21BCP264

interface A 
{
  public void mulInheritance();
}

class travelling 
{
  public void str(String s) 
  {
    System.out.println(s + " is travelling.");
  }
}

class Q14 extends travelling implements A 
{

  String st = "Animal";

  public void mulInheritance() 
  {
    System.out.println(st + " is eating.");
  }

  public static void main(String[] args) 
  {

    
    Q14 animal = new Q14();

    animal.mulInheritance();

    animal.str(animal.st);
  }

}