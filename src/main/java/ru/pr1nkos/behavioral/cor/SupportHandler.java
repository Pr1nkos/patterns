package ru.pr1nkos.behavioral.cor;

import lombok.Setter;

/**
 * The type Support handler.
 */
@Setter
public abstract class SupportHandler {
    /**
     * The Support handler.
     */
    protected SupportHandler supportHandler;

    /**
     * Handle request.
     *
     * @param request the request
     */
    public abstract void handleRequest(String request);
}
