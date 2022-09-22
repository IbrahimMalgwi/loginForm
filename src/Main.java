public class Main {
    public static void main(String[] args) {
        RegistrationForum myForm = new RegistrationForum(null);
        User user = myForm.user;
        if (user != null) {
            System.out.println("Successful registration of: " + user.name);
        }
        else {
            System.out.println("Registration canceled");
        }
    }
}