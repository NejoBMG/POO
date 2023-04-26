package POO.tp2;
public class Document{
    private String nombre;
    private int cantPaginas;
    

    public Document(String nombre, int cantPaginas) {
        this.nombre = nombre;
        this.cantPaginas = cantPaginas;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantPaginas() {
        return this.cantPaginas;
    }

    public void setCantPaginas(int cantPaginas) {
        this.cantPaginas = cantPaginas;
    }
}