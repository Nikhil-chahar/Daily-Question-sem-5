class MyCircularQueue {
    int q[];
    int tail=-1,head=0,size;
    public MyCircularQueue(int k) {
        q = new int[k];
        size=k;

    }
    
    public boolean enQueue(int value) {
        if(isFull()) return false;
        tail= (tail+1)%size;
        q[tail] = value;
        return true;
    }
    
    public boolean deQueue() {
        if(isEmpty()) return false;
        if(head == tail){
            head = 0;
            tail = -1;
        }
        else head = (head+1)%size;
        return true;
    }
    
    public int Front() {
        return isEmpty() ? -1 : q[head];
    }
    
    public int Rear() {
        return isEmpty() ? -1 : q[tail];
    }
    
    public boolean isEmpty() {
        return tail == -1;       
    }
    
    public boolean isFull() {
        return !isEmpty() && (tail +1)%size == head;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */