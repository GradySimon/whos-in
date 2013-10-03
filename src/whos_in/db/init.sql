CREATE TABLE tag (
	name VARCHAR(25) NOT NULL PRIMARY KEY
);

CREATE TABLE category (
	name VARCHAR(25) NOT NULL PRIMARY KEY
);

CREATE TABLE project (
	id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
	title VARCHAR(60),
	description TEXT,
	category VARCHAR(25) NOT NULL,
	CONSTRAINT FOREIGN KEY (category) REFERENCES category(name)
);

CREATE TABLE member_request (
	id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
	title VARCHAR(25),
	description TEXT,
	project_id INT,
	CONSTRAINT FOREIGN KEY (project_id) REFERENCES project(id)
);

CREATE TABLE project_tagged (
	tag_name VARCHAR(25) NOT NULL,
	CONSTRAINT FOREIGN KEY (tag_name) REFERENCES tag(name),
	project_id INT NOT NULL,
	CONSTRAINT FOREIGN KEY (project_id) REFERENCES project(id)
);