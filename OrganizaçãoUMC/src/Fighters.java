public class Fighters {

    private String name;
    private String nationality;
    private int age;
    private float height;
    private float weight;
    private String category;
    private int victories;
    private int defeats;
    private int draws;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
        setCategory();
    }

    public String getCategory() {
        return category;
    }

    private void setCategory() {
        if (this.getWeight() < 52.2) {
            this.category = "Invalid";
        } else if (this.getWeight() <= 70.3) {
            this.category = "Lightweight";
        } else if (this.getWeight() <= 83.9) {
            this.category = "Middleweight";
        } else if (this.getWeight() <= 120.2) {
            this.category = "Heavyweight";
        } else {
            this.category = "Invalid";
        }
    }

    public int getVictories() {
        return victories;
    }

    public void setVictories(int victories) {
        this.victories = victories;
    }

    public int getDefeats() {
        return defeats;
    }

    public void setDefeats(int defeats) {
        this.defeats = defeats;
    }

    public int getDraws() {
        return draws;
    }

    public void setDraws(int draws) {
        this.draws = draws;
    }

    public void apresentar() {
        System.out.println("Fighter " + this.getName());
        System.out.println("From " + this.getNationality());
        System.out.println("Aged " + this.getAge());
        System.out.println("Height " + this.getHeight());
        System.out.println("Weight " + this.getWeight());
        System.out.println("Category " + this.getCategory());
        System.out.println("History: " + this.getVictories() + " wins " + this.getDefeats() + " defeats " + this.getDraws() + " draws.");
    }

    public void status() {
        System.out.println(this.getName());
        System.out.println(this.getNationality());
        System.out.println(this.getAge());
        System.out.println(this.getCategory());
        System.out.println(this.getHeight());
        System.out.println(this.getWeight());
        System.out.println(this.getVictories());
        System.out.println(this.getDefeats());
        System.out.println(this.getDraws());
    }

    public void winFight() {
        this.setVictories(this.getVictories() + 1);
    }

    public void loseFight() {
        this.setDefeats(this.getDefeats() + 1);
    }

    public void drawFight() {
        this.setDraws(this.getDraws() + 1);
    }

    public Fighters(String nm, String na, int ag, float hgt, float wgt, int w, int l, int d) {
        this.setName(nm);
        this.setNationality(na);
        this.setAge(ag);
        this.setHeight(hgt);
        this.setWeight(wgt);
        this.setVictories(w);
        this.setDefeats(l);
        this.setDraws(d);
    }
}
