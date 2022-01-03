(ns app.views
  (:require [reagent.core :refer [atom]]))

;; state 
(defonce app-state (atom {:count 0}))

;; events

(defn increment
  [event]
  (.preventDefault event)
  (swap! app-state update-in [:count] inc))

(defn decrement
  [event]
  (.preventDefault event)
  (swap! app-state update-in [:count] dec))

(defn header
  []
  [:div
   [:h1 "A template for reagent apps"]])

(def button-classes "mx-6 lg:mx-0 hover:underline bg-white text-gray-800 font-bold rounded-full my-6 py-4 px-8 shadow-lg focus:outline-none focus:shadow-outline transform transition hover:scale-105 duration-300 ease-in-out")

(defn counter
  []
  [:div.flex.w-full.gap-9
   [:button.btn {:class button-classes
                 :on-click #(decrement %)} "-"]
   [:button {:disabled true} (get @app-state :count)]
   [:button.btn {:class button-classes
                 :on-click #(increment %)} "+"]])

(defn app []
  [:div
   [header]
   [counter]])
