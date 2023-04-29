package com.mycompany.app

class encode
{
	public static void main(String[] args)
	{
		String character = "Sairam";
		int length = character.length();
        String out = "";
 	
        for(int n=0; n<length; n++)
        {
            char temp = character.charAt(n);
            if(temp > 31 && temp < 127)
            {       
                int ASCII = (int)temp;
                out = out+ASCII;
                out = out+(char)32;
            }
          }
         System.out.println(out); }
}
