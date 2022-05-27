public class Account {

    private final String name;

    public Account(String name) {
        this.name = name;
    }

    public boolean checkNameToEmboss() {
        if (name.length() < 3) {
            return false;
        }
        if (name.length() > 19) {
            return false;
        }
        if (name.startsWith(" ")) {
            return false;
        }
        if (name.endsWith(" ")) {
            return false;
        }
        int count = 0;
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == ' '){
                count++;
            }
            if (count > 1) {
                return false;
            }
        }
        if (count != 1){
            return false;
        }

        return true;
    }

}