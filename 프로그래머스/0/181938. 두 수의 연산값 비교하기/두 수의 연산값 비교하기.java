class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        int temp = Integer.parseInt(Integer.toString(a) + Integer.toString(b));
        int temp2 = 2 * a * b;
        
        answer = temp > temp2 ? temp : temp2;
        
        return answer;
    }
}