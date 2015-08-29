public class Solution {
    public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
        int leftx = Math.max(A, E);
        int lefty = Math.max(B, F);
        int rightx = Math.min(C, G);
        int righty = Math.min(D, H);
        int area1 = (C-A)*(D-B);
        int area2 = (G-E)*(H-F);
        int area3 = (rightx-leftx)*(righty-lefty);
        if(leftx > rightx || lefty >righty) {
            return area1 + area2;
        } else {
            return area1 + area2 - area3;
        }
    }
}
