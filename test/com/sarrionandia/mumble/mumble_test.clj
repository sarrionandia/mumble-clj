(ns com.sarrionandia.mumble.mumble-test
  (:require [clojure.test :refer :all]
            [com.sarrionandia.mumble.mumble :as m]))

(deftest mumble-kata-test
  (testing "Empty string returns empty string"
    (is (= "" (m/mumbler "")))))