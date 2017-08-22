package cc.guoxingnan.mixinan.dao;

import java.util.List;

import cc.guoxingnan.mixinan.entity.Pic;

public interface PicDao {
	public List<Pic> getPics(); //已做
	public Pic getLastPic();  //已做
	public int addPic(Pic pic); //已做
}
