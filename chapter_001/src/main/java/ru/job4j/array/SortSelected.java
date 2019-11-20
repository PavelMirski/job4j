package ru.job4j.array;


public class SortSelected {

    public static int[] sort(int[] data) {
        int min = MinDiapason.findMin(data, 0, data.length);
        int index = FindLoop.indexOf(data, min, 0, data.length);
        for (int i = 0; i < data.length; i++){
            min = data[i];
            index = i;
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
        }


        return data;
    }
}