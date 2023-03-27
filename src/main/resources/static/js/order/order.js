window.onload = function(){
	
	$(document).ready(function() {
    var itemCount = $("tr.jinho").length;
    var totalPrice = 0;
    $("input.individual_totalPrice_input").each(function() {
      totalPrice += parseInt($(this).val());
    });
    $(".quantity").text(itemCount);
    $(".totalPrice1").text(totalPrice.toLocaleString());
    $(".payAmountSum").text(totalPrice.toLocaleString());
  });
}