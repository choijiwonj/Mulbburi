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
    function ValidationCon() {
		
		var mid = document.getElementById("memberId");
		var mpwd = document.getElementById("memberPwd");
		var mrepwd = document.getElementById("memberRePwd");
		var mname = document.getElementById("memberName");
		var phone = document.getElementById("phone");
		var emailId = document.getElementById("emialId");
		var domain = document.getElementById("domain");
		var postCode = document.getElementById("postCode");
		var bsAddress = document.getElementById("bsAddress");
		var dtAddress = document.getElementById("dtAddress");
		
	if(mname.value.length == 0) {
		alert("이름을 입력해 주세요.");
		mname.focus();
		return false;
	}
	
	var regIdPw = /^[a-zA-Z0-9]{8,16}$/;
	
	if(!regIdPw.test(mId.value)) {
		alert("아이디를 영소문자,대문자,숫자 8~16자로 입력해주세요.");
		mId.focus();
		return false;
	}
	
	if(!regIdPw.test(mPwd.value)) {
		alert("아이디를 영소문자,대문자,숫자 8~16자로 입력해주세요.");
		mPwd.focus();
		return false;
	}
	
	if(mrepwd.value !== mpwd.value) {
		alert("비밀번호가 일치하지 않습니다.");
		repwd.focus();
		return false;
	}
	
	var regPhone = /^[0-9]+/g;
	
	if(!regPhone.test(phone.value)) {
		alert("핸드폰번호는 숫자만 입력할 수 있습니다.");
		phone.focus();
		return false;
	}
	
	if(emailId.value == "") {
		alert("이메일 주소를 입력해주세요.");
		emailId.focus();
		return false;
	}
	
	if(domain.value == "선택") {
		alert("이메일 주소를 선택해주세요.");
		domain.focus();
		return false;
	}
	
	if(postCode.value == "") {
		alert("주소를 입력해주세요.");
		dtAddress.focus();
		return false;
	}
    
    if(bsAddress.value == "") {
		alert("주소를 입력해주세요.");
		dtAddress.focus();
		return false;
	}
	
	if(dtAddress.value == "") {
		alert("주소를 입력해주세요.");
		dtAddress.focus();
		return false;
	}
      
}

function ValidationSel() {
		
		var bName = document.getElementById("businessName");
		var bNo = document.getElementById("businessNo");
		var mid = document.getElementById("memberId");
		var mpwd = document.getElementById("memberPwd");
		var mrepwd = document.getElementById("memberRePwd");
		var phone = document.getElementById("phone");
		var emailId = document.getElementById("emialId");
		var domain = document.getElementById("domain");
		var postCode = document.getElementById("postCode");
		var bsAddress = document.getElementById("bsAddress");
		var dtAddress = document.getElementById("dtAddress");
		
	if(bname.value.length == 0) {
		alert("사업명을 입력해 주세요.");
		mname.focus();
		return false;
	}
	
	var regbNo = /^[0-9]+/g;
	
	if(!regbNo.test(bNo.value)) {
		alert("사업자 번호는 숫자만 입력할 수 있습니다.");
		bNo.focus();
		return false;
	}
	
	var regIdPw = /^[a-zA-Z0-9]{8,16}$/;
	
	if(!regIdPw.test(mPwd.value)) {
		alert("아이디를 영소문자,대문자,숫자 8~16자로 입력해주세요.");
		mPwd.focus();
		return false;
	}
	
	if(mrepwd.value !== mpwd.value) {
		alert("비밀번호가 일치하지 않습니다.");
		repwd.focus();
		return false;
	}
	
	var regPhone = /^[0-9]+/g;
	
	if(!regPhone.test(phone.value)) {
		alert("핸드폰번호는 숫자만 입력할 수 있습니다.");
		phone.focus();
		return false;
	}
	
	if(emailId.value == "") {
		alert("이메일 주소를 입력해주세요.");
		emailId.focus();
		return false;
	}
	
	if(domain.value == "선택") {
		alert("이메일 주소를 선택해주세요.");
		domain.focus();
		return false;
	}
	
	if(postCode.value == "") {
		alert("주소를 입력해주세요.");
		dtAddress.focus();
		return false;
	}
    
    if(bsAddress.value == "") {
		alert("주소를 입력해주세요.");
		dtAddress.focus();
		return false;
	}
	
	if(dtAddress.value == "") {
		alert("주소를 입력해주세요.");
		dtAddress.focus();
		return false;
	}
}
