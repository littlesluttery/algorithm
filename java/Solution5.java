public class Solution5 {
    public static void main(String[] args) {
        int[] gas  = {1,2,3,4,5};
        int[] cost = {3,4,5,1,2};
        int i = canCompleteCircuit(gas, cost);
        System.out.println(i);

    }
    // 暴力破解
    public static int canCompleteCircuit(int[] gas,int[] cost){
        for (int i = 0; i <cost.length ; i++) {
            // 记录剩余汽油
            int rest = gas[i] - cost[i];
            int index = (i+1) % cost.length;
            while (rest>0 && index != i){
                rest += gas[index] - cost[index];
                index = (index+1)%cost.length;

            }
            if (rest>=0 && index ==i){
                return i;
            }
            
        }
        return -1;
    }
}
