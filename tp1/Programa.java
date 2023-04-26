package POO;

/*
 * Una empresa de multimedios audiovisuales maneja diferentes programas en los medios de comunicación
más conocidos: la radio y la televisión. Todos los programas tienen un título y una persona responsable de la
dirección de la publicación. Además tienen un código numérico que las identifica unívocamente. Tanto los
programas de radio como los de televisión poseen una duración determinada en minutos, además cuenta con
una hora de inicio, así como el nombre de la emisora correspondiente. Los programas de radio necesitan por
otra parte un responsable de la musicalización.
Además, existe un espacio disponible para los comerciales.
En los programas de radio, este tiempo se mide en minutos al aire (por ejemplo, “LA PARADA” tiene 23 minutos
de propagandas). Para la televisión, se mide en cantidad de comerciales por tanda (por ejemplo, “Bailando Por
Un Sueño” tiene siete propagandas en cada tanda). Cada programa televisivo puede tener además un número
diferente de tandas comerciales.
a) Definir todas las clases necesarias para modelar los distintos productos financiados por esta empresa
de multimedios.
b) Realice el diagrama de clases.
c) En una clase test muestre el espacio disponible para los comerciales que tienen los diferentes
programas.
Clases:
multimedios => programa
Programa => television, radio

Atributos Programa: titulo, personaResponsable, codigo, duracion, horaInicio, emisora
metodos: set get, comerciales

*/
public class Programa{
    private String titulo,responsable, codigo, emisora;
    private int duracion, horaInicio;
    public Programa(){}
    public Programa(String TIT,String RES, String COD, String EMI,int DUR, int INI){
        this.titulo = TIT;
        this.responsable = RES;
        this.codigo = COD;
        this.emisora = EMI;
        this.duracion = DUR;
        this.horaInicio = INI;
    }


    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getResponsable() {
        return this.responsable;
    }

    public void setResponsable(String responsable) {
        this.responsable = responsable;
    }

    public String getCodigo() {
        return this.codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getEmisora() {
        return this.emisora;
    }

    public void setEmisora(String emisora) {
        this.emisora = emisora;
    }

    public int getDuracion() {
        return this.duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getHoraInicio() {
        return this.horaInicio;
    }

    public void setHoraInicio(int horaInicio) {
        this.horaInicio = horaInicio;
    }
}

