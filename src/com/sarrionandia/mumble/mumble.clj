(ns com.sarrionandia.mumble.mumble
  (:require [clojure.string :as s]))

(defn- mumble-letter [position letter]
  (s/join
    (concat (s/upper-case letter)
            (repeat position letter))))

(defn mumbler [x]
  (let [char-seq (vec x)]
    (if (= 0 (count char-seq))
      ""
      (s/join "-" (map-indexed mumble-letter char-seq)))))
