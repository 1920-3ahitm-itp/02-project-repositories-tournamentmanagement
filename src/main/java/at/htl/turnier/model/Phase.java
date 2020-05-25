package at.htl.turnier.model;

public class Phase {

    private Long id;
    private int order;
    private Tournament tournament;

    public Phase () {}

    public Phase(int order, Tournament tournament) {
        this.order = order;
        this.tournament = tournament;
    }

    public Tournament getTournament() {
        return tournament;
    }

    public void setTournament(Tournament tournament) {
        this.tournament = tournament;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }
}
