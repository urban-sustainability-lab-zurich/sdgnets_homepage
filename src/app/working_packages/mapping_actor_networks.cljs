(ns app.working-packages.mapping-actor-networks
  (:require [app.components :refer (work-package)]))

(defn wp-1 []
  [:section.bg-white.p-20
   [:div.w-full
    [work-package
     {:description-wp
      [:p "Implementing the SDGs in cities is a complex governance challenge,
       touching on issues ranging from gender equality over biodiversity to
       climate protection. This means that implementing the SDGs requires
       cross-scale governance involving solutions in many policy areas and all
       societal sectors. Actor networks play a key role for successful
       cross-scale governance in complex sustainability governance settings
       (Henry and Vollan 2014; Ingold et al. 2018). These networks, also called
       governance networks, consist of organizations from all societal sectors,
       including civil society, the private sector, government and scientific
       institutions (Rhodes 1996). In urban contexts, the need to consider
       actor networks is especially pronounced given the extraordinary
       diversity and density of actors encountered in urban governance arenas
       (Kaufmann and Sidney 2020).  Digitalization has impacted and continues
       to impact urban governance networks. Urban governance is already
       characterized by high levels of complexity, which is further exacerbated
       as cities become “smarter” and rely on ever more interdependent, complex
       digital infrastructure (Balogun et al. 2020). Complexity and an uneven
       access to tools and distribution of resources can deepen inequality
       (Bramwell 2020), putting a premium on diversity in urban governance
       networks.  In P1, we tackle the complexity of urban actor networks
       head-on. We build a continuously updating tool to map actor networks
       involved in urban sustainability transformations in Zurich. We focus on
       three leading empirical questions in P1."
       [:ul.list-inside.list-disc.py-2
        [:li "RQ1.1: Which actors impact which SDGs in Zurich? Who participates
       in which projects? "]
        [:li "RQ1.2: Which actors are central in SDG implementation?
       Which are peripheral?"]
        [:li "RQ1.3: What positions do actors take in
       discourses around SDG implementation?"]]
       "We use tools and new data sources arising from digitalization to build
       a continuously updated and comprehensive monitoring of actor
       activity. Automated text analysis of government documents, open
       government data, traditional and social media, combined with hyperlink
       networks, allows us to create a comprehensive mapping of actors involved
       in different areas of urban sustainability transformations. This
       approach to study governance actor networks is based on a rapidly
       advancing research frontier, using the 2 possibilities of data sources
       and tools arising from digitalization (Yi and Scholz 2015; Angst 2019;
       Scott et al. 2020; Leifeld 2020).  Our models will categorize actor
       activity based on a conceptualization I have developed and successfully
       applied to structure complex governance systems (Angst 2020), to create
       a bipartite actor-activity network. We use hyperlink networks and joint
       venue participation to establish inter-actor links (Yi and Scholz 2015)
       (RQ1.2) and use discourse network analysis (Leifeld 2020) to analyze
       discourse patterns (RQ1.3). In gradually building our models, we start
       with a limited set of core SDG implementation areas3 and regularly
       exchange with experts on automated text analysis of policy data at the
       Department of Political Science at UZH, as we broaden our coverage.  To
       continuously fine-tune our models with regard to ground truth, we
       regularly validate our results through expert interviews with
       representatives of actors we sample from our results and exchange with
       urban governance researchers at ZHAW and UZH, such as the ZHAW
       Institutes of Urban Landscape and Sustainable Development. We further
       acquire third-party funding to build a public-facing platform for actors
       to locate themselves, based on a science-society outreach funding
       scheme4 . The platform allows all actors involved in SDG implementation
       in Zurich to find other actors working on similar issues, even if they
       do not have extensive resources or are new to the field. Doing so, we
       build a service for actors working on SDG implementation in Zurich,
       transdisciplinary research is uniquely suited to provide. Both our
       trained network mapping models and public-facing infrastructure will be
       completely open source and accessible. This opens up the possibility for
       others to have a starting point in order to apply our approach in
       different cities, ensuring scalability of the project."]
      :description-timeline
      "We plan to achieve the main outputs of this work-package until early
       2023, namely an Activity mapping (1.1), Hyperlink networks (1.2), and
       Discourse networks (1.3). Until Mid 2023, we mihgt implement a public
       platform showcasting these results."
      :title "Mapping actor networks"
      :icon-url "img/networking.png"}]]])
