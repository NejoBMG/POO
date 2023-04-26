package POO.tp3;
import java.io.*;
import java.util.Vector;

public class ArchivoDeEnteros {
    RandomAccessFile enteros;

    public ArchivoDeEnteros(String fisico){
        try {
            enteros = new RandomAccessFile(fisico,"rw");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    public void almacenarEntero(int n){
        try {
            if (enteros.length()>0) {
                enteros.seek(enteros.length());
            }
            enteros.writeInt(n);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    void mostrarEnteros(){
        try {
            while(enteros.getFilePointer()<enteros.length()){
                System.out.println(enteros.readInt());
            }   
        } catch (IOException e) {
            System.out.println(e.getMessage());

        }
    }
    boolean buscarEntero(int n){
        boolean enc = false;
        try {
            enteros.seek(0);
            while(enteros.getFilePointer()<enteros.length() && !enc){
                if (n == enteros.readInt()){
                    enc = true;
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return enc;
    }
    double promedio(){
        double sum = 0,sum1 = 0;
        try {
            int size = (int)enteros.length();
            enteros.seek(0);
            while(enteros.getFilePointer()<size){
                sum += enteros.readInt();
            }
            sum1 = (sum/size);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return sum1;
    }
    void ordenar(){
        try {
            int num = (int) enteros.length();
            int[] aux = new int[num];
            enteros.seek(0);
            int i = 0;
            while(enteros.getFilePointer()<enteros.length()){
                aux[i] = enteros.readInt();
                i++;
            }
            aux = burbuja(aux);
            enteros.seek(0);
            for (int j = 0; j <= enteros.length(); j++) {
                enteros.writeInt(aux[j]);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    private int[] burbuja(int[] v){
        boolean bandera = true;
        while(bandera){
           bandera = false;
           for(int i = 0; i < v.length-1; i++){
              if(v[i]>v[i+1]){
                 int aux = v[i];
                 v[i] = v[i+1];
                 v[i+1] = aux;
                 bandera = true;
              }
           }
        }
        return v;
     }

     void sumarDosUnidadesImpares(){
        long ultimo = 0;
        int numero = 0;
        try {
            enteros.seek(0);
            while(enteros.getFilePointer() < enteros.length()){
                ultimo = enteros.getFilePointer();
                numero = enteros.readInt();
                if(numero < 53 && !(numero%2 == 0)){
                    numero += 2;
                    enteros.seek(ultimo);
                    enteros.writeInt(numero);
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
     }
}
