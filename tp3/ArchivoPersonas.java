package POO.tp3;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.*;
public class ArchivoPersonas{
    RandomAccessFile personas;
    public ArchivoPersonas(String fisico){
        try {
            personas = new RandomAccessFile(fisico,"rw");
        } catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
    public void agregarPersona(Persona p){
        try {
            if (personas.length()>0) {
                personas.seek(personas.length());
            }
            personas.writeInt(p.getDni());
            personas.writeUTF(p.getName().substring(0, 10));
            personas.writeDouble(p.getAltura());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

}