(ns app.views
  (:require
   [app.components :refer (button title below-hero below-title content team news)]
   [app.state :refer (app-state)]
   [app.working-packages.mapping-actor-networks :refer (wp-1)]
   [app.working-packages.studying-sdg-interactions :refer (wp-2)]
   [app.working-packages.closing-governance-gaps :refer (wp-3)]))

(defn nav-button [{:keys [title]}]
  [:div.z-50
   [button {:title title
            :on-click (fn [] (swap! app-state assoc :view title))}]])

(defn navbar []
  [:div {:class "flex justify-between my-8 w-full px-4 z-50 mb-4"} ;; alternative :div.flex :div#id <=> :div {:id "id"}
   [:div {:class "flex"}
    [nav-button {:title "Home"}]
    [nav-button {:title "Team"}]
    [nav-button {:title "News"}]]])


(defn tasks_2
  []
  [:section {:class "bg-white text-gray-600 body-font"}
   [:div {:class "container px-5 py-24 mx-auto flex flex-wrap"}
    [:div {:class "flex-shrink-0 w-10 h-10 rounded-full bg-green-500 inline-flex items-center justify-center"}
     [:svg {:fill "none", :stoke "currentColor", :stroke-linecap "round", :stroke-linejoin "round", :stroke-width "2", :class "w-5 h-5", :viewbox "0 0 24 24"}]]]])


(defn task
  []
  [:section {:class "bg-white text-gray-600 body-font"}
   [:div {:class "container px-5 py-24 mx-auto flex flex-wrap"}
    [:div {:class "flex flex-wrap w-full"}
     [:div {:class "lg:w-2/5 md:w-1/2 md:pr-10 md:py-6"}
      [:div {:class "flex relative pb-12"}
       [:div {:class "h-full w-10 absolute inset-0 flex items-center justify-center"}
        [:div {:class "h-full w-1 bg-gray-200 pointer-events-none"}]]
       [:div {:class "flex-shrink-0 w-10 h-10 rounded-full bg-green-500 inline-flex items-center justify-center text-white relative z-10"}
        [:svg {:fill "none", :stroke "currentColor", :stroke-linecap "round", :stroke-linejoin "round", :stroke-width "2", :class "w-5 h-5", :viewbox "0 0 24 24"}
         [:path {:d "M12 22s8-4 8-10V5l-8-3-8 3v7c0 6 8 10 8 10z"}]]]

       [:div {:class "flex-grow pl-4"}
        [:h2 {:class "font-medium title-font text-sm text-gray-900 mb-1 tracking-wider"} "September 2021"]
        [:p {:class "leading-relaxed"} "Project start"]]]

      [:div {:class "flex relative pb-12"}
       [:div {:class "h-full w-10 absolute inset-0 flex items-center justify-center"}
        [:div {:class "h-full w-1 bg-gray-200 pointer-events-none"}]]
       [:div {:class "flex-shrink-0 w-10 h-10 rounded-full bg-green-500 inline-flex items-center justify-center text-white relative z-10"}
        [:svg {:fill "none", :stroke "currentColor", :stroke-linecap "round", :stroke-linejoin "round", :stroke-width "2", :class "w-5 h-5", :viewbox "0 0 24 24"}
         [:circle {:cx "12", :cy "5", :r "3"}]
         [:path {:d "M12 22V8M5 12H2a10 10 0 0020 0h-3"}]]]
       [:div {:class "flex-grow pl-4"}
        [:h2 {:class "font-medium title-font text-sm text-gray-900 mb-1 tracking-wider"} "October 2021"]
        [:p {:class "leading-relaxed"}
         "Rough prototype work for public-facing network mapping completed. "
         [:a {:class "hover:underline" :target "_blank" :href "https://marioangst.shinyapps.io/prototype_app/"}
          "See here. "] "Pure visualization concept, does not use automated content yet."]]]

      [:div {:class "flex relative pb-12"}
       [:div {:class "h-full w-10 absolute inset-0 flex items-center justify-center"}
        [:div {:class "h-full w-1 bg-gray-200 pointer-events-none"}]]
       [:div {:class "flex-shrink-0 w-10 h-10 rounded-full bg-green-500 inline-flex items-center justify-center text-white relative z-10"}
        [:svg {:fill "none", :stroke "currentColor", :stroke-linecap "round", :stroke-linejoin "round", :stroke-width "2", :class "w-5 h-5", :viewbox "0 0 24 24"}
         [:circle {:cx "12", :cy "5", :r "3"}]
         [:path {:d "M12 22V8M5 12H2a10 10 0 0020 0h-3"}]]]
       [:div {:class "flex-grow pl-4"}
        [:h2 {:class "font-medium title-font text-sm text-gray-900 mb-1 tracking-wider"} "October 2021"]
        [:p {:class "leading-relaxed"} "Project presented at network workshop at Eawag"]]]


      [:div {:class "flex relative pb-12"}
       [:div {:class "h-full w-10 absolute inset-0 flex items-center justify-center"}
        [:div {:class "h-full w-1 bg-gray-200 pointer-events-none"}]]
       [:div {:class "flex-shrink-0 w-10 h-10 rounded-full bg-green-500 inline-flex items-center justify-center text-white relative z-10"}
        [:svg {:fill "none", :stroke "currentColor", :stroke-linecap "round", :stroke-linejoin "round", :stroke-width "2", :class "w-5 h-5", :viewbox "0 0 24 24"}
         [:path {:d "M22 12h-4l-3 9L9 3l-3 9H2"}]]]
       [:div {:class "flex-grow pl-4"}
        [:h2 {:class "font-medium title-font text-sm text-gray-900 mb-1 tracking-wider"} "December 2021"]
        [:p {:class "leading-relaxed"} "Start development of classification model for SDG 11.2 (sustainable transport).
                                        Automated mapping of actors active in sustainable transport governance will
                                        serve as pilot for broader mapping."]]]

      [:div {:class "flex relative pb-12"}
       [:div {:class "h-full w-10 absolute inset-0 flex items-center justify-center"}
        [:div {:class "h-full w-1 bg-gray-200 pointer-events-none"}]]
       [:div {:class "flex-shrink-0 w-10 h-10 rounded-full bg-green-500 inline-flex items-center justify-center text-white relative z-10"}
        [:svg {:fill "none", :stroke "currentColor", :stroke-linecap "round", :stroke-linejoin "round", :stroke-width "2", :class "w-5 h-5", :viewbox "0 0 24 24"}
         [:circle {:cx "12", :cy "5", :r "3"}]
         [:path {:d "M12 22V8M5 12H2a10 10 0 0020 0h-3"}]]]
       [:div {:class "flex-grow pl-4"}
        [:h2 {:class "font-medium title-font text-sm text-gray-900 mb-1 tracking-wider"} ""]
        [:p {:class "leading-relaxed"} "Working prototype of pilot classification model. Stakeholder workshop and report."]]]

      [:div {:class "flex relative pb-12"}
       [:div {:class "h-full w-10 absolute inset-0 flex items-center justify-center"}
        [:div {:class "h-full w-1 bg-gray-200 pointer-events-none"}]]
       [:div {:class "flex-shrink-0 w-10 h-10 rounded-full bg-green-500 inline-flex items-center justify-center text-white relative z-10"}
        [:svg {:fill "none", :stroke "currentColor", :stroke-linecap "round", :stroke-linejoin "round",
               :stroke-width "2", :class "w-5 h-5", :viewbox "0 0 24 24"}
         [:path {:d "M20 21v-2a4 4 0 00-4-4H8a4 4 0 00-4 4v2"}]
         [:circle {:cx "12", :cy "7", :r "4"}]]]

      [:div {:class "flex-grow pl-4"}
       [:h2 {:class "font-medium title-font text-sm text-gray-900 mb-1 tracking-wider"} "July 2022"]
       [:p {:class "leading-relaxed"} "Presentation of pilot model results at ECPR general conference 2022"]]]

      [:div {:class "flex relative pb-12"}
       [:div {:class "h-full w-10 absolute inset-0 flex items-center justify-center"}
        [:div {:class "h-full w-1 bg-gray-200 pointer-events-none"}]]
       [:div {:class "flex-shrink-0 w-10 h-10 rounded-full bg-green-500 inline-flex items-center justify-center text-white relative z-10"}
        [:svg {:fill "none", :stroke "currentColor", :stroke-linecap "round", :stroke-linejoin "round", :stroke-width "2", :class "w-5 h-5", :viewbox "0 0 24 24"}
         [:circle {:cx "12", :cy "5", :r "3"}]
         [:path {:d "M12 22V8M5 12H2a10 10 0 0020 0h-3"}]]]
       [:div {:class "flex-grow pl-4"}
        [:h2 {:class "font-medium title-font text-sm text-gray-900 mb-1 tracking-wider"} ""]
        [:p {:class "leading-relaxed"} "Broadening of classification for larger set of SDG implementation issues"]]]

      [:div {:class "flex relative pb-12"}
       [:div {:class "h-full w-10 absolute inset-0 flex items-center justify-center"}
        [:div {:class "h-full w-1 bg-gray-200 pointer-events-none"}]]
       [:div {:class "flex-shrink-0 w-10 h-10 rounded-full bg-green-500 inline-flex items-center justify-center text-white relative z-10"}
        [:svg {:fill "none", :stroke "currentColor", :stroke-linecap "round", :stroke-linejoin "round", :stroke-width "2", :class "w-5 h-5", :viewbox "0 0 24 24"}
         [:circle {:cx "12", :cy "5", :r "3"}]
         [:path {:d "M12 22V8M5 12H2a10 10 0 0020 0h-3"}]]]
       [:div {:class "flex-grow pl-4"}
        [:h2 {:class "font-medium title-font text-sm text-gray-900 mb-1 tracking-wider"} ""]
        [:p {:class "leading-relaxed"} "Discourse mapping"]]]

      [:div {:class "flex relative"}
       [:div {:class "flex-shrink-0 w-10 h-10 rounded-full bg-green-500 inline-flex items-center justify-center text-white relative z-10"}
        [:svg {:fill "none", :stroke "currentColor", :stroke-linecap "round", :stroke-linejoin "round", :stroke-width "2", :class "w-5 h-5", :viewbox "0 0 24 24"}
         [:path {:d "M22 11.08V12a10 10 0 11-5.93-9.14"}]
         [:path {:d "M22 4L12 14.01l-3-3"}]]]
       [:div {:class "flex-grow pl-4"}
        [:h2 {:class "font-medium title-font text-sm text-gray-900 mb-1 tracking-wider"} "Beginning of 2025"]
        [:p {:class "leading-relaxed"} "End of project: Working live mapping."]]]]

     [:img {:class "lg:w-3/5 md:w-1/2 object-cover object-center rounded-lg md:mt-0 mt-12", :src "img/prototype.png", :alt "step"}]]]])

(defn home []
  [:div.bg-white.pt-10
   [:div.flex.items-start.justify-around
    [content
     {:description "We use tools and new data sources arising from
     digitalization to build a continuously updated and comprehensive
     monitoring of actor activity."
      :title "Mapping actor networks"
      :icon-url "img/networking.png"
      :on-click (fn [] (swap! app-state assoc :view "Mapping actor networks"))
      :scale-down? true}]
    [content
     {:description "We use gamification to study SDG
     interactions contextualized in Zürich."
      :title "Studying SDG interactions"
      :icon-url "img/sustainable.png"
      :scale-down? true
      :on-click (fn [] (swap! app-state assoc :view "Studying SDG interactions"))}]
    [content {:description "We co-design targeted network interventions with
     stakeholders to close governance gaps in real-world experiment."
              :title "Closing governance gaps"
              :icon-url "img/circle.png"
              :scale-down? true
              :on-click (fn [] (swap! app-state assoc :view "Closing governance gaps"))}]]])

(defn body []
  (let [v (:view @app-state)]
    (cond
      (= v "Home") [home]
      (= v "Team") [team]
      (= v "News") [news]
      :else [home])))



(defn app []
  (let [v (:view @app-state)]
    [:<>
     (cond
       (#{"Home" "Team" "News"} v)
       [:div.gradient.overflow-x-hidden
        [navbar]
        [title]
        [below-hero]
        [body]]

       (#{"Mapping actor networks"} v)
       [:div.gradient.overflow-x-hidden
        [navbar]
        [below-hero]
        [wp-1]
        [task]]

       (#{"Studying SDG interactions"} v)
       [:div.gradient.overflow-x-hidden
        [navbar]
        [below-hero]
        [wp-2]]

       (#{"Closing governance gaps" "DE"} v)
       [:div.gradient.overflow-x-hidden
        [navbar]
        [below-hero]
        [wp-3]])]))
