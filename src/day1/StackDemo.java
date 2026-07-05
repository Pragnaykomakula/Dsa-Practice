package day1;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {

        Stack<Character> s1 = new Stack<>();
        String word = "ALGORITHM";
        String reverseWord = "";

        for(int i = 0;i<word.length();i++){

           s1.push(word.charAt(i));
        }
        while(!s1.empty()) {
            reverseWord = reverseWord + s1.pop();
        }
        System.out.println(reverseWord);


    }
}


