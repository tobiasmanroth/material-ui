(ns starter.core
    (:require [reagent.core :as r]
              ["@material-ui/core" :as mui]))

(def button (r/adapt-react-class (aget mui "Button")))

(defn app []
  [:div
   {:style {:display "flex"
            :flex-direction "column"}}
   [:div.buttons
    [:h2 "Buttons Contained"]

    [button
     {:variant "contained"}
     "Test"]

    [button
     {:variant "contained"
      :color "primary"}
     "Primary"]

    [button
     {:variant "contained"
      :color "secondary"}
     "Secondary"]

    [button
     {:variant "contained"
      :color "primary"
      :disabled true}
     "Disabled"]

    [button
     {:variant "contained"
      :color "secondary"
      :href "http://storrito.com"}
     "Link"]




    ]


   [:h2 "test"]])

(defn stop []
  (js/console.log "Stopping..."))

(defn start []
  (js/console.log "Starting...")
  (r/render [app]
            (.getElementById js/document "app")))

(defn ^:export init []
  (start))
