^{:nextjournal.clerk/visibility #{:hide-ns}}
(ns notebooks.micrograd
  (:require [nextjournal.clerk :as clerk]))

;; Let's define a function a scalar valued function f of x as follows

;; def f(x):
;;  return 3*x**2 - 4*x + 5

(defn f [x]
  (+ (- (* 3 (Math/pow x 2))
        (* 4 x)) 5))

(f 3.0)
