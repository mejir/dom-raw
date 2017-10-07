(ns dow-raw.core)


(def cnt-holder (.getElementById js/document "clicks"))
(def reset-button (.getElementById js/document "reset-btn"))
(def cnt (atom 0))

(defn inc-clicks!
  []
  (set! (.-innerHTML cnt-holder) (swap! cnt inc)))

(defn reset-clicks!
  []
  (set! (.-innerHTML cnt-holder) (reset! cnt -1)))

(set! (.-onclick js/document) inc-clicks!)
(set! (.-onclick reset-button) reset-clicks!)