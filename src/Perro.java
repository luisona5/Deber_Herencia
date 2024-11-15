public class Perro extends Mascota{
    String color;
    String nombre;
    int edad;

    public Perro(){}

    // constructor general

    public Perro(String raza, String tipo, String habitad, int patas, String color, String nombre, int edad) {
        super(raza, tipo, habitad, patas);
        this.color = color;
        this.nombre = nombre;
        this.edad = edad;
    }

    // constructor padre

    public Perro(String raza, String tipo, String habitad, int patas) {
        super(raza, tipo, habitad, patas);
    }

    // construccion de getters y setters

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    // metodo personalizado
    public void mostrarPerro(){
        System.out.println("\n-----PERRO-----");
        System.out.println("Raza: " + getRaza());
        System.out.println("Tipo: " + getTipo());
        System.out.println("Habitad: " + getHabitad());
        System.out.println("Patas: " + getPatas());
    }

}
