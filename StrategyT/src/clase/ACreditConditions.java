package clase;

public abstract class ACreditConditions {
        protected double rate;
        protected int durationInMonths;

        public double getRate() {
            return rate;
        }

        public void setRate(double rate) {
            this.rate = rate;
        }

        public int getDurationInMonths() {
            return durationInMonths;
        }

        public void setDurationInMonths(int durationInMonths) {
            this.durationInMonths = durationInMonths;

    }

}
