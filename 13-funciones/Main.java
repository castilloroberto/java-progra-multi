import java.util.Scanner;

public class Main {


    public static void print(String p) {
        System.out.print(p);
    }

    public static void println(String p) {
        System.out.println(p);
    }

    public static float sumarLista(float[] nums) {
        
        float suma = 0;

        for(float n : nums){
            suma += n;
        }
        
        return suma;
    }

    public static float sumar(float n,float n2 ) {
        return n + n2;
    }

    public static float restar(float n,float n2 ) {
        return n - n2;
    }

    public static float multiplicar(float n,float n2 ) {
        return n * n2;
    }

    public static float potencia(float base,float exponente ) {
        
        float res = base;
        while(exponente > 1){
            res = res * base;
            exponente--;
        }
        return res;
    }

    public static float dividir(float n,float n2 ) {

        if ( n2 == 0) {
            
            return 0;

        } else {
            
            return n / n2;
        }

    }

    

    public static void main(String[] args) {
        


        Scanner input = new Scanner(System.in);

        print("ingrese un numero: ");
        float n = input.nextFloat();
        print("ingrese otro numero: ");
        float n2 = input.nextFloat();

        println("\nSuma: " + sumar(n,n2));
        println("Resta: " + restar(n,n2));
        println("Multiplicacion: " + multiplicar(n,n2));
        println("Divicion: " + dividir(n,n2));
        println("Potencia: " + potencia(n,n2));

        Person robert = new Person("Robert","SAP",20);
        println("\n");
        robert.presentarse();


    }




}