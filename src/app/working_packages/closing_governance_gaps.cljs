(ns app.working-packages.closing-governance-gaps
  (:require [app.components :refer (work-package)]
            [app.state :refer (app-state)]))


(defn wp-3 []
  [:section.bg-white.p-20
   [:div.w-full
    [work-package {:description-wp
                   [:p "In this last sub-project, we integrate the knowledge
                   gained from "
                    [:span.text-blue-400
                     {:class ["hover:underline" "cursor-pointer"]
                      :on-click (fn [] (swap! app-state assoc :view "Mapping actor networks"))}
                     "mapping actor networks"]
                    " and "
                    [:span.text-blue-400
                     {:class ["hover:underline" "cursor-pointer"]
                      :on-click (fn [] (swap! app-state
                                              assoc :view "Studying SDG interactions"))}
                     "studying SDG interactions"]
                    " to test ways to strengthen actor networks. We co-design
     targeted network interventions with stakeholders to close governance gaps
     in a real-world experiment. Governance gaps describe a lack of
     coordination among actors working on interrelated problems. If two
     problems are related, it is likely beneficial if actors working on these
     problems coordinated their actions."
                    [:br]
                    "What are major governance gaps in SDG implementation in
     Zurich? Can targeted network interventions contribute to improving
     SDG implementation processes"
                    [:br]
                    "Our project is able to close this gap by exploiting the
possibilities arising with digitalization of multi-level network modeling
connecting actors and localized SDG interactions. To identify and classify
governance gaps, we rely on the R package motifr (Angst and Seppelt
2020), dedicated to multi-level motif analysis."
                    [:br]
                    "We will bring together actors involved in governance gaps
to promote social learning or spark new projects."]
      :description-timeline "We plan to do the Gap Diagnosis (3.1) and the
      Interventions (3.2) from 2024 onward, with two main outputs to close the
      project, namely Outreach Reports and Scientific Papers"
      :title "Closing governance gaps"
      :icon-url "img/circle.png"}]]])
