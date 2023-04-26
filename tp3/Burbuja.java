package POO.tp3;

public class Burbuja {
    public int[] burbuja(int[] v){
        boolean bandera = true;
        while(bandera){
           bandera = false;
           for(int i = 0; i < v.length-1; i++){
              if(v[i]>v[i+1]){
                 int aux = v[i];
                 v[i] = v[i+1];
                 v[i+1] = aux;
                 bandera = true;
              }//if
           }//for
        }//while
        return v;
     }//burbuja
}
