(ns bowling-kata.core-spec
  (:require [speclj.core :refer :all]
            [bowling-kata.core :refer :all]))

(describe "a bowling game"
  (it "score is 0 if no pins are knocked down"
    (should= 0 (score-game (repeat 20 0))))

  (it "score is 20 if 1 pin is knocked down each throw"
    (should= 20 (score-game (repeat 20 1))))

  (it "adds extra bonus for spares"
    (should= 16 (score-game (concat '(5 5 3) (repeat 17 0)))))

  (it "adds extra bonus for strikes"
     (should= 26 (score-game (concat '(10) '(5 3) (repeat 17 0)))))

  (it "scores a perfect game"
    (should= 300 (score-game (concat (repeat 12 10))))))
