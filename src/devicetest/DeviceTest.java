package devicetest;

public class DeviceTest {

    public static void main(String[] args) {
        Device s1 = new Device("Light 1", false);
        Device s2 = new Device("Light 2", false);
        Device s3 = new Device("Light 3", false);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println("Light 1 toggle on/off");
        s1.changeState();
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println("Light 2 toggle on/off");
        s2.changeState();
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println("Light 3 toggle on/off");
        s3.changeState();
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println("Light 1 toggle on/off");
        s1.changeState();
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println("Light 2 toggle on/off");
        s2.changeState();
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println("Light 3 toggle on/off");
        s3.changeState();
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}
