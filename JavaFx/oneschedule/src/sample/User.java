package sample;

enum account_type_t{
        USR_ANOMY, //USR_ANOMY  匿名用户
        USR_CLERK, //USR_CLERK  售票员
        USR_MANG, //USR_MANG    经理
        USR_ADMIN //USR_ADMIN   系统管理员
};

public class User {
    private int  user_id;               //用户id
    private account_type_t user_type;   //用户类型
    private String username;       //用户名
    private String password;       //用户密码

    public User(){}

    public User(String username,String password,account_type_t user_type)
    {
        this.username = username;
        this.password = password;
        this.user_type = user_type;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public int getUser_id() {
        return user_id;
    }

    public account_type_t getUser_type() {
        return user_type;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUser_type(account_type_t user_type) {
        this.user_type = user_type;
    }
}
