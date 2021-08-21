public class Person {


    public String Nombre;
    public String Campus;
    public int Edad;


    public void presentarse() {
        Main.println("Nombre: " + Nombre);
        Main.println("Campus: " + Nombre);
        Main.println("Edad: " + Edad);
    }

    public Person(String name, String campus,int edad){


        Nombre = name;
        Campus = campus;
        Edad = edad;


    }



}