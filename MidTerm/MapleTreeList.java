import java.util.Map;

public class MapleTreeList {

    private int[] mapleTreeList;
    private int index;
    private MapleTreeNodes firstNode;

    public MapleTreeList(int cap){
        mapleTreeList = new int[cap];
        index = 0;
    }
    public MapleTreeList(){
        firstNode = null;
    }

    public void insert(int item, String itemName){
        MapleTreeNodes newItem = new MapleTreeNodes(item, itemName);
        newItem.setLink(firstNode);
        firstNode = newItem;
    }

    public Boolean contains(int item){
        MapleTreeNodes currNode = firstNode;
        while (currNode != null){
            if(currNode.getItemID() == item){
                return true;
            }
            else {
                currNode = currNode.getLink();
            }
        }
        return false;
    }

    public String toString(){
        String listContent = "The list contains: ";
        MapleTreeNodes currNode = firstNode;
        while(currNode != null){
            listContent += currNode.getItemID() + "";
            currNode = currNode.getLink();

        }
        return listContent;
    }

    public void remove(int item){

        if(firstNode.getLink() == null){
            return;
        }
        if(firstNode.getItemID() == item){
            firstNode = null;
            return;
        }
            MapleTreeNodes currNode = firstNode;
            while (currNode.getLink() != null) {
                MapleTreeNodes pre = currNode;
                currNode = currNode.getLink();
                if (currNode.getItemID() == item) {
                    pre.setLink(currNode.getLink());
                    return;
                }
            }

    }

}
