package ua.edu.cbs.lms.hometask_oop_9.task2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        MyList<String> mlString = new MyList<>();
        MyList<Integer> mlInteger = new MyList<>(12);

        System.out.println(mlString.getListsClass() + ": " + mlString.getCount());
        System.out.println(mlInteger.getListsClass() + ": " + mlInteger.getCount());


        //List<String> lStr= new ArrayList<>();

        for(int i=0; i<11; i++) {
            mlString.add(String.format("%s",i));
        }


    }
}
