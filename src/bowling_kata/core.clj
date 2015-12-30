(ns bowling-kata.core)

(defn score-game [frames]
	(apply + (flatten (vals frames))))
