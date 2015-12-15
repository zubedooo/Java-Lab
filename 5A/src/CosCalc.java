
public class CosCalc implements Runnable {
	double[]  arr;
	int length;
	public CosCalc(double[] val, int lenght) {
		arr = val;
		this.length = lenght;
	}
	@Override
	public void run() {
		for (int i = 0; i < length; i++) {
			double radian = i * 180 / Math.PI;
			arr[i] = Math.cos(radian);
		}
	}

}
