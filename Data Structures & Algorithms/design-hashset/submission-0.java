class MyHashSet {
    public ArrayList<Integer> arrList=new ArrayList<>();
    int addValue=0; 
    int temp=0;
    public MyHashSet() {
        int add=this.addValue; 


    }
    
    public void add(int key) {
        if(!arrList.contains(key)){ 
            arrList.add(key); 
        }


    }
    
    public void remove(int key) {
        for(int num=0;num<arrList.size();num++){ 
            if(key==arrList.get(num)){ 
                arrList.remove(num);
            }
        }
    }
    
    public boolean contains(int key) {
        return arrList.contains(key);
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */