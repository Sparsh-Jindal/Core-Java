package quickCompute;

import java.util.TreeSet;

public class NumAvg {
	private TreeSet<Integer> numSet;
	
	public NumAvg() {
		numSet=new TreeSet<>();
	}

	public TreeSet<Integer> getNumSet() {
		return numSet;
	}

	public void setNumSet(TreeSet<Integer> numSet) {
		this.numSet = numSet;
	}

	public void addNum(int num) {
		if (num % 5 != 0 && num % 6 != 0) {
			numSet.add(num);
		}
	}

	public double calAvg() {
		double total = 0.0;
		int count=0;

		for (Integer e : numSet) {
			total += e;
			count++;
		}
		if(count>0) {
			return total/count;
		}
		return 0.0;
		

	}
}
