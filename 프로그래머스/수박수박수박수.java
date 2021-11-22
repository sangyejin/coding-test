//https://programmers.co.kr/learn/courses/30/lessons/12922

class Solution {
    public String solution(int n) {
        String answer = "";
        
        for(int i=1;i<=n;i++){
            if(i%2!=0){
                answer+="수";
            } else {
                answer+="박";
            }
        }                    
        return answer;
    }
}

//재밌는 풀이
/*
class Solution {
    String text =
        "수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박";
  public String solution(int n) {
      String answer = text.substring(0, n);
      return answer;
  }
}
*/