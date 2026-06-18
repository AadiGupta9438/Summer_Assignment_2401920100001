class Solution {
    public int largestRectangleArea(int[] arr) {
        int n = arr.length;
        int arrl[] = new int[n];
        int arrr[] = new int[n];
        Stack<Integer> stack = new Stack<>();
        for(int i = 0 ; i < n ; i++){
            while(!stack.isEmpty() && arr[stack.peek()] >= arr[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                arrl[i] = -1;
            } else {
                arrl[i] = stack.peek();
            }
            stack.push(i);
        }
        stack.clear();
        for(int i = n - 1 ; i >= 0 ; i--){
            while(!stack.isEmpty() && arr[stack.peek()] >= arr[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                arrr[i] = n;
            } else {
                arrr[i] = stack.peek();
            }
            stack.push(i);
        }
        int max = 0;
        for(int i = 0 ; i < n ; i++){
            int l = arrr[i] - arrl[i] - 1;
            int a = arr[i] * l;
            max = Math.max(max , a);
        }
        return max;
    }
}