import java.io.*;


public class FileOperator
{
    private File m_file;

    public FileOperator()
    {
        String fileName = "output.txt";
        m_file = new File(fileName);
    }

    public void writeFile(Trees[] tree) throws FileNotFoundException
    {
        PrintWriter fileOutput = new PrintWriter(m_file);

        for(int i = 0; i < tree.length; i++)
        {
            if (tree[i] instanceof OakTree)
            {
                fileOutput.println("Oak - " + tree[i].getNumofBranches());
            }
            else if(tree[i] instanceof MapleTree)
            {
                fileOutput.println("Maple - " + tree[i].getNumofLeaves());
            }
        }
        fileOutput.close();

    }
}
