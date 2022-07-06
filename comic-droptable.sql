--use master
--drop database if exists WEBCOMIC
--create database WEBCOMIC

use WEBCOMIC

insert into Role (RoleName)
values ('ADMIN'),
('USER');

insert into Account (Birthday, CreatedDate, Email, FullName, Password, Sex, Status, TranslateTeamId)
values ('2022-12-12','2022-12-12','admin@gmail.com','admin AbC','$2a$10$/tJ17.lDF2O9Vsqr.P636ese6jJAdoXgCSZ7j7qsAYrIwScEcvMVa',1,1,NULL),
('2022-08-08','2022-08-08','user@gmail.com','user MON','$2a$10$/tJ17.lDF2O9Vsqr.P636ese6jJAdoXgCSZ7j7qsAYrIwScEcvMVa',0,1,NULL);

insert into account_role_entities
values (1,1),
(2,2);

drop table Notification
drop table Comment
drop table Follow
drop table CateComic
drop table AuthorComic
drop table ChapterImage
drop table Chapter
drop table Author
drop table Category
drop table Comic
drop table account_role_entities
drop table Account
drop table Role
--drop table UserDetail
drop table TranslateTeam
drop table Request
drop table Report

drop table notification
drop table comment
drop table follow
drop table cate_comic
drop table author_comic
drop table chapter_image
drop table chapter
drop table author
drop table category
drop table comic
drop table account_role_entities
drop table account
drop table role
drop table translate_team
drop table request
drop table report