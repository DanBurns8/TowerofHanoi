public class HanoiTower {
    private Peg peg1;
    private Peg peg2;
    private Peg peg3;
    private int numDiscs;

    public HanoiTower(int num, Peg p1, Peg p2, Peg p3) {
        numDiscs=num;
        peg1=p1;
        peg2=p2;
        peg3=p3;
    }
    public void solveTower() {
        moveTower(peg1, peg3, peg2, numDiscs);
    }

    private void moveTower(Peg startPeg, Peg endPeg, Peg extraPeg, int numtoMove) {
        if(numtoMove==1) startPeg.moveTopDisc(endPeg);
        moveTower(startPeg, extraPeg, endPeg, numtoMove-1);
        startPeg.moveTopDisc(endPeg);
        moveTower(extraPeg,endPeg,startPeg,numtoMove-1);

        // TODO move discs(number input) from the start peg to the end peg
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        HanoiTower ht = new HanoiTower(5);
        ht.solveTower();
    }

}