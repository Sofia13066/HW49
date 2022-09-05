package controller;

import model.Friend;

public class DeadLock{
    
    public static void main(String[] args) {
        final Friend sam = new Friend("Sam");
        final Friend nick = new Friend("Nick");

        new Thread(new Runnable() {
            @Override
            public void run() {
                sam.greet(nick);
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                nick.greet(sam);
            }
        }).start();
    }
}