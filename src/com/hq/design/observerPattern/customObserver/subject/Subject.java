package com.hq.design.observerPattern.customObserver.subject;

import com.hq.design.observerPattern.customObserver.observer.Observer;

/**
 * Created by hq on 17/8/20.
 */
public interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
