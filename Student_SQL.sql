create database bkacad;
use bkacad;

create table students(
	id varchar(10) primary key,
    full_name varchar(30) not null,
    gender tinyint(1) not null,
    dateOfBirth varchar(30) not null,
    address varchar(30) not null,
    phone varchar(10),
    email varchar(255),
    gpa double not null
);

INSERT INTO `bkacad`.`students` (`id`, `full_name`, `gender`, `dateOfBirth`, `address`, `phone`, `email`, `gpa`) VALUES ('BKC22023', 'Nguyen van A', '1', '01/02/2000', 'Hà Nội', '0987654321', 'a@gmail.com', '2.5');
INSERT INTO `bkacad`.`students` (`id`, `full_name`, `gender`, `dateOfBirth`, `address`, `phone`, `email`, `gpa`) VALUES ('BKC22002', 'Pham Van B', '0', '03/03/1999', 'Đà Nẵng', '0987654345', 'b@gmail.com', '3.0');
INSERT INTO `bkacad`.`students` (`id`, `full_name`, `gender`, `dateOfBirth`, `address`, `phone`, `email`, `gpa`) VALUES ('BKC22003', 'Nguyen Thi C', '1', '12/12/2002', 'Hà Nội', '00123456789', 'c@gmail.com', '2.8');
