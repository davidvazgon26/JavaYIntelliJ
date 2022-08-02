public class comparaCadenas {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";

        System.out.println(s1 == s2);

        if (s1.equals(s2)) { //esta es la forma recomendada para comparar cadenas
            System.out.println("Son iguales");
        }else{
            System.out.println("No son iguales");
        }
    }
}
