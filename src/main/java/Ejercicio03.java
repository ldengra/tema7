//Escribe un método que cuente el número de palabras que contiene. Asumimos que cada palabra
//está separada por solo un espacio en blanco.
import java.util.Scanner;
public class Ejercicio03 {
    public Ejercicio03() {
        Scanner input = new Scanner(System.in);
        String frase;
        int palabras = 0;

        System.out.println("Inserta una frase");
        frase = input.nextLine();

        palabras = cuentaPalabras(frase);

        System.out.println("La frase " + frase + " tiene " + palabras + " palabras.");
    }

    public int cuentaPalabras(String frase){
        int palabras=0;
        boolean esPalabra = false;

        for(int i = 0; i < frase.length(); i++){
            char c = frase.charAt(i);
            if (Character.isSpaceChar(c) || c == '\n' || c == '\t') {
                esPalabra = false;
            }else if(!esPalabra){
                esPalabra = true;
                palabras++;
            }
        }
        return palabras;
    }
}