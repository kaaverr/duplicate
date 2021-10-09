package com.company;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static boolean isDuplicate(int[] array2){
        for (int i = 0; i <array2.length ; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array2[i] == array2[j] && i!=j){
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isDuplicate2(int[] array){
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i <array.length ; i++) {
            set.add(array[i]);
        }
        return array.length != set.size();
    }

    public static void main(String[] args) {
	int[] array = new int[]{1,10,18,6,4,1,7};
	int[] array2 = new int[]{10,18,6,4,1,7};
        System.out.println(isDuplicate(array2));
        System.out.println(isDuplicate2(array));
    }
}
