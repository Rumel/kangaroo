(ns kangaroojs.core
  (:require [om.core :as om]
            [om.dom :as dom]))

(enable-console-print!)

(def app-state (atom {}))

(defn widget [data owner]
  (reify
    om/IRender
    (render [this]
      (dom/h1 nil "Hello World from React!"))))

(om/root widget app-state
  {:target (. js/document (getElementById "app"))})
