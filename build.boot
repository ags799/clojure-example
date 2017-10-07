(set-env! :resource-paths #{"src"}
          :dependencies `[[org.clojure/clojure ~(clojure-version)]
                          [ags799/bootlaces "7baea80"]])

(require '[ags799.bootlaces :refer :all])

(bootlaces! 'ags799/clojure-example)

(task-options! jar {:main 'ags799.clojure-example})
