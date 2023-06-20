package day36lambda;

/*
     If a Class has
       i)"private" variables
       ii)Constructor with all parameters
       iii)Constructor without any parameter
       iv)All getters and setters
       v)toString() method
    then it is called "POJO Class".
    POJO stands for "Plain Old Java Object"
 */

public class Courses {

    private String courseName;
    private int numOfStd;
    private String season;
    private double avgScore;


    public Courses(String courseName, int numOfStd, String season, double avgScore) {
        this.courseName = courseName;
        this.numOfStd = numOfStd;
        this.season = season;
        this.avgScore = avgScore;
    }

    public Courses() {
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    public int getNumOfStd() {
        return numOfStd;
    }
    public void setNumOfStd(int numOfStd) {
        this.numOfStd = numOfStd;
    }
    public String getSeason() {
        return season;
    }
    public void setSeason(String season) {
        this.season = season;
    }
    public double getAvgScore() {
        return avgScore;
    }
    public void setAvgScore(double avgScore) {
        this.avgScore = avgScore;
    }


    @Override
    public String toString() {
        return  "CourseName='" + courseName + '\'' +
                ", NumOfStd=" + numOfStd +
                ", Season='" + season + '\'' +
                ", AvgScore=" + avgScore;

    }
}
