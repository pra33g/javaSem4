// WAP that accept two file names as command line arguments. Copy only those lines from the first file to second file which contains the word Computers. Also count number of words in first file
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;
class P35{
    
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("Resources" + File.separator + args[0]);
            FileWriter fileWriter = new FileWriter("Resources" + File.separator + args[1], true);
            Scanner s = new Scanner(fileReader);
            while(s.hasNextLine()){
                String line = s.nextLine();
                if (line.toLowerCase().contains("computers") || line.toLowerCase().contains("computers.")){
                    fileWriter.append(line + "\n");
                    System.out.println(line);
                }
            }
            s.close();
            
            fileReader.close();
            System.out.println("Done");
            
            fileReader = new FileReader("Resources" + File.separator + args[0]);

            int readInt = fileReader.read();
            int counter = 0;
            while(readInt != -1){
                if (readInt == 10 || readInt == 32){
                    counter++;
                }
                readInt = fileReader.read();
            }
            System.out.println("Words = " + counter);

            fileWriter.close();
            fileReader.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        
    }

}

