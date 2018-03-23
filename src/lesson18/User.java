package lesson18;

/**
 * Создать класс User, содержащий private переменные login, password.
 * Создать внутренний класс Query в классе User.
 * Класс Query содержит метод printToLog(), который распечатывает на консоль сообщение о том что пользователь с таким то
 * логином и паролем отправил запрос.
 * Класс User, содержит метод createQuery(), в котором создается объект класса Query и вызывается метод printToLog().
 * В методе main():
 * создать экземпляр класса User  и вызвать метод createQuery();
 * создать экземпляр класса Query и вызвать метод printToLog() используя конструкцию user.new Query();
 * создать экземпляр класса Query и вызвать метод printToLog() используя конструкцию new User().new Query();
 */
public class User {
    private String login, password;

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public class Query {
        public void printToLog() {
            System.out.printf("Пользователь %s с паролем" + " %s отправил запрос", login, password);
        }
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

    public void createQuery(){
        Query query = new Query();
        query.printToLog();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User userDemo = (User) o;

        if (login != null ? !login.equals(userDemo.login) : userDemo.login != null) return false;
        return password != null ? password.equals(userDemo.password) : userDemo.password == null;
    }

    @Override
    public int hashCode() {
        int result = login != null ? login.hashCode() : 0;
        result = 31 * result + (password != null ? password.hashCode() : 0);
        return result;
    }

    public static void main(String[] args) {
        User user = new User("login1", "password1");
        user.createQuery();
    }
}
