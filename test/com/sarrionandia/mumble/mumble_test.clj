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

  (testing "Single uppercase letter is unmodified"
    (is (= "C" (m/mumbler "C"))))

  (testing "Mumbles a two letter string"
    (is (= "X-Yy" (m/mumbler "xy"))))

  (testing "Mumbles a three letter string"
    (is (= "A-Ss-Ddd" (m/mumbler "asd"))))

  (testing "Mumbles a mixed case string"
    (is (= "C-Vv-Bbb" (m/mumbler "cVb")))))