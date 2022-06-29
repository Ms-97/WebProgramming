//리스트 데이터 가져오기

function listServer(page){
	
	//리스트 데이터와 페이징 데이터를 모두 가져올 예정.. 
	$.ajax({
		url : '/board/BoardList',	//context root 존재시 경로에 추가..
		//type : 'get',
		data :	'page=' + page,
		success:function(){},
		error:function(){},
		dataType :''
	});
	
}
