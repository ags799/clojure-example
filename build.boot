(set-env! :resource-paths #{"src"}
          :dependencies `[[org.clojure/clojure ~(clojure-version)]
                          [ags799/bootlaces "dfb3d20"]
                          [ags799/boot-docker "4307be3"]])

(require '[ags799.bootlaces :refer :all]
         '[ags799.boot-docker :refer :all])

(bootlaces! 'ags799/example)
(boot-docker! "ags799" "example" "0.0.0")

(task-options! jar {:main 'ags799.example})
