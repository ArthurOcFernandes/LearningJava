public class OrgFights {
    public static void main(String[] args) {
        Fighters f[] = new Fighters[6];
        f[0] = new Fighters("Pretty boy", "France", 31, 1.75f, 68.9f, 11, 2, 1);
        f[1] = new Fighters("Putscript", "Brazil", 29, 1.68f, 57.8f, 14, 2, 3);
        f[2] = new Fighters("Snapshadow", "USA", 35, 1.65f, 80.9f, 12, 2, 1);
        f[3] = new Fighters("Dead Code", "Australia", 28, 1.93f, 81.6f, 13, 0, 2);
        f[4] = new Fighters("UFOCobol", "Brazil", 37, 1.70f, 119.3f, 5, 4, 3);
        f[5] = new Fighters("Nerdaart", "USA", 30, 1.81f, 105.7f, 12, 2, 4);

        Fights UMC01 = new Fights();
        UMC01.scheduleFight(f[0], f[1]);
        UMC01.fight();
        f[0].status();
        f[1].status();
    }
}
