insert into tb_role(authority)values('ROLE_ADMIN');
insert into tb_role(authority)values('ROLE_GERENTE');
insert into tb_role(authority)values('ROLE_VENDEDOR');

insert into tb_users(nome,email,senha)values('maria','maria@gmail.com','$2a$10$79Uc7OcjK06B9c9Id/tBLeb.1BRaio59P/bEH22IVJb3kL88Z1yWa');
insert into tb_users(nome,email,senha)values('jose','jose@gmail.com','$2a$10$79Uc7OcjK06B9c9Id/tBLeb.1BRaio59P/bEH22IVJb3kL88Z1yWa');
insert into tb_users(nome,email,senha)values('joao','joao@gmail.com','$2a$10$79Uc7OcjK06B9c9Id/tBLeb.1BRaio59P/bEH22IVJb3kL88Z1yWa');

insert into tb_user_role(user_id, role_id)values(1,3);
insert into tb_user_role(user_id, role_id)values(2,1);
insert into tb_user_role(user_id, role_id)values(3,2);