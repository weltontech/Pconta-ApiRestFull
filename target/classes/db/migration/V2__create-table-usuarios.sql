create table usuarios(

    id bigint not null auto_increment,
    nome varchar(100) not null,
    email varchar(100) not null unique,
    nomeMae varchar(100) not null,
    nomePai varchar(100) not null,
    senha varchar(100) not null,
    cpf varchar(100) not null unique,
    primary key(id)

);