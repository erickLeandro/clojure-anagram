(ns anagram
  (:require [clojure.string :as s]))

(defn sort-word [word]
  (sort (s/lower-case word)))

(defn anagrams-for [word words]
  (filter 
    (fn [x] 
      (and 
        (not= (vector (s/lower-case word)) words)
        (= (sort-word word) (sort-word x)))) words))