package POO.tp3;

public class Main {
    public static void main(String[] args) {
        // Punto 1
        /*
         TP.3, eje 1. Escriba un método que a los valores impares menores que 53, los actualice de manera que el valor almacenado se incremente en 2 unidades. Ejemplo: si el archivo contiene la siguiente secuencia: 19 6  22  99 56 35 101 48 37 luego de ejecutar el método queda: 21 6  22 99 56 37 101 48 39
        */
        ArchivoDeEnteros ma = new ArchivoDeEnteros("prueba1.dat");
        // ma.almacenarEntero(19);
        // ma.almacenarEntero(6);
        // ma.almacenarEntero(22);
        // ma.almacenarEntero(99);
        // ma.almacenarEntero(56);
        // ma.almacenarEntero(35);
        // ma.almacenarEntero(101);
        // ma.almacenarEntero(48);
        // ma.almacenarEntero(37);
        
        ma.mostrarEnteros();
        System.out.println("=======================");
        ma.sumarDosUnidadesImpares();
        
        ma.mostrarEnteros();

    }
}

        // System.out.println("=======================");
        // ma.ordenar();
        // ma.mostrarEnteros();
        // System.out.println(ma.promedio());

    // int op = 10;
    // DataBase dataBase = new DataBase("");
    // try {
    //     do{
    //         listarMenu();
    //         op=Console.readInt();
    //         switch (op){
    //             case 1:{
    //                     String Name = Console.readString("Ingrese el nombre para la base de datos ");
    //                     dataBase.closeDb();
    //                     char X = Console.readChar("Ingrese 'Y' para abrir la base de datos ó 'N' para cerrarla");
    //                     if(X == 'Y'){
    //                         dataBase.openDb();
    //                     }
    //                     dataBase.setName(Name);
    //                     break;
    //             }
                
    //             case 2:{
    //                     String Name = Console.readString("Ingrese el nombre de la tabla;");
    //                     Table T1 = new Table(Name);
    //                     dataBase.createTable(T1);
    //                     break;
    //                 }
    //             case 3 :{
    //                     String ID = Console.readString("Ingrese el nombre de la tabla que quiere borrar");
    //                     dataBase.removeTable(ID);
    //                     break;
    //                 }
    //             case 4 :{
    //                     dataBase.listTables();
    //                     break;
    //                 }
    //             case 5: {
    //                     dataBase.openDb();
    //                     break;
    //                 }
    //             case 6 :{
    //                     dataBase.closeDb();
    //                     break;
    //                 }
    //             }
    //             System.out.println("================================");
    //             }while(op!=10);
    //             }
    //             catch (DBException e) {
    //             System.out.println(e.getMessage());
    //             } catch (TableException e){
    //             System.out.println(e.getMessage());
    //             }
    // }
    // public static void listarMenu(){
    //         System.out.println("==============Menu Base de datos==============");
    //         System.out.println(" 1- Crear Base de datos ");
    //         System.out.println(" 2- Añadir una tabla");
    //         System.out.println(" 3- Borrar una tabla ");
    //         System.out.println(" 4- Listar tablas");
    //         System.out.println(" 5- Abrir base de datos ");
    //         System.out.println(" 6- Cerrar base de datos");
    //         System.out.println(" 10- Salir");
    // }
// }
