//https://programmers.co.kr/learn/courses/30/lessons/42626

import java.util.PriorityQueue;
class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        
         PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
        
        for(int i=0;i<scoville.length;i++){
            queue.add(scoville[i]);
        }
        
       
        while(queue.size()>1) {
        	if(queue.peek()>=K) return answer;
        	int n1 = queue.poll();
        	int n2 = queue.poll();
        	queue.add(n1 + (n2 * 2));
        	answer++;
        }
        
        if(queue.peek()<K) return -1;
        
        return answer;
    }
}