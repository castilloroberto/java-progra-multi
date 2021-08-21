import java.util.Scanner;

class Ejercicio2 {

    static void print(String p){
        System.out.print(p);
    }
    static void println(String p){
        System.out.println(p);
    }

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int[] nums = new int[3];
        int mayor = 0;
        
        for (int i = 0; i < 3; i++){

            print("Ingrese el " + (i+1) + " numero: ");
            nums[i] = input.nextInt();
            if( nums[i] > mayor){
                mayor = nums[i];
            }
            
        }

       
        println("El numero mayor es :" + mayor);

    }


}