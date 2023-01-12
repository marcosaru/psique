create table consulta(
    id serial not null,
    data_consulta date not null,
    valor double precision not null,
    psicologo_cpf varchar(14) not null,
    paciente_cpf varchar(14) not null,
    primary key (id),
    foreign key (psicologo_cpf) references psicologo(cpf),
    foreign key (paciente_cpf) references paciente(cpf)
);