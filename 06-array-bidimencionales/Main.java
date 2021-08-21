public class Main{



    public static void main(String args[]){



        String tablero[][] = new String[7][7];

        String primerFila[] = {"1","2","3","4","5","6","7"};  
        tablero[0] = primerFila;

        // System.out.println(tablero[0][0]); //1  
        // System.out.println(tablero[0][1]); //2  
        // System.out.println(tablero[0][2]); //3


        //3 filas 8 columnas
        // mostrar departamentos 
        String  deptos[][] = new String[18][2];

        deptos[0] = new String[] {"El Paraiso","oriente del pais"};


        deptos[1] = new String[] {"Francisco Morazan","Centro del pais"};


        deptos[2] = new String[] {"Atlantidad","Norte del pais"}; 

        for(String[] depto : deptos ){

            System.out.print("\n\nDepartamento: " + depto[0] + "\tUbicacion: "+ depto[1]);
        
        
        }



    }



}