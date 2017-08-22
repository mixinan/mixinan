package cc.guoxingnan.mixinan.util;

public class Api {
	
	//检查用户
	String checkUser = "http://localhost:8088/mixinan/user/check.do?name=123&password=123";
	//注册用户
	String registUser = "http://localhost:8088/mixinan/user/regist.do?name=125&password=125&gender=1";
	//通过userId找到user
	String getUserById = "http://localhost:8088/mixinan/user/getUserById.do?id=11";
	
	
	//根据blogId查找blog
	String getBlogByBlogId = "http://localhost:8088/mixinan/blog/getblog.do?id=3";
	//获取所有的blog
	String getAllBlogs = "http://localhost:8088/mixinan/blog/getallblogs.do";
	//获取blog页数
	String getBlogPages = "http://localhost:8088/mixinan/blog/getblogpages.do";
	//通过页数，获取当前页所有blog
	String getAllBlogsByPage = "http://localhost:8088/mixinan/blog/getblogsbypage.do?pageno=3";
	//添加一条blog
	String addBlog = "http://localhost:8088/mixinan/blog/addblog.do?userId=3&blogText=blogtext";
	//搜索blog
	String searchBlogs = "http://localhost:8088/mixinan/blog/blogsearch.do?kw=no";
	//通过blogId删除blog
	String deleteBlog = "http://localhost:8088/mixinan/blog/delete.do?blogId=30";
	//根据userId查找该用户所有blog
	String getBlogsByUserId = "http://localhost:8088/mixinan/blog/getByUserId.do?userId=3";
	//根据blogId 修改blog
	String updateBlog = "http://localhost:8088/mixinan/blog/update.do?blogId=35&blogText=sleep";

	
	//添加图片
	String addPic = "http://localhost:8088/mixinan/pic/add.do?url=test&desc=hi";
	//获取所有图片
	String getPics = "http://localhost:8088/mixinan/pic/getAll.do";
	//获取最后一张图片
	String getLastPic = "http://localhost:8088/mixinan/pic/getLastPic.do";
	
}
