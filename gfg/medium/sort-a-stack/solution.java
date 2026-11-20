class Solution {
    public Stack<Integer> sortStack(Stack<Integer> s) {
        if(!s.isEmpty()) {
            int top = s.pop();
            sortStack(s);
            sortedInsert(s, top);
        }
        return s;
    }
    
    private void sortedInsert(Stack<Integer> s, int x) {
        if (s.isEmpty() || s.peek()<=x) {
            s.push(x);
            return;
        }
        int top = s.pop();
        sortedInsert(s, x);
        s.push(top);
    }
}