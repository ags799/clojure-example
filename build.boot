(set-env! :dependencies `[[org.clojure/clojure ~(clojure-version)]
                          [ags799/bootlaces "dfb3d20"]
                          [ags799/boot-docker "5acc180"]])

(require '[ags799.bootlaces :refer :all]
         '[ags799.boot-docker :refer :all])

(bootlaces! 'ags799/example)
