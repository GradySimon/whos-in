INSERT INTO project (title, description)
VALUES 
	("Build Hoo's In", "As you can see, this site has a lot of work yet to be done on it. I've built it in Clojure, using Compojure."),
	("Make a beer pong table!", "I'm looking for people to help me design and build a beer pong table. We can make one for each collaborator!"),
	("Learn algorithmic music composition", "I know of a library for Haskell called Euterpea. This library lets you build both note structures and synths. I am interested in maybe working with some generative grammars to explore how musical structure corresponds to aesthetics."),
	("Plant a garden", "I want to plant a few rows in the community garden near Hereford."),
	("Spread awareness of the Invisible Children", "I want to work with someone to design a campaign to spread awareness and raise money for the Invisible Children in Uganda.");

INSERT INTO tag (id, name)
VALUES
	(1, "Programming"),
	(2, "Woodworking"),
	(3, "Activisim"),
	(4, "Music"),
	(5, "Outdoors"),
	(6, "Gardening"),
	(7, "Drinking");

INSERT INTO project_tagged (tag_id, project_id)
VALUES
	(1, 1),
	(1, 3),
	(2, 2),
	(3, 5),
	(4, 3),
	(5, 2),
	(5, 4),
	(6, 4),
	(7, 2);
