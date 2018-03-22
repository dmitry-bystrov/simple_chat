package server;

public interface AuthService {
    void start();
    String getNicknameByLoginPass(String login, String pass);
    void stop();
}
