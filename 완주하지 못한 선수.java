import java.util.ArrayList;
class Solution {
    public String solution(String[] participant, String[] completion) {

        String answer = "";
        
		ArrayList<String> list = new ArrayList<String>();
		for (int i = 0; i < participant.length; i++) {
			list.add(participant[i]);
		}
		for (int i = 0; i < completion.length; i++) {
			if (list.contains(completion[i])) {
				list.remove(completion[i]);
			}
		}
		answer = list.get(0);
        return answer;
    }
}