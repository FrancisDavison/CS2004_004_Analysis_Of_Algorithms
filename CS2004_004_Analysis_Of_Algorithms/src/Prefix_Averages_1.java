import java.util.Arrays;
public class Prefix_Averages_1
{
	public static void main(String args[])
	{
		double[] X = {7,3,-1,2,9,0,0.8,52,2.2,900};
		Prefix_Ave_1(X);
	}
	
	public static double[] Prefix_Ave_1(double[] X)
	{
		int n = X.length;
		double[] A = new double[n];
		int i;
		int j;
		for(i=0;i<n;i++)
		{
			double s = X[0];
			for(j=1;j<n;j++)
			{
				if(j<=i)
				{
					s+=X[j];
				}
			}
			A[i]=s/(i+1);
		}
		System.out.println(Arrays.toString(A));
		return A;
	}
}