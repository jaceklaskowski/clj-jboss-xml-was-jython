(defproject pl.japila/clj-jboss-xml-was-jython "0.0.1-SNAPSHOT"
  :description "Convert JBoss AS's XMLs to WAS's Jython scripts"
  :url "https://github.com/jaceklaskowski/clj-jboss-xml-was-jython"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :repositories [["sonatype-snapshots"
                  "http://oss.sonatype.org/content/repositories/snapshots/"]]
  :dependencies [[org.clojure/clojure "1.4.0"]
                 [org.clojure/data.zip "0.1.2-SNAPSHOT"]]
  :resource-paths ["resources" "test-resources"])
