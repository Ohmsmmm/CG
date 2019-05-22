import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class CgPlate {

    private String getInput() {
        //get svg text
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        String s = "";
        while(in.hasNext()) {
            s += in.nextLine() + "\n";
        }
        in.close();
        return s;
    }

    private String clearText(String s) {
        //clear all text and left with coordinate and color
        s = s.replaceAll("(?m)^<.*>|^(?:[\t ]*(?:\r?\n|\r))+| st.*>|[^0-9, ]","");
        s = s.replaceAll(",", " ");
        s = s.replaceAll(" +", " ");
        s = s.trim();
        return s;
    }

    private void printPlate(String s) {
        String [] d = s.split(" ");
        int bound, sub, j = 0, k = 0, l = 1;
        int [] dot = new int[6];
        int [] color = new int[3];

        System.out.println("\tprivate void fillPolygon0(Graphics g) {");
        
        for (int i = 0; i < d.length; i++) {
            bound = i % 9;
            sub = i % 10001;
            if (bound < 6) {
                //coordinate
                dot[j++ % 6] = Integer.parseInt(d[i]);
            }
            else {
                //color
                color[k++ % 3] = Integer.parseInt(d[i]);
            }
            if (bound == 8&&color[0]>=250&&dot[1]<=200&&dot[0]<=390) {
                //1 batch of data
                System.out.printf("\t\tfillPolygon(g, %d, %d, %d, %d, %d, %d, new Color(%d, %d, %d));\n", dot[0], dot[1], dot[2], dot[3], dot[4], dot[5], color[0], color[1], color[2]);
            }
            if (sub == 10000) {
                //subfunction every 1000 lines
                System.out.println("\t}\n");
                System.out.printf("\tprivate void fillPolygon%d(Graphics g) {\n",l);
                l++;
            }
        }
        System.out.println("\t}\n");

        System.out.println("\tpublic void paintComponent(Graphics g) {");
        for (int i = 0; i < l; i++) {
            System.out.printf("\t\tfillPolygon%d(g);\n",i);
        }
        System.out.println("\t}\n");
        System.out.print("}");
    }

    CgPlate() {
        String s = getInput();
        s = clearText(s);
        printPlate(s);
    }

    public static void main(String[] args) {
        CgPlate cg = new CgPlate();
    }

/*
    //insert this in your code

    private void fillPolygon(Graphics g, int x1, int y1, int x2, int y2, int x3, int y3, Color color) {
        Polygon poly = new Polygon();
        poly.addPoint(x1, y1);
        poly.addPoint(x2, y2);
        poly.addPoint(x3, y3);
        g2.setColor(color);
        g2.fillPolygon(poly);
    }
*/

}