(ns whos-in.render
	(:use (hiccup 
			[core :only [html]]
			[page :only []])))

(defn render-index [posts]
	(html
		[:html
			[:head
				[:title "Who's In? | Find Collaborators for Your Project"]]
			[:body
				(for [post posts]
					[:div.project
						])]]))