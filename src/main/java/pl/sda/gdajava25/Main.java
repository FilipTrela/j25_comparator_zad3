package pl.sda.gdajava25;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        DrużynaPiłkarska lechia = new DrużynaPiłkarska("Lechia",13,19,26,12,14,30);
        DrużynaPiłkarska arka = new DrużynaPiłkarska("Arka",12,21,21,12,14,30);
        DrużynaPiłkarska wisła = new DrużynaPiłkarska("Wisła",11,15,22,11,14,34);
        DrużynaPiłkarska slask = new DrużynaPiłkarska("Slask",11,16,23,11,14,23);
        List<DrużynaPiłkarska> drużynaPiłkarskaList = new ArrayList<>(Arrays.asList(lechia,arka,wisła,slask));
        ComparatorDrużynaPiłkarska comparatorDrużynaPiłkarska = new ComparatorDrużynaPiłkarska();
        Collections.sort(drużynaPiłkarskaList,comparatorDrużynaPiłkarska);
        drużynaPiłkarskaList.forEach(System.out::println);


    }
}
