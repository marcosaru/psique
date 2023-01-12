create table usuario (
    id serial,
    email varchar(255) not null,
    senha varchar(255) not null,
    cpf_psicologo varchar(255) not null,
    primary key (id)
);
alter table usuario add constraint fk_psi foreign key (cpf_psicologo) references psicologo(cpf);