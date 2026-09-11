class ArrayStack { 
    int stack[] = new int[10]; 
    int top = -1; 

    
    public void push(int x) { 
        if(top == stack.length){ 
            return; 
        } 
        top++;
        stack[top] = x; 
         
    } 
 
    public int pop() { 
        if(top == -1){ 
            return -1; 
        } 
        int pop = stack[top];
        top--;
        return pop; 
    } 
 
    public int top() { 
        return stack[top]; 
    } 
 
    public boolean isEmpty() { 
        if(top == -1){ 
            return true; 
        } 
        return false; 
    } 

    public static void main(String[] args) {

        ArrayStack s = new ArrayStack();

        s.push(10);
        s.push(20);
        s.push(30);

        System.out.println("Top: " + s.top());

        System.out.println("Pop: " + s.pop());

        System.out.println("Top: " + s.top());

        System.out.println("Is Empty: " + s.isEmpty());

        s.pop();
        s.pop();

        System.out.println("Is Empty: " + s.isEmpty());
    }
}