public class Pato extends Mascota{
    String nombre;
    int edad;
    String sexo;
    String color;

    public Pato(){}

    // constructor general


    public Pato(String raza, String tipo, String habitad, int patas, String nombre, int edad, String sexo, String color) {
        super(raza, tipo, habitad, patas);
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
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

    public void mostrarPato(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + getEdad());
        System.out.println("Sexo: " + getSexo());
        System.out.println("Color: " + color);
    }
}
