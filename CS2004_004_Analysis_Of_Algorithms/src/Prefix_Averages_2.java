import java.util.Arrays;
public class Prefix_Averages_2
{
	public static void main(String args[])
	{
		double[] X = {7,3,-1,2,9,0,0.8,52,2.2,900};
		Prefix_Ave_2(X);
	}
	
	public static double[] Prefix_Ave_2(double[] X)
	{
		int n = X.length;
		double[] A = new double[n];
		double s=0;
		int i;
		for(i=0;i<n;i++)
		{
			s+=X[i];
			A[i]=s/(i+1);
		}
		System.out.println(Arrays.toString(A));
		return A;
	}
}