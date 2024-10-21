public class MapleTree extends Trees
{
    private int numofMapleTrees;
    private double numofRoots;

    public MapleTree(double numofLeaves,double numofBranches, int numofMapleTrees, double numofRoots)
    {
        super(numofLeaves, numofBranches);
        this.numofMapleTrees = numofMapleTrees;
        this.numofRoots= numofRoots;
    }
    public MapleTree()
    {
        this.numofMapleTrees = numofMapleTrees;
        this.numofRoots= numofRoots;
    }

    public static class MapleTreeException extends Exception{
        public MapleTreeException(String message){
            super(message);
        }
    }

    public void getArrayMappleTrees(int numofMapleTrees) throws MapleTreeException{

        MapleTree[] newArray = new MapleTree[numofMapleTrees];
        newArray[0] = new MapleTreeLeaves();
        for(int i = 0; i < newArray.length; i++){
            if(newArray[i] instanceof MapleTreeLeaves){
                throw new MapleTreeException("This is a MapleTreeLeave! Not a Maple Tree");
            }
            else {
                newArray[i] = new MapleTree() ;
            }
        }
    }

    public double calcBranches(){
        return getNumofBranches() * numofRoots;

    }
    public double calcLeaves(){
        return getNumofLeaves() * numofRoots;
    }


}
