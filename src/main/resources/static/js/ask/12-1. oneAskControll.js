function click(){
    document.querySelector(".answerd").addEventListener("click", () => window.open("/askoneAnswer", "판매자 신고 자세히", "width=500, height=500, left=100, top=50"));
}

click();

function email(){
	document.querySelector(".answerd").addEventListener("click", () => {location.href = "/getEmail"});
	document.querySelector(".answerbutton2").addEvenListnenr("click", () => {location.href= "/regist/answer"});
}

email();