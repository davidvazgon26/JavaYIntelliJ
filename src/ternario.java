public class ternario {
    public static void main(String[] args) {
        int value = 2;
        int value2 = 3;

        String result = (value%2 == 0)? "Es par":"Es impar";
        String result2 = (value2%2 == 0)? "Es par":"Es impar";

        System.out.println(result);
        System.out.println(result2);

    }
}
