package com.gla.string;
class MyThread extends Thread{
    @Override
    public void run() {
        for(int i = 0;i < 10;i++) {
            System.out.println(i+1);
        }
    }
}
class OtherThread extends Thread{
    @Override
    public void run() {
        for(int i = 0;i < 10;i++) {
            System.out.println((char) (i + 'a'));
        }
    }
}

public class Main {
    static void main() {
        System.out.println("main");
        MyThread mt = new MyThread();
        OtherThread ot = new OtherThread();
        mt.run();
        ot.run();
        System.out.println("main ending");
    }
}
