(ns kangaroo.models.db
  (:use korma.db))

(defdb db (postgres {:db "kangaroo"
                     :user "kangaroo"
                     :password ""}))
