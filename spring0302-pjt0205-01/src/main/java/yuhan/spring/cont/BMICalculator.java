package yuhan.spring.cont;

public class BMICalculator {
	
	private double lowWeight;
	private double normalWeight;
	private double overWeight;
	private double obesity;
	
	
	public double getLowWeight() {
		return lowWeight;
	}
	public void setLowWeight(double lowWeight) {
		this.lowWeight = lowWeight;
	}
	public double getNormalWeight() {
		return normalWeight;
	}
	public void setNormalWeight(double normalWeight) {
		this.normalWeight = normalWeight;
	}
	public double getOverWeight() {
		return overWeight;
	}
	public void setOverWeight(double overWeight) {
		this.overWeight = overWeight;
	}
	public double getObesity() {
		return obesity;
	}
	public void setObesity(double obesity) {
		this.obesity = obesity;
	}


	public void BMICalculatortion(double height, double weight) {
		double h = height * 0.01;
		double result = weight / (h * h);
		
		System.out.println("BMI지수 : " + (int)result);
		
		if(result > obesity) {
			System.out.println("비만");
		}
		else if(result > overWeight) {
			System.out.println("과체중");
		}
		else if(result > normalWeight) {
			System.out.println("정상체중");
		}
		else {
			System.out.println("저체중");
		}
		
	}
	

}
