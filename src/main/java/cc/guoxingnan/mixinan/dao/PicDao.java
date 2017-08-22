package cc.guoxingnan.mixinan.dao;

import java.util.List;

import cc.guoxingnan.mixinan.entity.Pic;

public interface PicDao {
	public List<Pic> getPics(); 
	public Pic getLastPic();
	public int addPic(Pic pic);
}
