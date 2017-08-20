/*
 * 打开首页时，加载所有blog，并显示在ul里
 * */
var getAllBlogs = function(){
		
	$.ajax({
		type:"get",
		url:path+"/blog/getallblogs.do",
		dataType:"json",
		success:function(result){
			var list = result.data;
			var listSize = list.length;
			console.log("从服务器获取到 "+listSize+" 条数据");
			
			//遍历结果集，显示在ul里
			for (var i = 0;i<listSize;i++) {
				var blog = list[i];
				var userId = blog.mi_user_id;
				var nickname = getUserById(userId);
				var blogText = blog.mi_blog_text;
				var $li = $("<li>"+nickname+"：<br>"+blogText+"<br>"+blog.mi_blog_create_time+"</li><br>");
				
				//给li绑定 blogId
				$li.data("blogId",blog.mi_blog_id);
				
				$("#blog_list").prepend($li);
			}
		},
		error:function(){
			console.log(result.msg);
		}
	});
}






/*
 * 增加一条Blog
 * addBlog
 * */
var addBlog = function(){
	var $input = $("#blogText");
	var blogText = $input.val().trim();
	console.log(blogText);
	var userId = getCookie("userId");
	var $list=$("#blog_list");
	
	if (blogText=="") {
		$input.attr('placeholder','不能为空')
		return;
	}
	
	$.ajax({
		type:"post",
		url:path+"/blog/addblog.do",
		data:{"userId":userId,"blogText":blogText},
		dataType:"json",
		success:function(result){
			console.log(result.status);
			console.log(result.msg);
			//console.log(result.data);
			//发送完毕后，清空输入框内容
			$input.val("");
			$input.attr("placeholder","请输入内容");
			//清空ul，重新从服务器获取blog列表
			$list.html("");
			getAllBlogs();
//			$list.prepend($("<li>"+userId+"："+blogText+"</li>"));
		},
		error:function(){
			console.log(result.status);
			console.log(result.msg);
			console.log(result.data);
		}
	});
	
}



