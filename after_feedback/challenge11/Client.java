package after_feedback.challenge11;

public class Client {
    private String name;
    private String email;

    public Client(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public void showData() {
        System.out.println("Client: " + name + " | Email: " + email);
    }
}
