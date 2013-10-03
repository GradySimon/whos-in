(ns whos-in.app
	(:use compojure.core
		  whos-in.views)
	(:require [compojure.route :as route]
			  [compojure.handler :as handler]))

(defroutes all-routes
	(GET "/" [] (index)))

(def app
	(handler/site all-routes))

