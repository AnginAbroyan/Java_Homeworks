package homework10.abstract_class_and_interface.ex3;

import homework10.abstract_class_and_interface.ex3.A;

//3.
public class MyClass implements A {
    @Override
    public void methOne() {
        System.out.println("MyClass.methOne");
    }

    @Override
    public void methTwo() {
        System.out.println("MyClass.methTwo");

    }
}
