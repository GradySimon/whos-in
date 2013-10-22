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
