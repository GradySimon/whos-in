(ns whos-in.views
	(:require [whos-in.db :as db]
			  [whos-in.config :as config]
			  [whos-in.render :as render-index]))

(defn index "Main index page." []
	(let [posts (db/fetch-projects config/MAX-PROJECTS-ON-INDEX)]
		(render/render-index posts)))