(ns app.core
  (:require [reagent.core :as r]))

(defn hello-world []
  [:h1 "Hello World!"])

(defn init-app []
  (r/render [hello-world]
            (.getElementById js/document "app")))

(defn reload! []
  (println "[main] reloaded:")
  (init-app))

(defn main! []
  (println "[main]: loading")
  (init-app))
