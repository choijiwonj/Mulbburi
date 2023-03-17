function click(){
    const button1 = document.querySelector("#siren");
    const button2 = document.querySelector("#accept");
  
    button1.addEventListener("click", () => {location.href="../lecture/06-1. 판매자 신고.html"});
    button2.addEventListener("click", () => {location.href = "../lecture/06-2. 판매자 승인.html"});
}

click();
