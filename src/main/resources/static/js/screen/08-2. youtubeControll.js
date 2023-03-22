function dropdown(){
    document.querySelector(".arrow").addEventListener("click", () => {document.querySelector(".mydropdown").classList.toggle("active")});
}

dropdown();

function dropdown2(){
	document.querySelector(".arrow2").addEventListener("click", () => {document.querySelector(".mydropdown2").classList.toggle("active2")});
}

dropdown2();

function click(){
    const $t1 = document.querySelector(".t1");
    const $t2 = document.querySelector(".t2");
    const $background2 = document.querySelector(".totalstory");
    const $background3 = document.querySelector(".totalstory3");

    $t1.addEventListener("click", () => {
        $background2.style.display = "flex";
        $background3.style.display = "none";
        console.log("t1");
    });

    $t2.addEventListener("click", () => {
        $background3.style.display = "flex";
        $background2.style.display = "none";
        console.log("t2");
    })
}

click();