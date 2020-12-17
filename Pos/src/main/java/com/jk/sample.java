package com.jk;

public class sample {
	
	public static void main(String args[]) {
		
		String temp ="hdsfhjsdf,jsdhfjksdhjf,hsdjfhsk,jdhfsdh,fsdhfhsd";
		String[] temp1 = temp.split(",");
		
		
		StringBuffer sb = new StringBuffer();
		for(int i=0;i<temp1.length;i++) {
			sb =sb.append(temp1[i]);
			if(i!=4) {
				sb.append("\n");
			}
		}
		System.out.println(sb.toString());
		
	}

}
