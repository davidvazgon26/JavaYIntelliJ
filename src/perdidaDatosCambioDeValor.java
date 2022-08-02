//Ejemplo de como al pasar deun dato mayor a uno mas chico puede llevarnos a la perdida de datos

public class perdidaDatosCambioDeValor {
    public static void main(String[] args) {
        int intValue1 = 56; //puedo hacer una copia ya que se pasa como copia y no como referencia
        int intValue2 = intValue1;

        System.out.println("The 2nd value is: "+ intValue2);

        //Pasando valor a uno mas grande
        long longValue = intValue1;
        System.out.println("No hay problema porque pasa a un valor mas grande: "+ longValue);

        //El problema se da cuando el valor a pasar a un tipo mas chico sobre pasa el maximo de este
        int intValue3 = 1024;
        byte byteValue = (byte) intValue3;
        System.out.println("Deberia mostrar el valor 1024: "+ byteValue);

        //Mismo ejemplo pero con decimal
        double doubleValue = 3.9999d;
        int intValue4 = (int) doubleValue;
        System.out.println("Perdimos los decimales... " + intValue4);
    }
}
