(ns app.state
  (:require
   [reagent.core :refer (atom)]))

;; state

(defonce app-state (atom {:count 0
                          :view "Home"}))

;; (assoc @app-state :view title) --> replace app-sate by the result of the function  call
;; (swap! atom f) --> (reset! atom (f @atom))
;; (deref atom) @atom

;; events
(defn decrement
  [event]
  (.preventDefault event)
  (swap! app-state update-in [:count] dec))

(defn increment
  [event]
  (.preventDefault event)
  (swap! app-state update-in [:count] inc))

(defn counter
  []
  [:div.flex.w-full.gap-9
   [:button.btn {:on-click #(decrement %)} "-"]
   [:button {:disabled true} (get @app-state :count)]
   [:button.btn {:on-click #(increment %)} "+"]])
