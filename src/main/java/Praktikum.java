public class Praktikum {

    public static void main(String[] args) {

        String name = "Vinni Puh";
        Account account = new Account(name);
        if (account.checkNameToEmboss()) {
            System.out.println("Your name will be printed");
        } else {
            System.out.println("Incorrect name");
        }
    }

}
