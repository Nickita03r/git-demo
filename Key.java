public class Key {
    private boolean isPressed;

    public Key() {
        this.isPressed = false;
    }

    public boolean getKey(){
        return this.isPressed;
    }
    public void press(int num) {
        this.isPressed = true;
        System.out.println("Клавиша "+num+" нажата");
    }

    public void release(int num) {
        this.isPressed = false;
        System.out.println("Клавиша "+num+" отпущена");
    }
}