package ml;

import static java.nio.charset.StandardCharsets.ISO_8859_1;
import static java.nio.charset.StandardCharsets.UTF_8;

/**
 * Created by nlosada on 02/10/18.
 */
public class Main {

    public static void main(String[] args) {
        System.out.println(Main.convertEncodingToUTF8("Abonando este cupÃ³n se activarÃ¡ tu suscripciÃ³n y te llegarÃ¡ otro mail con usuario y contraseÃ±a para acceder al portal de alumnos."));
    }

    private static String convertEncodingToUTF8(String msg){
        byte ptext[] = msg.getBytes(ISO_8859_1);
        String value = new String(ptext, UTF_8);
        return value;
    }
}
