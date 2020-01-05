public class OpenUseClass {
    public static void main(String[] args) {
        OpenUseClass.class.getResource("xxx.txt");
        OpenUseClass.class.getClassLoader().getResource("xxx.txt");
    }
}
