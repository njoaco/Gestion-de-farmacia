CREATE DATABASE farmacia;

CREATE TABLE appuser (
    appuser_pk int AUTO_INCREMENT primary key,
    userRole varchar(200),
    name varchar(200),
    dob varchar(50),
    mobileNumber varchar(50),
    email varchar(200),
    username varchar(200),
    password varchar(50),
    adress varchar(200)
);

CREATE TABLE medicine (
	medicine_pk int AUTO_INCREMENT primary key, 
    uniqueId varchar(200), 
    name varchar(200), 
    companyName varchar(200), 
    quantity bigint,
    price bigint
);

CREATE TABLE bill (
	bill_pk int AUTO_INCREMENT primary key, 
    billId varchar(200), 
    billDate varchar(50), 
    totalPaid bigint,
    generatedBy varchar(50)
);

INSERT INTO appuser (userRole,name,dob,mobileNumber,email,username,password,adress) values('Admin','Admin','10-04-2005','1100000045','admin@gmail.com','admin','admin','Argentina') /* CUENTA DE ADMINSTRADOR */
