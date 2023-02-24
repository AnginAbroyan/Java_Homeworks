package homework10.inheritance;

public class InheritedClasses3 {
    public void DisplayA() {
        System.out.print("A ");
    }
}

class B extends InheritedClasses3 {
    public void DisplayB(){
        System.out.print("B ");
    }
}
class C extends B {
    public void DisplayC(){
        System.out.print("C ");
    }
}
class D extends C {
    public void DisplayD(){
        System.out.print("D ");
    }
}
class E extends D {
    public void DisplayE(){
        System.out.print("E ");
    }
}

class F extends E {
    public void DisplayF(){
        System.out.println("F");
    }
}
