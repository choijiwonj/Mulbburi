window.onload = function() {


	/* 아이디 중복 체크 */
	if(document.getElementById("duplicationCheck")) {

        const $duplication = document.getElementById("duplicationCheck");

        $duplication.onclick = function() {
            let memberId = document.getElementById("memberId").value.trim();

            fetch("/member/idDupCheck", {
                method: "POST",
                headers: {
                    'Content-Type': 'application/json;charset=UTF-8'
                },
                body: JSON.stringify({memberId: memberId})
            })
                .then(result => result.text())
                .then(result => alert(result))
                .catch((error) => error.text().then((res) => alert(res)));

        }
    }
    
    
    
    
}
/* $('.id_input').on("propertychange change keyup paste input", function() {
	
	console.log("keyup 테스트");
	
	var memberId = $('.id_input').val();
	var data = {memberId : memberId}
	
	$.ajax({
		type : "post",
		url : "/member/idCheck",
		data : data,
		success : function(result){
			if(result != 'fail') {
				$('.id_input_re_1').css("display","inline-block");
				$('.id_input_re_2').css("display","none");
			} else {
				$('.id_input_re_2').css("display","inline-block");
				$('.id_input_re_1').css("display","none");
			}
		}
	}); 
}); */