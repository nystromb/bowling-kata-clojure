(ns bowling-kata.core)

(defn spare? [rolls]
  (= 10 (apply + (take 2 rolls))))

(defn strike? [rolls]
  (= 10 (first rolls)))

(defn number-of-next-rolls [rolls]
  (cond
      (or (spare? rolls) (strike? rolls)) 3 
      :else 2))

(defn number-of-rolls-for-frame [rolls]
  (if (strike? rolls) 1 2))

(defn convert-to-frames [rolls]
  (lazy-seq (cons (take (number-of-next-rolls rolls) rolls)
                        (convert-to-frames (drop (number-of-rolls-for-frame rolls) rolls)))))

(defn make-game[rolls]
  (take 10 (convert-to-frames rolls)))

(defn calculate-game-score [frame_scores]
  (reduce + frame_scores))

(defn score-game [rolls]
  (calculate-game-score (map calculate-game-score (make-game rolls))))
