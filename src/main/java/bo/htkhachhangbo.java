package bo;

import java.util.ArrayList;

import bean.htkhachhangbean;
import dao.htkhachhangdao;

public class htkhachhangbo {
	htkhachhangdao lsdao=new htkhachhangdao();
	   public ArrayList<htkhachhangbean> getkh(long makh){
		   return lsdao.getkh(makh);
	   }
}
