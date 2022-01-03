package day01;

public class NormalUser implements User {

private String email;
private String password;

    public NormalUser(String email, String passowrd) {
        this.email = email;
        this.password = passowrd;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public String getPassword() {
        return password;
    }
}
