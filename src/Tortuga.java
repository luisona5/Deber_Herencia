public class Tortuga extends Mascota {
    String nombre;
    int edad;
    String sexo;
    String color;

    public Tortuga() {}

    // constructor general

    public Tortuga(String raza, String tipo, String habitad, int patas, String nombre, int edad, String sexo, String color) {
        super(raza, tipo, habitad, patas);
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.color = color;
    }

    // constructor del padre

    public Tortuga(String raza, String tipo, String habitad, int patas) {
        super(raza, tipo, habitad, patas);
    }

    // constructor del hijo
    public Tortuga(String nombre, int edad, String sexo, String color) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.color = color;

    }

    public void InfTortuga(){
        System.out.println(" nombre: "+nombre);
        System.out.println(" edad: "+edad);
        System.out.println(" sexo: "+sexo);
        System.out.println(" color: "+color);
        System.out.println("------------------------------------------");
    }
}
