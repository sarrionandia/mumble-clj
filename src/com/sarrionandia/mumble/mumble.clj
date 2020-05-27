(ns com.sarrionandia.mumble.mumble)

(defn- mumble-letter [letter position]
  (clojure.string/upper-case letter))

(defn mumbler [x]
  (let [char-seq (vec x)]
    (if (= 0 (count char-seq))
      ""
      (mumble-letter (get char-seq 0) 0))))
