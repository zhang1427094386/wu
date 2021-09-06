package cn.hp.model;

// 医生
public class Doctors {
    private int id;
    private String account;
    private String password;
    private String name;
    private String administr;
    private String sex;
    private String age;
    private String idcard;
    private String phone;
    private String email;

    public Doctors(int id, String account, String password, String name, String administr, String sex, String age, String idcard, String phone, String email) {
        this.id = id;
        this.account = account;
        this.password = password;
        this.name = name;
        this.administr = administr;
        this.sex = sex;
        this.age = age;
        this.idcard = idcard;
        this.phone = phone;
        this.email = email;
    }

    public Doctors() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Doctors{" +
                "id=" + id +
                ", account='" + account + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", administr='" + administr + '\'' +
                ", sex='" + sex + '\'' +
                ", age='" + age + '\'' +
                ", idcard='" + idcard + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdministr() {
        return administr;
    }

    public void setAdministr(String administr) {
        this.administr = administr;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }
}
