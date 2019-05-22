import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class PolygonPlate extends JPanel {

    public static void main(String[] args) {
        PolygonPlate m = new PolygonPlate();

        JFrame f = new JFrame();
        f.add(m);
        f.setTitle("Polygon Template");
        f.setSize(600, 600);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        f.setResizable(false);
    }

    private void fillPolygon(Graphics g, int x1, int y1, int x2, int y2, int x3, int y3, Color color) {
        // this function let you draw a polygon and fill at the same time
        Polygon poly = new Polygon();
        poly.addPoint(x1, y1);
        poly.addPoint(x2, y2);
        poly.addPoint(x3, y3);
        g.setColor(color);
        g.fillPolygon(poly);
    }

	private void fill(Graphics g){
    fillPolygon(g, 63, 112, 70, 126, 77, 112, new Color(250, 251, 243));
    fillPolygon(g, 182, 119, 189, 126, 189, 112, new Color(255, 218, 21));
    fillPolygon(g, 189, 112, 189, 126, 196, 112, new Color(255, 252, 65));
    fillPolygon(g, 196, 112, 196, 133, 210, 112, new Color(255, 176, 14));
    fillPolygon(g, 210, 112, 217, 126, 217, 119, new Color(253, 188, 26));
    fillPolygon(g, 210, 112, 196, 133, 217, 126, new Color(255, 175, 4));
    fillPolygon(g, 210, 112, 217, 119, 231, 112, new Color(253, 173, 16));
    fillPolygon(g, 224, 91, 210, 112, 231, 112, new Color(255, 251, 100));
    fillPolygon(g, 217, 119, 217, 126, 231, 119, new Color(251, 189, 28));
    fillPolygon(g, 217, 126, 231, 126, 231, 119, new Color(252, 188, 20));
    fillPolygon(g, 231, 112, 231, 119, 238, 112, new Color(255, 205, 4));
    fillPolygon(g, 231, 119, 231, 126, 238, 126, new Color(251, 182, 16));
    fillPolygon(g, 231, 126, 238, 140, 238, 126, new Color(255, 193, 14));
    fillPolygon(g, 238, 175, 238, 182, 245, 175, new Color(255, 255, 69));
    fillPolygon(g, 238, 182, 231, 182, 245, 189, new Color(254, 225, 37));
    fillPolygon(g, 245, 105, 252, 105, 252, 91, new Color(254, 254, 58));
    fillPolygon(g, 245, 105, 252, 112, 252, 105, new Color(255, 253, 54));
    fillPolygon(g, 238, 168, 245, 175, 252, 168, new Color(255, 253, 72));
    fillPolygon(g, 245, 63, 259, 63, 259, 49, new Color(255, 242, 42));
    fillPolygon(g, 252, 105, 252, 112, 259, 112, new Color(255, 254, 65));
    fillPolygon(g, 245, 126, 245, 133, 259, 133, new Color(255, 233, 26));
    fillPolygon(g, 245, 133, 252, 140, 259, 133, new Color(250, 218, 21));
    fillPolygon(g, 259, 49, 266, 56, 266, 49, new Color(253, 252, 63));
    fillPolygon(g, 259, 49, 259, 63, 266, 56, new Color(254, 248, 48));
    fillPolygon(g, 245, 77, 245, 84, 266, 77, new Color(255, 255, 81));
    fillPolygon(g, 252, 91, 252, 105, 266, 105, new Color(253, 253, 71));
    fillPolygon(g, 252, 105, 259, 112, 266, 105, new Color(253, 254, 62));
    fillPolygon(g, 259, 133, 266, 133, 266, 119, new Color(253, 207, 33));
    fillPolygon(g, 252, 112, 245, 126, 266, 119, new Color(255, 255, 63));
    fillPolygon(g, 259, 112, 252, 112, 266, 119, new Color(252, 254, 57));
    fillPolygon(g, 259, 133, 266, 140, 266, 133, new Color(255, 197, 35));
    fillPolygon(g, 252, 140, 252, 154, 266, 140, new Color(250, 200, 9));
    fillPolygon(g, 259, 133, 252, 140, 266, 140, new Color(254, 200, 32));
    fillPolygon(g, 266, 49, 266, 56, 273, 56, new Color(250, 255, 62));
    fillPolygon(g, 266, 70, 266, 77, 273, 77, new Color(252, 249, 106));
    fillPolygon(g, 266, 105, 273, 105, 273, 98, new Color(255, 209, 28));
    fillPolygon(g, 266, 105, 266, 119, 273, 105, new Color(255, 200, 21));
    fillPolygon(g, 266, 119, 273, 119, 273, 105, new Color(254, 203, 24));
    fillPolygon(g, 266, 119, 266, 133, 273, 119, new Color(251, 203, 33));
    fillPolygon(g, 266, 133, 273, 133, 273, 119, new Color(253, 205, 33));
    fillPolygon(g, 266, 133, 266, 140, 273, 133, new Color(254, 200, 32));
    fillPolygon(g, 259, 112, 266, 119, 266, 105, new Color(255, 255, 63));
    fillPolygon(g, 273, 77, 280, 77, 280, 70, new Color(255, 253, 139));
    fillPolygon(g, 266, 70, 273, 77, 280, 70, new Color(255, 252, 87));
    fillPolygon(g, 273, 63, 266, 70, 280, 70, new Color(253, 255, 54));
    fillPolygon(g, 273, 77, 280, 84, 280, 77, new Color(255, 216, 25));
    fillPolygon(g, 273, 98, 280, 98, 280, 84, new Color(251, 211, 25));
    fillPolygon(g, 266, 77, 273, 98, 280, 84, new Color(255, 224, 28));
    fillPolygon(g, 273, 77, 266, 77, 280, 84, new Color(251, 242, 89));
    fillPolygon(g, 273, 98, 273, 105, 280, 98, new Color(254, 208, 26));
    fillPolygon(g, 273, 105, 280, 105, 280, 98, new Color(254, 208, 26));
    fillPolygon(g, 273, 105, 280, 112, 280, 105, new Color(253, 207, 25));
    fillPolygon(g, 273, 105, 273, 119, 280, 112, new Color(255, 205, 24));
    fillPolygon(g, 266, 140, 266, 161, 280, 147, new Color(250, 195, 30));
    fillPolygon(g, 266, 161, 280, 154, 280, 147, new Color(254, 194, 38));
    fillPolygon(g, 273, 133, 266, 140, 280, 147, new Color(255, 196, 40));
    fillPolygon(g, 273, 63, 280, 70, 287, 56, new Color(251, 255, 80));
    fillPolygon(g, 280, 70, 287, 70, 287, 56, new Color(251, 249, 136));
    fillPolygon(g, 280, 70, 280, 77, 287, 70, new Color(255, 242, 75));
    fillPolygon(g, 280, 77, 287, 77, 287, 70, new Color(255, 226, 28));
    fillPolygon(g, 280, 77, 280, 84, 287, 77, new Color(255, 219, 35));
    fillPolygon(g, 280, 105, 280, 112, 287, 105, new Color(253, 207, 25));
    fillPolygon(g, 280, 112, 287, 112, 287, 105, new Color(254, 205, 24));
    fillPolygon(g, 280, 98, 280, 105, 287, 105, new Color(254, 208, 27));
    fillPolygon(g, 273, 119, 273, 133, 287, 133, new Color(255, 194, 18));
    fillPolygon(g, 273, 133, 287, 140, 287, 133, new Color(254, 192, 19));
    fillPolygon(g, 273, 133, 280, 147, 287, 140, new Color(254, 200, 32));
    fillPolygon(g, 280, 147, 287, 147, 287, 140, new Color(254, 188, 32));
    fillPolygon(g, 280, 147, 280, 154, 287, 147, new Color(255, 193, 30));
    fillPolygon(g, 287, 70, 287, 77, 294, 77, new Color(254, 226, 31));
    fillPolygon(g, 287, 77, 294, 84, 294, 77, new Color(252, 223, 35));
    fillPolygon(g, 280, 84, 280, 98, 294, 84, new Color(251, 221, 27));
    fillPolygon(g, 287, 77, 280, 84, 294, 84, new Color(253, 224, 34));
    fillPolygon(g, 287, 133, 294, 133, 294, 126, new Color(253, 191, 18));
    fillPolygon(g, 280, 112, 273, 119, 294, 126, new Color(254, 197, 22));
    fillPolygon(g, 287, 112, 280, 112, 294, 126, new Color(254, 199, 21));
    fillPolygon(g, 273, 119, 287, 133, 294, 126, new Color(255, 195, 19));
    fillPolygon(g, 287, 133, 287, 140, 294, 133, new Color(254, 188, 16));
    fillPolygon(g, 280, 154, 287, 168, 294, 154, new Color(254, 175, 22));
    fillPolygon(g, 287, 147, 280, 154, 294, 154, new Color(255, 174, 23));
    fillPolygon(g, 287, 56, 287, 70, 294, 56, new Color(255, 255, 123));
    fillPolygon(g, 294, 77, 294, 84, 301, 77, new Color(253, 225, 37));
    fillPolygon(g, 287, 105, 301, 105, 301, 91, new Color(252, 210, 27));
    fillPolygon(g, 280, 98, 287, 105, 301, 91, new Color(253, 212, 26));
    fillPolygon(g, 294, 84, 280, 98, 301, 91, new Color(252, 218, 32));
    fillPolygon(g, 287, 105, 287, 112, 301, 105, new Color(254, 205, 24));
    fillPolygon(g, 294, 126, 294, 133, 301, 133, new Color(252, 190, 19));
    fillPolygon(g, 294, 133, 301, 140, 301, 133, new Color(254, 186, 15));
    fillPolygon(g, 287, 140, 287, 147, 301, 140, new Color(255, 182, 28));
    fillPolygon(g, 294, 133, 287, 140, 301, 140, new Color(254, 186, 15));
    fillPolygon(g, 287, 147, 294, 154, 301, 140, new Color(253, 175, 23));
    fillPolygon(g, 294, 154, 287, 168, 301, 168, new Color(251, 175, 30));
    fillPolygon(g, 301, 77, 308, 77, 308, 63, new Color(252, 224, 27));
    fillPolygon(g, 287, 70, 294, 77, 308, 63, new Color(250, 232, 24));
    fillPolygon(g, 294, 77, 301, 77, 308, 63, new Color(255, 231, 37));
    fillPolygon(g, 294, 56, 287, 70, 308, 63, new Color(254, 254, 106));
    fillPolygon(g, 301, 77, 301, 91, 308, 77, new Color(255, 226, 34));
    fillPolygon(g, 301, 91, 301, 105, 308, 105, new Color(253, 215, 30));
    fillPolygon(g, 301, 105, 308, 119, 308, 105, new Color(255, 194, 18));
    fillPolygon(g, 294, 126, 301, 133, 308, 119, new Color(254, 190, 20));
    fillPolygon(g, 287, 112, 294, 126, 308, 119, new Color(254, 195, 17));
    fillPolygon(g, 301, 105, 287, 112, 308, 119, new Color(254, 199, 20));
    fillPolygon(g, 294, 154, 301, 168, 308, 154, new Color(254, 174, 23));
    fillPolygon(g, 301, 140, 294, 154, 308, 154, new Color(251, 173, 21));
    fillPolygon(g, 294, 84, 301, 91, 301, 77, new Color(254, 223, 34));
    fillPolygon(g, 308, 63, 315, 63, 315, 56, new Color(255, 253, 77));
    fillPolygon(g, 308, 63, 315, 70, 315, 63, new Color(251, 254, 121));
    fillPolygon(g, 308, 63, 308, 77, 315, 70, new Color(255, 254, 101));
    fillPolygon(g, 301, 91, 308, 105, 315, 98, new Color(254, 220, 34));
    fillPolygon(g, 308, 105, 308, 119, 315, 112, new Color(253, 200, 22));
    fillPolygon(g, 308, 119, 301, 133, 315, 126, new Color(253, 189, 19));
    fillPolygon(g, 301, 133, 315, 140, 315, 126, new Color(255, 188, 19));
    fillPolygon(g, 301, 133, 301, 140, 315, 140, new Color(254, 185, 22));
    fillPolygon(g, 301, 140, 308, 154, 315, 140, new Color(253, 184, 28));
    fillPolygon(g, 308, 154, 315, 154, 315, 140, new Color(252, 182, 34));
    fillPolygon(g, 308, 154, 315, 161, 315, 154, new Color(251, 169, 21));
    fillPolygon(g, 308, 154, 301, 168, 315, 161, new Color(255, 175, 24));
    fillPolygon(g, 301, 168, 315, 168, 315, 161, new Color(255, 168, 6));
    fillPolygon(g, 308, 182, 315, 182, 315, 175, new Color(254, 198, 43));
    fillPolygon(g, 315, 70, 308, 77, 322, 84, new Color(255, 226, 40));
    fillPolygon(g, 308, 77, 301, 91, 322, 84, new Color(254, 225, 35));
    fillPolygon(g, 301, 91, 315, 98, 322, 84, new Color(252, 221, 32));
    fillPolygon(g, 315, 98, 322, 91, 322, 84, new Color(253, 219, 34));
    fillPolygon(g, 315, 112, 315, 126, 322, 112, new Color(254, 199, 21));
    fillPolygon(g, 315, 98, 315, 112, 322, 112, new Color(255, 200, 22));
    fillPolygon(g, 315, 126, 315, 140, 322, 140, new Color(255, 184, 20));
    fillPolygon(g, 315, 140, 322, 147, 322, 140, new Color(255, 179, 31));
    fillPolygon(g, 315, 140, 315, 154, 322, 147, new Color(252, 185, 32));
    fillPolygon(g, 315, 154, 322, 154, 322, 147, new Color(253, 181, 34));
    fillPolygon(g, 315, 154, 315, 161, 322, 154, new Color(255, 175, 28));
    fillPolygon(g, 315, 161, 322, 161, 322, 154, new Color(254, 172, 28));
    fillPolygon(g, 315, 161, 315, 168, 322, 161, new Color(254, 173, 22));
    fillPolygon(g, 315, 189, 315, 196, 322, 189, new Color(255, 198, 39));
    fillPolygon(g, 315, 196, 322, 196, 322, 189, new Color(255, 206, 25));
    fillPolygon(g, 315, 196, 315, 203, 322, 196, new Color(255, 194, 6));
    fillPolygon(g, 308, 105, 315, 112, 315, 98, new Color(254, 203, 24));
    fillPolygon(g, 308, 119, 315, 126, 315, 112, new Color(253, 196, 19));
    fillPolygon(g, 322, 28, 329, 28, 329, 14, new Color(255, 250, 76));
    fillPolygon(g, 322, 28, 329, 42, 329, 28, new Color(254, 252, 81));
    fillPolygon(g, 322, 28, 322, 49, 329, 42, new Color(253, 253, 97));
    fillPolygon(g, 322, 84, 322, 91, 329, 91, new Color(255, 215, 31));
    fillPolygon(g, 322, 91, 329, 98, 329, 91, new Color(254, 212, 29));
    fillPolygon(g, 315, 98, 322, 112, 329, 98, new Color(255, 209, 27));
    fillPolygon(g, 322, 91, 315, 98, 329, 98, new Color(253, 211, 28));
    fillPolygon(g, 322, 112, 315, 126, 329, 119, new Color(255, 195, 21));
    fillPolygon(g, 315, 126, 329, 126, 329, 119, new Color(253, 193, 21));
    fillPolygon(g, 315, 126, 329, 133, 329, 126, new Color(253, 193, 21));
    fillPolygon(g, 315, 126, 322, 140, 329, 133, new Color(253, 188, 22));
    fillPolygon(g, 322, 140, 329, 140, 329, 133, new Color(251, 194, 27));
    fillPolygon(g, 322, 140, 322, 147, 329, 140, new Color(253, 194, 32));
    fillPolygon(g, 322, 147, 329, 147, 329, 140, new Color(250, 200, 41));
    fillPolygon(g, 322, 147, 322, 154, 329, 147, new Color(255, 177, 29));
    fillPolygon(g, 322, 161, 315, 168, 329, 168, new Color(252, 169, 1));
    fillPolygon(g, 315, 175, 322, 182, 329, 175, new Color(255, 196, 19));
    fillPolygon(g, 329, 14, 329, 28, 336, 28, new Color(251, 242, 49));
    fillPolygon(g, 329, 28, 329, 42, 336, 35, new Color(255, 234, 47));
    fillPolygon(g, 329, 91, 329, 98, 336, 98, new Color(255, 206, 28));
    fillPolygon(g, 329, 140, 329, 147, 336, 140, new Color(254, 200, 40));
    fillPolygon(g, 329, 147, 336, 147, 336, 140, new Color(250, 202, 34));
    fillPolygon(g, 329, 133, 329, 140, 336, 140, new Color(255, 204, 42));
    fillPolygon(g, 329, 147, 336, 154, 336, 147, new Color(251, 196, 43));
    fillPolygon(g, 322, 154, 322, 161, 336, 154, new Color(255, 179, 31));
    fillPolygon(g, 322, 161, 336, 161, 336, 154, new Color(252, 183, 30));
    fillPolygon(g, 322, 161, 329, 168, 336, 161, new Color(255, 162, 23));
    fillPolygon(g, 315, 70, 322, 84, 329, 63, new Color(254, 249, 95));
    fillPolygon(g, 329, 14, 336, 28, 343, 21, new Color(255, 240, 31));
    fillPolygon(g, 322, 84, 343, 84, 343, 70, new Color(251, 215, 17));
    fillPolygon(g, 329, 63, 322, 84, 343, 70, new Color(250, 255, 100));
    fillPolygon(g, 329, 91, 343, 91, 343, 84, new Color(254, 220, 34));
    fillPolygon(g, 329, 91, 336, 98, 343, 91, new Color(253, 213, 29));
    fillPolygon(g, 336, 98, 329, 119, 343, 119, new Color(252, 197, 19));
    fillPolygon(g, 329, 119, 329, 126, 343, 119, new Color(254, 196, 24));
    fillPolygon(g, 336, 147, 336, 154, 343, 147, new Color(254, 192, 31));
    fillPolygon(g, 336, 140, 336, 147, 343, 147, new Color(255, 197, 33));
    fillPolygon(g, 336, 154, 336, 161, 343, 161, new Color(255, 188, 1));
    fillPolygon(g, 322, 112, 329, 119, 336, 98, new Color(255, 197, 23));
    fillPolygon(g, 329, 98, 322, 112, 336, 98, new Color(255, 207, 23));
    fillPolygon(g, 336, 98, 343, 119, 350, 98, new Color(251, 208, 34));
    fillPolygon(g, 343, 91, 336, 98, 350, 98, new Color(253, 252, 63));
    fillPolygon(g, 336, 140, 343, 147, 350, 133, new Color(255, 190, 34));
    fillPolygon(g, 343, 147, 350, 147, 350, 133, new Color(253, 196, 21));
    fillPolygon(g, 329, 126, 329, 133, 350, 133, new Color(254, 205, 42));
    fillPolygon(g, 343, 119, 329, 126, 350, 133, new Color(254, 203, 34));
    fillPolygon(g, 329, 133, 336, 140, 350, 133, new Color(255, 201, 40));
    fillPolygon(g, 343, 147, 336, 154, 350, 154, new Color(254, 192, 11));
    fillPolygon(g, 350, 98, 343, 119, 357, 105, new Color(253, 242, 62));
    fillPolygon(g, 343, 119, 357, 112, 357, 105, new Color(253, 201, 37));
    fillPolygon(g, 343, 119, 357, 126, 357, 112, new Color(255, 201, 40));
    fillPolygon(g, 343, 119, 350, 133, 357, 126, new Color(255, 197, 37));
    fillPolygon(g, 343, 70, 343, 84, 364, 77, new Color(253, 255, 47));
    fillPolygon(g, 343, 84, 343, 91, 364, 84, new Color(253, 252, 63));
    fillPolygon(g, 343, 91, 350, 98, 364, 84, new Color(255, 254, 51));
    fillPolygon(g, 357, 105, 357, 112, 364, 105, new Color(253, 255, 50));
    fillPolygon(g, 364, 77, 364, 84, 371, 84, new Color(255, 253, 62));
    fillPolygon(g, 350, 98, 357, 105, 364, 84, new Color(255, 254, 37));
    fillPolygon(g, 364, 77, 371, 84, 378, 70, new Color(255, 255, 69));
    fillPolygon(g, 371, 84, 378, 91, 385, 77, new Color(250, 196, 35));
    fillPolygon(g, 378, 91, 385, 91, 385, 77, new Color(255, 183, 29));
    fillPolygon(g, 378, 70, 371, 84, 385, 77, new Color(255, 255, 79));
    fillPolygon(g, 385, 77, 385, 91, 392, 91, new Color(255, 182, 25));
    fillPolygon(g, 385, 77, 399, 84, 399, 77, new Color(251, 207, 40));
    fillPolygon(g, 385, 77, 392, 91, 399, 84, new Color(255, 176, 32));
}

public void paintComponent(Graphics g) {
    fill(g);
}
}