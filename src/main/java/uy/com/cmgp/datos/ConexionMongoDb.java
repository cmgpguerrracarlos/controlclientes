package uy.com.cmgp.datos;
import com.mongodb.*;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import java.util.ArrayList;
import java.util.List;
import org.bson.Document;

public class ConexionMongoDb {
    private MongoDatabase database;
    private MongoCollection<Document> collection;
    private Document document = new Document();
    
    public ConexionMongoDb(){
        MongoClient mongoClient = new MongoClient("localhost",27017);
         this.database = mongoClient.getDatabase("mydb");
         this.collection = database.getCollection("clients");
        System.out.println("Conectado a mongodb");
        
    }
    
    public boolean insertar(String action){
        
        return true;
    }
    
    public void mostrar(){
        List<Document> databases = new MongoClient("localhost",27017).listDatabases().into(new ArrayList<>());

            databases.forEach(db -> System.out.println(db.toJson()));
    }
    
    public boolean actualizar(String oldAction,String newAction){
//        document.put("action", oldAction);
//        BasicDBObject newDocument = new BasicDBObject();
//        newDocument.put("action", newAction);
//        collection.findAndModify(document, newDocument);
//        System.out.println("Actualizado");
        return true;
    }
    
    public boolean eliminar(String action){
//        document.put("action", action);
//        collection.remove(document);
        return true;
    }
    
    
}
