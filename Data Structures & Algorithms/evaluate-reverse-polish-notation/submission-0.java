class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack1=new Stack<>(); 
        
         

        for(int i=0;i<tokens.length;i++){ 
            if(tokens[i].equals("+")){ 
                stack1.push(stack1.pop()+stack1.pop());

            }
            else if(tokens[i].equals("-")){ 
                int top=stack1.pop();
                stack1.push(stack1.pop()-top);

            }
            else if(tokens[i].equals("*")){ 
                stack1.push(stack1.pop()*stack1.pop());

            }
            else if(tokens[i].equals("/")){ 
                int top=stack1.pop();
                stack1.push(stack1.pop()/top);

            }
            else{ 
                stack1.push(Integer.parseInt(tokens[i]));
            }
            
        }
        return stack1.pop();



    }
}
