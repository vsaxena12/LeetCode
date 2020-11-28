package hashingTechniques.driver;

import hashingTechniques.chainHashing.ChainHash;

public class Driver
{
	public static void main(String args[])
	{
		System.out.println("Testing Hashing");
		
		ChainHash chainHash = new ChainHash();
		chainHash.hashingUsingChain();
	}
}