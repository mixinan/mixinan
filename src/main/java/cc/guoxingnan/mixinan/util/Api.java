package cc.guoxingnan.mixinan.util;

public class Api {
	
	//����û�
	String checkUser = "http://localhost:8088/mixinan/user/check.do?name=123&password=123";
	//ע���û�
	String registUser = "http://localhost:8088/mixinan/user/regist.do?name=125&password=125&gender=1";
	//ͨ��userId�ҵ�user
	String getUserById = "http://localhost:8088/mixinan/user/getUserById.do?id=11";
	
	
	//����blogId����blog
	String getBlogByBlogId = "http://localhost:8088/mixinan/blog/getblog.do?id=3";
	//��ȡ���е�blog
	String getAllBlogs = "http://localhost:8088/mixinan/blog/getallblogs.do";
	//��ȡblogҳ��
	String getBlogPages = "http://localhost:8088/mixinan/blog/getblogpages.do";
	//ͨ��ҳ������ȡ��ǰҳ����blog
	String getAllBlogsByPage = "http://localhost:8088/mixinan/blog/getblogsbypage.do?pageno=3";
	//���һ��blog
	String addBlog = "http://localhost:8088/mixinan/blog/addblog.do?userId=3&blogText=blogtext";
	//����blog
	String searchBlogs = "http://localhost:8088/mixinan/blog/blogsearch.do?kw=no";
	//ͨ��blogIdɾ��blog
	String deleteBlog = "http://localhost:8088/mixinan/blog/delete.do?blogId=30";
	//����userId���Ҹ��û�����blog
	String getBlogsByUserId = "http://localhost:8088/mixinan/blog/getByUserId.do?userId=3";
	//����blogId �޸�blog
	String updateBlog = "http://localhost:8088/mixinan/blog/update.do?blogId=35&blogText=sleep";

	
	//���ͼƬ
	String addPic = "http://localhost:8088/mixinan/pic/add.do?url=test&desc=hi";
	//��ȡ����ͼƬ
	String getPics = "http://localhost:8088/mixinan/pic/getAll.do";
	//��ȡ���һ��ͼƬ
	String getLastPic = "http://localhost:8088/mixinan/pic/getLastPic.do";
	
}
