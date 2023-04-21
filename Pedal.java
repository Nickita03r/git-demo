public class Pedal {
    private boolean isPressed;

    public Pedal() {
        this.isPressed = false;
    }
    public boolean getPedal(){
        return this.isPressed;
    }
    public void press() {
        this.isPressed = true;
        System.out.println("Педаль нажата");
    }

    public void release() {
        this.isPressed = false;
        System.out.println("Петаль отпущена");
    }
}