package cc.guoxingnan.mixinan.dao;

import java.util.List;

import cc.guoxingnan.mixinan.entity.Pic;
import cc.guoxingnan.mixinan.util.MixiResult;

public interface PicDao {
	public MixiResult<List<Pic>> getPics(); 
	public MixiResult<Pic> getLastPic();
	public void addPic(String picUrl);
}
