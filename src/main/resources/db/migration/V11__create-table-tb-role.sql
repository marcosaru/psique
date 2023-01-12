create table tb_role (
    roleId serial primary key ,
    roleName varchar(255) not null unique
);
