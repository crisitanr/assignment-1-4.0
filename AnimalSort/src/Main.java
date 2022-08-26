import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        List<String> list = new ArrayList<>();
        List<String> AnimalList = new ArrayList<>();
        File filename = new File("C:\\Users\\cris\\Downloads\\animals2.txt");

        if (filename.exists()){
            try {
                list = Files.readAllLines(filename.toPath(), Charset.defaultCharset());
            } catch (IOException ex) {
                ex.printStackTrace();
            }
            if(list.isEmpty())
                return;
        }
        for(String line : list){
            String [] res = line.split(",");
            switch (res[0]){
                case "A" -> AnimalList.add(new Animal(res[1], res[2]));
                case "B" -> AnimalList.add(new cat(res[1], res[2]));

            }
            AnimalList.add(res[1]);
            System.out.println(AnimalList.toString());
        }
        }
    }

