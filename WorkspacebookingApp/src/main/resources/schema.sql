

    
     create table usersecinfo (
        username varchar(50) not null,
        password varchar(800) not null,
        emp_id bigint not null,
        role varchar(50),
        enabled smallint not null,
        primary key (username),
        
        FOREIGN KEY (emp_id) REFERENCES employeedetails(emp_id)
    );
    
   create table employeedetails (
     emp_id bigint not null auto_increment,
     empname varchar(50) not null,
     fullname varchar(100) not null,
     location varchar(50) not null,
     country varchar(50) not null,
     
     primary key (emp_id)
     );
     
     
         CREATE TABLE `bookingdetails` (
  `booking_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `bookingdate` date NOT NULL,
  `intime` time NOT NULL,
  `outtime` time NOT NULL,
  `emp_id` bigint(20) not NULL,
  PRIMARY KEY (`booking_id`),
  FOREIGN KEY (emp_id) REFERENCES employeedetails(emp_id)
	 );
	commit;
  