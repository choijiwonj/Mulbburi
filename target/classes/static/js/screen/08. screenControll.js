function click(){
    const button1 = document.querySelector(".tt1")
    const button2 = document.querySelector(".tt2");

   button1.addEventListener("click", () => {location.href="../lecture/08-1. 배너 관리.html"});
   button2.addEventListener("click", () => {location.href="../lecture/08-2. 유투브 관리.html"});
}

click();