public class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        if(gas == null || cost == null || gas.length == 0 || cost.length == 0) {
            return -1;
        }
        int sum = 0;
        int totalGas = 0;
        int index = -1;
        for(int i=0; i<gas.length; i++) {
            sum += gas[i] - cost[i];
            totalGas += gas[i] - cost[i];
            if(sum <0) {
                sum = 0;
                index = i;
            }
        }
        return totalGas>=0? index+1: -1; 
    }
}
