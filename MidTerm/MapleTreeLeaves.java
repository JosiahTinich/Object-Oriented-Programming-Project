public class MapleTreeLeaves extends MapleTree implements Seasons
{
    private String maple_Color;
    public MapleTreeLeaves(double numofLeaves,double numofBranches, int numofMapleTrees, double numofRoots, String maple_Color) {
        super(numofLeaves, numofBranches, numofMapleTrees, numofRoots);

        this.maple_Color = maple_Color;
    }

    public MapleTreeLeaves(){

        this.maple_Color = maple_Color;
    }
    public double calcBranches(){
        return getNumofBranches() * getNumofLeaves();

    }
    public double calcLeaves(){
        return getNumofLeaves() * getNumofLeaves();
    }

    @Override
    public String Spring() {
        if(maple_Color == "Orange"){
            return "It's Spring";

        }
        return "It's not Spring";
    }

    @Override
    public String Summer() {
        if(maple_Color == "Green"){
            return "It's Summer";

        }
        return "It's not Summer";
    }

    @Override
    public String Fall() {
        if(maple_Color == "Yellow"){
            return "It's Fall";

        }
        return "It's not Fall";
    }

    @Override
    public String Winter() {
        if(maple_Color == "Brown"){
            return "It's Winter";

        }
        return "It's not Winter";
    }

}
