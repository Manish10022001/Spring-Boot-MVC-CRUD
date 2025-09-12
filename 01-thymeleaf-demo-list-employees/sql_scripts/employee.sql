create database if not exists `employee_directory`;
use `employee_directory`;

-- Table structure for table employee
drop table if exists `employee`;

create table `employee`(
	id int not null auto_increment,
    first_name varchar(45) default null,
    last_name varchar(45) default null,
    email varchar(45) default null,
    primary key(id)
) engine=InnoDB auto_increment=1 default charset = latin1;

-- Data for table employee
insert into employee values
	(1,'Leslie','Andrews','leslie@gmail.com'),
    (2,'Emma','Baumgarten','emma@gmail.com'),
    (3,'Avani','Gupta','avani@gmail.com'),
    (4,'Yuri','Petrov','yuri@gmail.com'),
    (5,'Jaun','Vega','juan@gmail.com');
select * from employee;