function home(){
	document.querySelector(".store").addEventListener("click", () => {location.href="/select/product"});
	document.querySelector(".home").addEventListener("click", () => {location.href="/Mulbburi/login"});
	document.querySelector(".login").addEventListener("click", () => {location.href="/member/login/login"});
	/*document.querySelector(".logout").addEventListener("click", () => {location.href="/Mulbburi"});*/
}

home();