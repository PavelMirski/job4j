package ru.job4j.array;

public class Prepare {
    public static void main(String[] args) {
          boolean[] data = {true, true, true, true};
        boolean result = false;
        int a = 0 ;
        int b = 0;
        for (int z = 0; z < data.length; z++){
            a += ((data[z] == true) ? 0 : 1 );

            b += ((data[z] == false) ? 1 : 0 );

            if(a == 0 || b== 0)
                result = true;
            else
                break;
        }

            System.out.println(a);
            System.out.println(b);
        }
    }


