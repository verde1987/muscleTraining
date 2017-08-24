package at.aspg.muscletraining.data;

import at.aspg.muscletraining.R;
import at.aspg.muscletraining.Util;

public class Break implements DisplayableItem {
	
	private int duration;
	
	public int getDuration() {
		return duration;
	}
	
	public void setDuration(int duration) {
		this.duration = duration;
	}
	
	@Override
	public String getName() {
		return Util.getString(R.string._break);
	}
	
	@Override
	public String getDetails() {
		return "";
	}
	
}
