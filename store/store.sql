
CREATE DATE student;

use student;

CREATE  TABLE registered_student (
    id INT(20) PRIMARY KEY AUTO_INCREMENT,
    first_name VARCHAR(100) NOT NULL,
    mid_name VARCHAR(100) NOT NULL,
    last_name VARCHAR(100) NOT NULL,
    father_name VARCHAR(250) NOT NULL,
    mother_name VARCHAR(250) NOT NULL,
    address VARCHAR(255) NOT NULL,
    dob DATE NOT NULL,
    gender VARCHAR(20) NOT NULL,
    email VARCHAR(100) NOT NULL,
    contact_no VARCHAR(20) NOT NULL,
    parent_contact_no VARCHAR(20) NOT NULL,
    applied_course VARCHAR(20) NOT NULL
);

