set names utf8;
drop database if exists mixinan;
create database mixinan character set utf8;
use mixinan;
create table mi_user(
	mi_user_id int primary key auto_increment,
	mi_user_name varchar(100) not null,
	mi_user_password varchar(100) not null,
	mi_user_gender varchar(5) default '1'
);