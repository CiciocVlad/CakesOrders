package Entity;

public class Tort extends Entity<Long> {
    private String tip;

    public Tort(String tip) {
        this.tip = tip;
    }

    public String getTip() {
        return this.tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }
}
