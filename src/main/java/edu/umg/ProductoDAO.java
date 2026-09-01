package edu.umg;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

public class ProductoDAO implements AutoCloseable {

    private final MongoClient cliente;
    private final MongoCollection<Document> productos;

    public ProductoDAO() {
        cliente = ConexionMongo.conectar();
        MongoDatabase db = cliente.getDatabase("tienda");
        productos = db.getCollection("productos");
    }

    public void insertar(Producto producto) {
        // TODO 1: construir un Document con los datos del producto.
        // TODO 2: insertar el documento con insertOne().
        throw new UnsupportedOperationException("Pendiente: insertar()");
    }

    public void listar() {
        // TODO: recorrer productos.find() y mostrar los documentos.
        throw new UnsupportedOperationException("Pendiente: listar()");
    }

    public Document buscarPorCodigo(String codigo) {
        // TODO: utilizar Filters.eq() y first().
        throw new UnsupportedOperationException("Pendiente: buscarPorCodigo()");
    }

    public void actualizarExistencia(String codigo, int nuevaExistencia) {
        // TODO: utilizar updateOne() y Updates.set().
        throw new UnsupportedOperationException("Pendiente: actualizarExistencia()");
    }

    public void actualizarPrecio(String codigo, double nuevoPrecio) {
        // TODO: actualizar el campo precio.
        throw new UnsupportedOperationException("Pendiente: actualizarPrecio()");
    }

    public void eliminar(String codigo) {
        // TODO: eliminar por código.
        throw new UnsupportedOperationException("Pendiente: eliminar()");
    }

    public void listarPocoInventario(int limite) {
        // TODO: mostrar productos con existencia menor al límite.
        throw new UnsupportedOperationException("Pendiente: listarPocoInventario()");
    }

    @Override
    public void close() {
        cliente.close();
    }
}
