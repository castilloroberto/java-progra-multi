class Main {

    static void printsi(String p, int i){

        System.out.println(p + " " + i);

    }
    static void print(String p){

        System.out.println(p);

    }

    public static void main(String[] args){

    
        int ganador = 45;
        int edad = 22;
        int boleto = 8989;

        //mayor de edad
        // ganador
        if(edad >= 21 && boleto == ganador){
            
            print("Felicidades ha ganado y es mayor de edad");
            print("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
            
        }
        // perdio
        if(edad >= 21 && boleto != ganador){
            
            print("Lo sentimos es mayor de edad pero,\nNo ha ganado");
            
        }
        

        // menor de edad
        // ganador
        if(edad < 21 && boleto == ganador){
            
            print("Ha ganado pero es menor de edad");
            
        }
        // perdio
        if(edad < 21 && boleto != ganador){
            print("Ha Perdido y es menor de edad");
            
        }
        

    }



}