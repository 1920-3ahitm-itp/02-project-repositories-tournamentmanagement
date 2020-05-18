package at.htl.turnier.model;

public class Match {

    private Long id;
    private Team team1;
    private Team team2;
    private String description;

    public Match() {}

    public Match(Team team1, Team team2, String description) {
        this.team1 = team1;
        this.team2 = team2;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Team getTeam1() {
        return team1;
    }

    public void setTeam1(Team team1) {
        this.team1 = team1;
    }

    public Team getTeam2() {
        return team2;
    }

    public void setTeam2(Team team2) {
        this.team2 = team2;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
