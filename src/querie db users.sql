show databases;
create database users;
use users;

CREATE TABLE usuarios(
	id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    username varchar(255) NOT NULL UNIQUE,
    nombre varchar(255) NOT NULL,
    apellido varchar(255) NOT NULL,
    phone varchar(255) NOT NULL,
    email varchar(255) NOT NULL,
	password VARCHAR(255) NOT NULL,
    created_at DATETIME DEFAULT CURRENT_TIMESTAMP
);

INSERT INTO usuarios (username, nombre, apellido, phone, email, password) VALUES ("ibx", "Brahiam", "Montero Santillan", "8099622004", "brahiam@hotmail.com", "root");

select * from usuarios;

/*drop database users;*/
