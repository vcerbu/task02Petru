package com.endava.main;

import com.endava.entity.ArrayProcesser;
import com.endava.enums.CarBrands;

import java.util.Arrays;

/**
 * Created by vcerbu on 3/27/2017.
 */
public class Main {
    public static void main(String[] args) {

        System.out.println("01. Car brands");
        System.out.println("Next value for Toyota: " + CarBrands.Toyota.getNext());
        System.out.println("-------------------------------");

        System.out.println("Previous value for BMW: " + CarBrands.BMW.getPrevious());
        System.out.println("-------------------------------");

        System.out.println("All brands:");
        CarBrands.showAll();


        System.out.println("02. ArrayProcesser");
        ArrayProcesser firstArray = new ArrayProcesser();
        int[] array = new int[]{2, 3, 2, 2};
        firstArray.setElements(array);
        System.out.println("The array is: " + Arrays.toString(firstArray.getElements()));
        System.out.println("This array contains 1 or 4: " + firstArray.contains1Or4());
        System.out.println("This array contains 1 or 2 after 1: " + firstArray.contains1Or2After1());
        System.out.println("This array contains " + firstArray.countEvens() + " even numbers");
    }
}
