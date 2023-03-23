window.onload = function(){
$(function(){
	$("#allCheck").click(function(){
		
		if($("#allCheck").prop("checked")){
			$("input[type=checkbox]").prop("checked",true);
		} else {
			$("input[type=checked]").prop("checked",false);
		}
		
		selTotalInfo($(".contents"));
	})
})
$(document).ready(function(){
	selTotalInfo();
});

$("#oneCheck").on("change",function(){
	
	selTotalInfo($(".contents"));
})



function selTotalInfo(){
	let totalPrice = 1000;
	let totalAmount = 2;
	let deliveryPrice = 3000;
	let totalPrice1 = 0;
	let finalTotalPrice = 0;
	
	$(".contents").each(function(index, element){
		
	if($(element).find(".chkTitle20").is(":checked") === true){
		totalPrice += parseInt($(element).find(".payAmountSum").val());
		
		totalAmount += parseInt($(element).find(".quantity").val());
		}
	})
	
	finalTotalPrice += totalPrice * totalAmount + deliveryPrice;
	totalPrice1 += totalPrice * totalAmount;
	$(".totalPrice").text(totalPrice1)
	$(".orderAmountSum").text(deliveryPrice);
	$(".quantity").text(totalAmount);
	$(".payAmountSum").text(finalTotalPrice.toLocaleString());
}

function deleteCartItem(pcNo){
	
	fetch("/cart/deleteCartItem", {
		method : 'POST',
		headers : {
			'Content-Type' : 'application/json; charset=UTF-8'
		},
		body : JSON.stringify({pcNo : pcNo})
	})
	.then(result =>{
		alert("상품이 삭제되었습니다.");
	})
	
} 

}
