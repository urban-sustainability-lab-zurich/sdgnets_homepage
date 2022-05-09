(ns app.working-packages.closing-governance-gaps
  (:require [app.components :refer (work-package)]))


(defn wp-3 []
  [:section.bg-white.p-20
   [:div.w-full
    [work-package
     {:description-wp
      [:p
       "In this part of SDGNets@ZH we integrate the knowledge gained through 
       actor mapping LINK_HERE and knowledge on SDG interactions LINKE_HERE to test ways to strengthen actor
networks. We co-design targeted network interventions with stakeholders to
close governance gaps in a real-world experiment. Governance gaps describe a
lack of coordination among actors working on interrelated problems. Combining
the crowd-sourced model of SDG interactions LINK_HERE with our actor network
mapping LINK_HERE enables us to identify governance gaps, using multi-level
network models."
       [:br]
       [:br]
       "While more nuanced in practice, the central hypothesis and
motivation behind multi-level governance network research
can be put quite simply: If two problems are related, it is likely beneficial
if actors working on these problems coordinated their actions. If actors work
on interrelated problems (such as specific SDGs) but are not coordinating their
actions, there is a governance gap or misfit in the network, detrimental to
successful outcomes.
       [:br]
       [:br]
       We organize our research on closing governance gaps
around two questions: 
       [:br]
       RQ 3.1: What are major governance gaps in SDG
implementation in Zurich?  
       [:br] RQ 3.2: Can targeted network interventions contribute
to improving SDG implementation processes? 
       [:br]
       [:br]
       Multi-level network modeling
connecting actors and localized SDG interactions to diagnose gaps in urban SDG
implementation is a straightforward conceptual extension to
existing research. To identify and classify governance
gaps (RQ3.1), we rely on multi-level motif analysis.  
       [:br]
       For
RQ3.2, we co-design network interventions with actors in participatory
processes. These interventions bring together actors involved in governance gaps to promote
social learning or spark new projects. To assess the potential of such network
modeling based, relatively high-effort interventions, we compare their outcomes
with a matched control group where actors receive low-effort digital prompts
about potential network partners over a period of time."]
      :description-timeline "We plan to do the Gap Diagnosis (3.1) and the
      Interventions (3.2) from 2024 onward."
      :title "Closing governance gaps"
      :icon-url "img/circle.png"}]]])
