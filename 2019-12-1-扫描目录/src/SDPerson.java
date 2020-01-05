import java.io.*;

public class SDPerson {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("person对象.obj"));
        Person person = (Person)ois.readObject();
        System.out.println(person);
        ois.close();

        Person person1 = new Person();
        person1.name = "a";
        person1.age = 11;
        person1.sex = "nan";
        person1.sn = 000;

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("person对象.obj") );
        oos.writeObject(person1);
        oos.close();
    }
}
