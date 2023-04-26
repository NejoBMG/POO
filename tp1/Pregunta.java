package POO;

public abstract class Pregunta {
    protected String enunciado;
    protected String tipo;

    public Pregunta(String enunciado, String tipo) {
        this.enunciado = enunciado;
        this.tipo = tipo;
    }

    public String getEnunciado() {
        return enunciado;
    }

    public String getTipo() {
        return tipo;
    }

    public abstract String getRespuesta();
    public int getCantidadPreguntasOM(String tipo) {
        boolean flag = tipo.equals("OM";
        int cantidad = 0;
        for (Pregunta pregunta : preguntas) {
            if (pregunta.getTipo().equals(tipo) && flag)) {
                cantidad++;
            }
        }
        return cantidad;
    }
}


