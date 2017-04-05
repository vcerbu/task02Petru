package com.endava.entity;

/**
 * Created by vcerbu on 3/27/2017.
 */

//task 2:
//        All good, just a couple of observations on ArrayProcesser:
//        1) It doesn't need nrElements, it's safer to use "elements.length" instead."
//        2) As I understood the task, you must find not 1 or 2 after 1, but only 2 after 1, so it should be false in your case.
//        3) Isn't it better to make "c" boolean?
//        4)
//        if (c >= 1)
//        return true;
//        else
//        return false;
//
//        could just return c >= 1

public class ArrayProcesser {

    int elements[];

    public int[] getElements() {
        return elements;
    }

    public void setElements(int[] element) {
        this.elements = element;
    }

    public boolean contains1Or4() {
        boolean c = false;
        for (int i = 0; i < elements.length; i++)
            if ((elements[i] == 1) || (elements[i] == 4))
                c = true;
        return c;
    }

    public boolean contains1Or2After1() {
        int c = 0;
        int position = 0;
        for (int i = 0; i < elements.length; i++)
            if (elements[i] == 1)
                for (int j = i + 1; j < elements.length; j++)
                    if ((elements[j] == 1) || elements[j] == 2)
                        c += 1;
        if (c >= 1)
            return true;
        else
            return false;
    }

    public int countEvens() {
        int count = 0;
        for (int i = 0; i < elements.length; i++)
            if (elements[i] % 2 == 0)
                count++;
        return count;
    }

}
