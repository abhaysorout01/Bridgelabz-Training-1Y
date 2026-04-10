package LogisticProblem;

abstract class CheckPoint {
    String checkpointId;
    String locationName;
    int distanceFromLast; // in kilometers
    int expectedDuration; // in minutes
    int actualDuration; // in minutes

    public CheckPoint(String checkpointId, String locationName, int distanceFromLast, int expectedDuration, int actualDuration) {
        this.checkpointId = checkpointId;
        this.actualDuration = actualDuration;
        this.expectedDuration = expectedDuration;
        this.locationName = locationName;
        this.distanceFromLast = distanceFromLast;
    }
    public boolean isDelayed() {
        return actualDuration > expectedDuration;
    }

    public abstract boolean isCritical();
    public abstract String getType();
    public abstract double calculatePenalty();
}
