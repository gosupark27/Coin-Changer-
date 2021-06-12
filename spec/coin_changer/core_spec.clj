(ns coin-changer.core-spec
  (:require [speclj.core :refer :all]
            [coin-changer.core :refer :all]))

(describe "coin changer"

 (it "0 coin for 0 pennies"
  (should= [] (change-for 0 )))
 (it "1 coin for 1 pennies"
  (should= [1] (change-for 1 )))
 (it "2 coins for 2 pennies"
  (should= [1 1] (change-for 2 )))
 (it "1 coin for 5 pennies"
  (should= [5] (change-for 5 )))
 (it "1 coin for 10 pennies"
  (should= [10] (change-for 10 )))
 (it "1 coin for 25 pennies"
  (should= [25] (change-for 25 )))

 )
