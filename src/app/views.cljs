(ns app.views
  (:require
   [app.components :refer (button title work-package below-hero)]
   [app.state :refer (app-state)]
   [app.working-packages.mapping-actor-networks :refer (wp-1)]))

(defn nav-button [{:keys [title]}]
  [:div.z-50
   [button {:title title
            :on-click (fn [] (swap! app-state assoc :view title))}]])

(defn exs
  []
  [:div {:class "flex flex-wrap w-1/2"}
   [:div {:class "w-5/6 sm:w-1/2 p-6"}
    [:img {:class "w-full md:w-1/5 z-50", :src "img/networking.png"}]
    [:h3 {:class "text-3xl text-gray-800 font-bold leading-none mb-3"} "Actor network mapping"]
    [:p {:class "text-gray-600 mb-8"} "We use tools and new data sources arising from digitalization to build a continuously updated and comprehensive monitoring of actor activity."]]
   [:div {:class "w-full sm:w-1/2 p-6"}]])

(defn content [{:keys [description title icon-url rounded? on-click]}]
  [:div {:class ["flex" "flex-wrap" "w-1/3" "p-10"]}
   [:div
    [:div {:class ["flex" "justify-start" "w-full"]}
     [:img {:class (conj ["center" "w-1/2" "z-50" "aspect-square object-cover"]
                         (when rounded? "rounded-full")), :src icon-url}]]
    [:h3 {:on-click (or on-click identity)
          :class (conj ["text-3xl text-gray-800 font-bold leading-none my-3"]
                       (when on-click "cursor-pointer hover:underline"))
          }
     title]
    [:p {:class "text-gray-600 mb-8"} description]]])

(def button-classes "mx-6 lg:mx-0 hover:underline bg-white text-gray-800 font-bold rounded-full my-6 py-4 px-8 shadow-lg focus:outline-none focus:shadow-outline transform transition hover:scale-105 duration-300 ease-in-out")

(defn tasks
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
        [:h2 {:class "font-medium title-font text-sm text-gray-900 mb-1 tracking-wider"} "STEP 1 (October 2021)"]
        [:span [:p {:class "leading-relaxed"}
                "The first prototype of a living network mapping actors in Zurich and
       \"their\" SDG targets is completed! You can have a look "
                [:a {:class "hover:underline" :target "_blank" :href "https://marioangst.shinyapps.io/prototype_app/"}
                 "here."]]]]]
      [:div {:class "flex relative pb-12"}
       [:div {:class "h-full w-10 absolute inset-0 flex items-center justify-center"}
        [:div {:class "h-full w-1 bg-gray-200 pointer-events-none"}]]
       [:div {:class "flex-shrink-0 w-10 h-10 rounded-full bg-green-500 inline-flex items-center justify-center text-white relative z-10"}
        [:svg {:fill "none", :stroke "currentColor", :stroke-linecap "round", :stroke-linejoin "round", :stroke-width "2", :class "w-5 h-5", :viewbox "0 0 24 24"}
         [:path {:d "M22 12h-4l-3 9L9 3l-3 9H2"}]]]
       [:div {:class "flex-grow pl-4"}
        [:h2 {:class "font-medium title-font text-sm text-gray-900 mb-1 tracking-wider"} "STEP 2"]
        [:p {:class "leading-relaxed"} "Lorem ipsum"]]]
      [:div {:class "flex relative pb-12"}
       [:div {:class "h-full w-10 absolute inset-0 flex items-center justify-center"}
        [:div {:class "h-full w-1 bg-gray-200 pointer-events-none"}]]
       [:div {:class "flex-shrink-0 w-10 h-10 rounded-full bg-green-500 inline-flex items-center justify-center text-white relative z-10"}
        [:svg {:fill "none", :stroke "currentColor", :stroke-linecap "round", :stroke-linejoin "round", :stroke-width "2", :class "w-5 h-5", :viewbox "0 0 24 24"}
         [:circle {:cx "12", :cy "5", :r "3"}]
         [:path {:d "M12 22V8M5 12H2a10 10 0 0020 0h-3"}]]]
       [:div {:class "flex-grow pl-4"}
        [:h2 {:class "font-medium title-font text-sm text-gray-900 mb-1 tracking-wider"} "STEP 3"]
        [:p {:class "leading-relaxed"} "Lorem ipsum"]]]
      [:div {:class "flex relative pb-12"}
       [:div {:class "h-full w-10 absolute inset-0 flex items-center justify-center"}
        [:div {:class "h-full w-1 bg-gray-200 pointer-events-none"}]]
       [:div {:class "flex-shrink-0 w-10 h-10 rounded-full bg-green-500 inline-flex items-center justify-center text-white relative z-10"}
        [:svg {:fill "none", :stroke "currentColor", :stroke-linecap "round", :stroke-linejoin "round", :stroke-width "2", :class "w-5 h-5", :viewbox "0 0 24 24"}
         [:path {:d "M20 21v-2a4 4 0 00-4-4H8a4 4 0 00-4 4v2"}]
         [:circle {:cx "12", :cy "7", :r "4"}]]]
       [:div {:class "flex-grow pl-4"}
        [:h2 {:class "font-medium title-font text-sm text-gray-900 mb-1 tracking-wider"} "STEP 4"]
        [:p {:class "leading-relaxed"} "Lorem ipsum"]]]
      [:div {:class "flex relative"}
       [:div {:class "flex-shrink-0 w-10 h-10 rounded-full bg-green-500 inline-flex items-center justify-center text-white relative z-10"}
        [:svg {:fill "none", :stroke "currentColor", :stroke-linecap "round", :stroke-linejoin "round", :stroke-width "2", :class "w-5 h-5", :viewbox "0 0 24 24"}
         [:path {:d "M22 11.08V12a10 10 0 11-5.93-9.14"}]
         [:path {:d "M22 4L12 14.01l-3-3"}]]]
       [:div {:class "flex-grow pl-4"}
        [:h2 {:class "font-medium title-font text-sm text-gray-900 mb-1 tracking-wider"} "FINISH"]
        [:p {:class "leading-relaxed"} "Lorem ipsum"]]]]
     [:img {:class "lg:w-3/5 md:w-1/2 object-cover object-center rounded-lg md:mt-0 mt-12", :src "img/prototype.png", :alt "step"}]]]])

(defn wp-2 []
  [:section.bg-white.p-20
   [:div.w-full
    [work-package
     {:description-wp "Complementary to mapping actor networks in P1, in P2, we
     work on charting the other side of complexity in urban sustainability
     transformations: the fundamental interconnectedness of SDG implementation
     challenges.  SDGs interact with each other in obvious and non-obvious
     ways (Bennich et al. 2020). SDG interactions can be synergistic or
     conflicting, meaning that goal achievement in one SDG (or target) can both
     positively or negatively affect goal achievement in another SDG (or
     target) (Pham-Truffert et al. 2020).  We use gamification to study mental
     models of SDG interactions held by actors in Zürich, in collaboration with
     the ZHdK Gamelab. We explore the ways in which gamification and serious
     games can help actors understand their own mental models about dynamics in
     urban sustainability transformations, as well as the ways in which it can
     help them understand mental models of others. We organize research in this
     sub-project around two guiding questions: RQ2.1: How can gamification and
     serious games contribute to the study of localized SDG interactions?
     RQ2.2: How can gamification and serious games contribute to social
     learning about dynamics in urban sustainability transformations between
     actors?  To answer these questions, we build on and contribute to a lively
     literature on mental models and participatory modeling in sustainability
     research and complex systems in general (Moon et al. 2019). Mental model
     research and participatory modeling is a prime target for gamification and
     serious games (Bakhanova et al. 2020).  For RQ2.1, we gather information
     about perceived interactions among a fixed number of elements of urban
     sustainability transformations (mainly SDG targets, see figure 1b) (Van
     Den Broek 2018). We expose a sample of representatives of organisational
     actors identified in P1 to an interactive, digital representation of
     Zurich. As common in mental model research, actors are then prompted to
     specify their perceptions of how different elements of urban
     sustainability interact. For example, do they think increases in the
     quality of green spaces would lead to visitor pressure in a neighborhood?
     Where do they think reduced car traffic would impact businesses most?
     Where would an increase in tools for citizen participation yield most
     engagement?  At the most basic level, gamification makes it possible for
     actors to get direct feedback about the effect of their model parameter
     choices. More interestingly, gamification opens up unique possibilities to
     expose actors to effects of competing mental models or explorations of
     development scenarios, which we explore with the ZHdK Gamelab. As a data
     gathering approach, this procedure also yields the data to construct a
     crowd-sourced and localized meta-model of SDG interactions in Zurich,
     based on the combined mental models of participating actors.  To answer
     RQ2.2 we explore the transdisciplinary potential of gamification and
     serious games to promote social learning and shared understandings (or
     acceptance for difference) of dynamics in urban sustainability
     transformations. We examine how mental models among actor groups
     differ (for example between powerful and marginal actors). In areas of
     contestation, we collaborate with the ZHdK Gamelab to promote social
     learning and resolve potential conflicts among actors in digital serious
     games (Haug et al. 2011)."
      :description-timeline "We plan to achieve the main outputs of this
work-package until early 2024, namely relating to the Participatory
Modeling (2.1) and Social learning (2.2)."
      :title "Studying SDG interactions"
      :icon-url "img/sustainable.png"}]]])

(defn wp-3 []
  [:section.bg-white.p-20
   [:div.w-full
    [work-package
     {:description-wp "In P3 we integrate the knowledge gained in the
previous two sub-projects P1 and P2 to test ways to strengthen actor
networks. We co-design targeted network interventions with stakeholders to
close governance gaps in a real-world experiment. Governance gaps describe a
lack of coordination among actors working on interrelated problems. Combining
the crowd-sourced model of SDG interactions from P2 with the actor network
mapping gained in P1 enables us to identify governance gaps, using multi-level
network models.  While more nuanced in practice, the central hypothesis and
motivation behind multi-level governance network research (Bodin et al. 2019)
can be put quite simply: If two problems are related, it is likely beneficial
if actors working on these problems coordinated their actions. If actors work
on interrelated problems (such as specific SDGs) but are not coordinating their
actions, there is a governance gap or misfit in the network, detrimental to
successful outcomes (Ekstrom and Young 2009). We organize our research in P3
around two questions: RQ3.1: What are major governance gaps in SDG
implementation in Zurich?  RQ3.2: Can targeted network interventions contribute
to improving SDG implementation processes? Multi-level network modeling
connecting actors and localized SDG interactions to diagnose gaps in urban SDG
implementation (see figure 1c) is a straightforward conceptual extension to
existing research. However, multi-level network modeling has never before been
applied to study SDG implementation, as Bennich et al.
(2020, p. 11) find in the most recent comprehensive review of the SDG
interactions literature. One of the reasons for the research gap outlined in
the quote above likely lies in the complexity of sustainability governance
settings. Our project is able to close this gap by exploiting the possibilities
arising with digitalization in P1 and P2. To identify and classify governance
gaps (RQ3.1), we rely on the R package motifr (Angst and Seppelt 2020),
dedicated to multi-level motif analysis. Optionally, we integrate its
procedures to diagnose governance gaps into the live network mapping
established in P1 to provide further value to this public-facing outreach part
of the project (subject to successful third-party funding acquisition).  For
RQ3.2, we co-design network interventions with actors in art-led participatory
processes, in collaboration with the ZHdK MA Transdisciplinary Studies. These
interventions bring together actors involved in governance gaps to promote
social learning or spark new projects. To assess the potential of such network
modeling based, relatively high-effort interventions, we compare their outcomes
with a matched control group where actors receive low-effort digital prompts
about potential network partners over a period of time."
      :description-timeline "We plan to do the Gap Diagnosis (3.1) and the
      Interventions (3.2) from 2024 onward, with two main outputs to close the
      project, namely Outreach Reports and Scientific Papers"
      :title "Closing governance gaps"
      :icon-url "img/circle.png"}]]])



(defn home-de []
  [:div.bg-white.pt-10
   [:div.flex.items-start.justify-around
    [content {:description "Wir nutzen Tools und neue Datenquellen, die sich aus der Digitalisierung ergeben, um ein laufend aktualisiertes und umfassendes Monitoring der Aktivitäten der Akteure aufzubauen." :title "Abbildung von Akteursnetzwerken" :icon-url "img/networking.png"}]
    [content {:description "Text DE" :title "Untersuchung der SDG-Wechselwirkungen" :icon-url "img/sustainable.png"}]
    [content {:description "Text DE" :title "Lücken in der Governance" :icon-url "img/circle.png"}]]])


(defn team []
  [:div.bg-white.pt-10
   [:div.flex.items-start.justify-around
    [content {:description "PI of the project. Political scientist bla networks"
              :title "Dr. Mario Angst"
              :icon-url "img/mario.jpg"
              :rounded? true}]
    [content {:description "PhD student in Geography blabla"
              :title "Myriam Pham-Truffert"
              :icon-url "img/myriam.jpg"
              :rounded? true}]
    [content {:description "We will advertise for a Research Assistant at some point... :-)"
              :title "Young Padawan"
              :rounded? true
              :icon-url "img/yoda.jpg"}]]])

(defn news []
  [:div.bg-white.pt-10
   [:div.flex.items-start.justify-around
    [content {:description "Launch of DSI Community Sustainability!" :title "February 2022" :icon-url "img/pikachu.png"}]
    [content {:description "Confirmed home office but we are till on it - only virtually!" :title "January 2021" :icon-url "img/pikachu.png"}]
    [content {:description "Some news" :title "Date" :icon-url "img/pikachu.png"}]
    [content {:description "Some news" :title "Date" :icon-url "img/pikachu.png"}]]
   [:div.flex.items-start.justify-around
    [content {:description "Do you like SDGnets' logo?" :title "November 2021" :icon-url "img/SDGnets_logo.png"}]
    [content {:description "Some news" :title "October 2021" :icon-url "img/pikachu.png"}]
    [content {:description "Myriam (SDGnets' PhD) has found a home research group in the Earth System Science (ESS) group!" :title "September 2021" :icon-url "img/dsi-office.jfif"}]
    [content {:description "Mario (SDGnets' PI) has settled at the Digital Society Initiative (DSI)!" :title "August 2021" :icon-url "img/einstein-office.jfif"}]]])

(defn home []
  [:div.bg-white.pt-10
   [:div.flex.items-start.justify-around
    [content
     {:description "We use tools and new data sources arising from
     digitalization to build a continuously updated and comprehensive
     monitoring of actor activity."
      :title "Mapping actor networks"
      :icon-url "img/networking.png"
      :on-click (fn [] (swap! app-state assoc :view "Mapping actor networks"))}]
    [content
     {:description "We use gamification to study mental models of SDG
     interactions held by actors in Zürich."
      :title "Studying SDG interactions"
      :icon-url "img/sustainable.png"
      :on-click (fn [] (swap! app-state assoc :view "Studying SDG interactions"))}]
    [content {:description "We co-design targeted network interventions with
     stakeholders to close governance gaps in real-world experiment."
              :title "Closing governance gaps"
              :icon-url "img/circle.png"
              :on-click (fn [] (swap! app-state assoc :view "Closing governance gaps"))}]]])

(defn body []
  (let [v (:view @app-state)]
    (cond
      (= v "Home") [home]
      (= v "Team") [team]
      (= v "News") [news]
      :else [home])))

(defn navbar []
  [:div {:class "flex justify-between my-8 w-full px-4 z-50 mb-4"} ;; alternative :div.flex :div#id <=> :div {:id "id"}
   [:div {:class "flex"}
    [nav-button {:title "Home"}]
    [nav-button {:title "Team"}]
    [nav-button {:title "News"}]]
   [:div {:class "justify-self-end"}
    [nav-button {:title "DE"}]]])

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
        [tasks]]

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
