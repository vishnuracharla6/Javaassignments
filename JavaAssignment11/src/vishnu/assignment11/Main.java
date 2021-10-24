package vishnu.assignment11;
import java.io.File;
import java.util.*;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class Main
{
    public static void main(String[] args)
    {
        File file = new File("file1.txt");
        HashMap<Character, Integer> countMap = new HashMap<Character, Integer>();
        try (FileReader fr = new FileReader(file))
        {
            int content;
            while ((content = fr.read()) != -1){
                char ch = (char) content;
                if(countMap.containsKey(ch))
                    countMap.put(ch,countMap.get(ch)+1);
                else
                    countMap.put(ch,1);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            FileWriter myWriter = new FileWriter("file2.txt");
            for (Map.Entry entry : countMap.entrySet()) {
                myWriter.write(entry.getKey() + "   " + entry.getValue()+"\n");
            }
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}