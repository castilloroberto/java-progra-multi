import java.util.ArrayList;


public class Main{

    static void print (String p){
        System.out.println(p);
    }

    public static void main(String[] args) {
        
        int i = 1; 
        int j = 0; 
        int n = 5;
        // 3,5,7,9 
        int[] numeros = {3,5,7,9};
        while (j < numeros.length){
            
            
            print("\nTabla del:" + numeros[j]);
            i = 1;
            while(i < 13 ){

                print(numeros[j] + " X "+ i + " = " + numeros[j]*i);
                i++;
            }
            j++;                
        }


       /* ArrayList<String> names = new ArrayList<String>();
        names.add("Robert");
        names.add("Carlos");
        names.add("Castillo");
        names.add("Castellanos");

        names.forEach( (name) -> print(name));*/









    }




}
