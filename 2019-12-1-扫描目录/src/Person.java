import java.io.Serializable;

public class Person implements Serializable {
    String name;
    int age;
    String sex;
    int sn;

    @Override
    public String toString() {
        return String.format("Person{" +
        "%s,%d,%s,%d}",name,age,sex,sn
        );
    }
}
