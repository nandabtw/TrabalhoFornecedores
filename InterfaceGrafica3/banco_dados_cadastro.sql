CREATE DATABASE cadastro;

USE cadastro;

CREATE TABLE cadastro.cadastro_pessoa (
 id       INT auto_increment NOT NULL,
 nome     varchar(100)       NOT NULL,
 endereco varchar(100)       NOT NULL,
 email    varchar(100)       NULL    ,
 telefone varchar(100)       NULL    ,
 CONSTRAINT cadastro_pessoa_pk PRIMARY KEY (id)
);

select * from cadastro_pessoa;

CREATE TABLE fornecedor (
 id INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
 nome VARCHAR(100)      NOT NULL ,
 email VARCHAR(100)     NOT NULL ,
 endereco VARCHAR(200)  NOT NULL ,
 uf INT                 NOT NULL ,
 telefone VARCHAR(20)   NOT NULL ,
 cnpj VARCHAR(20)       NOT NULL ,
 inscricaoEstadual VARCHAR(20)      NOT NULL ,
 nomeFantasia VARCHAR(100)          NOT NULL ,
 categoria VARCHAR(50)              NOT NULL
);

CREATE TABLE cadastro.uf (
 id    INT auto_increment NOT NULL,
 nome  varchar(100)       NOT NULL,
 sigla varchar(2)         NOT NULL,
 CONSTRAINT cadastro_pessoa_pk PRIMARY KEY (id)
);

select * from uf;
