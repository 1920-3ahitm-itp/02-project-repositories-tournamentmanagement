package at.htl.turnier.model;

public class Tournament {

    private int id;
    private String name;
    private String date;
    private int pointsWin;
    private int pointsDraw;

    public Tournament() {};

    public Tournament(String name, String date, int pointsWin, int pointsDraw) {
        this.name = name;
        this.date = date;
        this.pointsWin = pointsWin;
        this.pointsDraw = pointsDraw;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getPointsWin() {
        return pointsWin;
    }

    public void setPointsWin(int pointsWin) {
        this.pointsWin = pointsWin;
    }

    public int getPointsDraw() {
        return pointsDraw;
    }

    public void setPointsDraw(int pointsDraw) {
        this.pointsDraw = pointsDraw;
    }
}
