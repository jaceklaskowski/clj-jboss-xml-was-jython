(ns pl.japila.clj-jboss-xml-was-jython.core
  (:require [clojure.xml :as xml]
            [clojure.zip :as zip]
            [clojure.data.zip.xml :as zip-xml]))

(defn read-ds [xml]
  (-> (zip/xml-zip (xml/parse xml))
    (zip-xml/xml-> :local-tx-datasource)))

(defn -main
  [& args]
  (println (read-ds "test-resources/derby-ds.xml")))
