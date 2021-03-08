class Clock {

    int hours = 12;
    int minutes = 0;

    public void next() {
        if (minutes < 59) {
            minutes += 1;
        } else {
            minutes = 0;

            if (hours < 12) {
                hours += 1;
            } else {
                hours = 1;
            }
        }
    }


}