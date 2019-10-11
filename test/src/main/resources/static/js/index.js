$("#find").click(function(){
	var nameH = $("#nameIn").val();
	$.ajax({
		url:'/getP',
		type:'POST',
		data:{
			nameHtml:nameH
		},
		success:function(pass){
			$("#pass").val(pass);
		}
	})
});
