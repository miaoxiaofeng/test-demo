/**
 * @author miaoxiaofeng
 * @create 2019-08-30 14:34
 */
public class Student {
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        System.out.println("获得密码");
        return password;
    }

    public void setPassword(String password) {
        this.password = password;

        System.out.println("再次打印密码");
    }
}
