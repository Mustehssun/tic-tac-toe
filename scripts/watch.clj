(require '[cljs.build.api :as b])

(b/watch "src"
  {:main 'tic-tac-toe.core
   :output-to "out/tic_tac_toe.js"
   :output-dir "out"})
