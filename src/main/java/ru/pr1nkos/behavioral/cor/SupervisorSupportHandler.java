package ru.pr1nkos.behavioral.cor;

/**
 * The type Supervisor support handler.
 */
public class SupervisorSupportHandler extends SupportHandler {
    @Override
    public void handleRequest(String request) {
        if(request.equals("supervisor")) {
            System.out.println("Supervisor requested.");
        }
        else if (supportHandler != null) {
            supportHandler.handleRequest(request);
        }
    }
}
