/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BounceBall;

/**
 *
 * @author workstation
 */
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;

public class Blocks {
    public int map[][];
    public int brickWidth;
    public int brickHeight;

//intial create blocks(rows,colomns)
    public Blocks(int row, int col) {
        map = new int[row][col];
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {

//the less length of array
                map[i][j] = 1;
            }
        }
//shpe of blocks
        brickWidth = 540 / col;
        brickHeight = 150 / row;
    }
//coloered the blocks
    public void draw(Graphics graphics2d, Color colorName) {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[0].length; j++) {
                if (map[i][j] > 0) {

// The distance of the blocks and their place in the frame        
                  graphics2d.setColor(colorName);
                    graphics2d.fillRect(j * brickWidth + 80, i * brickHeight + 50, brickWidth, brickHeight);

//the border and it's color between blocks       
                    graphics2d.setColor(Color.black);
                    graphics2d.drawRect(j * brickWidth + 80, i * brickHeight + 50, brickWidth, brickHeight);
                }
            }
        }
    }

}
