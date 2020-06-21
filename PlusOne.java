class Solution {
    public int[] plusOne(int[] digits) {		
        StringBuilder s = new StringBuilder();
		int carry = 1;
        
		for (int i = digits.length - 1; i >= 0; i--) {
			if (digits[i] == 9 && carry == 1) {
				s.append(0);
                carry=1;
			}
			else {
				s.append(digits[i] + carry);
				carry = 0;
			}

		}
        if(carry==1)
            s.append(carry);
        
		s.reverse();

		String[] s_arr = s.toString().split("");
		int[] new_arr = new int[s.length()];
		int i = 0;
		for (String x : s_arr)
			new_arr[i++] = Integer.parseInt(x);
        
        return new_arr;
    }
}
