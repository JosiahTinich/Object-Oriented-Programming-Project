import java.io.*;
import java.util.Scanner;
public class TestProject
{
    public static void main(String[] args)
    {
 
        MapleTree m1 = new MapleTree(11.0, 15.0, 25, 23.3);
        MapleTree m2 = new MapleTree();
        MapleTreeLeaves mL1 = new MapleTreeLeaves(14.0, 25.0, 13, 87.0, "Brown");
        MapleTreeLeaves mL2 = new MapleTreeLeaves();
        MapleTreeLeaves mL3 = new MapleTreeLeaves(4.7, 11.2, 24, 67.3, "Orange");
        MapleTreeLeaves mL4 = new MapleTreeLeaves(32.8, 45.9, 18, 21.4, "Green");
        MapleTreeLeaves mL5 = new MapleTreeLeaves(23.9, 31.7, 30, 34.4, "Yellow");

        OakTree s1 = new OakTree(20.0, 15.0, 30, 50.5);
        OakTree s2 = new OakTree();
        OakTreeLeaves z1 = new OakTreeLeaves(100.0, 50.0, 30.0, 200.0, "Green");
        OakTreeLeaves z2 = new OakTreeLeaves(75.0, 35.0, 30.0, 150.0, "Yellow");
        OakTreeLeaves z3 = new OakTreeLeaves(50.0, 20.0, 25.5, 100.5, "Brown");
        OakTreeLeaves z4 = new OakTreeLeaves(60.0, 30.0, 27.5, 125.5, "Orange");
        OakTreeLeaves z5 = new OakTreeLeaves();


        System.out.println(s1.calcBranches());
        System.out.println(s2.calcLeaves());
        System.out.println(z1.calcBranches());
        System.out.println(z1.calcLeaves());
        System.out.println(z2.calcBranches());
        System.out.println(z2.calcLeaves());
        System.out.println(z3.calcBranches());
        System.out.println(z3.calcLeaves());
        System.out.println(z4.calcBranches());
        System.out.println(z4.calcLeaves());
        System.out.println(z5.calcBranches());
        System.out.println(z5.calcLeaves());

        System.out.println(z1.Summer());
        System.out.println(z1.Winter());
        System.out.println(z2.Fall());
        System.out.println(z2.Spring());
        System.out.println(z3.Winter());
        System.out.println(z3.Summer());
        System.out.println(z4.Spring());
        System.out.println(z4.Fall());




        System.out.println(m1.calcBranches());
        System.out.println(m2.calcLeaves());
        System.out.println(mL2.calcBranches());
        System.out.println(mL2.calcLeaves());
        System.out.println(mL3.calcBranches());
        System.out.println(mL3.calcLeaves());
        System.out.println(mL4.calcBranches());
        System.out.println(mL4.calcLeaves());
        System.out.println(mL5.calcBranches());
        System.out.println(mL5.calcLeaves());
        System.out.println(mL1.Winter());
        System.out.println(mL1.Fall());
        System.out.println(mL3.Spring());
        System.out.println(mL3.Fall());
        System.out.println(mL4.Summer());
        System.out.println(mL4.Winter());
        System.out.println(mL5.Fall());
        System.out.println(mL5.Summer());

        MapleTree array = new MapleTree();
        try {
            array.getArrayMappleTrees(4);
        } catch (MapleTree.MapleTreeException exception) {
            System.out.println(exception.getMessage());
        }

        MapleTreeList list = new MapleTreeList();
        list.insert(0,"f");
        list.insert(1,"g");
        list.insert(2,"s");
        list.insert(3,"j");
        list.insert(4,"c");
        list.insert(5,"t");
        list.remove(0);
        System.out.println(list.contains(13));
        System.out.println(list.contains(2));
        System.out.println(list.toString());



    }
}
