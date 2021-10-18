import java.util.ArrayList;
import java.util.Random;

public class PrefixAveArrayList
{
	public static void main(String args[])
	{
		int p=10;
		ArrayList<Float> X = new ArrayList<Float>(p);
		Float A = 7f;
		Float B = 3f;
		Float C = -1f;
		Float D = 2f;
		Float E = 9f;
		Float F = 0f;
		Float G = 0.8f;
		Float H = 52f;
		Float I = 2.2f;
		Float J = 900f;
		X.add(A);
		X.add(B);
		X.add(C);
		X.add(D);
		X.add(E);
		X.add(F);
		X.add(G);
		X.add(H);
		X.add(I);
		X.add(J);
		PrefixAverage(X);
	}
	
	public static ArrayList<Float> PrefixAverage(ArrayList<Float> X)
	{
		if(X==null)
		{
			return null;
		}
		int n = X.size();
		if(n==0)
		{
			return null;
		}
		ArrayList<Float> A = new ArrayList<Float>(n);
		for(int i=0;i<n;i++)
		{
			Float s = X.get(0);
			for(int j=1;j<n;j++)
			{
				if(j<=i)
				{
					s+=X.get(j);
				}
			}
			A.add(s/(i+1));
		}
		System.out.println(A);
		return A;
	}
}