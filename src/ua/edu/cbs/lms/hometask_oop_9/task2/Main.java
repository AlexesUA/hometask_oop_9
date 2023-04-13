package ua.edu.cbs.lms.hometask_oop_9.task2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        MyList<String> mlString = new MyList<>();
        MyList<Integer> mlInteger = new MyList<>(12);

        System.out.println(mlString.getListsClass() + ": " + mlString.getCount() + "; " + mlString.getLength());
        System.out.println(mlInteger.getListsClass() + ": " + mlInteger.getCount() + "; " + mlInteger.getLength());


//        List<String> lStr= new ArrayList<>();
//        System.out.println(lStr.getClass());

        for(int i=0; i<11; i++) {
            mlString.add(String.format("%s",i));
        }

        for(int i=0; i<31; i++) {
            mlInteger.add(i);
        }


        System.out.println(mlString.getListsClass() + ": " + mlString.getCount() + "; " + mlString.getLength());
        System.out.println(mlInteger.getListsClass() + ": " + mlInteger.getCount() + "; " + mlInteger.getLength());

        System.out.println("index 3 = " + mlString.getElement(3));
        System.out.println("index -2 = " + mlString.getElement(-2));
        System.out.println("index 21 = " + mlString.getElement(21));

        System.out.println("index 4 = " + mlInteger.getElement(4));
        System.out.println("index -23 = " + mlInteger.getElement(-23));
        System.out.println("index 32 = " + mlInteger.getElement(32));

    }
}
