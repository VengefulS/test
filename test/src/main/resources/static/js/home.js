$(document).ready(function(){
	$.ajax({
		url:'/getAll',
		type:'POST',
		data:{
			
		},
		success:function(data){
			var name = data.name;
		}
	})
})