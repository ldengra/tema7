import java.util.Scanner;

public class Ejercicio02 {
    public Ejercicio02(){
        String frase = "";
        int vocales=0;
        int consonantes=0;
        Scanner input = new Scanner(System.in);
        System.out.println("inserta una frase");
        frase = input.nextLine();

        vocales = cuentaVocales(frase);
        consonantes = cuentaConsonantes(frase);
        System.out.println(frase +" tiene " + vocales + " vocales y " + consonantes + " consonantes");
    }

    public int cuentaVocales(String frase){

        int vocales=0;
        int consonantes=0;

        for(int i = 0; i < frase.length(); i++){
            if((frase.charAt(i)=='a') || (frase.charAt(i)=='e') || (frase.charAt(i)=='i') || (frase.charAt(i)=='o') || (frase.charAt(i)=='u')){
                vocales = vocales + 1;
            }else{
               consonantes = consonantes + 1;
            }
        }

        return vocales;
    }
    public int cuentaConsonantes(String frase){

        int vocales=0;
        int consonantes=0;

        for(int i = 0; i < frase.length(); i++){
            if((frase.charAt(i)=='a') || (frase.charAt(i)=='e') || (frase.charAt(i)=='i') || (frase.charAt(i)=='o') || (frase.charAt(i)=='u') || (frase.charAt(i)==' ')){
                vocales = vocales +1;
            }else{
                consonantes = consonantes + 1;
            }
        }

        return consonantes;
    }
}