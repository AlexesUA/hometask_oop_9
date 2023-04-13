package ua.edu.cbs.lms.hometask_oop_9.task3;

import ua.edu.cbs.lms.hometask_oop_9.task2.ErrorsHandlig;

public class DictionaryObject<TKey, TData>{
    private TKey key;
    private TData data;

    public DictionaryObject(TKey key, TData data){
        this.key = key;
        this.data = data;
    }

//    public DictionaryObject add(TKey key, TData data){
//        try{
//            return new DictionaryObject(key, data);
//        }catch (Exception error){
//            ErrorsHandlig.errorHandling(error);
//            return null;
//        }
//    }

    public TData getData() {
        return data;
    }

    public TKey getKey() {
        return key;
    }

    @Override
    public String toString() {
        return "key=" + key +", data=" + data;
    }
}
