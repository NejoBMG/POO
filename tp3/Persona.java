package POO.tp3;
public class Persona{
    private int dni;
    private String name;
    private double altura;

    public Persona(String name, int dni, double altura) {
        this.name = name;
        this.dni = dni;
        this.altura = altura;
    }
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDni() {
        return this.dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public double getAltura() {
        return this.altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

}
