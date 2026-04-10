package LogisticProblem;

public class DeliveryCheckpoint extends CheckPoint {

        public DeliveryCheckpoint(String id, String loc, int d, int e, int a) {
            super(id, loc, d, e, a);
        }

        public boolean isCritical() { return true; }

        public String getType() { return "DeliveryCheckpoint"; }

        public double calculatePenalty() {
            if(!isDelayed()) return 0;
            return (actualDuration - expectedDuration) * 2;
    }

}
