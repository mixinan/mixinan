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
				var blogText = blog.mi_blog_text;
				var $li = $("<li>"+userId+"："+blogText+"</li>");
				$("#blog_list").prepend($li);
			}
		},
		error:function(){
			console.log(result.msg);
		}
	});
}





