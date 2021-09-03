package cn.hp.model;


//科室表
public class Administr {
    private int id;
    private String name;

    public Administr(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Administr() {
    }

    @Override
    public String toString() {
        return "AdministrDao{" +
                "id=" + id +
                ", name='" + name + '\'' +
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
}
