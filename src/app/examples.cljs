(ns app.examples)

(defn exs
  []
  [:div {:class "flex flex-wrap w-1/2"}
   [:div {:class "w-5/6 sm:w-1/2 p-6"}
    [:img {:class "w-full md:w-1/5 z-50", :src "img/networking.png"}]
    [:h3 {:class "text-3xl text-gray-800 font-bold leading-none mb-3"} "Actor network mapping"]
    [:p {:class "text-gray-600 mb-8"} "We use tools and new data sources arising from digitalization to build a continuously updated and comprehensive monitoring of actor activity."]]
   [:div {:class "w-full sm:w-1/2 p-6"}]])



(def button-classes "mx-6 lg:mx-0 hover:underline bg-white text-gray-800 font-bold rounded-full my-6 py-4 px-8 shadow-lg focus:outline-none focus:shadow-outline transform transition hover:scale-105 duration-300 ease-in-out")


(defn home-de []
  [:div.bg-white.pt-10
   [:div.flex.items-start.justify-around
    [content {:description "Wir nutzen Tools und neue Datenquellen, die sich aus der Digitalisierung ergeben, um ein laufend aktualisiertes und umfassendes Monitoring der Aktivitäten der Akteure aufzubauen." :title "Abbildung von Akteursnetzwerken" :icon-url "img/networking.png"}]
    [content {:description "Text DE" :title "Untersuchung der SDG-Wechselwirkungen" :icon-url "img/sustainable.png"}]
    [content {:description "Text DE" :title "Lücken in der Governance" :icon-url "img/circle.png"}]]])
