package ua.edu.cbs.lms.hometask_oop_9.task3;

public class Main {
    public static void main(String[] args) {
        MyDictionary <Integer, String> dcIntStr = new MyDictionary<>();

        for(int i=0; i<13; i++) {
            dcIntStr.add(i, String.format("%s",i));
        }

        System.out.println("Count: " + dcIntStr.getCount() + "; Length: " + dcIntStr.getLength());

        System.out.println(dcIntStr.getKeyData(3));
        System.out.println(dcIntStr.getKeyData(6));
        System.out.println(dcIntStr.getKeyData(15));

        System.out.println(dcIntStr.getDictionaryOnIndex(3));
        System.out.println(dcIntStr.getDictionaryOnIndex(6, true));
        System.out.println(dcIntStr.getDictionaryOnIndex(15, false));

        MyDictionary <String, String> dcStrStr = new MyDictionary<>(3);

        dcStrStr.add("Книга","Book");
        dcStrStr.add("Сонце", "Sun");
        dcStrStr.add("Мова","Language");
        dcStrStr.add("Двері","Door");
        dcStrStr.add("Вода","Water");
        dcStrStr.add("Вітер","Wind");
        dcStrStr.add("Математика","Mathematics");
        dcStrStr.add("Комп'ютер","Computer");
        dcStrStr.add("Птах","Bird");
        dcStrStr.add("Робота","Work");

        System.out.println(dcStrStr.getKeyData("Вітер"));
        System.out.println(dcStrStr.getKeyData("Сонце"));
        System.out.println(dcStrStr.getKeyData("Робота"));

        System.out.println(dcStrStr.getDictionaryOnIndex(3));
        System.out.println(dcStrStr.getDictionaryOnIndex(6, true));
        System.out.println(dcStrStr.getDictionaryOnIndex(15, false));

    }
}
