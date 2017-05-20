package org.vistula.collections;

import java.util.HashMap;

public class CredentialsValidator {

    private HashMap<String, String> credentials;

    public CredentialsValidator(HashMap<String, String> credentials) {
        this.credentials = credentials;
    }

    public HashMap<String, String> getCredentials() {
        return credentials;
    }

    public void setCredentials(HashMap<String, String> credentials) {
        this.credentials = credentials;
    }

    public boolean areCredentialsValid(String login, String password) {
        return true;
    }
}
