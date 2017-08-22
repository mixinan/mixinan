package test.dao;

import java.util.List;

import org.junit.Test;

import cc.guoxingnan.mixinan.dao.PicDao;
import cc.guoxingnan.mixinan.entity.Pic;
import test.TestCase;

public class TestPicDao extends TestCase{
	PicDao dao = super.getContext().getBean("picDao", PicDao.class);
	
	@Test
	public void addPic(){
		Pic pic = new Pic();
		pic.setMi_pic_url("https://www.guoxingnan.cc");
		pic.setMi_pic_desc("���ǵڼ���");
		int rows = dao.addPic(pic);
		
		System.out.println("Ӱ���� "+rows+" ������");
	}
	
	
	@Test
	public void getPics(){
		List<Pic> pics = dao.getPics();
		
		System.out.println(pics);
	}
	
	
	@Test
	public void getLastPic(){
		Pic pic = dao.getLastPic();
		
		System.out.println(pic);
	}
}
