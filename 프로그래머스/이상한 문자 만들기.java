//https://programmers.co.kr/learn/courses/30/lessons/12930

class Solution {
    public String solution(String s) {
        String answer = "";
        
		char[] arr = new char[s.length()];
        int index=0;
		for(int i=0;i<arr.length;i++) {
			
			arr[i]=s.charAt(i);
			
			if(arr[i]!=' ') {
				if(index%2==0) {
					arr[i]=s.toUpperCase().charAt(i);
				    index++;
                } else {
					arr[i]=s.toLowerCase().charAt(i);
                    index++;
				}
			} else {
                index=0;
            }
			answer+=arr[i];
		}
		return answer;
	}
}