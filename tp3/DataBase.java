package POO.tp3;
import java.util.Vector;
public class DataBase{
    private Vector <Table> tables;
    private String name;
    private boolean open;

    DataBase(String NAM){
        this.tables = new Vector<Table>();
        this.name= NAM;
        this.open = false;
    }
    void createTable(Table t) throws DBException, TableException{
        try {
            if(!this.open){
                throw new DBException("ERROR: La base de datos está cerrada");
            }
            if (this.tables.contains(t)){
                throw new TableException("ERROR: La tabla no existe en la base de datos.");
            }
            tables.addElement(t);
            this.open = true;
        } catch (DBException e) {
            System.out.println("Error en la creación: "+e.getMessage());
        }
    }
    void removeTable(String id){
        try {
            if(!open){
                throw new DBException("ERROR: La base de datos está cerrada");
            }
            int cont = 0;
            for (Table table : tables) {
                if (table != null){
                    if(table.getName().equals(id)){
                      tables.remove(cont);  
                    }
                    cont++;
                }
            }
        } catch (DBException e) {
            System.out.println("Error: "+e.getMessage());
        }
    }
    void listTables(){
        try {
            if(!open){
                throw new DBException("ERROR: La base de datos está cerrada");
            }
            for (Table table : tables) {
                if(table != null){
                    System.out.println("Nombre: "+table.getName());
                }
            }
        } catch (DBException e) {
            System.out.println("Error: "+e.getMessage());
        }
    }
    void openDb(){
        this.open = true;
    }
    void closeDb(){
        this.open = false;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
    public boolean isOpen() {
        return this.open;
    }
}
