package ua.edu.cbs.lms.hometask_oop_9.task2;

import java.lang.reflect.Array;

public class MyList <T>{
    private T[] arraysMyList;
    private int count;

    boolean isEmpty;

    public MyList(){
        arraysMyList = (T[]) new Object[10];
        count = 0;
        isEmpty = true;
    }

    public MyList(int initialLengthArray){
        try{
            if(initialLengthArray <= 0) throw new Exception("The initial length cannot be less than or equal to 0.");
            else{
                arraysMyList = (T[]) new Object[initialLengthArray];
                count = 0;
                isEmpty = true;
            }
        }catch (Exception error){
            ErrorsHandlig.errorHandling(error);
        }
    }

    public int getCount(){
        return count;
    }

    public int getLength(){
        return arraysMyList.length;
    }

    public String getListsClass(){
        return arraysMyList.getClass().getName();
    }

    public boolean add(T element){
        try {
            if (count + 1 == arraysMyList.length) {
                if(increasingArray()){
                    throw new Exception("Increasing list error.");
                }
            }

            arraysMyList[count] = element;
            count++;
            return true;

        }catch (Exception error){
            ErrorsHandlig.errorHandling(error);
            return false;
        }
    }

    private boolean increasingArray(){
        try {
            T[] newArray = arraysMyList;
            arraysMyList = (T[]) new Object[(int)(newArray.length*1.5)];
            arraysMyList = newArray.clone();
            return true;
        }catch (Exception error){
            ErrorsHandlig.errorHandling(error);
            return false;
        }
    }



}
