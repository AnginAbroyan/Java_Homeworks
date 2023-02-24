package homework10.inheritance;

public class SubClass2 extends SuperClass2 {
    public String message = "Hello SubClass class";


   public SubClass2(){
       System.out.println(super.message);
       System.out.println(message);
   }


}
