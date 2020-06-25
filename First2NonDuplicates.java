
		
		int[] arr = {1,1,2,3};
		
		int num1=0;
		int num2=0;
		int xor=0;
		int split_bit=0;
		
		for(int a:arr)
			xor^=a;
		
		split_bit=xor & (~xor-1);
		System.out.println(split_bit);
		
		for(int a:arr)
		{
			if((a & split_bit) == 0)
				num1^=a;
			else
				num2^=a;
		}
		
		System.out.println("Num1 :: " + num1 );
		System.out.println("Num2 :: " + num2 );
		
	
