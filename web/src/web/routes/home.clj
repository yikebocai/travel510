(ns web.routes.home
  (:use compojure.core)
  (:require [web.views.layout :as layout]
            [web.util :as util]))

(defn home-page []
  (layout/render
    "home.html" ))

(defn about-page []
  (layout/render "about.html"))

(defroutes home-routes
  (GET "/" [] (home-page))
  (GET "/about" [] (about-page)))
