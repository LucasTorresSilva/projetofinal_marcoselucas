create database projetomarcoselucas	

use projetomarcoselucas

create table cadastro(
nome varchar(50) not null,
codigo int primary key not null,
cep int not null,
endereco varchar(100) not null,
bairro varchar(50) not null,
cidade varchar(50) not null);

select * from cadastro