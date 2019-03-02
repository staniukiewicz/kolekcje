package Zadanie1;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        Random rand = new Random();

        for (int j = 0; j < 5; j++) {
            int pick = rand.nextInt(100);
            al.add(pick);
        }
        System.out.println("5 Random no.: " + al);
    }

}