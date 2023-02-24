package homework10.inheritance;

public class Child1 extends Parent1 {
    @Override
    protected void showMessage(){
        System.out.println("Hello Child class");
        super.showMessage();
    }



}
