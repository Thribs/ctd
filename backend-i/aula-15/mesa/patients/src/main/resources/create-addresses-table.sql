create table if not exists addresses(id int not null primary key auto_increment, street varchar(255) not null, number int null default null, city varchar(255) not null, neighborhood varchar(255));