import java.util.ArrayList;

public class VoteProcessor {

	public String calculateElectionWinner(ArrayList<String> votes) {
		String Winner = "";
		int votesFrancis = 0;
		int votesSnowden = 0;
		for (int i = 0; i < votes.size(); i++) {
			if (votes.get(i).equalsIgnoreCase("pope francis")) {
				votesFrancis++;
			} else {
				votesSnowden++;
			}
		}
		if(votesFrancis > votesSnowden) {
			Winner = "pope francis";
		} 
		else if(votesFrancis < votesSnowden) {
			Winner = "edward snowden";
		}
		else {
			Winner = "TIE";
		}
		return Winner;
	}

}
