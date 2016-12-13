package functors3;

public class EqualsZero implements Equaler {

	@Override
	public boolean equals(int arr) {
		if(arr==0)
			return true;
		return false;
	}

}
