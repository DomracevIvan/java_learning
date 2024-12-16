package HomeWork;


import HomeWork.Lesson7.TeleVisor;

public class App {
    public static void main(String[] args) {

        TeleVisor tv = new TeleVisor("Smart tv", "Black and Gray", "Java TV", "AV/TV/Blu Ray", 42, 100, 99);
        System.out.println(tv);
        TeleVisor tv1 = new TeleVisor("retro tv", "red", "Java TV", "AV", 24, 20, 99);
        System.out.println(tv1);
        TeleVisor tv2 = new TeleVisor("tv", "silver", "Java TV", "AV/TV", 24, 50, 99);
        System.out.println(tv2);


    }
}


