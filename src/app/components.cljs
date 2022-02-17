(ns app.components)

;; reusable functionn
(defn button [{:keys [title on-click]}]
  [:button
   {:class "mx-5 hover:underline bg-white text-gray-800 font-bold rounded-full my-1 py-1 px-6 shadow-lg focus:outline-none focus:shadow-outline transform transition hover:scale-105 duration-300 ease-in-out"
    :on-click (or on-click (constantly 0))}
   [:h {:class "text-gray-800 mb-8"} title]])

(defn title
  []
  [:div {:class "container pt-10 px-3 mx-auto flex flex-wrap flex-col md:flex-row items-strech gap-5"}
   [:div {:class "flex flex-col w-full md:w-2/5 justify-center items-start text-center md:text-left"}
    [:p {:class "uppercase tracking-loose w-full"} "Digitalization and urban sustainability transformations in Zurich"]
    [:h1 {:class "my-4 text-5xl font-bold leading-tight"} "SDGnets@ZH"]
    [:p {:class "leading-normal text-2xl mb-8"} "Supporting actor networks in Zurich on the road to 2030"]
    #_[:div {:class "flex gap-5 justify-start w-full"} ;; alternative :div.flex :div#id <=> :div {:id "id"}
       [nav-button {:title "Home"}]
       [nav-button {:title "Team"}]
       [nav-button {:title "News"}]]]
   [:div {:class "w-full md:w-2/5 py-6 text-center md:-my-6"}
    [:img {:class "w-full z-50", :src "img/SDGNets_logo.png"}]]
   #_[:div {:class "flex min-h-full items-start -px-10 -mx-5"}
      [nav-button {:title "DE"}]]])

(defn work-package [{:keys [title description-wp description-timeline icon-url]}]
  [:div.w-full.flex.justify-around
   [:div.max-w-7xl
    [:img {:class "mx-auto w-1/2 sm:w-1/2 md:w-1/4 z-20", :src icon-url}]
    [:h3 {:class "text-center text-3xl text-gray-800 font-bold leading-none my-3"} title]
    [:p {:class "w-full p-6 text-justify md:columns-2 lg:columns-3 lg:gap-10"} description-wp]
    [:h2 {:class "text-3xl text-gray-500 px-6"} "Timeline"]
    [:p {:class "w-full p-6"} description-timeline]]])

(defn below-hero []
  [:div {:class "relative -mt-12 lg:-mt-20"}
   [:svg {:class "w-screen" :width 2560 :height "13rem":viewbox "0 0 1428 174", :version "1.1", :xmlns "http://www.w3.org/2000/svg", :xmlns:xlink "http://www.w3.org/1999/xlink"}
    [:g {:stroke "none", :stroke-width "1", :fill "none", :fill-rule "evenodd"}
     [:g {:transform "translate(0.000000, 70.000000)", :fill "#FFFFFF", :fill-rule "nonzero"}
      [:path {:d "M0,0 C90.7283404,0.927527913 147.912752,27.187927 291.910178,59.9119003 C387.908462,81.7278826 543.605069,89.334785 759,82.7326078 C469.336065,156.254352 216.336065,153.6679 0,74.9732496", :opacity "0.100000001"}]
      [:path {:d "M100,104.708498 C277.413333,72.2345949 426.147877,52.5246657 546.203633,45.5787101 C666.259389,38.6327546 810.524845,41.7979068 979,55.0741668 C931.069965,56.122511 810.303266,74.8455141 616.699903,111.243176 C423.096539,147.640838 250.863238,145.462612 100,104.708498 Z", :opacity "0.100000001"}]
      [:path {:d "M1046,51.6521276 C1130.83045,29.328812 1279.08318,17.607883 1439,40.1656806 L1439,120 C1271.17211,77.9435312 1140.17211,55.1609071 1046,51.6521276 Z", :id "Path-4", :opacity "0.200000003"}]]
     [:g {:transform "translate(0.000000, 105.000000)", :fill "#FFFFFF", :fill-rule "nonzero"}
      [:path {:d "M0.457,34.035 C57.086,53.198 98.208,65.809 123.822,71.865 C181.454,85.495 234.295,90.29 272.033,93.459 C311.355,96.759 396.635,95.801 461.025,91.663 C486.76,90.01 518.727,86.372 556.926,80.752 C595.747,74.596 622.372,70.008 636.799,66.991 C663.913,61.324 712.501,49.503 727.605,46.128 C780.47,34.317 818.839,22.532 856.324,15.904 C922.689,4.169 955.676,2.522 1011.185,0.432 C1060.705,1.477 1097.39,3.129 1121.236,5.387 C1161.703,9.219 1208.621,17.821 1235.4,22.304 C1285.855,30.748 1354.351,47.432 1440.886,72.354 L1441.191,104.352 L1.121,104.031 L0.457,34.035 Z"}]]]]])
