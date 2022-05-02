(ns app.working-packages.studying-sdg-interactions
  (:require [app.components :refer (work-package)]))

(defn wp-2 []
  [:section.bg-white.p-20
   [:div.w-full
    [work-package
     {:description-wp "Complementary to mapping actor networks in P1, in P2, we
     work on charting the other side of complexity in urban sustainability
     transformations: the fundamental interconnectedness of SDG implementation
     challenges.  SDGs interact with each other in obvious and non-obvious
     ways. SDG interactions can be synergistic or
     conflicting, meaning that goal achievement in one SDG (or target) can both
     positively or negatively affect goal achievement in another SDG (or
     target).  We use gamification to study mental
     models of SDG interactions held by actors in Zürich.
      SD-Game will investigate local knowledge which is relevant to the Sustainable Development Goals through 
      digital and non-digital game elements supporting participatory systems modeling.
      With a case study in the city of Zurich, the project will dive into the central 
      role that gamification can play to identify local knowledge regarding interactions 
      among the Sustainable Development Goals (SDGs), i.e. how progress toward 
      one target can foster or hinder progress on (an)other target(s).
      After exploring the questions of definition and contextualization of so-called 
      “SDG interactions”, the project will test different degrees of gamification
      in participatory systems modeling interventions, using notably an existing modeling tool, 
      as well as a game which will be specially designed for the research purpose. 
      The project will also reflect on the learning outcomes of the game elements for 
      the participating stakeholders."
      :description-timeline "We plan to achieve the main outputs of this
work-package until early 2024, namely relating to the Participatory
Modeling (2.1) and Social learning (2.2)."
      :title "Studying SDG interactions"
      :icon-url "img/sustainable.png"}]]])
