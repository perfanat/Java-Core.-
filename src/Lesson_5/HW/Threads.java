package Lesson_5.HW;

import java.util.ArrayList;
import java.util.List;

public class Threads {
    static final int size = 10000000;
    static final int numOfThreads = 10;
    static final int h = size / numOfThreads;
    static float[] arr = new float[size];

    public static void main(String[] args) {
        // один поток
        for (int i = 0; i < size; i++) {
            arr [i] = 1;
        }
        long a = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        System.out.println("Время расчёта одного потока - "+(System.currentTimeMillis() - a));
        // несколько потоков
        for (int i = 0; i < size; i++) {
            arr [i] = 1;
        }
        List <float[]> list = new ArrayList<>();
        List <Thread> threads = new ArrayList<>();
        float[] a1=new float[h];
        Thread t1;
        a = System.currentTimeMillis();
        for (int i = 0; i < numOfThreads; i++) {
            System.arraycopy(arr, i*h, a1, 0, h);
            list.add(a1);
            t1 = new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int i = 0; i < a1.length; i++) {
                        a1[i] = (float)(a1[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
                    }
                }
            });
            threads.add(t1);
        }
        for (Thread t:threads
             ) {
            t.start();
        }
        for (Thread t:threads
        ) {
            try {
                t.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        int count = 0;
        for (float [] f:list
             ) {
            System.arraycopy(f, 0, arr, count*h, h);
            count++;
        }
        System.out.println("Несколько потоков ("+numOfThreads+") - "+(System.currentTimeMillis() - a));
    }
}
