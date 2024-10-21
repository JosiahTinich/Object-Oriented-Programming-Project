import java.io.*;

public class OakTree extends Trees
{
    private double numofOakTrees;
    private double numofTwigs;


    public OakTree(double numofLeaves, double numofBranches, double numofOakTrees, double numofTwigs)
    {
        super(numofLeaves, numofBranches);
        this.numofOakTrees = numofOakTrees;
        this.numofTwigs = numofTwigs;
    }

    public OakTree()
    {
        this.numofOakTrees = numofOakTrees;
        this.numofTwigs = numofTwigs;
    }

    public double calcBranches(){
        return getNumofBranches() * getNumofLeaves();

    }
    public double calcLeaves(){
        return getNumofLeaves() * getNumofLeaves();
    }











}
