function home(){
	document.querySelector(".store").addEventListener("click", () => {location.href="/store"});
	document.querySelector(".home").addEventListener("click", () => {location.href="/Mulbburi"});
	document.querySelector(".logout").addEventListener("click", ()=>{location.href="/Mulbburi"})
}

home();