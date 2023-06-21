package bo;

import java.util.ArrayList;

import bean.htphanhoibean;
import dao.htphanhoidao;


public class htphanhoibo {
	htphanhoidao phdao = new htphanhoidao();
	ArrayList<htphanhoibean> ph;
	public ArrayList<htphanhoibean> getphanhoi(){
		return phdao.getphanhoi();
	}
	
	public static void main(String[] args) {
		htphanhoibo spdao=new  htphanhoibo();
		System.out.println(spdao.getphanhoi());
	}
}




