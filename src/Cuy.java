
public class Cuy extends Mascota {
    String nombre;
    int edad;
    String sexo;
    String color;


    public Cuy() {
    }

    // Constructor General padre e hija

    public Cuy(String raza, String tipo, String habitad, int patas, String nombre, int edad, String sexo, String color) {
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

    // metodo personalizado
    public void mostrarCuy() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Edad: " + getEdad());
        System.out.println("Sexo: " + getSexo());
        System.out.println("Color: " + getColor());
    }
}

