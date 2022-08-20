package com.example.java.tecese;

public class conditionalStatement {
    public static void main(String[] args) {
        int[][] bin = {{66,61,88,26,13},{52,38,7,74,62}};
        System.out.println(calculateGrade(bin));
    }
    public static String[] calculateGrade(int[][] students_marks) {

        String[] cal = new String[students_marks.length];

        for (int i = 0; i < students_marks.length; i++) {
            int arr = 0;
            int result = 0;
            int cont=0;

            for (int j = 0; j < students_marks[i].length; j++) {
                arr+= students_marks[i][j];
                cont++;
            }
            result =(int) Math.round(arr/cont);

//            System.out.println(result);

            if(result<50) cal[i] = "F";
            if(result>=50 && result<60) cal[i]="D";
            if(result>=60 && result<70) cal[i]="C";
            if(result>=70 && result<80) cal[i]="B";
            if(result>=80 && result<90) cal[i]="A";
            if(result>=90) cal[i]="A+";

        }
        return cal;
    }
}
