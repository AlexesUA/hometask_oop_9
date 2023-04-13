package ua.edu.cbs.lms.hometask_oop_9.task5;

import ua.edu.cbs.lms.hometask_oop_9.task2.ErrorsHandlig;

public class Main {
    public static void main(String[] args) {
        MyClass <String> mcStr = MyClass.createMyClass("String variables");
        MyClass <Integer> mcInt = MyClass.createMyClass(123);
        MyClass <Boolean> mcBool = MyClass.createMyClass(true);

        try {
            assert mcStr != null;
            System.out.println(mcStr.getVariables());
        }catch (Exception error){
            ErrorsHandlig.errorHandling(error);
        }

        try {
            assert mcInt != null;
            System.out.println(mcInt.getVariables());
        }catch (Exception error) {
            ErrorsHandlig.errorHandling(error);
        }

        try {
            assert mcBool != null;
            System.out.println(mcBool.getVariables());
        }catch (Exception error){
            ErrorsHandlig.errorHandling(error);
        }

    }
}
