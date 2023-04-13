package ua.edu.cbs.lms.hometask_oop_9.task3;

public class DictionaryObjekt <TKey, TData>{
    private TKey key;
    private TData data;

    public DictionaryObjekt(TKey key, TData data){
        this.key = key;
        this.data = data;
    }

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
