(ns app.core
  (:require [reagent.dom :as dom]
            [app.views :as views]))

(defn ^:dev/after-load start
  []
  (dom/render
   [views/app]
   (.getElementById js/document "app")))

(defn ^:export main
  []
  (start))


(comment (start))
