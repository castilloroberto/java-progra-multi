import java.util.Scanner;

class Main {
    
    static int z = 0;    
    static int a = 0;    
    static float[][] nums;
    static float[] mayoresA5;
    static float[] menoresA5;
    static float media;
    
    public static void print(String p) {
        System.out.print(p);
    }
    
    public static void println(String p) {
        System.out.println(p);
    }
    
    static Scanner input = new Scanner(System.in); 
    
    public static void Ingresar(int x,int y ){    
        
        // x columnas
        // y filas
        z = 0;
        a = 0;
        media = 0;
        nums = new float[x][y];
        mayoresA5 = new float[x*y];
        menoresA5 = new float[x*y];
        
        for(int i = 0; i < y; i++){
           
            println("\nFila " + (i+1) + " de " + (y) + ":");
           
            float[] fila = new float[x];

            for(int j = 0; j < x; j++){

                print("\nIngrese el elemento " + (j+1) + " de " + x + " : ");
                fila[j] = input.nextFloat();

                media += fila[j];
                
                if ( fila[j] >= 5) {
                    
                    mayoresA5[z] = fila[j]; 
                    z++;

                } else {
                    
                    menoresA5[a] = fila[j]; 
                    a++;

                }
            } 
            nums[i] = fila;
           
        }
        media = (media / (x*y));

        
      

    }

    public static void Mostrar(String msg,float[][] array){
        
        println(msg);
        int i = 0;
        for(float[] fila : array){
        
            println("\nFila #" + (i+1));
            for(float n : fila){
                println(n+"");
            }
            i++;
        
        }
    
    }

    public static void Mostrar(String msg,float[] array,int limite){
        
        println(msg+"\n");
        for(int i = 0; i < limite; i++){
            println(array[i] + "");
        }
    } 

    public static void main(String[] args) {
        
       
        
        String menu = "\n1.Ingrese los datos de la matriz 4x4\n\n2.Imprimir matriz.\n\n3.Media de los datos\n\n4.Datos >= a 5\n\n5.Datos < a 5\n\n6.Salir\n\nOpcion:"; 
        int opcion = 0; 
        while ( opcion != 6) {
            
            print("\n\t\tMenu\n");
            print(menu);

            opcion = input.nextInt();
            switch (opcion) {
                case 1:
                    Ingresar(4,4);
                    break;

                case 2:
                    Mostrar("\nDatos de la Matriz:",nums);
                    break;
                case 3:
                    println("\nMedia: " + media);
                    break;

                case 4:
                    Mostrar("\nMayores o iguales a 5:",mayoresA5,z);
                    break;

                case 5:
                    Mostrar("\nMenores a 5",menoresA5,a);
                    break;

                case 6:
                    println("\nAdios!!");
                    break;

                    
                default:
                    println("\nOpcion invallida");
                    break;
            }
        }
    }


}