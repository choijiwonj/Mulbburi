    function getYouTube() {
        $.ajax({
             type : "GET",
             dataType : "JSON",
             url : "https://www.googleapis.com/youtube/v3/search?channelId=@elgarden_&part=snippet&maxResults=6&key=AIzaSyAHSGbXskEp85YLDs6MvR5g-sHo7lvh1gE",
             contentType : "application/json",
             success : function(jsonData) {
                 for (var i = 0; i < jsonData.items.length; i++) {
                     var items = jsonData.items[i];
                     console.log(items);
                 }
             },
             complete : function(data) {

             },
             error : function(xhr, status, error) {
                 console.log("유튜브 요청 에러: "+error);
             }
        });
    }