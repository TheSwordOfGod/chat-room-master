package pojo;

public class User {

    private int id;             //用户id
    private String name;        //用户名
    private int age;            //年龄
    private String sex;         //性别
    private String account;     //账号
    private String password;    //密码
    private String head_image;  //图片路径

    public User() {
    }

    public User(int id, String name, int age,String sex, String account, String password, String head_image) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.account = account;
        this.password = password;
        this.head_image = head_image;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", account='" + account + '\'' +
                ", password='" + password + '\'' +
                ", head_image='" + head_image + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getHead_image() {
        return head_image;
    }

    public void setHead_image(String head_image) {
        this.head_image = head_image;
    }
}
