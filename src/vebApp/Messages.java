package vebApp;

public class Messages extends Communication {
    String[] yourMessages = new String[100];
    String[] partnerMessages = new String[100];
    int yourIndex;
    int partnerIndex;

    public void yourTern(String mess){
        yourMessages[yourIndex] = mess;
        yourIndex++;
    }

    public void partnerTern(String mess){
        partnerMessages[partnerIndex] = mess;
        yourIndex++;
    }
}
