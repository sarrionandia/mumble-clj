(ns com.sarrionandia.mumble.mumble)

(defn mumbler [x]
  (if
    (= x "")
    ""
    (clojure.string/upper-case x)))
