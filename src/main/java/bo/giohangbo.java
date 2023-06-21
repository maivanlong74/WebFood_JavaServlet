package bo;

import java.util.ArrayList;

import bean.giohangbean;

public class giohangbo {
	public ArrayList<giohangbean> ds= new ArrayList<giohangbean>();
	   public void Them(String masanpham, String anh, String tensanpham, long gia, long soluong) {
		   for(giohangbean h: ds)
			   if(h.getMasanpham().trim().equals(masanpham.trim())) {
				   h.setSoluong(soluong + h.getSoluong());
				   return;
			   }
		   ds.add(new giohangbean(masanpham, anh, tensanpham, gia, soluong));
	   }
	   
	   public void Up(String masanpham, String anh, String tensanpham, long gia, long soluong) {
		   for(giohangbean g:ds)
				if(g.getMasanpham().trim().equals(masanpham.trim())) {
					g.setSoluong(soluong);
					return ;
				}
				ds.add(new giohangbean(masanpham, anh, tensanpham, gia, soluong));
		}
	
	   
	   public long Tongtien() {
		   long s=0;
		   for(giohangbean h: ds)
			   s=s+h.getThanhtien();
		   return s;
	   }
	   
	   public void remove(String masanpham ) {
		  	if (masanpham!=null) 
		  	{		for(giohangbean g: ds)
		  			if(g.getMasanpham().equals(masanpham)) {
		  				ds.remove(g);
		  				return;
		  			}
		  	}
	}
}
