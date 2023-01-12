create table psicologo (
                           cpf varchar(14) not null,
                           nome varchar(255) not null,
                           qtde_paciente varchar(255) not null,
                           salario numeric not null,
                           crp varchar(255) not null,
                           primary key (cpf)
);