(ns com.sarrionandia.mumble.mumble
  (:require [clojure.string :as s]))

(defn- mumble-letter [position letter]
  (let
    [head (s/upper-case letter)
     tail (repeat position letter)]
      (s/join (concat head tail))))



(defn mumbler [x]
  (let [char-seq (vec x)]
    (if (= 0 (count char-seq))
      ""
      (s/join "-" (map-indexed mumble-letter char-seq)))))
