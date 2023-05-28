(ns micrograd-clj.micrograd
   (:require [nextjournal.clerk :as clerk]))

(clerk/serve! {:browse? true})

(clerk/show! "notebooks/micrograd.clj")

(clerk/serve! {:watch-paths ["notebooks" "src"]})