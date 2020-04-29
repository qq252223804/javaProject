package src.main.on_the_road;
import java.io.Serializable;
        /*
 3  * Serializable:用于给被序列化的类加入ID号。
 4  * 用于判断类和对象是否是同一个版本。
 5  */

public class User implements Serializable {
    private static final long serialVersionUID = 6751475469936246177L;
    private String userId;
    private String userName;
    private int age;

    public User(String userId, String userName, int age) {
        super();
        this.userId = userId;
        this.userName = userName;
        this.age = age;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "[userId="+userId+" , name=" + userName + ", age=" + age + "]";
}
}

