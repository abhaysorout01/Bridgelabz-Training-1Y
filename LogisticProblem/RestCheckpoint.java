package LogisticProblem;

public class RestCheckpoint extends CheckPoint {

    public RestCheckpoint(String id, String loc, int d, int e, int a) {
        super(id, loc, d, e, a);
    }

    public boolean isCritical() { return false; }

    public String getType() { return "RestCheckpoint"; }

    public double calculatePenalty() {
        if(!isDelayed()) return 0;

        int delay = actualDuration - expectedDuration;
        if(delay > 30) return delay * 0.5;

        return 0;
    }
}

