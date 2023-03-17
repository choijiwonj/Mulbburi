function click(){
    const one = document.querySelector(".tt1");
    const two = document.querySelector(".tt2");
    const three = document.querySelector(".tt3");

    one.addEventListener("click", () => {location.href = "../lecture/12-1. oneAskControll.html"});
    two.addEventListener("click", () => {location.href = "../lecture/12-2. 공지사항.html"});
    three.addEventListener("click", () => {location.href = "../lecture/12-3. FAQ.html"});
}

click();