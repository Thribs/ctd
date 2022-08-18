create table drugs if not exists (
    id int auto_increment primary key,
    name varchar(255) not null,
    labName varchar(255) not null,
    quantity_in_stock int not null default 0,
    price double not null
)