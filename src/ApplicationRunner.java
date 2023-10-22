package com.vorova;

import java.util.ArrayList;
import java.util.List;

public class ApplicationRunner {
    public static void main(String[] args) {

        List<Runnable> threads = new ArrayList<>();
        threads.add(new Channel());
        threads.add(new Channel());
        threads.add(new Channel());
        threads.add(new Channel());
        threads.add(new Channel());

        for(Runnable runnable : threads) {
            runnable.run();
        }

    }
}