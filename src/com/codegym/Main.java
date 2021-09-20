package com.codegym;

public class Main {

    public static void main(String[] args) {
    int[] a = {1,2,3,4,5,6};
    addElement(a, 9, 3);
    }
    public static int[] addElement(int[] a, int value, int index) {
        int n = a.length + 1;
        int[] a1= new  int[n];
        for (int i = 0; i < index; i++) {
            a1[i] = a[i];
        }
        for (int i = index; i < a.length; i++) {
            a1[i + 1]  = a[i];
        }
        a1[index] = value;
        return a1;
    }

}
