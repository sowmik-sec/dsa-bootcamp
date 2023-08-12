package com.sowmik.arrays.easy;

import java.util.Scanner;

public class CheckIfTheSentenceIsPangram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        boolean ans = checkIfPangram(str);
        System.out.println(ans);
    }
    public static boolean checkIfPangram(String sentence) {
        boolean isPangram = true;
        char[] letters = {'a', 'b', 'c', 'd','e','f','g', 'h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        for (int i = 0; i < letters.length; i++) {
            if(!sentence.contains(Character.toString(letters[i]))) {
                isPangram = false;
                return false;
            }
        }
        return isPangram;
    }
}
