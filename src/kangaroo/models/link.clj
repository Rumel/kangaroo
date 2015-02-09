(ns kangaroo.models.link
  (:use kangaroo.models.db korma.core)
  (:import java.util.Date)
  (:require digest))

(defentity links)

(defn- get-md5-hash
  "Returns the hash for the link"
  [url]
  (as-> (.toString (Date.)) x
        (str url x)
        (digest/md5 x)
        (subs x 0 6)))

(defn all 
  "Return all links in the database"
  []
  (select links))

(defn new
  "Inserts a new link into the database"
  [url]
  (loop [tries 0]
    (let [[result exception] (try
                               (let [hash (get-md5-hash (str url tries))]
                                 [(insert links
                                    (values {:url url :hash hash})) nil])
                               (catch org.postgresql.util.PSQLException e [nil e]))]
      (if-not exception
        result
        (recur (inc tries))))))
