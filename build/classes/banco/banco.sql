CREATE DATABASE ConexaoBD;
USE ConexaoBD;

CREATE TABLE Pessoa (
    id_pessoa INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    cpf VARCHAR(14) NOT NULL UNIQUE,
    email VARCHAR(100) NOT NULL UNIQUE,
    telefone VARCHAR(15),
    idade DATE
);

CREATE TABLE Cliente (
    id_cliente INT AUTO_INCREMENT PRIMARY KEY,
    id_pessoa INT NOT NULL,

    FOREIGN KEY (id_pessoa)
        REFERENCES Pessoa(id_pessoa)
);

CREATE TABLE Funcionario (
    id_funcionario INT AUTO_INCREMENT PRIMARY KEY,
    id_pessoa INT NOT NULL,
    turno VARCHAR(20),

    FOREIGN KEY (id_pessoa)
        REFERENCES Pessoa(id_pessoa)
);

CREATE TABLE Carro (
    id_carro INT AUTO_INCREMENT PRIMARY KEY,
    id_cliente INT NOT NULL,

    placa VARCHAR(10) NOT NULL UNIQUE,
    modelo VARCHAR(50),
    marca VARCHAR(50),
    cor VARCHAR(30),
    ano INT,

    FOREIGN KEY (id_cliente)
        REFERENCES Cliente(id_cliente)
);

C