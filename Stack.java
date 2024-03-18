public class Stack {
    int arr[];
    int top;

    public Stack(int i) {
        arr = new int[i];
        top = 0;  
    }

    void push(Stack st, int data) {
        if (top == (arr.length - 1)) {
            System.out.println("Stack Overflow");
            return;
        }
        st.arr[st.top++] = data;
        System.out.println("Data Pushed!"+data);
    }

    void pop() {
        if (top == 0) 
        {  
            System.out.println("Stack Underflow");
            System.out.println("Popped Data"+top); 
        }
        System.out.println("Popped Data:"+arr[--top]); 
    }

    public void peek(Stack st) {
        if (top == 0) {
            System.out.println("Empty");
        } else {
            System.out.println("Peek Data: "+ arr[top - 1]); 
        }
    }

    public void printStack() 
    {
        System.out.println( "Status of Stack: ");   
        for (int i = 0; i < top; i++) 
        {  
            System.out.print(arr[i] + ", ");
        }
    }

    public static void main(String args[]) {
        Stack st = new Stack(5);
        st.push(st, 1);
        st.push(st, 2);
        st.pop();
        st.peek(st);
        st.printStack();
    }
}