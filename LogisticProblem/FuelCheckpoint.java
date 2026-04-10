package LogisticProblem;

public class FuelCheckpoint extends DeliveryCheckpoint{

        public FuelCheckpoint(String id, String loc, int d, int e, int a) {
            super(id, loc, d, e, a);
        }

        public boolean isCritical() { return true; }

        public String getType() { return "FuelCheckpoint"; }

        public double calculatePenalty() {
            return isDelayed() ? 10 : 0;
        }
}
