class Clock {

    int hours = 12;
    int minutes = 0;

    void next() {
        minutes = minutes+1;
        if (minutes == 60) {
            hours = hours +1;
            if (hours == 13) {
                hours = 1;
            }
            minutes = 00;
        }
    }
}