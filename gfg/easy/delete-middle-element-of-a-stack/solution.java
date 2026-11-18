class Solution {
    public void deleteMid(Stack<Integer> s) {
        int size = s.size();
        int pos = size/2 + 1;
        del(s, pos, 1);
    }

    public void del(Stack<Integer> s, int pos, int count) {
        if (s.empty()) return;
        if (count == pos) {
            s.pop();
            return;
        }
        int temp = s.peek();
        s.pop();
        del(s, pos, count + 1);
        s.push(temp);
    }
}