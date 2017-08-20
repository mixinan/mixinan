set names utf8;
drop database if exists mixinan;
create database mixinan character set utf8;
use mixinan;
create table mi_user(
	mi_user_id int primary key auto_increment,
	mi_user_name varchar(100) not null,
	mi_user_password varchar(100) not null,
	mi_user_gender varchar(5) default '1',
	mi_user_create_time varchar(20)
);

create table mi_blog(
	mi_blog_id int primary key auto_increment,
	mi_user_id int,
	mi_blog_text varchar(300),
	mi_blog_like_times int,
	mi_blog_create_time varchar(20),
	mi_blog_last_modify_time varchar(20)
);

insert into mi_user values(3,'123','123',null,now());
insert into mi_user values(5,'125','125',null,now());
insert into mi_user values(6,'126','126',null,now());

insert into mi_blog values(null,6,'¼õ·Ê!',2,now(),now());
insert into mi_blog values(null,3,'mixinan',2,now(),now());
insert into mi_blog values(null,5,'yes i do',2,now(),now());
insert into mi_blog values(null,3,'hello world!',2,now(),now());
insert into mi_blog values(null,6,'vvvv',2,now(),now());
insert into mi_blog values(null,5,'are you ok?',3,now(),now());
insert into mi_blog values(null,5,'I like coding!',3,now(),now());

select * from mi_blog;