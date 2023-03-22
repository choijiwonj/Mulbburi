var emailId = document.getElementById("emailId");
var domain = document.getElementById("domain");
         
function mailsend() {
	   var emailId = document.getElementById("emailId");
	   var domain = document.getElementById("domain");
	   var formValues = $("form[name=loginForm]").serialize();
	
	   $.ajax({
	      type : "POST",
	      url : "/member/mailsend",
	      data : 
	         /*"emailId" : emailId,
	         "domain" : domain*/
	         formValues
	      ,
	      success : function(data){
	         alert("해당 이메일로 인증번호 발송이 완료되었습니다. \n 확인부탁드립니다.")
	         
	         console.log("data : "+ data);
	      }
	   })
	}



