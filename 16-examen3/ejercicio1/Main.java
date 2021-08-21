import java.util.Scanner;

class Main {

    static float[] nums;
    static float suma = 0;
    static float[] negativos;
    static float[] positivos;
    
    public static void print(String p) {
        System.out.print(p);
    }
    
    public static void println(String p) {
        System.out.println(p);
    }
    
    static Scanner input = new Scanner(System.in); 
    
    public static void Ingresar(int cantidad ){    
        
        int j = 0;
        int y = 0;
        nums = new float[cantidad];
        for(int i = 0; i < cantidad; i++){
            
            print("\nIngrese el elemento " + (i+1) + " de " + cantidad + " : ");
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
    public static void Mostrar(String msg,float[] array){
        
        println(msg);
        
        for(float n : array){
        
            println(n+"");
        
        }
    
    }
    public static void main(String[] args) {
        
       
        Ingresar(5);
        Mostrar("\nNumeros ingresados",nums);
        Mostrar("\nNegativos:",negativos);
        Mostrar("\nPositivos:",positivos);
        println("\nSuma:\n" + suma);

    }


}