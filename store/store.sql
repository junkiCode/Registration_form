
CREATE DATE student;

USE student;

DROP TABLE registered_student;

CREATE  TABLE registered_student (
    id INT(20) PRIMARY KEY AUTO_INCREMENT,
    first_name VARCHAR(100) NOT NULL,
    mid_name VARCHAR(100) NOT NULL,
    last_name VARCHAR(100) NOT NULL,
    father_name VARCHAR(250) NOT NULL,
    mother_name VARCHAR(250) NOT NULL,
    address VARCHAR(255) NOT NULL,
    dob VARCHAR(50) NOT NULL,
    gender VARCHAR(20) NOT NULL,
    email VARCHAR(100) NOT NULL,
    contact_no VARCHAR(20) NOT NULL,
    parent_contact_no VARCHAR(20) NOT NULL,
    applied_course VARCHAR(20) NOT NULL
);

INSERT INTO registered_student (id, first_name, mid_name, last_name, father_name, mother_name, address, dob, gender,
email,

contact_no,

parent_contact_no, applied_course)
VALUES (1, 'John', 'D', 'Doe', 'David Doe', 'Sarah Doe', '123 Main St', '2002-05-12', 'M', 'johndoe@example.com', '555-1234', '555-5678', 'Computer Science');

INSERT INTO registered_student (id, first_name, mid_name, last_name, father_name, mother_name, address, dob, gender,
email,

contact_no,

parent_contact_no, applied_course)
VALUES (2, 'Jane', '', 'Smith', 'Robert Smith', 'Karen Smith', '456 Elm St', '2003-08-22', 'F', 'janesmith@example.com', '555-5678', '555-1234', 'Engineering');

INSERT INTO registered_student (id, first_name, mid_name, last_name, father_name, mother_name, address, dob, gender,
email,

contact_no,

parent_contact_no, applied_course)
VALUES (3, 'Michael', 'J', 'Brown', 'Thomas Brown', 'Julie Brown', '789 Oak St', '2002-01-01', 'M', 'michaelbrown@example.com', '555-2345', '555-6789', 'Business');

INSERT INTO registered_student (id, first_name, mid_name, last_name, father_name, mother_name, address, dob, gender,
email,

contact_no,

parent_contact_no, applied_course)
VALUES (4, 'Samantha', '', 'Johnson', 'John Johnson', 'Amy Johnson', '101 Maple St', '2004-03-15', 'F', 'samanthajohnson@example.com', '555-6789', '555-2345', 'Psychology');

INSERT INTO registered_student (id, first_name, mid_name, last_name, father_name, mother_name, address, dob, gender,
email,

contact_no,

parent_contact_no, applied_course)
VALUES (5, 'William', 'T', 'Davis', 'Mark Davis', 'Elizabeth Davis', '222 Cherry St', '2002-12-31', 'M', 'williamdavis@example.com', '555-3456', '555-7890', 'Mathematics');

INSERT INTO registered_student (id, first_name, mid_name, last_name, father_name, mother_name, address, dob, gender,
email,

contact_no,

parent_contact_no, applied_course)
VALUES (6, 'Emily', 'M', 'Garcia', 'Juan Garcia', 'Maria Garcia', '333 Walnut St', '2003-06-10', 'F', 'emilygarcia@example.com', '555-7890', '555-3456', 'Journalism');

