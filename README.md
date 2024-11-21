# Estramipyme Backend

Este es el backend del proyecto **Estramipyme**, diseñado para gestionar encuestas basadas en metodologías estratégicas como el Círculo Dorado y el Radar Estratégico. Esta aplicación permite a los usuarios registrarse, responder formularios y generar informes personalizados.

## Tecnologías

Este proyecto utiliza las siguientes tecnologías:

* **Java 17**
* **Spring Boot**
* **Maven**
* **JPA/Hibernate**
* **JWT para autenticación**
* **Swagger para documentación de API**
* **Base de datos relacional**

## Requisitos Previos

Asegúrate de tener instalado lo siguiente:

* Java 17
* Maven
* Git
* Un servidor de base de datos compatible (MySQL, PostgreSQL, etc.)

## Instalación

1. **Clona el repositorio:**
```bash
git clone https://github.com/tu-usuario/estramipyme-backend.git
cd estramipyme-backend
```

2. **Configura la base de datos:**
   * Renombra el archivo `application.properties.example` a `application.properties`.
   * Actualiza las propiedades con las credenciales de tu base de datos.

3. **Construye y ejecuta la aplicación:**
```bash
mvn clean install
mvn spring-boot:run
```

## Estructura del Proyecto

El proyecto sigue una arquitectura modular clara para facilitar el desarrollo y el mantenimiento:

```
com.estramipyme.crud/
├── api/                 # Controladores REST
├── config/              # Configuración del proyecto (CORS, Swagger)
├── dto/                 # DTOs para solicitudes y respuestas
├── persistence/         # Entidades y repositorios JPA
├── security/            # Configuración de seguridad y autenticación JWT
├── service/             # Servicios y lógica de negocio
├── utils/               # Utilidades comunes
└── resources/           # Configuración y scripts de base de datos
```

## Endpoints Principales

Los controladores gestionan los siguientes recursos:

* Usuarios (`/api/users`)
* Preguntas (`/api/questions`)
* Opciones (`/api/options`)
* Respuestas (`/api/responses`)
* Resultados (`/api/results`)

Consulta la documentación de la API generada por Swagger en http://localhost:8080/swagger-ui.html.

## Base de Datos

Scripts de creación de tablas están ubicados en `src/main/resources/db/`:

* `Create_Users_Table.sql`
* `Create_Questions_Table.sql`
* `Create_Options_Table.sql`
* `Create_Responses_Table.sql`
* `Create_Results_Table.sql`

Ejecuta estos scripts en tu servidor de base de datos antes de iniciar la aplicación.

## Seguridad

Este proyecto utiliza JWT para la autenticación:

1. Registra un usuario nuevo (`/api/auth/register`).
2. Autentícate para obtener un token (`/api/auth/login`).
3. Usa el token en los encabezados de las solicitudes para acceder a los endpoints protegidos.

## Miembros del Equipo

* Jaime Andrés Vélez
* Mateo Osorio
* Susana Fernández
* David Arroyave
* Caterine Montoya
* Axel Iván Londoño

## Contribuir

Si deseas contribuir al proyecto, sigue estos pasos:

1. Haz un fork del repositorio.
2. Crea tu rama de características:
```bash
git checkout -b feature/nueva-caracteristica
```

3. Realiza tus cambios y haz commit:
```bash
git commit -m 'Agrega nueva característica'
```

4. Haz push a la rama:
```bash
git push origin feature/nueva-caracteristica
```

5. Abre un Pull Request.

## Licencia

Este proyecto está licenciado bajo la licencia MIT. Consulta el archivo `LICENSE` para más información.
