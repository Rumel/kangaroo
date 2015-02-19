(ns kangaroo.routes.home
  (:import java.io.File)
  (:require [compojure.core :refer :all]
            [compojure.response :as response]))

(def index-file "resources/public/index.html")

(defn index
  "Returns the index page"
  []
  (response/render (File. index-file) nil))

(defroutes home-routes
  (GET "/" [] (index)))
