package ru.job4j.array;


public class SortSelected {

    public static int[] sort(int[] data) {
        for (int i = 0; i < data.length-1; i++) {
            int min = MinDiapason.findMin(data, i + 1, data.length);
            int index = FindLoop.indexOf(data, min, i + 1, data.length);
            if (data[i] > min) {
                int tmp = data[i];
                data[i] = data[index];
                data[index] = tmp;
            }
        }
        /*for (int i = 0; i < data.length; i++){
            min = data[i];
            //index = i;
            for (int j = i+1; j < data.length; j++){
                if (data[j] < min){
                    index = j;
                    min = data[j];
                }
            }
            if (data[i] != data[index]){
                data[index] = data[i];
                data[i] = min;
            }
        }*/


        return data;
    }
}