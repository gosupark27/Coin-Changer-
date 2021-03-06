(ns coin-changer.core)

(defn change-for [amount]
 (let [denominations [25 10 5 1]
       amounts (reductions #(mod % %2) amount denominations)
       coins (map #(int (/ %1 %2)) amounts denominations)]
  (mapcat #(take %1 (repeat %2)) coins denominations)
  ))
