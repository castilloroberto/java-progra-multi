// import java.utils.Scanner;

class Main {


    static void print(String p){

        System.out.print(p);

    }

    public static void main(String[] args){
       


        int n1 = 50; 
        int n2 = 35; 
        
        
        float suma = n1 + n2;
        
        float res = n1 + n2;
        
        float multi = n1 * n2;

        float divi = n1 / n2;



        // print("\nSuma: " + suma);
        // print("Resta: " + res);
        // print("Multiplicacion: " + multi);
        // print("Divicion: " + divi);
      

        int mes = 13;


        print("\nMes: ");
        switch (mes) {
            case 1:
                print("Enero");
                break;
            case 2:
                print("Febrerp");
                break;
            case 3:
                print("Marzo");
                break;
        
            case 4:
                print("Abril");
                break;
            case 5:
                print("Mayo");
                break;
            case 6:
                print("Junio");
                break;
            case 7:
                print("Julio");
                break;
            case 8:
                print("Agosto");
                break;
            case 9:
                print("Septiembre");
                break;
            case 10:
                print("Octubre");
                break;
            case 11:
                print("Noviembre");
                break;
            case 12:
                print("Diciembre");
                break;
                
            default:
                print("El mes "+ mes + " no existe");
                break;
            }
        print("\n");
            
            
        

    }



}