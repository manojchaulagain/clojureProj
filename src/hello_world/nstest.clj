(ns clojure.examples.hello (:gen-class))

;; This program displays Hello World
(defn Example [] 
			(def x 1)
			(def y 1.25)
			(def str1 "Hello")
			(def status true)
			(println str1)
			(println (double(/ 3 2)))
			(println (and (not= 2 3) (= 3 3)))
)
(Example)

(defn LoopExample []
	(def x (atom 1))
	(while  (< @x 5)
		(do
			(println @x)
			(swap! x inc)
		)
	)	
)
(LoopExample)