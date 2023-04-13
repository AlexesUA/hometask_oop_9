package ua.edu.cbs.lms.hometask_oop_9.task5;

import ua.edu.cbs.lms.hometask_oop_9.task2.ErrorsHandlig;

public class MyClass <T>{
    private T variables;

    private MyClass (T variables){
        this.variables = variables;
    }

    public static <T> MyClass<T> createMyClass(T variables){
        try{
            return new MyClass<T>(variables);
        }catch (Exception error){
            ErrorsHandlig.errorHandling(error);
            return null;
        }
    }

    public T getVariables() {
        return variables;
    }
}
