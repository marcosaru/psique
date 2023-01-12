create table tb_user_roles(
    roleId integer,
    id integer
);
alter table tb_user_roles add constraint fk_role_id foreign key (roleId) references tb_role(roleId);
alter table tb_user_roles add constraint fk_user_id foreign key (id) references usuario(id);