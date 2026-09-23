public class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int[][] time=new int[position.length][2];
        

        for(int i=0;i<position.length;i++){ 
            time[i][0]=position[i]; 
            time[i][1]=speed[i];
        }
        Arrays.sort(time,(a,b)->Integer.compare(b[0],a[0]));
        // position: 10,8,5,1,0 - > descending order, 0 - position and 1 - speed

        Stack<Double> stack=new Stack<>();
        for(int[] t:time){ 
            stack.push((double) (target-t[0])/t[1]); 

            if(stack.size()>=2 && stack.peek()<=stack.get(stack.size()-2)){ 
                stack.pop();
            }

        }

        return stack.size();
    }
}