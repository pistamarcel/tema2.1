public class BirdWatcher {
    private final int[] birdsPerDay;
    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }
    public int[] getLastWeek() {
        return birdsPerDay;
    }
    public int getToday() {
        if (birdsPerDay.length == 0) {
            return 0;
        }
        return birdsPerDay[birdsPerDay.length - 1];
    }
    public void incrementTodaysCount() {
        birdsPerDay[birdsPerDay.length - 1]++;
    }
    public boolean hasDayWithoutBirds() {
        for(int i : birdsPerDay) {
            if (i == 0) {
                return true;
            }
        }
        return false;
    }
    public int getCountForFirstDays(int numberOfDays) {
        int count = 0;
        for(int i =0; i < numberOfDays && i < birdsPerDay.length ; i++) {
            count += birdsPerDay[i];
        }
        return count;
    }
    public int getBusyDays() {
        int numberOfBusyDays = 0;
        for (int day : birdsPerDay) {
            if (day >= 5) {
                numberOfBusyDays++;
            }
        }
        return numberOfBusyDays;
    }
}



