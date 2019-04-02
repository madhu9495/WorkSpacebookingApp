
drop table if exists users;

    
     create table usersecinfo (
        username varchar(50) not null,
        password varchar(800) not null,
        empId bigint not null
        role varchar(50),
        enabled smallint not null,
        primary key (username),
        
        FOREIGN KEY (empId) REFERENCES employeedetails(empId)
    );
    
   create table employeedetails (
     empId bigint not null auto_increment,
     empname varchar(50) not null,
     fullname varchar(100) not null,
     location varchar(50) not null,
     country varchar(50) not null,
     
     primary key (empId)
     );
     
  