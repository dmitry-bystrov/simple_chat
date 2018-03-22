package server;

import java.util.ArrayList;

public class BaseAuthService implements AuthService {

    private class Entry {
        private String login;
        private String pass;
        private String nickname;

        public Entry(String login, String pass, String nickname) {
            this.login = login;
            this.pass = pass;
            this.nickname = nickname;
        }
    }

    private ArrayList<Entry> entries;

    public BaseAuthService() {
        entries = new ArrayList<>();
        entries.add(new Entry("login1","pass1","Bill"));
        entries.add(new Entry("login2","pass2","Molly"));
        entries.add(new Entry("login3","pass3","Alex"));
    }

    @Override
    public void start() {

    }

    @Override
    public String getNicknameByLoginPass(String login, String pass) {
        for (Entry entry : entries) {
            if (entry.login.equals(login) && entry.pass.equals(pass)) return entry.nickname;
        }
        return null;
    }

    @Override
    public void stop() {

    }
}
