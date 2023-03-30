function home(){
	document.querySelector(".store").addEventListener("click", () => {location.href="/store"});
	document.querySelector(".home").addEventListener("click", () => {location.href="/Mulbburi/login"});
	document.querySelector(".logout").addEventListener("click", ()=>{location.href="/select/product"})
}

home();