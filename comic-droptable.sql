--use master
--drop database if exists WEBCOMIC
--create database WEBCOMIC

use WEBCOMIC

insert into Role
values (1, 'ADMIN'),
(2, 'USER');

insert into Account
values (1, '2022-12-12','2022-12-12','admin@gmail.com','admin AbC','$2a$10$/tJ17.lDF2O9Vsqr.P636ese6jJAdoXgCSZ7j7qsAYrIwScEcvMVa',1,1,NULL),
(2, '2022-08-08','2022-08-08','user@gmail.com','user MON','$2a$10$/tJ17.lDF2O9Vsqr.P636ese6jJAdoXgCSZ7j7qsAYrIwScEcvMVa',0,1,NULL);

insert into account_role_entites
values (1,1),
(2,2);

drop table ComicNotification
drop table Comment
drop table FollowComic
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