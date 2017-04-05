package com.endava.entity;

/**
 * Created by vcerbu on 3/27/2017.
 */

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
