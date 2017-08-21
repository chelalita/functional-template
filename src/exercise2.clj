(ns exercise2)

(defn a [x] (> x 5))
(defn only-greater-than-five
  [x]
  (filter a x))

