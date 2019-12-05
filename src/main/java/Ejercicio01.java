import java.util.Scanner;

public class Ejercicio01 {
    public Ejercicio01(){
        String frase = "";
        Scanner input = new Scanner(System.in);
        System.out.println("inserta una frase");
        frase = input.nextLine();


        frase = primeraMayuscula(frase);
        System.out.println(frase);
    }

    public String primeraMayuscula(String frase){
        String fraseFinal = "";

        for(int i = 0; i < frase.length(); i++){
            if(i==0){
                fraseFinal += Character.toUpperCase(frase.charAt(i));
            }else{
                fraseFinal += frase.charAt(i);
            }
        }

        return fraseFinal;
    }
}
