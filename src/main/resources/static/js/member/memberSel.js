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


function ValidationSel() {
		
		var bName = document.getElementById("businessName");
		var bNo = document.getElementById("businessNo");
		var mname = document.getElementById("memberName");
		var mid = document.getElementById("memberId");
		var mpwd = document.getElementById("memberPwd");
		var mrepwd = document.getElementById("memberRePwd");
		var phone = document.getElementById("phone");
		var emailId = document.getElementById("emailId");
		var domain = document.getElementById("domain");
		var postCode = document.getElementById("postCode");
		var bsAddress = document.getElementById("bsAddress");
		var dtAddress = document.getElementById("dtAddress");
		
	var regName = /^[가-힣]+$/;
	var regbNo = /^\d{10}$/;
	var regIdPw = /^[a-zA-Z0-9]{8,16}$/;
	var regPhone = /^[0-9]+/g;
	
	
	if(bName.value.length == 0) {
		alert("사업명을 입력해 주세요.");
		bName.focus();
		return false;
	} else if(!regName.test(mname.value)) {
		alert("이름에는 한글을 입력해주세요.");
		bName.focus();
		return false;
	} else if(!regbNo.test(bNo.value)) {
		alert("사업자 번호를 숫자로 된 10자로 입력해주세요.");
		bNo.focus();
		return false;
	} else if(!regIdPw.test(mid.value)) {
		alert("비밀번호를 영소문자,대문자,숫자 8~16자로 입력해주세요.");
		mpwd.focus();
		return false;	
	} else if(!regIdPw.test(mpwd.value)) {
		alert("비밀번호를 영소문자,대문자,숫자 8~16자로 입력해주세요.");
		mpwd.focus();
		return false;
	} else if(mrepwd.value !== mpwd.value) {
		alert("비밀번호가 일치하지 않습니다.");
		mrepwd.focus();
		return false;
	} else if(!regPhone.test(phone.value)) {
		alert("핸드폰번호는 숫자만 입력할 수 있습니다.");
		phone.focus();
		return false;
	} else if(emailId.value == "") {
		alert("이메일 주소를 입력해주세요.");
		emailId.focus();
		return false;
	} else if(domain.value == "선택") {
		alert("이메일 주소를 선택해주세요.");
		domain.focus();
		return false;
	} else if(postCode.value == "") {
		alert("주소를 입력해주세요.");
		dtAddress.focus();
		return false;
	} else if(bsAddress.value == "") {
		alert("주소를 입력해주세요.");
		dtAddress.focus();
		return false;
	} else if(dtAddress.value == "") {
		alert("주소를 입력해주세요.");
		dtAddress.focus();
		return false;
	}
	
	document.getElementById("selform").submit();
} 
