import java.util.Random;

public class Fights {
    public Fighters challenged;
    public Fighters challenger;
    public int rounds;
    public boolean approved;

    public Fighters getChallenged() {
        return challenged;
    }

    public void setChallenged(Fighters challenged) {
        this.challenged = challenged;
    }

    public Fighters getChallenger() {
        return challenger;
    }

    public void setChallenger(Fighters challenger) {
        this.challenger = challenger;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isApproved() {
        return approved;
    }

    private void setApproved(boolean approved) {
        this.approved = approved;
    }

    public void scheduleFight(Fighters f1, Fighters f2) {
        if (f1.getCategory() == f2.getCategory() && f1 != f2) {
            setApproved(true);
            setChallenger(f1);
            setChallenged(f2);
        } else {
            setApproved(false);
            setChallenger(null);
            setChallenged(null);
        }
    }

    public void fight() {
        if (isApproved()) {
            System.out.println(" ||| Challenged |||");
            challenged.apresentar();
            System.out.println(" ||| Challenger |||");
            challenger.apresentar();

            Random windl = new Random();
            int winner = windl.nextInt(3);
            switch (winner) {
                case 0:
                    System.out.println("Fight Drawn");
                    challenger.drawFight();
                    challenged.drawFight();
                    break;
                case 1:
                    System.out.println("Fight won by the challenged");
                    challenged.winFight();
                    challenger.loseFight();
                    break;
                case 2:
                    System.out.println("Fight won by the challenger");
                    challenger.winFight();
                    challenged.loseFight();
                    break;
            }

        } else {
            System.out.println("Fight cannot happen");
        }

    }

}




