package ua.edu.cbs.lms.hometask_oop_9.task3;

import ua.edu.cbs.lms.hometask_oop_9.task2.ErrorsHandlig;

public class MyDictionary <TKey, TData>{

    private DictionaryObject[] dictionary;
    private int count;

    public MyDictionary(){
        dictionary = new DictionaryObject[10];
        count=0;
    }

    public MyDictionary(int initialLength){
        try {
            if(initialLength<=0) throw new Exception("Initial length cannot less than or equals 0.");
            dictionary = new DictionaryObject[initialLength];
            count = 0;
        }
        catch (Exception error){
            ErrorsHandlig.errorHandling(error);
        }
    }

    public int getCount() {
        return count;
    }

    public boolean add(TKey key, TData data){
        try{
            if(count == dictionary.length){
                if(!increasingArray()) throw new Exception("Increasing array error.");
            }

            if(dictionary[count].add(key, data) != null) {
                count++;
                return true;
            }
            return false;
        }catch (Exception error){
            ErrorsHandlig.errorHandling(error);
            return false;
        }
    }

    private boolean increasingArray(){
        try {
            DictionaryObject[] tempArray = dictionary;
            dictionary = new DictionaryObject[(int) (tempArray.length * 1.5)];
            for (int i = 0; i < tempArray.length; i++) {
                dictionary[i] = tempArray[i];
            }
            return true;
        }catch (Exception error){
            ErrorsHandlig.errorHandling(error);
            return false;
        }
    }

    public TData getKeyData(TKey key){
        try {
            for (DictionaryObject tempDictionary : dictionary) {
                if (tempDictionary.getKey().equals(key)) {
                    return (TData) tempDictionary.getData();
                }
            }
            return null;
        }catch (Exception error){
            ErrorsHandlig.errorHandling(error);
            return null;
        }
    }

    public DictionaryObject getDictionaryOnIndex(int index){
        return (DictionaryObject) get(index, false);
    }

    public String getDictionaryOnIndex(int index, boolean ifToString){
        return (String) get(index, ifToString);
    }

    private <T> Object get(int index, boolean ifToString){
        try {
            if (index < 0) {
                throw new Exception("Out of bounds array. Index less than to 0.");
            } else if(index > count){
                throw new Exception("Out of bounds array. Index is greater then to length array.");
            }else{
                if(ifToString) return dictionary[index].toString();
                else return dictionary[index];
            }
        }catch (Exception error){
            ErrorsHandlig.errorHandling(error);
            return null;
        }
    }

}
