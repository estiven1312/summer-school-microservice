# Summer School Microservice

Este proyecto es un microservicio desarrollado con **Spring Boot** y **Java 21**. Proporciona una API para gestionar información relacionada con cursos de verano. Utiliza **PostgreSQL** como base de datos y está configurado para ejecutarse en contenedores Docker.

## Tecnologías utilizadas

- **Java 21**
- **Spring Boot**
- **Maven**
- **PostgreSQL**
- **Docker** y **Docker Compose**

## Requisitos previos

Asegúrate de tener instalados los siguientes programas en tu sistema:

- [Docker](https://www.docker.com/)
- [Docker Compose](https://docs.docker.com/compose/)

## Configuración

1. Crea un archivo `.env` en la raíz del proyecto con las siguientes variables de entorno:

    ```dotenv
    DB_HOST=localhost
    DB_PORT=5432
    DB_NAME=db05
    DB_USERNAME=alumno
    DB_PASSWORD=123456
    LOG_LEVEL=INFO
    SERVER_PORT=8086
    ```

2. Asegúrate de que el puerto definido en `SERVER_PORT` no esté en uso.

## Ejecución con Docker Compose

1. Construye y levanta los contenedores con el siguiente comando:

    ```bash
    docker-compose up --build
    ```

2. Accede a la aplicación en tu navegador o cliente API en la URL:

    ```
    http://localhost:8086
    ```

## Servicios

El archivo `docker-compose.yml` define los siguientes servicios:

- **app**: El microservicio Spring Boot.
- **db**: La base de datos PostgreSQL.

## Notas

- Los datos de la base de datos se almacenan en un volumen Docker llamado `postgres_data`.
- Puedes modificar las variables de entorno en el archivo `.env` para personalizar la configuración.

## Comandos útiles

- Detener los contenedores:

    ```bash
    docker-compose down
    ```

- Ver los logs de la aplicación:

    ```bash
    docker-compose logs -f app
    ```

## Licencia

Este proyecto está bajo una licencia de uso interno.