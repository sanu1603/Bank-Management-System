create database bankmanagementsystem;
show databases;
use bankmanagementsystem;
create table signup(formno varchar(20) not null,
 name varchar(20) not null, 
 dob varchar(20) not null, 
 gender varchar(20) not null, 
 email varchar(40) not null, 
 address varchar(40) not null, 
 rel varchar(20) not null,
 inc varchar(20) not null,
 edu varchar(20) not null,
 occ varchar(20) not null,
 atype varchar(20) not null,
 pan varchar(20) not null,
 unique(pan),
 addhar bigint not null,
 primary key(addhar)
 );
 create table details(pin int,
 formno varchar(20) not null,
 atype varchar(20),
 cardno varchar(20) not null);
 
 create table bank(pin int not null,
 date varchar(40) not null, 
 type varchar(20) not null, 
 amount int not null);
 
 drop table signup;
 
 select count(formno) from details;
 
 select * from bank;
 select * from details;
 select * from signup;

select * from bank order by amount DESC limit 5; 