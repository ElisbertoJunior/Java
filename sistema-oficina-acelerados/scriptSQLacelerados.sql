-- comentarios
-- a linha abaixo cria um banco de dados
create database dbacelerados;

-- a linha abaixo escocle o banco de dados a ser utilizado
use dbacelerados;

-- o bloco de intrucoes abaixo cria uma tabela
create table dbusers(
	iduser int primary key,
    user varchar(50) not null,
    fone varchar(15),
    login varchar(15) not null unique,
    senha varchar(15) not null
);

-- o comando abaixo descreve a tabela
describe dbusers;

-- a linha abaixo insere dados na tabela (CRUD)
-- Create -> insert
insert into dbusers(iduser, user, fone, login, senha)
values(1, 'Adriana', '9999-9999', 'adriana', '123456'); 

-- a linha abaixo exibe os dados da tabela(CRUD)
-- Read -> select
select * from dbusers;

insert into dbusers(iduser, user, fone, login, senha)
values(2, 'Administrador', '9999-9999', 'admin', 'admin1234');
insert into dbusers(iduser, user, fone, login, senha)
values(3, 'Diego Alves', '9999-9999', 'diego', '123456');

-- a linha abaixo modifica dados na tabela(CRUD)
-- update -> update
update dbusers set user = 'Adriana Alves' where iduser=1;

-- a linha abaixo apaga um registro da tabela (CRUD)
-- delete -> delete
delete from dbusers where iduser=3;

create table tbclients(
	idcli int primary key auto_increment,
    namecli varchar(50) not null,
    endcli varchar(100),
    fonecli varchar(50),
    carcli varchar(50),
    placa varchar(50)
);

describe tbclients;

insert into tbclients(namecli, endcli, fonecli, carcli, placa)
values('Ze da esquina', 'Rua 3 n233', '9999-9999', 'Fox', 'FFE-0322');

select * from tbclients;

use dbacelerados;

create table tbos(
    os int primary key auto_increment,
    data_os timestamp default current_timestamp,
    carro varchar(150) not null,
    defeito varchar(150) not null,
    servico varchar(150),
    mecanico varchar(30),
    valor decimal(10,2),
    idcli int not null,
    foreign key(idcli) references tbclients(idcli)
);

describe tbos;

insert into tbos(carro, defeito, servico, mecanico, valor, idcli)
values('Fox', 'Nao liga', 'troca de bateria', 'Diego', 310.85, 1);

select * from tbos;

-- o codigo abaixo traz informacoes de duas tabela
select
O.os,carro,defeito,servico,valor,
C.namecli,fonecli
from tbos as O
inner join tbclients as C
on (O.idcli = C.idcli);