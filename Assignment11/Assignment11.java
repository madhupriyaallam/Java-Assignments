package Java.Assignment11;

import java.awt.*;
import java.io.*;
import java.util.*;


public class Assignment11 {
    public static void main(String[] args) throws Exception
    {

        // file -> fileInputStream(Bytes) -> InputStreamReader(char) -> BufferedReader

        // opens a file
        File file = new File("/home/madha/IdeaProjects/Zemoso/src/Java/Assignment11/charfreq.txt" );
        //  reads the streams of raw bytes
        FileInputStream fileInputStream = new FileInputStream(file);
        // It reads bytes and decodes them into characters using a specified charset.
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
        // Reads text from a character-input stream
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        // opens a file to write
        FileWriter destinationFile = new FileWriter("/home/madha/IdeaProjects/Zemoso/src/Java/Assignment11/result.txt");

        String line, finalContent = "";
        HashMap<Character,Integer> container = new HashMap<>();

        // reading and appending contents of the file to a string
        while ((line = bufferedReader.readLine()) != null) {
            line = line.replace(" ", "");
            finalContent += line.toLowerCase();
        }

        // looping over the string, adding character into HashMap and incrementing count
        for (char c : finalContent.toCharArray()) {
            // checks if character is an alphabet
            if (c >= 'a' && c <= 'z') {
                // if character is already in Map, increment the value by 1
                if (container.containsKey(c)) {
                    container.put(c, container.get(c) + 1);
                }
                // if character occurs for the first time, add to map and increment by 1
                else {
                    container.put(c, 1);
                }
            }
        }

        destinationFile.write("Key\t - \tvalue\n");

        // Reading key,values from map and writing into file
        for (Map.Entry<Character, Integer> entry : container.entrySet()) {
            String key = entry.getKey().toString();
            Integer value = entry.getValue();
            String res = key+"\t - \t"+value+"\n";
            destinationFile.write(res);
        }
        // closing a file
        destinationFile.close();
    }
}