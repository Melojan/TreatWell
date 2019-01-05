/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package treatwell;

/**
 *
 * @author meloj
 */
import java.io.*;

public class BuildBox {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int h = Integer.parseInt(br.readLine());
        int w = Integer.parseInt(br.readLine());

        checkSizes(h, w);

        //Creating a Box
        String[][] box = buildBox(h, w);

        //Print Box
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                System.out.print(box[i][j]);
            }

            System.out.println(" ");
        }

    }

    public static void checkSizes(int h, int w) throws InvalidSizeException {
        
        //Cannot have Negative Sized Boxes
        if (h < 0 && w < 0) {
            throw new InvalidSizeException("Cannot have negative-sized dimensions");
        }
        
        //Assume it only works for similar Sized Boxes

        if (h != w) {
            throw new InvalidSizeException("Cannot have different dimensions");
        }

    }

    public static String[][] buildBox(int h, int w) {
        String[][] box = new String[h][w];

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                /////////TOP/////////
                if (i == 0) {
                    if (j == 0) //Top-Left Corner
                    {
                        box[i][j] = "┌";
                    } else if (j == w - 1) //Top-Right Corner
                    {
                        box[i][j] = "┐";
                    } else {
                        box[i][j] = "-";
                    }

                    /////////BOTTOM///////
                } else if (i == h - 1) {
                    if (j == 0) {
                        box[i][j] = "└"; //Bottom-Left Corner
                    } else if (j == w - 1) {
                        box[i][j] = "┘"; //Bottom-Right Corner
                    } else {
                        box[i][j] = "-";
                    }
                } /////////SIDES/////////
                else {
                    if (j == 0 || j == w - 1) {
                        box[i][j] = "| ";
                    } else {
                        box[i][j] = " ";
                    }
                }
            }
        }

        return box;
    }
}
