-- This was written with MySQL in mind, no other RDBMS.

CREATE TABLE tag (
	id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
	name VARCHAR(25) NOT NULL
);

CREATE TABLE project (
	id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
	title VARCHAR(60),
	description TEXT,git 
	creation_date DATETIME NOT NULL
);

CREATE TABLE member_request (
	id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
	title VARCHAR(25),
	description TEXT,
	project_id INT,
	CONSTRAINT FOREIGN KEY (project_id) REFERENCES project(id)
);

CREATE TABLE project_tagged (
	tag_id INT NOT NULL,
	CONSTRAINT FOREIGN KEY (tag_id) REFERENCES tag(id),
	project_id INT NOT NULL,
	CONSTRAINT FOREIGN KEY (project_id) REFERENCES project(id)
);
