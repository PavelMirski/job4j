package ru.job4j.array;

public class Check {
    public boolean mono(boolean[] data) {
        boolean result = false;
        int i;
        for (i = 0; i < data.length; i++) {
            if (data[0] != data[i]) {
                result = false;
                break;
            }
            result = true;
        }

       /* int a = 0;
        int b = 0;
        for (int z = 0; z < data.length; z++){
            a += ((data[z] == true) ? 0 : 1 );

            b += ((data[z] == false) ? 0 : 1 );

            if(a == 0 && b > 0 || a > 0 && b == 0)
                result = true;
            else if (a > 0 && b > 0)
                result = false;
        }*/


            return result;
        }



}