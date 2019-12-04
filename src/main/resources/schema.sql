create table record
(
    id          bigint unsigned auto_increment,
    create_time timestamp default current_timestamp(3),
    name        varchar(64),
    primary key (id)
);