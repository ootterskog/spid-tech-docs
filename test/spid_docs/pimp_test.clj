(ns spid-docs.pimp-test
  (:require [midje.sweet :refer :all]
            [spid-docs.enlive :refer [select parse]]
            [spid-docs.pimp :refer :all]))

(fact "Adds anchors to all headings"
      (->> (make-headings-clickable "<div>
<h2>Poblano</h2>
<p>Mild and earthy</p>
<h2>Hungarian Hot Wax</h2>
<p>Great for pickling</p>")
           parse
           (select [:h2])
           (map :content)) => [[{:tag :a
                                  :attrs {:class "anchor-link"
                                          :id "poblano"
                                          :href "#poblano"}
                                  :content ["Poblano"]}]
                               [{:tag :a
                                  :attrs {:class "anchor-link"
                                          :id "hungarian-hot-wax"
                                          :href "#hungarian-hot-wax"}
                                  :content ["Hungarian Hot Wax"]}]])
