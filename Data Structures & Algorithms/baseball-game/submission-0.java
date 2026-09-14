class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack=new Stack<>(); 
        int res=0;
        for(String s:operations){ 
            if(s.equals("+")){ 
                int top=stack.pop(); 
                int newtop=stack.peek()+top;
                stack.push(top);
                stack.push(newtop);
                res+=newtop;
            }
            else if(s.equals("C")){
                res-=stack.pop();
            }
            else if(s.equals("D")){
                stack.push(2*stack.peek());
                res+=stack.peek();
            }

            else{ 
                stack.push(Integer.parseInt(s));
                res+=stack.peek();
            }
        }
        
        return res;
    }
}