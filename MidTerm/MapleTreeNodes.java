public class MapleTreeNodes {

    protected int itemID;
    protected String itemName;
    protected MapleTreeNodes link;

    public MapleTreeNodes(int itemID, String itemName){
        this.itemID = itemID;
        this.itemName = itemName;
        link = null;
    }
   public void setLink(MapleTreeNodes link){
        this.link = link;
   }
   public MapleTreeNodes getLink(){
        return link;
   }
   public int getItemID(){
        return itemID;
    }
   public void setItemID(String itemName){
        this.itemName = itemName;
   }
   public String getItemName(){
        return itemName;
   }
   public void setItemName(String itemName){
        this.itemName = itemName;
   }
}
