package POO.tp2;
import java.util.Vector;

public class Printer{
    private double cantTinta;
    private int cantPapel;
    private boolean on_Off, online;
    private Vector<Document> documentos;
    public Printer(double TIN, int PAP, boolean ON, boolean ONL){
        this.documentos = new Vector<Document>();
        this.cantTinta = TIN;
        this.cantPapel = PAP;
        this.on_Off = ON;
        this.online = ONL;
    }
    public void imprimir(Document doc){
        System.out.println("Imprimiendo: '"+doc.getNombre()+"'");
        this.cantPapel-= doc.getCantPaginas();
    }

    public double getCantTinta() {
        return this.cantTinta;
    }

    public void setCantTinta(double cantTinta) {
        this.cantTinta = cantTinta;
    }

    public int getCantPapel() {
        return this.cantPapel;
    }

    public void setCantPapel(int cantPapel) {
        this.cantPapel = cantPapel;
    }

    public boolean isOn_Off() {
        return this.on_Off;
    }

    public boolean getOn_Off() {
        return this.on_Off;
    }

    public void setOn_Off(boolean on_Off) {
        this.on_Off = on_Off;
    }

    public boolean isOnline() {
        return this.online;
    }

    public boolean getOnline() {
        return this.online;
    }

    public void setOnline(boolean online) {
        this.online = online;
    }

    public Vector<Document> getDocumentos() {
        return this.documentos;
    }

    public void setDocumentos(Vector<Document> documentos) {
        this.documentos = documentos;
    }

}