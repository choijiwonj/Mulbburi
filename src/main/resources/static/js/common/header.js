function home(){
	document.querySelector(".store").addEventListener("click", () => {location.href="/store"});
	/*document.querySelector(".home").addEventListener("click", () => {location.href="/Mulbburi/login"});*/
	/*document.querySelector(".logout").addEventListener("click", () => {location.href="/Mulbburi"});*/
	document.querySelector(".community").addEventListener("click", () => {location.href="/thumbnail/list"});
	document.querySelector(".customer").addEventListener("click", () => {location.href="/main"});
	document.querySelector(".login").addEventListener("click", () => {location.href="member/login/loginJoin"});
}

home();
