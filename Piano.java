class Piano {
    private boolean isTuned;
    private boolean isPlayed;
    private Key[] keys;
    private Pedal pedal;

    public Piano(int numberOfKeys) {
        this.keys = new Key[numberOfKeys];
        for (int i = 0; i < numberOfKeys; i++) {
            this.keys[i] = new Key();
        }
        this.isPlayed = false;
        this.isTuned = false;
        this.pedal = new Pedal();
    }

    public void display(){
        System.out.println();
        for (int i = 0; i < this.keys.length; i++) {
            System.out.println("Клавиша "+(i+1) +" "+this.keys[i].getKey());
        }
        System.out.println("Педаль "+this.pedal.getPedal()+"\n");
    }

    public void tune() {
        this.isTuned = true;
        System.out.println("Пианино настроено...");
    }

    public void startPlay() {
        this.isPlayed = true;
        System.out.println("Пианино играет...");
    }

    public void stopPlay(){
        this.isPlayed = false;
        System.out.println("Пианино завершило играть...");
    }
    public void pressKey(int keyNumber) {
        if (keyNumber >= 0 && keyNumber < this.keys.length) {
            this.keys[keyNumber].press(keyNumber);
        } else {
            System.out.println("Неверная клавиша");
        }
    }
    public void releaseKey(int keyNumber){
        if (keyNumber >= 0 && keyNumber < this.keys.length) {
            this.keys[keyNumber].release(keyNumber);
        } else {
            System.out.println("Неверная клавиша");
        }
    }
    public void pressPedal() {
        this.pedal.press();
    }
    public void releasePedal(){
        this.pedal.release();
    }

}