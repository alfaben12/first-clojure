(defn fibo-iterate
  [^long n]
  (let [next-fib (fn [[a b]] [b (+ a b)])
        fibs (iterate next-fib [0N 1N])]
    (first (nth fibs n))))