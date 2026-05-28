class MyHashSet {
    public ArrayList<Integer> arrList;
    
    public MyHashSet() {
        this.arrList=new ArrayList<>(); 


    }
    
    public void add(int key) {
        if(!arrList.contains(key)){ 
            arrList.add(key); 
        }


    }
    
    public void remove(int key) {
        
            if(arrList.contains(key)){ 
                arrList.remove(arrList.indexOf(key));
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