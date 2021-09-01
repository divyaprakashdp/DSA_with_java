package ArrayQueue;

public class Patients {
    private String Name;
    private String ailment;
    private int age;

    public Patients(String name, String ailment, int age) {
        Name = name;
        this.ailment = ailment;
        this.age = age;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAilment() {
        return ailment;
    }

    public void setAilment(String ailment) {
        this.ailment = ailment;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Patients{" +
                "Name='" + Name + '\'' +
                ", ailment='" + ailment + '\'' +
                ", age=" + age +
                '}';
    }
}
