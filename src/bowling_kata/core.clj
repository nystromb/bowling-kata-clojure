(ns bowling-kata.core)

(defn spare? [[first-throw second-throw]]
  (if (= 10 (+ first-throw second-throw))
    true
    false))

(defn frame-bonus [frame next-frame]
  (cond
    (spare? frame) (first next-frame) 
    :else 0))

(defn calculate-bonus [frames]
  (loop [frame-index 1 total-bonus 0]
    (let [frame (get frames frame-index)]
      (if (= frame-index 10) 
      total-bonus
      (recur (inc frame-index) (+ total-bonus (frame-bonus frame (get frames (inc frame-index)))))))))

(defn score-game [frames]
  (+ (apply + (flatten (vals frames))) (calculate-bonus frames)))
