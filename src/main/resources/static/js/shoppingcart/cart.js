window.onload = function(){
$(function(){
	$("#allCheck").click(function(){
		
		if($("#allCheck").prop("checked")){
			$("input[type=checkbox]").prop("checked",true);
		} else {
			$("input[type=checked]").prop("checked",false);
		}
		
		selTotalInfo();
	})
})
$(document).ready(function(){
	 $("input[type=checkbox]").change(function(){
			selTotalInfo();
	})
});

function selTotalInfo(){
	
	if($("input:checkbox[name='checkbox_input']").is(":checked") == true){
	
	const totalPrice = parseInt($(".sbtotalPrice").text());
	const totalAmount = parseInt($(".quantity_input").val());
	var deliveryPrice = 0;
	var finalTotalPrice = 0;
	
	
	finalTotalPrice = totalPrice * totalAmount + deliveryPrice;
	$(".totalPrice").text(totalPrice.toLocaleString());
	$(".orderAmountSum").text(deliveryPrice);
	$(".quantity").text(totalAmount.toLocaleString());
	$(".payAmountSum").text(finalTotalPrice.toLocaleString());
	} else {
	$(".totalPrice").text(0);
	$(".orderAmountSum").text(0);
	$(".quantity").text(0);
	$(".payAmountSum").text(0);
	}
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
