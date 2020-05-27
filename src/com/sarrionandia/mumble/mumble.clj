(ns com.sarrionandia.mumble.mumble)

(defn mumbler [x]
  (let [char-seq (seq x)]
    (if (= 0 (count char-seq))
      ""
      (clojure.string/upper-case x))
    )
  )
