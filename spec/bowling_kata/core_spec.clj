(ns bowling-kata.core-spec
  (:require [speclj.core :refer :all]
            [bowling-kata.core :refer :all]))

(describe "a bowling game"
  (it "score is 0 if no pins are knocked down"
    (should= 0 (score-game { 1 [0 0] 2 [0 0] 3 [0 0] 4 [0 0] 5 [0 0] 6 [0 0] 7 [0 0] 8 [0 0] 9 [0 0] 10 [0 0] })))
	
  (it "score is 20 if no pins are knocked down"
    (should= 20 (score-game { 1 [1 1] 2 [1 1] 3 [1 1] 4 [1 1] 5 [1 1] 6 [1 1] 7 [1 1] 8 [1 1] 9 [1 1] 10 [1 1] })))
	
  (it "adds extra bonus for spares"
    (should= 20 (score-game { 1 [5 5] 2 [3 3] 3 [1 0] 4 [0 0] 5 [0 0] 6 [0 0] 7 [0 0] 8 [0 0] 9 [0 0] 10 [0 0] }))))
  
