import java.nio.file.*;
import java.io.IOException;
import java.util.*;
public class Main {
    public static void main(String[] args) 
    {
        int pos = 50;
        int count0 = 0;
        Path filePath = Paths.get("Input.txt");

        try
        {
            List <String> lines = Files.readAllLines(filePath);

            for(String line : lines)
            {
                if(line.isBlank()) continue; 
                char firstElement = line.charAt(0);
                int restElements = Integer.parseInt(line.substring(1));

                if(firstElement == 'R')
                {
                    pos = (pos + restElements) % 100;
                }
                else
                {
                    pos = (pos - restElements) % 100;
                }

                if (pos < 0)
                {
                    pos += 100;
                }
                if (pos == 0)
                {
                    count0++;
                }
            }
        }catch(IOException e)
            {
                e.printStackTrace();
            }
        System.out.println(count0);
    }
    
}
