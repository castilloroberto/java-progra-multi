import java.util.Scanner;

class Main {

    static void print(String p){
        System.out.print(p);
    }
    static void println(String p){
        System.out.println(p);
    }

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        print("Ingrese los grados centigrados: ");
        float ce = input.nextFloat();
        println(ce + "");
        float f = ((ce*9)/5) + 32;
        
        print("Los grados Fahrenheit: " + f);

    }



}