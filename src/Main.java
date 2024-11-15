import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // La primera clase deberá generar objetos sin parámetros.
        Tortuga tortuga1 = new Tortuga();
        tortuga1.MostrarMascota();
        tortuga1.InfTortuga();

        //La segunda clase deberá generar objetos con  parámetros en la clase padre.
        Perro perro1 = new Perro("HASKI","GRANDE","TERRESTRE",4);
        perro1.MostrarMascota();


        //La tercera clase deberá generar objetos con  parámetros en la clase hija.
        Gato gato1 = new Gato("Sami",3,"Hembra","cafe claro");
        gato1.mostrarGato();

        //La cuarta clase deberá generar objetos con  parámetros en la clase padre e hija.
        Cuy cuy1 = new Cuy("hamster","pequeño","terreste",4,"Pecas",2,"Macho","blanco y negro");
        cuy1.MostrarMascota();
        cuy1.mostrarCuy();

        //La quinta clase deberá generar objetos sin parámetros y después setearlos.
        Pato pato1 = new Pato();
        pato1.MostrarMascota();
        pato1.mostrarPato();
        pato1.setRaza("Ave");
        pato1.setTipo("pequeño");
        pato1.setHabitad("terrestre, aereo");
        pato1.setPatas(2);
        pato1.setNombre("Patito");
        pato1.setEdad(1);
        pato1.setSexo("Hembra");
        pato1.setColor("Blanco");
        pato1.MostrarMascota();
        pato1.mostrarPato();

    }
}