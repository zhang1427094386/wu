package cn.hp.model;


// 患者
public class Patients {
    private int id;
    private String account;
    private String password;
    private String name;
    private String sex;
    private String age;
    private String idcard;
    private String phone;
    private String email;
    private String disease;
    private String appointment_time;
    private String time;
    private String doctor;
    private String state;
    private int patients_state;
    public Patients(int id, String account, String password, String name, String sex, String age, String idcard, String phone, String email, String disease, String appointment_time, String time, String doctor, String state, int patients_state) {
        this.id = id;
        this.account = account;
        this.password = password;
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.idcard = idcard;
        this.phone = phone;
        this.email = email;
        this.disease = disease;
        this.appointment_time = appointment_time;
        this.time = time;
        this.doctor = doctor;
        this.state = state;
        this.patients_state = patients_state;
    }

    public Patients(String phone) {
        this.phone = phone;
    }

    public int getId() {
        return id;
    }

    public Patients(String account, String password, String name, String sex, String age, String idcard, String phone, String email, String disease, String appointment_time, String time, String doctor, String state) {
        this.account = account;
        this.password = password;
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.idcard = idcard;
        this.phone = phone;
        this.email = email;
        this.disease = disease;
        this.appointment_time = appointment_time;
        this.time = time;
        this.doctor = doctor;
        this.state = state;
    }

    public Patients() {
    }

    public void setId(int id) {
        this.id = id;
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

    public int getPatients_state() {
        return patients_state;
    }

    public void setPatients_state(int patients_state) {
        this.patients_state = patients_state;
    }

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    public String getAppointment_time() {
        return appointment_time;
    }

    public void setAppointment_time(String appointment_time) {
        this.appointment_time = appointment_time;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDoctor() {
        return doctor;
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Patients{" +
                "id=" + id +
                ", account='" + account + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age='" + age + '\'' +
                ", idcard='" + idcard + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", disease='" + disease + '\'' +
                ", appointment_time='" + appointment_time + '\'' +
                ", time='" + time + '\'' +
                ", doctor='" + doctor + '\'' +
                ", state='" + state + '\'' +
                '}';
    }
}
