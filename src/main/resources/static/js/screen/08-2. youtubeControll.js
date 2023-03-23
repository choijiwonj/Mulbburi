function click(){
    document.querySelector(".t2").addEventListener("click", () => {location.href = "/screen/08-3. youtubeList"});
    document.querySelector(".t1").addEventListener("click", () => {location.href = "/screen/08-2. youtubeControll"});
}

click();

/*function path(){
	document.querySelector(".path2").addEventListener("click", () => {alert("embed 주소를 입력해주세요.")});
} 

path();*/

function dropdown(){
    document.querySelector(".arrow").addEventListener("click", () => {document.querySelector(".mydropdown").classList.toggle("active")});
}

dropdown();