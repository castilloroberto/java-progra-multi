import java.util.Scanner;

class Ejercicio2 {
    
    static int z = 0;    
    static int a = 0;    
    static float[][] nums;
    static float[] mayoresA5;
    static float[] menoresA5;
    static float media;

    
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
           
           
            float[] fila = new float[x];

            for(int j = 0; j < x; j++){

                System.out.print("\nIngrese un numero ["+(i+1)+"," + (j+1) +"]: ");

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

    public static void Mostrar(float[][] array){
        
        for(int i = 0;i < 4 ;i++){
            
            for(int j = 0;j < 4 ;j++){
                
                System.out.println("\nElemento ["+(i+1)+","+(j+1) +"]: "+ array[i][j]);
            }
            
        }
        
    }
    
    public static void Mostrar(float[] array){
        
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i] );
        }
    } 
    
    public static void main(String[] args) {
        
        
        
        String menu = "\n1.Ingrese los datos de la matriz 4x4\n\n2.Imprimir matriz.\n\n3.Media de los datos\n\n4.Datos >= a 5\n\n5.Salir\n\nOpcion:"; 
        int opcion = 0; 
        while ( opcion != 5) {
            
            System.out.print(menu);
            opcion = input.nextInt();

            switch (opcion) {
                case 1:
                    Ingresar(4,4);
                    break;

                case 2:
                    Mostrar(nums);
                    break;
                case 3:
                    System.out.println("\nMedia: " + media);
                    break;

                case 4:
                    Mostrar(mayoresA5);
                    break;
            }
        }
    }


}