function dropdown(){
    document.querySelector(".arrow").addEventListener("click", () => {document.querySelector(".mydropdown").classList.toggle("active")});
}

dropdown();

function click(){
	  document.querySelector(".t2").addEventListener("click", () => {location.href = "/screen/08-4. bannerList"});
      document.querySelector(".t1").addEventListener("click", () => {location.href = "regist/banner"});
}