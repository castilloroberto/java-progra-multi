

public class Main{


    public static void main(String[] args){
        int arreglo[] = new int[6];
        arreglo[0] = 350;

        String jugadores[][] = new String[10];
        
        jugadores[0] = "Edrick Menjivar - 1";
        jugadores[1] = "Maynor Figueroa - 3";
        jugadores[2] = "Antony Lozano - 9";
        jugadores[3] = "Romell Quioto - 12";
        jugadores[4] = "Buba Lopez - 1";
        jugadores[5] = "Jorge Benguche -55 ";
        jugadores[6] = "Bryan Acosta - 6";
        jugadores[7] = "Andy Najar - 17";
        jugadores[8] = "Albert Elis - 9";
        jugadores[9] = "Jerry Bengtson -11";
        
        
        System.out.println("Jugadores Seleccion de Honduras:\n");
        for (String j : jugadores){
            System.out.println(j);
        }
        

    }



}