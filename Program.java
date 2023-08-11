package JavaException3;

import java.io.IOException;
import java.util.HashMap;

public class Program {
    public static void main(String[] args) {
        ParseData parseData = new ParseData(); 
        String newFileName = null; 
        WriteFile writeFile = new WriteFile(); 

        HashMap<String, Object> data = parsData.parseInputData(); 
        while (data.size() != 6) {
            try {
                throw new DataExceptions();
            } catch (DataExceptions e) {
                data = parseData.parseInputData();
            }
        } 

        newFileName = data.get("lastName") + ".txt"; 
        StringBuilder sb = new StringBuilder();
        for (String str : data.keySet()) {
            sb.append(data.get(str));
            sb.append(" ");
        }


        System.out.println(data);
        String filePath = newFileName;
        System.out.println(filePath);
        writeFile.writeData(String.valueOf(sb), filePath); 

    }
}
