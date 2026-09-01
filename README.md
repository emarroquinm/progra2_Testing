# Laboratorio: Java + MongoDB Atlas con GitHub Codespaces

## Curso
Programación II

## Objetivo
Construir una aplicación Java ejecutada en GitHub Codespaces que se conecte a MongoDB Atlas y permita realizar operaciones CRUD sobre una colección de productos.

## Tecnologías
- Java 17
- Maven
- GitHub
- GitHub Codespaces
- MongoDB Atlas
- MongoDB Java Sync Driver

## Caso de estudio
La aplicación administrará productos con los campos:

- `codigo`
- `nombre`
- `categoria`
- `precio`
- `existencia`

Base de datos: `tienda`  
Colección: `productos`

## 1. Crear el Codespace
1. Abra este repositorio en GitHub.
2. Seleccione **Code > Codespaces**.
3. Seleccione **Create codespace on main**.
4. Espere a que se abra Visual Studio Code en el navegador.

## 2. Configurar MongoDB Atlas
1. Cree un proyecto en MongoDB Atlas.
2. Cree una implementación gratuita disponible.
3. Cree un usuario de base de datos.
4. Configure **Network Access** para permitir la conexión desde el Codespace.
5. En **Connect > Drivers > Java**, copie la cadena de conexión.

## 3. Configurar el secreto
No escriba la contraseña dentro del código.

Cree un secreto de Codespaces llamado:

`MONGODB_URI`

Como alternativa temporal para una sesión de laboratorio:

```bash
export MONGODB_URI='mongodb+srv://USUARIO:CLAVE@CLUSTER/?retryWrites=true&w=majority'
```

No suba esta cadena al repositorio.

## 4. Compilar
```bash
mvn clean compile
```

## 5. Ejecutar
```bash
mvn exec:java
```

Al inicio debe mostrarse:

```text
=== Java + MongoDB Atlas ===
Conexión exitosa.
```

## 6. Trabajo a realizar
Complete `ProductoDAO.java` e implemente en `App.java` un menú que incluya:

1. Agregar producto.
2. Listar productos.
3. Buscar producto por código.
4. Actualizar precio.
5. Actualizar existencia.
6. Eliminar producto.
7. Mostrar productos con poco inventario.
0. Salir.

## 7. Requisitos
- Utilizar `insertOne()`.
- Utilizar `find()`.
- Utilizar un filtro con `Filters.eq()`.
- Utilizar `updateOne()`.
- Utilizar `deleteOne()`.
- Utilizar una consulta con `Filters.lt()` o equivalente.
- Validar entradas básicas.
- No almacenar credenciales dentro del código.
- Mantener una estructura clara de clases.

## 8. Evidencias
Incluya en la entrega:

- Enlace al repositorio.
- Captura de la aplicación ejecutándose en Codespaces.
- Captura de la colección `productos` en MongoDB Atlas.
- Evidencia de insertar, buscar, actualizar y eliminar.
- Al menos 5 productos registrados.
- Respuestas a las preguntas de análisis solicitadas por el docente.

## Seguridad
Nunca suba:
- contraseña de Atlas;
- URI completa con contraseña;
- archivos `.env`;
- capturas que muestren credenciales.

## Estructura esperada
```text
.
├── .devcontainer/
│   └── devcontainer.json
├── src/
│   ├── main/
│   │   └── java/
│   │       └── edu/
│   │           └── umg/
│   │               ├── App.java
│   │               ├── ConexionMongo.java
│   │               ├── Producto.java
│   │               └── ProductoDAO.java
│   └── test/
│       └── java/
│           └── edu/
│               └── umg/
├── .gitignore
├── pom.xml
└── README.md
```

## Entrega
Realice `commit` y `push` de todos los archivos de código. Verifique nuevamente que las credenciales no estén presentes en el historial del repositorio.
