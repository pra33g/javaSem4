//generates files having question statement at top
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
class FileMaker {
    
    public static void main(String[] args) {
        try{
            FileReader fileReader = new FileReader("ques.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String str = null;
            int p_number = 0;
            while((str = bufferedReader.readLine()) != null){
                ++p_number;
                if (p_number >= 24){
                    FileWriter fileWriter = new FileWriter("P" + p_number + ".java");
                    BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                    
                    String prepend = "//",
                    append = "\nclass P" + p_number + "{\n\tpublic static void main(String args[]){\n\n\t}\n}" ;
                    
                    str = prepend + str;
                    str = str + append;
                    
                    bufferedWriter.write(str);
                    bufferedWriter.flush();

                    bufferedWriter.close();
                    fileWriter.close();

                }
            }

            bufferedReader.close();
            fileReader.close();
        }
        catch (Exception e){
                System.out.println("Exception!");
        }
    }
}
