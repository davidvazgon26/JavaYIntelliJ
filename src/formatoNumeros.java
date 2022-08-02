import java.text.NumberFormat;
import java.util.Locale;

public class formatoNumeros {
    public static void main(String[] args) {

        //Para pasar parametro de alguna region en particular podemos usar una varible
        Locale locale = new Locale("da", "DK");
        Locale espaniaLocale = new Locale("es", "ES");

        double doubleValue = 1_234_567.89; // Java ignora los guines bajos

        //Primero el valor normal
        System.out.println(doubleValue); //1234567.89

        //Sin y con parametro
        NumberFormat numF = NumberFormat.getNumberInstance();
        NumberFormat numF2 = NumberFormat.getNumberInstance(locale);
        System.out.println(numF.format(doubleValue));
        System.out.println(numF2.format(doubleValue));

        //Moneda
        NumberFormat curF = NumberFormat.getCurrencyInstance();
        NumberFormat curF2 = NumberFormat.getCurrencyInstance(espaniaLocale);
        System.out.println(curF.format(doubleValue));
        System.out.println(curF2.format(doubleValue));

        //Solo como entero

        NumberFormat intF = NumberFormat.getIntegerInstance();
        System.out.println(intF.format(doubleValue));

    }
}
