/** Created by Yoitsu Kmaijo, a program used to convert standard
 * alphabet into modified katakana script that is used to denote Itak
 * language pronunciations. */

package itak;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintStream;
import java.io.Reader;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.StringReader;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.io.BufferedWriter;
import java.io.StringWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.lang.*;

import javax.swing.JFrame;
import javax.swing.JLabel;


/** This class is the main class that is going to be used for the project. */
public class ItakMain {
    
    public static void main(String[] args) throws IOException {
        /* BufferedReader input =
                new BufferedReader(new InputStreamReader(System.in)); */
        try {
            Reader input = new FileReader(new File(args[0]));
            Scanner scan = new Scanner(input);
            StringBuilder converted = new StringBuilder();
            while (scan.hasNextLine()) {
                String line = scan.nextLine();
                ItakConverter convert = new ItakConverter(line);
                converted.append(convert.Convert());

                //PrintStream out = new PrintStream(System.out, true, "UTF-32");
                //System.out.println("\u31F0");
            }
            printItak(converted, args[1]);
        } catch (IOException excp) {
            System.err.printf("Input error: %s%n", excp.getMessage());
            System.exit(1);
        } catch (IllegalArgumentException excp) {
            System.err.printf("Input error: %s%n", excp.getMessage());
            System.exit(1);
        } catch (NullPointerException excp) {
            System.err.printf("Null Pointer error: %s%n", excp.getMessage());
            System.exit(1);
        }
    }
    
    public static void printItak(StringBuilder converted, String fileName) {
//        System.out.print(converted);
//        JFrame frame = new JFrame();
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setSize(100,150);  
//        //create a label for a heart shape
//        JLabel label = new JLabel(converted);
//        frame.add(label);
//        frame.setVisible(true);
            
            try {
                File file = new File(fileName);
                FileOutputStream fos = new FileOutputStream(file);
                OutputStreamWriter out = new OutputStreamWriter(fos, "UTF8");
                Writer writeTo = new BufferedWriter(out);
                writeTo.write(converted.toString());
                writeTo.close();
            }  catch (IOException excp) {
                System.err.printf("Input error: %s%n", excp.getMessage());
                System.exit(1);
            } catch (IllegalArgumentException excp) {
                System.err.printf("Input error: %s%n", excp.getMessage());
                System.exit(1);
            } catch (NullPointerException excp) {
                System.err.printf("Null Pointer error: %s%n", excp.getMessage());
                System.exit(1);
            }
        


    }
}