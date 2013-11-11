(ns whos-in.views
	(:require [whos-in.data :as data]
			  [whos-in.config :as config]
			  [whos-in.render :as render]))

(defn index "Main index page." []
	(let [posts (data/fetch-projects config/MAX-PROJECTS-ON-INDEX)]
		(render/render-index posts)))

(defn project-page "Detail page for a single project" [project-id]
    (let [project-map (data/fetch-project project-id)]
        (render/render-project-page project-map)))