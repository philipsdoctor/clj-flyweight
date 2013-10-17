(ns clj-flyweight.core)


(defn find-subset
  [subset start-collection]
    (loop [current-subset subset collection start-collection paused-search nil collection-agg []]
      (let [first-current-subset (first current-subset) first-item-data (first collection)]
        (cond
          (and (= first-current-subset (first first-item-data)) (not-empty (rest current-subset)))
              (recur (rest current-subset) (rest first-item-data) {:nested current-subset :col collection} collection-agg)
          (= first-current-subset (first first-item-data))
               (if (= first-item-data (rest collection))
                 (conj collection-agg first-item-data)
                 (recur current-subset (rest collection) paused-search (conj collection-agg first-item-data)))
          (empty? first-item-data)
              (if (empty? paused-search)
                collection-agg
                (recur (:nested paused-search) (rest (:col paused-search)) nil collection-agg))
          :else (recur current-subset (rest collection) paused-search collection-agg)))))

(defn get-subset
  [subset collection]
  (find-subset subset collection))
