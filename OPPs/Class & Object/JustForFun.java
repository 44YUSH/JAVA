public class JustForFun {
    public static void main(String[] args) {
        Student s1 = new Student();

        System.out.println(s1.yob);

        s1.name = "Radha";
        s1.yob = 21;

        System.out.println(s1.check());

        Student s2 = new Student();

        s2.name = "Krishna";
        s2.yob = 24;

        System.out.println(s2.check());
    }
}
