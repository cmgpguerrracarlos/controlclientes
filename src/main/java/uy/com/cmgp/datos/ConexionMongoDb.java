package uy.com.cmgp.datos;
import com.mongodb.*;

public class ConexionMongoDb {
    private DB database;
    private DBCollection collection;
    private BasicDBObject document = new BasicDBObject();
    
    public ConexionMongoDb(){
        Mongo mongo = new Mongo("localhost",3456);
        database = mongo.getDB("Todo");
        collection = database.getCollection("Todo");
        System.out.println("Conectado a mongodb");
        
    }
    
    public boolean insertar(String action){
        document.put("action", action);
        collection.insert(document);
        return true;
    }
    
    public void mostrar(){
        DBCursor cursor = collection.find();
        while(cursor.hasNext()){
            System.out.println(cursor.next());
        }
    }
    
    public boolean actualizar(String oldAction,String newAction){
        document.put("action", oldAction);
        BasicDBObject newDocument = new BasicDBObject();
        newDocument.put("action", newAction);
        collection.findAndModify(document, newDocument);
        System.out.println("Actualizado");
        return true;
    }
    
    public boolean eliminar(String action){
        document.put("action", action);
        collection.remove(document);
        return true;
    }
}
