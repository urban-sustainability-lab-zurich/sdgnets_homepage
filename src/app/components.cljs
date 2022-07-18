(ns app.components)

;; reusable functionn
(defn button [{:keys [title on-click]}]
  [:button
   {:class "mx-5 hover:underline bg-white text-gray-800 font-bold rounded-full my-1 py-1 px-6 shadow-lg focus:outline-none focus:shadow-outline transform transition hover:scale-105 duration-300 ease-in-out"
    :on-click (or on-click (constantly 0))}
   [:h {:class "text-gray-800 mb-8"} title]])

(defn title
  []
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> main
  [:div {:class "container pt-10 px-3 mx-auto flex flex-wrap flex-col md:flex-row items-strech gap-5"}
   [:div {:class "flex flex-col w-full md:w-2/5 justify-center items-start text-center md:text-left"}
    [:p {:class "uppercase tracking-loose w-full"} "Digitalization and urban sustainability transformations in Zurich"]
    [:h1 {:class "my-4 text-5xl font-bold leading-tight"} "SDGnets@ZH"]
    [:p {:class "leading-normal text-2xl mb-8"} "Supporting actor networks in Zurich on the road to 2030"]]
   [:div {:class "w-full md:w-2/5 lg:w-80 py-6 text-center md:-my-6"}
    [:img {:class "w-full z-50", :src "img/SDGNets_logo.png"}]]])

(defn below-title []
  [:img {:class "w-full z-50", :src "img/wave.png"}])

(defn below-hero []
  [:div {:class "relative -mt-12 lg:-mt-20"}
   [:svg {:class "w-screen" :width 2560 :height "15rem" :viewbox "0 0 2560 209", :version "1.1", :xmlns "http://www.w3.org/2000/svg", :xmlns:xlink "http://www.w3.org/1999/xlink"}
    [:g {:stroke "none", :stroke-width "1", :fill "none", :fill-rule "evenodd"}
     [:rect {:width "1448" :height "40" :x "0" :y "200" :fill "#FFFFFF" :rx 15}]
     [:g {:transform "translate(0.000000, 70.000000)", :fill "#FFFFFF", :fill-rule "nonzero"}
      [:path {:d "M0,0 C90.7283404,0.927527913 147.912752,27.187927 291.910178,59.9119003 C387.908462,81.7278826 543.605069,89.334785 759,82.7326078 C469.336065,156.254352 216.336065,153.6679 0,74.9732496", :opacity "0.100000001"}]
      [:path {:d "M100,104.708498 C277.413333,72.2345949 426.147877,52.5246657 546.203633,45.5787101 C666.259389,38.6327546 810.524845,41.7979068 979,55.0741668 C931.069965,56.122511 810.303266,74.8455141 616.699903,111.243176 C423.096539,147.640838 250.863238,145.462612 100,104.708498 Z", :opacity "0.10000000"}]
      [:path {:d "M1046,51.6521276 C1130.83045,29.328812 1279.08318,17.607883 1439,40.1656806 L1439,120 C1271.17211,77.9435312 1140.17211,55.1609071 1046,51.6521276 Z", :id "Path-4", :opacity "0.200000003"}]]
     [:g {:transform "translate(0.000000, 105.000000)", :fill "#FFFFFF", :fill-rule "nonzero"}
      [:path {:d "M0.457,34.035 C57.086,53.198 98.208,65.809 123.822,71.865 C181.454,85.495 234.295,90.29 272.033,93.459 C311.355,96.759 396.635,95.801 461.025,91.663 C486.76,90.01 518.727,86.372 556.926,80.752 C595.747,74.596 622.372,70.008 636.799,66.991 C663.913,61.324 712.501,49.503 727.605,46.128 C780.47,34.317 818.839,22.532 856.324,15.904 C922.689,4.169 955.676,2.522 1011.185,0.432 C1060.705,1.477 1097.39,3.129 1121.236,5.387 C1161.703,9.219 1208.621,17.821 1235.4,22.304 C1285.855,30.748 1354.351,47.432 1440.886,72.354 L1441.191,104.352 L1.121,104.031 L0.457,34.035 Z"}]]]
    [:g {:stroke "none", :stroke-width "1", :fill "none", :fill-rule "evenodd"}
     [:g {:transform "translate(1439, 108)", :fill "#FFFFFF", :fill-rule "nonzero"}
      [:g {:transform "translate(0, 10)", :fill "#FFFFFF", :fill-rule "nonzero"}
       [:path {:d "M0,-8 C90.7283404,0.927527913 147.912752,27.187927 291.910178,59.9119003 C387.908462,81.7278826 543.605069,89.334785 759,82.7326078 C469.336065,156.254352 216.336065,153.6679 0,74.9732496", :opacity "0.200000003"}]]
      [:path {:d "M100,104.708498 C277.413333,72.2345949 426.147877,52.5246657 546.203633,45.5787101 C666.259389,38.6327546 810.524845,41.7979068 979,55.0741668 C931.069965,56.122511 810.303266,74.8455141 616.699903,111.243176 C423.096539,147.640838 250.863238,145.462612 100,104.708498 Z", :opacity "0.100000001"}]
      [:path {:d "M1046,51.6521276 C1130.83045,29.328812 1279.08318,17.607883 1439,40.1656806 L1439,120 C1271.17211,77.9435312 1140.17211,55.1609071 1046,51.6521276 Z", :id "Path-4", :opacity "0.200000003"}]]
     [:g {:transform "translate(1439, 143.000000)", :fill "#FFFFFF", :fill-rule "nonzero"}
      [:path {:d "M0.457,34.035 C57.086,53.198 98.208,65.809 123.822,71.865 C181.454,85.495 234.295,90.29 272.033,93.459 C311.355,96.759 396.635,95.801 461.025,91.663 C486.76,90.01 518.727,86.372 556.926,80.752 C595.747,74.596 622.372,70.008 636.799,66.991 C663.913,61.324 712.501,49.503 727.605,46.128 C780.47,34.317 818.839,22.532 856.324,15.904 C922.689,4.169 955.676,2.522 1011.185,0.432 C1060.705,1.477 1097.39,3.129 1121.236,5.387 C1161.703,9.219 1208.621,17.821 1235.4,22.304 C1285.855,30.748 1354.351,47.432 1440.886,72.354 L1441.191,104.352 L1.121,104.031 L0.457,34.035 Z"}]]]]])

(defn work-package [{:keys [title description-wp description-timeline icon-url]}]
  [:div.w-full.flex.justify-around
   [:div.max-w-7xl
    [:img {:class "mx-auto w-1/2 sm:w-1/2 md:w-1/4 z-20", :src icon-url}]
    [:h3 {:class "text-center text-3xl text-gray-800 font-bold leading-none my-3"} title]
    [:div
     [:p {:class "w-full p-6 text-justify md:columns-2 lg:columns-3 lg:gap-10"} description-wp]
    ]
    [:h2 {:class "text-3xl text-gray-500 px-6"} "Timeline"]
    [:p {:class "w-full p-6"} description-timeline]]])


(defn content-2 [{:keys [description title icon-url rounded? on-click contain? cover? scale-down?]}]
  [:div {:class ["flex" "flex-wrap" "w-1/3" "p-10"]}
   [:div
    [:div {:class ["flex" "justify-center" "w-full"]}
     [:img {:class (conj ["center" "z-50" "aspect-square object-cover" "h-60"]
                         (when rounded? "rounded-full")
                         (when contain? "object-contain")
                         (when cover? "object-cover")
                         (when scale-down? "object-scale-down")),
            :src icon-url}]]
    [:div {:class ["flex" "justify-center" "w-full"]}
     [:h3 {:on-click (or on-click identity)
           :class (conj ["text-3xl text-gray-800 font-bold leading-none my-3"]
                        (when on-click "cursor-pointer hover:underline"))}
      title]]
    [:p {:class "text-justify text-gray-600 mb-8"} description]]])


(defn content [{:keys [description title icon-url rounded? on-click contain? cover? scale-down?]}]
  [:div {:class ["flex" "flex-wrap" "w-1/3" "p-10"]}
   [:div
    [:div {:class ["flex" "justify-center" "w-full"]}
     [:img {:on-click (or on-click identity)
            :class (conj ["center" "z-50" "aspect-square object-cover" "h-60"]
                         (when rounded? "rounded-full")
                         (when contain? "object-contain")
                         (when cover? "object-cover")
                         (when scale-down? "object-scale-down")
                         (when on-click "cursor-pointer hover:underline")),
            :src icon-url}]]
    [:div {:class ["flex" "justify-center" "w-full"]}
     [:h3 {:on-click (or on-click identity)
           :class (conj ["text-3xl text-gray-800 font-bold leading-none my-3"]
                        (when on-click "cursor-pointer hover:underline"))}
      title]]
    [:p {:class "text-justify text-gray-600 mb-8"} description]]])


(defn step-bullet []
  [:div {:class "flex relative pb-12"}
   [:div {:class "h-full w-10 absolute inset-0 flex items-center justify-center"}
    [:div {:class "h-full w-1 bg-gray-200 pointer-events-none"}]]
   [:div {:class "flex-shrink-0 w-10 h-10 rounded-full bg-green-500 inline-flex items-center justify-center text-white relative z-10"}
    [:svg {:fill "none", :stroke "currentColor", :stroke-linecap "round", :stroke-linejoin "round", :stroke-width "2", :class "w-5 h-5", :viewbox "0 0 24 24"}
     [:path {:d "M22 12h-4l-3 9L9 3l-3 9H2"}]]]
   [:div {:class "flex-grow pl-4"}
    [:h2 {:class "font-medium title-font text-sm text-gray-900 mb-1 tracking-wider"} "STEP 2"]
    [:p {:class "leading-relaxed"} "Lorem ipsum"]]])

<<<<<<< HEAD
(defn step-content []
  )
=======
(defn step-content [])
>>>>>>> main

(defn team []
[:div.bg-white.pt-10
 [:div.flex.items-start.justify-around
  [content {:description
            [:p "Dr. Mario Angst is a postdoc at
the Digital Society Initiative of the University of Zurich. His research
focuses on the interplay between digitalization and sustainability
transformations, governance networks and policy-making in the Anthropocene. He
is currently focusing on the use of machine learning and natural language
processing algorithms to map sustainability governance networks and
discourses."
             [:br]
             [:br]
             [:a {:href "https://marioangst.com/"}
              [:img {:border "0", :src "img/website.png", :alt "marioangst.com", :width "60", :height "60"}]]
             [:a {:href "https://twitter.com/mario_angst_sci"}
              [:img {:border "0", :src "img/twitter.png", :alt "mario_angst_sci", :width "60", :height "60"}]]
<<<<<<< HEAD
             [:a {:href "mailto:mario.angst@uzh.ch"}
=======
             [:a {:href "mailto:mario.angst@Uzi.ch"}
>>>>>>> main
              [:img {:border "0", :src "img/email.png", :alt "Send an email", :width "60", :height "60"}]]]
            :title "Dr. Mario Angst"
            :icon-url "img/mario.jpg"
            :rounded? true}]
  [content {:description
            [:p "Myriam Pham-Truffert is a PhD student at the
Digital Society Initiative and the Department of Geography of the University of
Zurich. Her PhD thesis is about the use of gamification and participatory
modeling to gather data on contextualized, local-level interactions between
Sustainable Development Goals (SDGs)."
             [:br]
             [:br]
             [:a {:href "https://twitter.com/myriam_pham"}
              [:img {:border "0", :src "img/twitter.png", :alt "myriam_pham", :width "60", :height "60"}]]
             [:a {:href "mailto:myriam.pham-truffert@uzh.ch"}
              [:img {:border "0", :src "img/email.png", :alt "Send an email", :width "60", :height "60"}]]]
            :title "Myriam Pham-Truffert"
            :icon-url "img/myriam.jpg"
            :rounded? true}]
  [content {:description "Viviane Walker is a research assistant at the Digital
  Society Initiative and a student in communications and computational
  linguistics at the University of Zurich."
            :title "Viviane Walker"
            :rounded? true
            :icon-url "img/yoda.jpg"}]
  [content {:description "Neitah Noemi Müller is a research assistant at the
  Digital Society Initiative and a Master's student in religion, economy and
  politics at the University of Zurich."
            :title "Neitah Noemi Müller"
            :rounded? true
            :icon-url "img/yoda.jpg"}]]])

(defn news []
<<<<<<< HEAD
=======
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
>>>>>>> main
=======
>>>>>>> main
  [:div.bg-white.pt-10
   [content {:description "Official launch of DSI Community Sustainability. We
    look forward to contributing to the DSI Communities with regards to
    sustainability and gamification!"
             :title "February 2022"
             :icon-url "img/pikachu.png"}]
   [content {:description "We are now associated with the Earth System
    Science (ESS) group in the Department of Geography, which is led by
    Prof. Maria J. Santos."
             :title "September 2021"
             :icon-url "img/pikachu.png"}]
   [content {:description "The work for SDGnets@ZH has formally started at the
   Digital Society Initiative (DSI)!"
             :title "August 2021"
             :icon-url "img/pikachu.png"}]])
