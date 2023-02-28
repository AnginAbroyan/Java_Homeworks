package homework10.inheritance.ex1;

public class Child extends Parent {
    @Override
    public void showMessage(){
        System.out.println("Hello Child class");
        super.showMessage();
    }



}
