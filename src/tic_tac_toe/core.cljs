(ns tic-tac-toe.core
  (:require [reagent.dom :as reagent-dom]
            [clojure.string :as str]))

;; (defonce conn
;;   (repl/connect "http://localhost:9000/repl"))

(println "Hello world!")

;; (defn render-ui []
;;   [:div {:on-click (fn [] (println "B"))}
;;      [:p "Click this!" ]])

(defn render-board []
  [:div
     [:p "Board"]])

(defn render-side-menu []
  [:div
     [:p "Side-menu"]])

(defn render-header []
  [:div
     [:p "Header"]])

(defn render-screen [render-header render-side-menu render-board]
               [:div
                  [render-header]
                  [render-side-menu]
                  [render-board]])

(defn render-ui []
  (render-screen render-header render-side-menu render-board))

(defn main[]
  (println (js/document.getElementById "app"))
  (reagent-dom/render [render-ui] (js/document.getElementById "app")))
