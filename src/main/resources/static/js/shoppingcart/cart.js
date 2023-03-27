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
	 $("input:checkbox[name='checkbox_input']").change(function(){
			selTotalInfo();
	})
});

function selTotalInfo(){
	
	var totalPrice = 0;
	var totalCount = 0;
	var finalTotalPrice = 0;
	var deliveryPrice = 0;
	
	$("input:checkbox[name='checkbox_input']").each(function(index, element){
	
	console.log($(this));
	if($(this).is(":checked") === true){
	 var parentElem = $(element).parent();
            totalPrice += parseInt(parentElem.find(".individual_totalPrice_input").val());
            console.log(totalPrice);
            totalCount += parseInt(parentElem.find(".individual_sbAmount_input").val());
	}
});
	finalTotalPrice = totalPrice;
	$(".totalPrice").text(totalPrice.toLocaleString());
	$(".orderAmountSum").text(deliveryPrice);
	$(".quantity").text($("input:checkbox[name='checkbox_input']:checked").length);
	$(".payAmountSum").text(finalTotalPrice.toLocaleString());


}

$(".buyButton").click(function(){
	
	$("input:checkbox[name='checkbox_input']").each(function(){
		
		console.log(this);
		if($(this).is(":checked") ===true){
			console.log(this);
		}
	})
})
}