(set-env! :resource-paths #{"src"}
          :dependencies `[[org.clojure/clojure ~(clojure-version)]
                          [ags799/bootlaces "8c5bc4a"]])

(require '[ags799.bootlaces :refer :all])

(bootlaces! 'ags799/clojure-example)

(task-options! jar {:main 'ags799.clojure-example})
