public class Solution {
    public String simplifyPath(String path) {
        String[] paths=path.split("/") ; //the input path becomes : /../_home/a/b/../
        Stack<String> stack=new Stack<>(); 

        for(String s : paths){ 
            
            if(s.equals("..") ){ 
                if(!stack.isEmpty()){ 
                stack.pop();
            }
            }
             
            else if(!s.equals("") && !s.equals(".")){ 
                stack.push(s);
            }
        }
        return "/"+String.join("/",stack);
    }
}