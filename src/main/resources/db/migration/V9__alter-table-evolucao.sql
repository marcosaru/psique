alter table evolucao add column paciente_cpf varchar(14) not null;
alter table evolucao add constraint fk_paciente foreign key (paciente_cpf) references paciente(cpf);
alter table paciente drop column evolucao;