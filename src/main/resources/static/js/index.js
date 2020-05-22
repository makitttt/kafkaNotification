/*$( window ).ready(function() {
  connect();
});

function connect() {
  var socket = new SockJS('/websocket');
  stompClient = Stomp.over(socket);
  stompClient.debug = function (){};
  stompClient.connect({}, function (frame) {
      stompClient.subscribe('/topic/pushNotification', function (notification) {
    	  console.log('notiiiiii ' + notification);
          $('#textArea').val(notification);
       });
  });
}*/

$( window ).ready(function() {
  connect();
});

function connect() {
	var socket = new SockJS('/websocket');
	  stompClient = Stomp.over(socket);
	  stompClient.debug = function (){};
	  stompClient.connect({}, function(frame) {
		stompClient.subscribe('/topic/pushNotification', function(message) {
		$('#textArea').val(message);	
		});
	}, function(error) {
		alert("STOMP error " + error);
	});
}