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
	mi_blog_like_times int default 0,
	mi_blog_create_time varchar(20),
	mi_blog_last_modify_time varchar(20) default null
);

insert into mi_user values(3,'123','123',null,now());
insert into mi_user values(5,'125','125',null,now());
insert into mi_user values(6,'126','126',null,now());

insert into mi_blog(mi_user_id,mi_blog_text,mi_blog_create_time) values
(6,'¼õ·Ê!',now()),
(5,'ok!',now()),
(3,'yes!',now()),
(5,'no!',now()),
(3,'like!',now()),
(3,'do!',now());

select * from mi_blog;