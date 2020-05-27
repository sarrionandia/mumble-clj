(ns com.sarrionandia.mumble.mumble-test
  (:require [clojure.test :refer :all]
            [com.sarrionandia.mumble.mumble :as m]))

(deftest mumble-kata-test
  (testing "Empty string returns empty string"
    (is (= "" (m/mumbler ""))))

  (testing "Single letter a returns capitalised A"
    (is (= "A" (m/mumbler "a"))))

  (testing "Single letter b returns capitalised B"
    (is (= "B" (m/mumbler "b"))))

  (testing "Single letter B is unmodified"
    (is (= "B" (m/mumbler "B")))))