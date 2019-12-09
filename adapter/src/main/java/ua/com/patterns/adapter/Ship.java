package ua.com.patterns.adapter;

public class Ship {

    void fullAhead(){
        System.out.println("Ship engine is working at full capacity now ...");
    }

    void stopEngine(){
        System.out.println("Ship engine is stopping now ...");
    }

    void lightMessage(){
        System.out.println("Ship is sending light message now ...");
    }
}
