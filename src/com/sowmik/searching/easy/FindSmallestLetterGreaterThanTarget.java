package com.sowmik.searching.easy;

public class FindSmallestLetterGreaterThanTarget {
    public static void main(String[] args) {

    }
    public char nextGreatestLetter(char[] letters, char target) {
        int s = 0, e = letters.length-1;
        if(target>=letters[e]) {
            return letters[0];
        }
        while (s<=e) {
            int m = s + (e-s)/2;
            if(target>=letters[m]) {
                s = m+1;
            }
            else e = m-1;
        }
        return letters[s];
    }
}
