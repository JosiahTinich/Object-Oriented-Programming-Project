public class OakTreeLeaves extends OakTree implements Seasons
{
    private String oak_Color;


    public OakTreeLeaves(double numofLeaves, double numofBranches, double numofOakTrees, double numofTwigs, String oak_Color)
    {
        super(numofLeaves, numofBranches, numofOakTrees, numofTwigs);
        this.oak_Color = oak_Color;
    }

    public OakTreeLeaves()
    {
        this.oak_Color = oak_Color;
    }


    public double calcBranches(){
        return getNumofBranches() * getNumofLeaves();

    }
    public double calcLeaves(){
        return getNumofLeaves() * getNumofLeaves();
    }



    @Override
    public String Spring()
    {
        if(oak_Color == "Orange")
        {
            return "Oak: It's Spring and my leaves are Orange!";
        }
        else
        {
            return "It's not Spring!!";
        }
    }

    @Override
    public String Summer()
    {
        if(oak_Color == "Green")
        {
            return "Oak: It's Summer and my leaves are Green!";
        }
        else
        {
            return "Oak: It's not Summer!!";
        }
    }
    @Override
    public String Fall()
    {
        if(oak_Color == "Yellow")
        {
            return "Oak: It's Fall and my leaves are Yellow!";
        }
        else
        {
            return "Oak: It's not Fall!";
        }
    }
    @Override
    public String Winter()
    {
        if(oak_Color == "Brown")
        {
            return "Oak: It's Winter, my Branches are Brown and I have no Leaves!";
        }
        else
        {
            return "It's not Winter";
        }
    }
}
