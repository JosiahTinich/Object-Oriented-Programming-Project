public abstract class Trees {
    private double numofLeaves;
    private double numofBranches;

    // argument constructon
    public Trees(double numofLeaves, double numofBranches) {
        this.numofLeaves = numofLeaves;
        this.numofBranches = numofBranches;

    }

    // no args constructor
    public Trees() {
        this.numofLeaves = getNumofLeaves();
        this.numofBranches = getNumofBranches();
    }

    public void setNumofLeaves(double numofLeaves) {
        this.numofLeaves = numofLeaves;

    }

    public void setNumofBranches(double numofBranches) {
        this.numofBranches = numofBranches;
    }

    public double getNumofLeaves(){
        return numofLeaves;
    }


    public double getNumofBranches() {
        return numofBranches;
    }

    abstract double calcBranches();
    abstract double calcLeaves();

}


