(ns clojure.examples.hello
   (:gen-class))
(defn Example []
   (println (str "Hello World from Clojure"))
   (println (+ 1 2)))
(Example)