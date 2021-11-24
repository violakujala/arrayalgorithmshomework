package com.company;

public class Main {

    public static void main(String[] args) {
        // homework 3 1.1

       /* int[] DATA = {-4, 11, 7, -12, 6, 1};
        for (int i = 0; i < DATA.length; i++) {
            int indsmallest = i;
            for (int j = i + 1; j < DATA.length; j++)
                if (DATA[j] < DATA[indsmallest])
                    indsmallest = j;
            swap(DATA, i, indsmallest);
        }
        for(int d : DATA)
            System.out.println(d);
    }

    static void swap(int[] array, int ind1, int ind2) {
        int tmp = array[ind1];
        array[ind1] = array[ind2];
        array[ind2] = tmp;*/

        //homework 3 1.2

       /* int[] DATA = {-4, 11, 7, -12, 6, 1};
        boolean order = false;
        while (!order) {
            order = true;
            for (int i = 0; i < DATA.length - 1; i++) {
                if (DATA[i + 1] < DATA[i]) {
                    swap(DATA, i + 1, i);
                    order = false;
                    for (int v : DATA)
                        System.out.print(v + " ");
                    System.out.println();
                }
            }

        }
    }

    static void swap(int[] array, int ind1, int ind2) {
        int tmp = array[ind1];
        array[ind1] = array[ind2];
        array[ind2] = tmp;*/

        // homework 5

       /* int[] array = {9, 7, 2, 11};
        int i =1;
        while( i < array.length)
        {
            int val = array[i];
            int j = i-1;
            while(j >=0&&array[j]>val)
            {
                   array[j + 1] = array[j];
                    j--;
            }
            array[j+1] = val;
            i++;

        }
        for(int a : array)
            System.out.println(a);*/
    }
}
