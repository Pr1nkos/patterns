package ru.pr1nkos.behavioral.cor;

public class BasicSupportHandler extends SupportHandler {
    @Override
    public void handleRequest(String request) {
        if (request.equals("basic")) {
            System.out.println("Basic support");
        } else if (supportHandler != null) {
            supportHandler.handleRequest(request);
        }
    }
}
