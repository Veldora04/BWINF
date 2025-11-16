package com.BWINF;

import java.nio.file.*;
import java.io.*;
import java.util.*;

public class Reader {

    public static ArrayList<Vector>[] read(String filename) throws IOException {

        String content = Files.readString(Path.of(filename));
        String[] p = content.trim().split("\\s+");
        int idx = 0;

        int k = Integer.parseInt(p[idx++]); // Wege

        ArrayList<Vector> paths = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            double x1 = Double.parseDouble(p[idx++]);
            double y1 = Double.parseDouble(p[idx++]);
            double x2 = Double.parseDouble(p[idx++]);
            double y2 = Double.parseDouble(p[idx++]);

            paths.add(new Vector(x1, y1));
            paths.add(new Vector(x2, y2));
        }

        int sCount = Integer.parseInt(p[idx++]);

        @SuppressWarnings("unchecked")
        ArrayList<Vector>[] res = new ArrayList[sCount + 1];
        res[0] = paths;

        for (int s = 1; s <= sCount; s++) {
            int n = Integer.parseInt(p[idx++]);
            ArrayList<Vector> lake = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                double x = Double.parseDouble(p[idx++]);
                double y = Double.parseDouble(p[idx++]);
                lake.add(new Vector(x, y));
            }
            res[s] = lake;
        }

        return res;
    }
}


