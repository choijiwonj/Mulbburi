function home(){
<<<<<<< HEAD
	document.querySelector(".store").addEventListener("click", () => {location.href="/select/product"});
	document.querySelector(".home").addEventListener("click", () => {location.href="/Mulbburi/login"});
	document.querySelector(".login").addEventListener("click", () => {location.href="/member/login/login"});
=======
	document.querySelector(".store").addEventListener("click", () => {location.href="/store"});
	/*document.querySelector(".home").addEventListener("click", () => {location.href="/Mulbburi/login"});*/
>>>>>>> branch 'origin' of https://github.com/choijiwonj/Mulbburi.git
	/*document.querySelector(".logout").addEventListener("click", () => {location.href="/Mulbburi"});*/
	document.querySelector(".community").addEventListener("click", () => {location.href="/thumbnail/list"});
	document.querySelector(".customer").addEventListener("click", () => {location.href="/main"});
	document.querySelector(".login").addEventListener("click", () => {location.href="member/login/loginJoin"});
}

home();