(ns app.working-packages.mapping-actor-networks
  (:require [app.components :refer (work-package)]))

(defn wp-1 []
  [:section.bg-white.p-20
   [:div.w-full
    [work-package
     {:description-wp
      [:p
       "Imagine for a moment: You have an exciting project to make Zürich more sustainable.
      You have very little resources – maybe you are a startup just overwhelmed with the logistics of starting up at all.
      Or maybe you are new to Zurich. Or maybe you are from a marginalized community.
      Whatever it is, you are at a disadvantage."
       [:br]
       "There likely is someone in the city who can help you get up to speed and share lessons learned the hard way.
      But finding these people and organizations takes time and resources you do not have.
      So, you will unnecessarily duplicate efforts by others and fail in predictable ways.
      This is not only a problem for you, but also a problem for society at large. Urban sustainability needs
      everyone, from every sector. This means that urban sustainability needs connections. It needs strong governance networks."
       [:br]
       [:br]
       "In SDGNets@ZH, we are building an automated way to monitor \"who is doing what?\" in urban sustainability to help out with this problem.
      To do so, we combine natural language processing with machine 
       learning to analyze unstructured text data in regular intervals. We identify topics and 
       actors and map them to governance networks."
       [:br]
       "Which is a fancy way of saying that we teach computers to read newspapers (mostly) and figure out \"who is doing
       what?\" at the moment when it comes to urban sustainability. Based on this information we create a network map,
        where actors (like civil society organizations, businesses or state agencies) are connected to different issues
        in urban sustainability (like sustainable transport, climate-friendly energy provision or urban biodiversity)."
       [:br]
       [:br]
       "Why would we give over this task to computers?"
       [:br]
       [:br]
       "Glad you asked. It's absolutely the right question. To get a snapshot
       over \"who is doing what (potentially with whom)?\" it's very likely we would get a better impression by just talking to
       some people. Which we'll do, to see that the computers don't produce nonsense."
       [:br]
       [:br]
       "The reason to use digital tools and data sources is that they can do some things that are hard for us to do:"
       [:br]
       [:br]
       [:ul.list-inside.list-disc.py-2
        [:li "Monitor what is going on near constantly. Computers need no sleep."]
        [:li "Reading and re-reading thousands of newspaper articles."]
        [:li "Once we are good enough doing this in Zürich, computers very good at scaling up - 
              so someone can use our approach as a staring point for mapping in another city."]]
       [:br]
       [:br]
       "The mapping results will be made publically available and classification models will be open-sourced. We are
        currently looking for funding to augment the mapping with a citizen science component as well."]
      :description-timeline
      "We will follow an iterative approach in developing the mapping, starting from working prototypes of smaller
       scope (for example only using a specific issue of urban sustainability, such as sustainable transport).
      We then plan to gradually expand the scope of the mapping in interaction with stakeholders. "
      :title "Mapping actor networks"
      :icon-url "img/networking.png"}]]])
