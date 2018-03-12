package com.ptoop.graph.command;

import com.ptoop.graph.model.TetragonFigure;
import com.ptoop.graph.model.TriangleFigure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author: Alexey Storozhenko
 * @since: 11.03.2018
 */
public class CreateTetragonCommand implements ICommand<TetragonFigure> {

    public TetragonFigure execute() {
        BufferedReader br = null;
        try {
            br = new BufferedReader(new InputStreamReader(System.in));

            System.out.print("X1 value: ");
            int x1 = Integer.parseInt(br.readLine());
            System.out.print("Y1 value: ");
            int y1 = Integer.parseInt(br.readLine());
            System.out.print("X2 value: ");
            int x2 = Integer.parseInt(br.readLine());
            System.out.print("Y2 value: ");
            int y2 = Integer.parseInt(br.readLine());
            System.out.print("X3 value: ");
            int x3 = Integer.parseInt(br.readLine());
            System.out.print("Y3 value: ");
            int y3 = Integer.parseInt(br.readLine());
            System.out.print("X4 value: ");
            int x4 = Integer.parseInt(br.readLine());
            System.out.print("Y4 value: ");
            int y4 = Integer.parseInt(br.readLine());
            return new TetragonFigure(x1, y1, x2, y2, x3, y3, x4, y4);

        } catch (IOException e) {
            e.printStackTrace();
            return null;
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
