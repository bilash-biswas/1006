(let [num1 (do (Double/parseDouble (read-line))) 
     num2 (do (Double/parseDouble (read-line)))
     num3 (do (Double/parseDouble (read-line)))] 
  (println (format "MEDIA = %.1f" (/ (+ (* num1 2) (* num2 3) (* num3 5)) 10))))
