(ns app.working-packages.closing-governance-gaps
  (:require [app.components :refer (work-package)]))


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
