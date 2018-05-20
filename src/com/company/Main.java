package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int arrA[] = {1,2,3,4,5,6,7,8,9,10};
        for(int i : arrA){
            if (i == 7){
                continue;
            }
            System.out.println(i);
        }
    }
}
