(set-env! :resource-paths #{"src"}
          :dependencies `[[org.clojure/clojure ~(clojure-version)]
                          [ags799/bootlaces "0b130db"]])

(require '[ags799.bootlaces :refer :all])

(bootlaces! 'ags799/example)

(task-options! jar {:main 'ags799.example})
