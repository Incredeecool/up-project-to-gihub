
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Incredicool
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        BufferedReader br = new BufferedReader(new FileReader("PRJ321K.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"));
        String text = "";
        int i = 0;
        while((text = br.readLine()) != null){
            i++;
            bw.write(text);
            bw.newLine();
            bw.newLine();
        }
        br.close();
        bw.close();
        System.out.println("Read file complete!");
        System.out.println("Write file complete!");
	System.out.println("Yo! Test here");
    }
}
