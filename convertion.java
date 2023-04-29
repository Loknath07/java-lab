package com.mycompany.app;

class convertion{
	String data;
	String[] options;
	private String convertion(){
        String out="";
        int n,letters;
        if(this.options[1].equals("upper")){
            for(n=0;n<this.data.length();n++){
                letters=(int)(this.data.charAt(n));
                if(letters>=97 && letters<=122){
                    letters-=32;
                    out+=(char)(letters);
                }
                else
                    out+=(char)(letters);  
            }
        }
        else{
            for(n=0;n<this.data.length();n++){
                letters=(int)(this.data.charAt(n));
                if(letters>=65 && letters<=90){
                    letters+=32;
                    out=(char)(letters);
                }
                else
                    out=(char)(letters);
                
            }
        }
        return out;
    }
}
