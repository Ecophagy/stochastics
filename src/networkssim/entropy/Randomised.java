package networkssim.entropy;
import java.util.Random;

public abstract class Randomised
{
	protected final Random r;

	public Randomised(Random r)
	{
		if (r == null)
			throw new IllegalArgumentException("Null random number generator is not permitted");
		this.r = r;
	}

	Random getRandom()
	{
		return r;
	}

}
