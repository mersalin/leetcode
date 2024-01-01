class Solution {

    public void cleanRoom(Robot robot) {
        clean(robot, 0, 0, 0, new HashSet<>());
    }
    
    private void clean(Robot robot, int x, int y, int dir, Set<String> visited) {
        String pos = x + "=>" + y;
        if(visited.contains(pos)) {
            return;
        }
        robot.clean();
        visited.add(pos);
        
        for (int i=0; i<4; i++) {
            int nextX = x;
            int nextY = y;
            if (robot.move()) {
                switch(dir) {
                    case 0:
                        nextY += 1;
                        break;
                    case 90:
                        nextX += 1;
                        break;
                    case 180:
                        nextY -= 1;
                        break;
                    case 270:
                        nextX -= 1;
                        break;
                }
                clean(robot, nextX, nextY, dir, visited);
                robot.turnRight();
                robot.turnRight();
                robot.move();
                robot.turnRight();
                robot.turnRight();
            }
            dir += 90;
            dir = dir % 360;
            robot.turnRight();
        }
    }
}