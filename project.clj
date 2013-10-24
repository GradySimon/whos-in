(defproject whos-in "0.1.0-SNAPSHOT"
	:description "Who's In - A simple web app for finding collaborators."
	:url "https://github.com/GradySimon/whos-in"
	:license {:name "The MIT License (MIT)"
    		  :url "http://opensource.org/licenses/MIT"}
  	:dependencies [[org.clojure/clojure "1.5.1"]
  				   [compojure "1.1.5"]
  				   [org.clojure/java.jdbc "0.3.0-alpha5"]
  				   [mysql/mysql-connector-java "5.1.25"]
  				   [hiccup "1.0.4"]]
  	:plugins [[lein-ring "0.8.7"]]
  	:ring {:handler whos-in.app/app}
	:min-lein-version "2.0.0")
