public class KochCurveProject1 extends World {
    public double distance;
    public void KochCurve(int order, int size, int sides) {
        if (order == 0) {
            for (int x = 0; x < size; x++) {
                plane.move(1);
                plane.setPixelColor(0, 255, 0);
            }
        } else {
            int angle = 180 * (sides - 2) / sides;
            KochCurve(order - 1, size / 3, sides);
            plane.turn(angle);
            for (int x = 2; x <= sides; x++) {
                KochCurve(order - 1, size / 3, sides);
                plane.turn(angle - 180);
            }
            plane.turn(180);
            KochCurve(order - 1, size / 3, sides);
        }
    }
    public void square(double size, int red, int green, int blue, boolean outline) {
        int startingxpos = (int) (plane.xpos);
        int startingypos = (int) (plane.ypos);
        for (int x = startingxpos; x < startingxpos + size; x++) {
            for (int y = startingypos; y < startingypos + size; y++) {
                plane.teleport(x, y);
                plane.setPixelColor(red, green, blue);
            }
        }
        if (outline) {
            plane.teleport(startingxpos, startingypos);
            plane.startingAngle(90);
            plane.square(size);
        }
    }
    public double gradient(double a) {
        return (Math.pow(1.0085, a) * 29.45676);
    }
    public void go() {
        plane.teleport(0, 0);
        square(1000, 0, 0, 0, false);
        plane.teleport(257, 157);
        plane.startingAngle(0);
        plane.pausetime = 0;
        plane.trailWidth = 2;
        plane.isTrail = true;
        plane.setColor(0, 255, 0);
        for (int x = 1; x <= 4; x++) {
            KochCurve(5, 243, 3);
            plane.turn(-90);
        }
        plane.teleport(100, 12);
        for (int ypos = 12; ypos < 789; ypos++) {
            for (int xpos = 111; xpos < 905; xpos++) {
                plane.isTrail = false;
                plane.teleport(xpos,ypos);
                distance = Math.sqrt((500 - plane.xpos) * (500 - plane.xpos) + (400 - plane.ypos) * (400 - plane.ypos));
                    if (distance == 0) {
                        plane.setPixelColor(0, 0, 0);
                    }
                    if (distance <= 255) {
                        plane.setPixelColor((int) (gradient(distance)), 20, 0);
                    }
                if (distance>=386 && distance<=388){
                    plane.setPixelColor(0,0,plane.random(200,255));
                }
            }
        }
            plane.setColor(0, 0, 0);
            plane.trailWidth = 1;
            for (int y = 0; y <= 1; y++) {
                for (int x = 0; x <= 1; x++) {
                    plane.teleport(819 * x, 619 * y);
                    square(181, plane.random(0, 255), plane.random(0, 255), plane.random(0, 255), true);
                }
            }
            for (int y = 0; y <= 1; y++) {
                for (int x = 0; x <= 1; x++) {
                    plane.teleport(875.327 * x, 181 + (313.373) * y);
                    square(124.627, plane.random(0, 255), plane.random(0, 255), plane.random(0, 255), true);
                }
            }
            for (int y = 0; y <= 1; y++) {
                for (int x = 0; x <= 1; x++) {
                    plane.teleport(181 + 549 * x, 711 * y);
                    square(89, plane.random(0, 255), plane.random(0, 255), plane.random(0, 255), true);
                }
            }
            plane.teleport(500-40,455.055);
            plane.startingAngle(-72);
            plane.isTrail = true;
            plane.setColor(0,0,255);
            for(int x = 1; x<=5; x++){
                plane.move(129.443);
                plane.turn(216);
            }
            plane.teleport(1200, 0);
    }
}