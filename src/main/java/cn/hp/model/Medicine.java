package cn.hp.model;

// 药物表
public class Medicine {
    private int id;
    private String number;
    private String name;
    private String price;
    private String address;
    private String status;
    private String major;
    private String matter;

    public Medicine(int id, String number, String name, String price, String address, String status, String major, String matter) {
        this.id = id;
        this.number = number;
        this.name = name;
        this.price = price;
        this.address = address;
        this.status = status;
        this.major = major;
        this.matter = matter;
    }

    public Medicine() {
    }

    @Override
    public String toString() {
        return "Medicine{" +
                "id=" + id +
                ", number='" + number + '\'' +
                ", name='" + name + '\'' +
                ", price='" + price + '\'' +
                ", address='" + address + '\'' +
                ", status='" + status + '\'' +
                ", major='" + major + '\'' +
                ", matter='" + matter + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getMatter() {
        return matter;
    }

    public void setMatter(String matter) {
        this.matter = matter;
    }
}
