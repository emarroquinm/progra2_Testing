package edu.umg;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

public class ConexionMongo {

    private ConexionMongo() {
    }

    public static MongoClient conectar() {
        String uri = System.getenv("MONGODB_URI");

        if (uri == null || uri.isBlank()) {
            throw new IllegalStateException(
                "No se encontró la variable de entorno MONGODB_URI."
            );
        }

        return MongoClients.create(uri);
    }

    public static boolean probarConexion() {
        try (MongoClient cliente = conectar()) {
            MongoDatabase db = cliente.getDatabase("tienda");
            db.runCommand(new Document("ping", 1));
            return true;
        } catch (Exception e) {
            System.out.println("Error de conexión: " + e.getMessage());
            return false;
        }
    }
}
