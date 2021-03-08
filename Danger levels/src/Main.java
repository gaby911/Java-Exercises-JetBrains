enum DangerLevel {
    HIGH(3),
    MEDIUM(2),
    LOW(1);
    int value;
    DangerLevel(int value) {
        this.value=value;
    }
    public int getLevel(){
        return value;
    }
}