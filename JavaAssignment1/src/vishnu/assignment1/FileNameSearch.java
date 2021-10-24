package vishnu.assignment1;
import java.io.File;
public class FileNameSearch {

    public void search(String path,String regexp) throws NullPointerException
    {
        File dir = new File(path);
        File files[] = dir.listFiles();
        if(files != null && files.length > 0)
        {
            for(File temp:files)
            {
                if(temp.isDirectory())
                    search(temp.getAbsolutePath(),regexp);
                 else if(temp.getName().matches(regexp))
                    System.out.println(temp.getAbsolutePath());
            }
        }
    }
}
