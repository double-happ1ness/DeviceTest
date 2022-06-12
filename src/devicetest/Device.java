package devicetest;

public class Device {

    private String name;
    private boolean state;

    public Device(String name, boolean state) {
        this.name = name;
        this.state = state;
    }

    public void changeState() {
        state = !state;
    }

    public String toString() {

        if (state) {

            return this.name + " switch is: " + "On";
        } else {
            return this.name + " switch is: " + "Off";
        }
    }

}
