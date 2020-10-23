package programmers.level1;

public class 키패드 {
    private class Point{
        int x, y;

        public Point(int x, int y)
        {
            this.x = x;
            this.y = y;
        }
    }

    public String solution(int[] numbers, String hand) {
        Point[] pad;
        int dl, dr;
        StringBuilder sb;

        pad = new Point[10];
        pad[0] = new Point(3, 1);
        pad[1] = new Point(0, 0);
        pad[2] = new Point(0, 1);
        pad[3] = new Point(0, 2);
        pad[4] = new Point(1, 0);
        pad[5] = new Point(1, 1);
        pad[6] = new Point(1, 2);
        pad[7] = new Point(2, 0);
        pad[8] = new Point(2, 1);
        pad[9] = new Point(2, 2);
        Point L = new Point(3, 0);
        Point R = new Point(3, 2);
        sb = new StringBuilder();
        dl = dr = 0;
        for (int num : numbers)
        {
            if (num == 1 || num == 4 || num == 7)
            {
                sb.append("L");
                L.x = pad[num].x;
                L.y = pad[num].y;
            }
            else if (num == 3 || num == 6 || num == 9)
            {
                sb.append("R");
                R.x = pad[num].x;
                R.y = pad[num].y;
            }
            else{
                dl = Math.abs(L.x - pad[num].x) + Math.abs(L.y - pad[num].y);
                dr = Math.abs(R.x - pad[num].x) + Math.abs(R.y - pad[num].y);

                if (dl < dr)
                {
                    sb.append("L");
                    L.x = pad[num].x;
                    L.y = pad[num].y;
                }
                else if(dl > dr)
                {
                    sb.append("R");
                    R.x = pad[num].x;
                    R.y = pad[num].y;
                }
                else
                {
                    if (hand.equals("right"))
                    {
                        sb.append("R");
                        R.x = pad[num].x;
                        R.y = pad[num].y;
                    }
                    else
                    {
                        sb.append("L");
                        L.x = pad[num].x;
                        L.y = pad[num].y;
                    }
                }
            }
        }
        String answer = sb.toString();
        return answer;
    }
}
