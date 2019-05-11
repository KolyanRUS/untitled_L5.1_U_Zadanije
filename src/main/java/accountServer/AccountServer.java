package accountServer;

/**
 * @author a.akbashev
 * @author v.chibrikov
 *         <p>
 *         Пример кода для курса на https://stepic.org/
 *         <p>
 *         Описание курса и лицензия: https://github.com/vitaly-chibrikov/stepic_java_webserver
 */
public class AccountServer implements AccountServerI {
    private int usersCount;//текущее количество пользователей, которое к нам пришло
    private int usersLimit;//лимит пользователей, котор. могут к нам зайти

    public AccountServer(int usersLimit) {
        this.usersCount = 10;
        this.usersLimit = usersLimit;
    }

    @Override
    public void addNewUser() {
        usersCount += 1;
    }

    @Override
    public void removeUser() {
        usersCount -= 1;
    }

    @Override
    public int getUsersLimit() {
        return usersLimit;
    }

    @Override
    public void setUsersLimit(int usersLimit) {
        this.usersLimit = usersLimit;
    }

    @Override
    public int getUsersCount() {
        return usersCount;
    }
}