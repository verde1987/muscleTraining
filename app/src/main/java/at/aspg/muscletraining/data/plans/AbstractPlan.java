package at.aspg.muscletraining.data.plans;

import at.aspg.muscletraining.R;
import at.aspg.muscletraining.util.AndroidUtil;
import at.aspg.muscletraining.data.DisplayableItem;
import at.aspg.muscletraining.util.ObjectUtil;

public abstract class AbstractPlan implements DisplayableItem {
	
	private String name;
	
	public AbstractPlan() {
		name = AndroidUtil.getString(R.string.default_plan);
	}
	
	protected AbstractPlan(AbstractPlan toCopy) {
		ObjectUtil.requireNonNull(toCopy);
		name = toCopy.name;
	}
	
	@Override
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = ObjectUtil.requireNonNull(name);
	}
	
}
