(ns whos-in.data
	(:require [clojure.java.jdbc :as jdbc]
			  [whos-in.config :as config]))

(def db {:classname "com.mysql.jdbc.Driver"
	     :subprotocol "mysql"
	     :subname config/DB-LOCATION
	     :user config/DB-USER
	     :password config/DB-PASSWORD})

(defn get-result-set [query-and-params]
	(jdbc/query query-and-params))

(defn fetch-projects [max_project_count]
	(get-result-set
		["SELECT id, title
		  FROM project
		  ORDER BY creation_date DESC
		  LIMIT ?" max_project_count]))

(defn fetch-project [project-id]
	(let [project ()
		  tags (get-result-set
		  			["SELECT"])]))

(defn fetch-project-core [project-id]
	(get-result-set
		["SELECT title, description, creation_date
		  FROM project
		  WHERE id = ?" project-id]))

(defn fetch-project-tags [project-id]
	(get-result-set
		["SELECT tag.name
		  FROM project
		  INNER JOIN project_tagged ON project_tagged.project_id = project.id
		  INNER JOIN tag ON project_tagged.tag_id = tag.id
		  WHERE project.id = ?" project-id]))

(defn fetch-project-member-requests [project-id]
	(get-result-set
		["SELECT member_request.title, member_request.description
		  FROM project
		  INNER JOIN member_request ON project.id = member_request.project_id
		  WHERE project.id = ?" project-id])) ; needs to be updated when user table is added and linked
