package ru.pr1nkos.behavioral.cor;

public class AdvancedSupportHandler extends SupportHandler {
    @Override
    public void handleRequest(String request) {
        if(request.equals("advanced")){
            System.out.println("Advanced Request");
        } else if(supportHandler != null){
            supportHandler.handleRequest(request);
        }
    }
}
