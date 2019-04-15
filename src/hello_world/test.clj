(require '[clojure.repl :refer :all])
(import java.util.Date)

(defn greet [name] (str "Hello, " name))

(defn messenger 
	([] (messenger "Hello world!"))
	([msg] (println msg)))


(defn hello [greeting & who] 
	(println greeting who))

(println (let [d (Date.)] 
(. d toString))
)

(messenger "Hello Class!")
(hello "Dude" "Manoj" "class" "item1" "item2")
