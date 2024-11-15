public class Gato extends Mascota{
    String nombre;
    int edad;
    String sexo;
    String color;

    public Gato(){}

    // constructor general

    public Gato(String raza, String tipo, String habitad, int patas, String nombre, int edad, String sexo, String color) {
        super(raza, tipo, habitad, patas);
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.color = color;
    }


    // constructor hija


    public Gato(String nombre, int edad, String sexo, String color) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.color = color;
    }

    // construcciones de getters y setters

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

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // metodo personalizado

    public void mostrarGato(){
        System.out.println("\n----GATO------");
        System.out.println("Nombre: " + this.getNombre());
        System.out.println("Edad: " + this.getEdad());
        System.out.println("Sexo: " + this.getSexo());
        System.out.println("Color: " + this.getColor());
        System.out.println("----------------");
    }
}
