package edu.umg;

public class App {

    public static void main(String[] args) {

        System.out.println("=== Java + MongoDB Atlas ===");

        if (!ConexionMongo.probarConexion()) {
            System.out.println("Revise MONGODB_URI y la configuración de red de Atlas.");
            return;
        }

        System.out.println("Conexión exitosa.");

        /*
         * ACTIVIDAD DEL ESTUDIANTE:
         *
         * 1. Construir un menú con Scanner.
         * 2. Implementar las operaciones CRUD de ProductoDAO.
         * 3. Permitir:
         *    - Insertar producto
         *    - Listar productos
         *    - Buscar por código
         *    - Actualizar precio
         *    - Actualizar existencia
         *    - Eliminar
         *    - Mostrar poco inventario
         */
    }
}
