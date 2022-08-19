package com.example.java.tecese;

public class CLP_CoreJava_E2 {

    public static int levelCount(String word){
        int maxLevel = 0;
        int level = 0;

        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if(c=='{'){
                level++;
                if(level>maxLevel) maxLevel = level;
            } else if (c=='}') {
                level--;
            }
        }
        return maxLevel;
    }

    public static void main(String[] args) {
//        System.out.println(levelCount(args[0]));

       // System.out.println(levelCount());
    }
}
