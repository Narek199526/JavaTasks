package javaClass;

public class Sportsman {
    private int[] points;
    private int pointsFromRunning;
    private int aScoreFromPullUps;
    private int pointsFromSwimming;
    private int pointsFromJumping;

    // constrictor for sportsman
    Sportsman(int running, int pullUps, int swimming, int jumping){

        setPointsFromRunning(running);
        setAScoreFromPullUps(pullUps);
        setPointsFromSwimming(swimming);
        setPointsFromJumping(jumping);
    }

    // setter and getter for running
    void setPointsFromRunning(int pointsFromRunning){
        if(pointsFromRunning >= 50 && pointsFromRunning <= 100){
            this.pointsFromRunning = pointsFromRunning;
        }else {
            System.exit(1);
        }
    }
    public int getPointsFromRunning() {
        return pointsFromRunning;
    }


    // setter and getter for pull-ups
    public void setAScoreFromPullUps(int aScoreFromPullUps) {
        if (aScoreFromPullUps >= 50 && aScoreFromPullUps <= 100) {
            this.aScoreFromPullUps = aScoreFromPullUps;
        }else{
            System.exit(1);
        }
    }
    public int getaScoreFromPullUps() {
        return aScoreFromPullUps;
    }


    // setter and getter for swimming
    public void setPointsFromSwimming(int pointsFromSwimming) {
        if (pointsFromSwimming >= 50 && pointsFromSwimming <= 100) {
            this.pointsFromSwimming = pointsFromSwimming;
        }else {
            System.exit(1);
        }
    }
    public int getPointsFromSwimming() {
        return pointsFromSwimming;
    }


    // setter and getter for jumping
    public void setPointsFromJumping(int pointsFromJumping) {
        if (pointsFromJumping >= 50 && pointsFromJumping <= 100) {
            this.pointsFromJumping = pointsFromJumping;
        }
    }
    public int getPointsFromJumping() {
        return pointsFromJumping;
    }
    public double scoreAverage (){
        double count = 0;
        if (pointsFromRunning > 0 && aScoreFromPullUps > 0 && pointsFromSwimming > 0 && pointsFromJumping > 0){
            count = (pointsFromRunning + aScoreFromPullUps + pointsFromSwimming + pointsFromJumping) / 4;
        }
        return count;
    }
    //equal method
     public int equal(Sportsman sportsman){
        if (this.scoreAverage() > sportsman.scoreAverage()){
            return 1;
        }else if (this.scoreAverage() < sportsman.scoreAverage()) {
            return -1;
        }else {
            return 0;
        }
    }
}
