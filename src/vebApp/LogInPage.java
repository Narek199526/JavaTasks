package vebApp;

public class LogInPage extends Account {
   protected String logIn;
   protected String password;


    public void setLogIn(String logIn) {

        this.logIn = logIn;
    }

    public String getLogIn() {
        return logIn;
    }

    public void setPassword(String password) {
        if (password.length() >= 8) {
            this.password = password;
        } else System.exit(1);
    }
}
