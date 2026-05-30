CREATE DATABASE IF NOT EXISTS usuarios_db;

USE usuarios_db;

CREATE TABLE IF NOT EXISTS usuarios (
    id BIGINT NOT NULL AUTO_INCREMENT,
    nombre VARCHAR(255),
    correo VARCHAR(255),
    password VARCHAR(255),
    rol VARCHAR(255),
    PRIMARY KEY (id)
);