public class Mascota {
    String raza;
    String tipo;
    String Habitad;
    int patas;

    public Mascota() {

    }

    public Mascota(String raza, String tipo, String habitad, int patas) {
        this.raza = raza;
        this.tipo = tipo;
        Habitad = habitad;
        this.patas = patas;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getHabitad() {
        return Habitad;
    }

    public void setHabitad(String habitad) {
        Habitad = habitad;
    }

    public int getPatas() {
        return patas;
    }

    public void setPatas(int patas) {
        this.patas = patas;
    }

    public void MostrarMascota() {
        System.out.println("-------INFORMACION GENERAL------------");
        System.out.println("Especie del animal es: " + raza);
        System.out.println("Tipo de animal: " + tipo);
        System.out.println("Habitad: " + Habitad);
        System.out.println("numero de Patas del animal es: " + patas);
    }
}

