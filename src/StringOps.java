public class StringOps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String input1 = "aaabbcdd";
			String output2 ="";
			char temp1=input1.charAt(0);
			int count=1;
			for(int i=1;i<input1.length();i++)
			{ 
				if(temp1==input1.charAt(i))
					count++;
				else
				{
					output2=output2+String.valueOf(Character.toUpperCase(temp1))+count;
					temp1=input1.charAt(i);
					count=1;
				}
			}
			output2=output2+String.valueOf(Character.toUpperCase(temp1))+count;
			System.out.println(output2);
			
			System.out.println("These are the updates for Dev branch");
	}

}
