package at.aspg.muscletraining.data.exercises;

import java.util.List;

import at.aspg.muscletraining.data.IMuscleRegion;
import at.aspg.muscletraining.util.NumberUtil;

public class WeightRepsExercise extends RepsExercise implements Weight {
	
	private double weight;
	
	public WeightRepsExercise() {
		weight = 0;
	}
	
	protected WeightRepsExercise(WeightRepsExercise toCopy) {
		super(toCopy);
		weight = toCopy.weight;
	}
	
	public WeightRepsExercise(String name, String description, List<IMuscleRegion> primaryMuscleRegions, List<IMuscleRegion> secondaryMuscleRegions, int sets, int breakTime, int reps, double weight) {
		super(name, description, primaryMuscleRegions, secondaryMuscleRegions, sets, breakTime, reps);
		this.weight = NumberUtil.checkRangeLowerBound(weight, 0);
	}
	
	@Override
	public double getWeight() {
		return weight;
	}
	
	@Override
	public void setWeight(double weight) {
		this.weight = NumberUtil.checkRangeLowerBound(weight, 0);
	}
	
	@Override
	public WeightRepsExercise copy() {
		return new WeightRepsExercise(this);
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof WeightRepsExercise)) return false;
		if (!super.equals(o)) return false;
		
		WeightRepsExercise exercise = (WeightRepsExercise) o;
		
		return Double.compare(exercise.weight, weight) == 0;
	}
	
	@Override
	public int hashCode() {
		int result = super.hashCode();
		long temp;
		temp = Double.doubleToLongBits(weight);
		result = 31 * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	
	// TODO: @Override String getDetails()
}
