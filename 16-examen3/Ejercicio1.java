import java.util.Scanner;

class Ejercicio1 {

    static float[] nums;
    static float suma = 0;
    static float[] negativos;
    static float[] positivos;
    

    
    static Scanner input = new Scanner(System.in); 
    
    public static void Ingresar(int cantidad ){    
        
        int j = 0;
        int y = 0;
        nums = new float[cantidad];
        for(int i = 0; i < cantidad; i++){
            
            
            System.out.println("\nIngrese un numero: ");
            nums[i] = input.nextFloat();
            suma += nums[i];  
            
            if ( nums[i] < 0 ) {
                j++;

            } else {                
                y++;
            }
        }
        
        negativos = new float[j];
        positivos = new float[y];
        
        j = 0;
        y = 0;

        for(int i = 0; i < cantidad; i++){
                        
            if ( nums[i] < 0 ) {
            
                negativos[j] = nums[i];
                j++;

            } else {                
                
                positivos[y] = nums[i];
                y++;

            }
        }
        

    }
    public static void Mostrar(float[] array){
        
        
        for(float n : array){
        
            System.out.println(n);
        
        }
    
    }
    public static void main(String[] args) {
        
       
        Ingresar(10);
        System.out.println("\nNegativos:");
        Mostrar(negativos);

        System.out.println("\nPositivos:");
        Mostrar(positivos);

        System.out.println("\nSuma:\n" + suma);


    }


}