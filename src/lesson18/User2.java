package lesson18;

/**
 * Переписать предыдущее задание, используя локальный класс.
 */
public class User2 {
    public String password, login;

    public User2(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void createQuery() {
        class Query {
            public void printToLog() {
                System.out.printf("Пользователь %s с паролем %s отправил запрос \n", login, password);
            }
        }
        Query query = new Query();
        query.printToLog();
    }

    public static void main(String[] args) {
        User2 user = new User2("login1", "password1");
        user.createQuery();
    }
}
