
	function sendRequest(){
		
		var p_name = document.getElementById("nom").value;
		var resposta ="";
		
		$.ajax({
		    url: 'http://localhost:8080',
		    headers: {
		        'Content-Type' : 'application/x-www-form-urlencoded'
		    },
		    type: "GET", 
		    dataType: "json",
		    data: {"nom" : p_name },
		    
		    success: function (result) {
		        console.log(result);
		        console.log(result.message);
		        resposta = result.message;
		        document.getElementById("resposta").innerHTML = resposta;
		    },
		    
		    error: function (error) {
		        console.log(error);
		    }
		});
			
	}
	
