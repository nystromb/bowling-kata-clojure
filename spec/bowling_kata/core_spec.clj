(ns bowling-kata.core-spec
  (:require [speclj.core :refer :all]
            [bowling-kata.core :refer :all]))

(defn roll-all [pins])

(describe "a bowling game"
  (it "score is 0 if no pins are knocked down"
		(should= 0 (score-game {1 [0 0] 2 [0 0] 3 [0 0] 4 [0 0] 5 [0 0] 6 [0 0] 7 [0 0] 8 [0 0], 9 [0 0] 10 [0 0] }))))

