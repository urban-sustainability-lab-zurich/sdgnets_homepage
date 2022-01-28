(ns app.views
  (:require [reagent.core :refer [atom]]))

;; state
(defonce app-state (atom {:count 0
                          :view "Home"}))

;; events
(defn decrement
  [event]
  (.preventDefault event)
  (swap! app-state update-in [:count] dec))

(defn increment
  [event]
  (.preventDefault event)
  (swap! app-state update-in [:count] inc))

(defn button [{:keys [title on-click]}]
  [:button
   {:class "mx-5 hover:underline bg-white text-gray-800 font-bold rounded-full my-1 py-1 px-6 shadow-lg focus:outline-none focus:shadow-outline transform transition hover:scale-105 duration-300 ease-in-out"
    :on-click (or on-click (constantly 0))}
   [:h {:class "text-gray-800 mb-8"} title]])

(defn nav-button [{:keys [title]}]
  [button {:title title
           :on-click (fn [] (swap! app-state assoc :view title))}])

;; (assoc @app-state :view title) --> replace app-sate by the result of the function  call

;; (swap! atom f) --> (reset! atom (f @atom))
;; (deref atom) @atom

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



(defn below-hero []
  [:div {:class "relative -mt-12 lg:-mt-20"}
   #_[:svg {:class "wave-top w-screen", :viewbox "0 0 1439 147"}
      [:g {:stroke "none", :stroke-width "1", :fill "none", :fill-rule "evenodd"}
       [:g {:transform "translate(-1.000000, -14.000000)", :fill-rule "nonzero"}
        [:g {:class "wave", :fill "#f8AFC"}
         [:path {:d "M1440,84 C1383.555,64.3 1342.555,51.3 1317,45 C1259.5,30.824 1206.707,25.526 1169,22 C1129.711,18.326 1044.426,18.475 980,22 C954.25,23.409 922.25,26.742 884,32 C845.122,37.787 818.455,42.121 804,45 C776.833,50.41 728.136,61.77 713,65 C660.023,76.309 621.544,87.729 584,94 C517.525,105.104 484.525,106.438 429,108 C379.49,106.484 342.823,104.484 319,102 C278.571,97.783 231.737,88.736 205,84 C154.629,75.076 86.296,57.743 0,32 L0,0 L1440,0 L1440,84 Z"}]]
        [:g {:transform "translate(1.000000, 15.000000)", :fill "#FFFFFF"}
         [:g {:transform "translate(719.500000, 68.500000) rotate(-180.000000) translate(-719.500000, -68.500000) "}
          [:path {:d "M0,0 C90.7283404,0.927527913 147.912752,27.187927 291.910178,59.9119003 C387.908462,81.7278826 543.605069,89.334785 759,82.7326078 C469.336065,156.254352 216.336065,153.6679 0,74.9732496", :opacity "0.100000001"}]
          [:path {:d "M100,104.708498 C277.413333,72.2345949 426.147877,52.5246657 546.203633,45.5787101 C666.259389,38.6327546 810.524845,41.7979068 979,55.0741668 C931.069965,56.122511 810.303266,74.8455141 616.699903,111.243176 C423.096539,147.640838 250.863238,145.462612 100,104.708498 Z", :opacity "0.100000001"}]
          [:path {:d "M1046,51.6521276 C1130.83045,29.328812 1279.08318,17.607883 1439,40.1656806 L1439,120 C1271.17211,77.9435312 1140.17211,55.1609071 1046,51.6521276 Z", :opacity "0.200000003"}]]]]]]
   [:svg {:class "w-screen" :width 2560 :height "13rem":viewbox "0 0 1428 174", :version "1.1", :xmlns "http://www.w3.org/2000/svg", :xmlns:xlink "http://www.w3.org/1999/xlink"}
    [:g {:stroke "none", :stroke-width "1", :fill "none", :fill-rule "evenodd"}
     [:g {:transform "translate(0.000000, 70.000000)", :fill "#FFFFFF", :fill-rule "nonzero"}
      [:path {:d "M0,0 C90.7283404,0.927527913 147.912752,27.187927 291.910178,59.9119003 C387.908462,81.7278826 543.605069,89.334785 759,82.7326078 C469.336065,156.254352 216.336065,153.6679 0,74.9732496", :opacity "0.100000001"}]
      [:path {:d "M100,104.708498 C277.413333,72.2345949 426.147877,52.5246657 546.203633,45.5787101 C666.259389,38.6327546 810.524845,41.7979068 979,55.0741668 C931.069965,56.122511 810.303266,74.8455141 616.699903,111.243176 C423.096539,147.640838 250.863238,145.462612 100,104.708498 Z", :opacity "0.100000001"}]
      [:path {:d "M1046,51.6521276 C1130.83045,29.328812 1279.08318,17.607883 1439,40.1656806 L1439,120 C1271.17211,77.9435312 1140.17211,55.1609071 1046,51.6521276 Z", :id "Path-4", :opacity "0.200000003"}]]
     [:g {:transform "translate(0.000000, 105.000000)", :fill "#FFFFFF", :fill-rule "nonzero"}
      [:path {:d "M0.457,34.035 C57.086,53.198 98.208,65.809 123.822,71.865 C181.454,85.495 234.295,90.29 272.033,93.459 C311.355,96.759 396.635,95.801 461.025,91.663 C486.76,90.01 518.727,86.372 556.926,80.752 C595.747,74.596 622.372,70.008 636.799,66.991 C663.913,61.324 712.501,49.503 727.605,46.128 C780.47,34.317 818.839,22.532 856.324,15.904 C922.689,4.169 955.676,2.522 1011.185,0.432 C1060.705,1.477 1097.39,3.129 1121.236,5.387 C1161.703,9.219 1208.621,17.821 1235.4,22.304 C1285.855,30.748 1354.351,47.432 1440.886,72.354 L1441.191,104.352 L1.121,104.031 L0.457,34.035 Z"}]]]]])

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

(defn work-package [{:keys [title description-wp description-timeline icon-url]}]
  [:div.w-full
   [:img {:class "mx-auto w-1/2 sm:w-1/2 md:w-1/4 z-20", :src icon-url}]
   [:h3 {:class "text-center text-3xl text-gray-800 font-bold leading-none my-3"} title]
   [:p {:class "w-full p-6 text-justify"} description-wp]
   [:h2 {:class "text-3xl text-gray-500 px-6"} "Timeline"]
   [:p {:class "w-full p-6"} description-timeline]])

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


(defn wp-1 []
  [:section.bg-white.p-20
   [:div.w-full
    [work-package
     {:description-wp "Implementing the SDGs in cities is a
complex governance challenge, touching on issues ranging from gender equality
over biodiversity to climate protection. This means that implementing the SDGs
requires cross-scale governance involving solutions in many policy areas and
all societal sectors. Actor networks play a key role for successful cross-scale
governance in complex sustainability governance settings (Henry and Vollan
2014; Ingold et al. 2018). These networks, also called governance networks,
consist of organizations from all societal sectors, including civil society,
the private sector, government and scientific institutions (Rhodes 1996). In
urban contexts, the need to consider actor networks is especially pronounced
given the extraordinary diversity and density of actors encountered in urban
governance arenas (Kaufmann and Sidney 2020).  Digitalization has impacted and
continues to impact urban governance networks. Urban governance is already
characterized by high levels of complexity, which is further exacerbated as
cities become “smarter” and rely on ever more interdependent, complex digital
infrastructure (Balogun et al. 2020). Complexity and an uneven access to tools
and distribution of resources can deepen inequality (Bramwell 2020), putting a
premium on diversity in urban governance networks.  In P1, we tackle the
complexity of urban actor networks head-on. We build a continuously updating
tool to map actor networks involved in urban sustainability transformations in
Zurich. We focus on three leading empirical questions in P1.RQ1.1: Which actors
impact which SDGs in Zurich? Who participates in which projects?  RQ1.2: Which
actors are central in SDG implementation? Which are peripheral?  RQ1.3: What
positions do actors take in discourses around SDG implementation?  We use tools
and new data sources arising from digitalization to build a continuously
updated and comprehensive monitoring of actor activity. Automated text analysis
of government documents, open government data, traditional and social media,
combined with hyperlink networks, allows us to create a comprehensive mapping
of actors involved in different areas of urban sustainability
transformations. This approach to study governance actor networks is based on a
rapidly advancing research frontier, using the 2 possibilities of data sources
and tools arising from digitalization (Yi and Scholz 2015; Angst 2019; Scott et
al. 2020; Leifeld 2020).  Our models will categorize actor activity based on a
conceptualization I have developed and successfully applied to structure
complex governance systems (Angst 2020), to create a bipartite actor-activity
network. We use hyperlink networks and joint venue participation to establish
inter-actor links (Yi and Scholz 2015) (RQ1.2) and use discourse network
analysis (Leifeld 2020) to analyze discourse patterns (RQ1.3). In gradually
building our models, we start with a limited set of core SDG implementation
areas3 and regularly exchange with experts on automated text analysis of policy
data at the Department of Political Science at UZH, as we broaden our coverage.
To continuously fine-tune our models with regard to ground truth, we regularly
validate our results through expert interviews with representatives of actors
we sample from our results and exchange with urban governance researchers at
ZHAW and UZH, such as the ZHAW Institutes of Urban Landscape and Sustainable
Development. We further acquire third-party funding to build a public-facing
platform for actors to locate themselves, based on a science-society outreach
funding scheme4 . The platform allows all actors involved in SDG implementation
in Zurich to find other actors working on similar issues, even if they do not
have extensive resources or are new to the field. Doing so, we build a service
for actors working on SDG implementation in Zurich, transdisciplinary research
is uniquely suited to provide. Both our trained network mapping models and
public-facing infrastructure will be completely open source and
accessible. This opens up the possibility for others to have a starting point
in order to apply our approach in different cities, ensuring scalability of the
project."
      :description-timeline "We plan to achieve the main outputs of this
work-package until early 2023, namely an Activity mapping (1.1), Hyperlink
networks (1.2), and Discourse networks (1.3). Until Mid 2023, we mihgt
implement a public platform showcasting these results."
      :title "Mapping actor networks"
      :icon-url "img/networking.png"}]]])

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
    [content {:description "Mario (SDGnets' PI) has settled at the Digital Society Initiative (DSI)!" :title "August 2021" :icon-url "img/einstein-office.jfif"}]]

   ])


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

#_(defn team []
    [:<>
     [:div "Team View"]])

(defn code-example []
  (let [m {:a 3 :b 3}]
    [:pre
     (str m)
     [:br]
     (str (assoc m :c 3 :d 5))
     [:br]
     (str m)
     [:br]
     (str (dissoc m :a))
     [:br]
     (str (assoc m :view "epfl"))
     [:br]
     (str (assoc (dissoc m :a) :view "epfl"))
     [:br]
     (str (-> m
              (dissoc :a)
              (assoc :view "epfl")))]))

(defn body []
  (let [v (:view @app-state)]
    (cond
      (= v "Home") [home]
      (= v "Team") [team]
      (= v "News") [news]
      :else [home])))

(defn navbar []
  [:div {:class "flex justify-between my-8 w-full px-4 z-50"} ;; alternative :div.flex :div#id <=> :div {:id "id"}
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
