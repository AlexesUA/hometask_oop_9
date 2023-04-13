package ua.edu.cbs.lms.hometask_oop_9.task2;

public class MyList <T>{
    private T[] arraysMyList;
    private int count;

    public MyList(){
        arraysMyList = (T[]) new Object[10];
        count = 0;
    }

    public MyList(int initialLengthArray){
        try{
            if(initialLengthArray <= 0) throw new Exception("The initial length cannot be less than or equal to 0.");
            else{
                arraysMyList = (T[]) new Object[initialLengthArray];
                count = 0;
            }
        }catch (Exception error){
            ErrorsHandlig.errorHandling(error);
        }
    }




}
