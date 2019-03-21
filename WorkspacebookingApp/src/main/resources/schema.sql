
drop table if exists users;

    
     create table users (
        username varchar(50) not null,
        country varchar(30),
        enabled smallint,
        full_name varchar(100),
        password varchar(800) not null,
        role varchar(50),
        primary key (username)
    );
    
    create table profiledetails (
     profileid bigint(50) not null,
     firstname varchar(50) not null,
     lastname varchar(50) not null,,
     skillset varchar(50) not null,
     location varchar(50) not null,
     dob date not null,
     qualification varchar(50) not null,
     experiance INTEGER not null,
     gender varchar(10) not null,
     emailid varchar(100) not null,
     phonenumber varchar(20),
     
     primary key (profileid)
     
    
    );
  