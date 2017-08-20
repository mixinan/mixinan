package cc.guoxingnan.mixinan.util;

public class Api {
	//检查用户
	String checkUser = "http://localhost:8088/mixinan/user/check.do?name=123&password=123";
	//注册用户
	String registUser = "http://localhost:8088/mixinan/user/regist.do?name=125&password=125&gender=1";
	//根据blogId查找blog
	String getBlogByBlogId = "http://localhost:8088/mixinan/blog/getblog.do?id=3";
	//获取所有的blog
	String getAllBlogs = "http://localhost:8088/mixinan/blog/getallblogs.do";
	//添加一条blog
	String addBlog = "http://localhost:8088/mixinan/blog/addblog.do?userId=3&blogText=blogtext";
}
