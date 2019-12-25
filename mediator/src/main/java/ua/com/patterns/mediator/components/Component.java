package ua.com.patterns.mediator.components;

import ua.com.patterns.mediator.Mediator;

/**
 * Common interface of components
 */
public interface Component {

    void setMediator(Mediator mediator);

    String getName();
}
