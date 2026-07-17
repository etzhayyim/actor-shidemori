(require '[clojure.test :as t])

(doseq [ns-sym '[shidemori.methods.test-charter-gates
                  shidemori.murakumo-test
                  shidemori.registry-seed-test
                  shidemori.repository-contract-test]]
  (require ns-sym))

(let [result (apply t/run-tests
                    '[shidemori.methods.test-charter-gates
                      shidemori.murakumo-test
                      shidemori.registry-seed-test
                      shidemori.repository-contract-test])]
  (System/exit (if (zero? (+ (:fail result) (:error result))) 0 1)))
