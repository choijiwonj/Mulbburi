function home(){
		document.querySelector(".adminhome").addEventListener("click", () => {location.href="/Mulbburiadmin"});
		document.querySelector(".memberAdmin").addEventListener("click", () => {location.href="/memberAdmin"});
		document.querySelector(".sellerAdmin").addEventListener("click", () => {location.href="/sellerAdmin"});
		document.querySelector(".askAdmin").addEventListener("click", () => {location.href="/askAdmin"});
		document.querySelector(".screenAdmin").addEventListener("click", () => {location.href="/screenAdmin"});
		document.querySelector(".logout").addEventListener("click", () => {location.href="/Mulbburi"});
}

home();