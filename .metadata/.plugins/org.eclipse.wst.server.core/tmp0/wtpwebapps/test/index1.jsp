<!-- 
<!DOCTYPE html>
<html>
<head>
<style>
body {
	font-family: "Lato", sans-serif;
}

/* Style the tab */
div.tab {
	overflow: hidden;
	border: 1px solid #ccc;
	background-color: #f1f1f1;
}

/* Style the buttons inside the tab */
div.tab button {
	background-color: inherit;
	float: left;
	border: none;
	outline: none;
	cursor: pointer;
	padding: 14px 16px;
	transition: 0.3s;
	font-size: 17px;
}

/* Change background color of buttons on hover */
div.tab button:hover {
	background-color: #ddd;
}

/* Create an active/current tablink class */
div.tab button.active {
	background-color: #ccc;
}

/* Style the tab content */
.tabcontent {
	display: none;
	padding: 6px 12px;
	border: 1px solid #ccc;
	border-top: none;
}
</style>
<script type="text/javascript"
	src="https://public.tableau.com/javascripts/api/tableau-2.min.js"></script>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script type="text/javascript">
var ticket;
	$(document).ready(function() {
		//window.location.href = "http://192.168.1.31/trusted";

		$.ajax({

			url : 'http://182.71.18.237:9292/doLogin',
			type : 'get',
			success : function(data) {
				ticket = data;
				console.log('ajax success = ' + ticket);
			},
			error : function(data) {
				alert("error");
				// var errorMsg = 'Ajax request failed: ' + xhr.responseText;
				console.log('ajax error = ' + JSON.stringify(data));
			}
		});
	/* 	browser.webRequest.onBeforeRequest.addListener(
				  logURL,
				  {urls: ["<all_urls>"]}
				); */
		
	});
	/* //1
	(function(open) {
	    XMLHttpRequest.prototype.open = function(method, url, async, user, pass) {
	    	alert(url);
	        this.addEventListener("readystatechange", function() {
				if (this.readyState == 4) 
	            { 
					console.log(this.status);
				}
	        }, false);
	        open.call(this, method, url, async, user, pass);
			this.setRequestHeader("Authorization", "Token 123")
	    };
	})(XMLHttpRequest.prototype.open);
	// */
	/* // 2
	function addXMLRequestCallback(callback){
		alert("hi" + callback);
	    var oldSend, i;
	    if( XMLHttpRequest.callbacks ) {
	        // we've already overridden send() so just add the callback
	        XMLHttpRequest.callbacks.push( callback );
	    } else {
	        // create a callback queue
	        XMLHttpRequest.callbacks = [callback];
	        // store the native send()
	        oldSend = XMLHttpRequest.prototype.send;
	        // override the native send()
	        XMLHttpRequest.prototype.send = function(){
	            // process the callback queue
	            // the xhr instance is passed into each callback but seems pretty useless
	            // you can't tell what its destination is or call abort() without an error
	            // so only really good for logging that a request has happened
	            // I could be wrong, I hope so...
	            // EDIT: I suppose you could override the onreadystatechange handler though
	            for( i = 0; i < XMLHttpRequest.callbacks.length; i++ ) {
	                XMLHttpRequest.callbacks[i]( this );
	            }
	            // call the native send()
	            oldSend.apply(this, arguments);
	        }
	    }
	}

	addXMLRequestCallback( function( xhr ) {
	    console.log( xhr.responseText ); // (an empty string)
	});
	// */
	
		
			function openCity(evt, cityName) {
			var i, tabcontent, tablinks;
			tabcontent = document.getElementsByClassName("tabcontent");
			for (i = 0; i < tabcontent.length; i++) {
				tabcontent[i].style.display = "none";
			}
			tablinks = document.getElementsByClassName("tablinks");
			for (i = 0; i < tablinks.length; i++) {
				tablinks[i].className = tablinks[i].className.replace(
						" active", "");
			}
			document.getElementById(cityName).style.display = "block";
			evt.currentTarget.className += " active";
			if (cityName == "part") {
				initParts();
			} else if (cityName == "warrantyRepair") {
				initViz1();
			}

		}
		function initParts() {
			//alert("ticket" + ticket);
			// this has to come from ajax response  http://192.168.1.31/#/workbooks/8/views
			// http://192.168.1.31/trusted/Zk0HeIHKSa-Tbzgl7jlgLQ==:9fltIFoH3ojTf-BekNfm3k9d/views/Vizualizations/Region
						
			var containerDiv = document.getElementById("parts"), url = "http://182.71.18.237:9292/"+ "trusted/" + ticket+"/views/Visualizations/Region", options = {
				hideTabs : false
			}; 
			/* var containerDiv = document.getElementById("parts"), url = "http://192.168.1.31/trusted/"+ticket+"/views/Visualizations/Region", options = {
				hideTabs : false
			}; */
			var viz = new tableau.Viz(containerDiv, url, options);
			// Create a viz object and embed it in the container div.
		}
		function initViz1() {
			var containerDiv = document.getElementById("warranty"), url = "http://public.tableau.com/views/RegionalSampleWorkbook/Storms", options = {
				hideTabs : true
			};

			var viz = new tableau.Viz(containerDiv, url, options);
			// Create a viz object and embed it in the container div.
		}
	
</script>
</head>
<body id="body">
	<H3>Trusted Ticketer</H3>
	<form method="POST" id="form1" onload="JavaScript:handleClick()">
	<table class="style1">
		<tr>
			<td><input type="hidden" name="username" value="reader" /></td>
			<td><input type="submit" name="submittable" value="Go" />
		</tr>
	</table>
		</form>
	<p>Click on the buttons inside the tabbed menu:</p>

	<div class="tab">
		<button class="tablinks" onclick="openCity(event, 'part')">Parts</button>
		<button class="tablinks" onclick="openCity(event, 'warrantyRepair')">Warranty</button>
	</div>

	<div id="part" class="tabcontent">
		<div>
			<div id="parts" style="width: 800px; height: 700px;"></div>
		</div>
	</div>

	<div id="warrantyRepair" class="tabcontent">
		<div>
			<div id="warranty" style="width: 800px; height: 700px;"></div>
		</div>
	</div>



</body>
</html>
 -->
 
 <!DOCTYPE html>
<html>
<head>
<script	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script type="text/javascript" 	src="https://public.tableau.com/javascripts/api/tableau-2.min.js"></script>
<script type="text/javascript">

/* $(document).ready(function() {
	//window.location.href = "http://192.168.1.31/trusted";
	$('#mainDiv').hide();
	$('#loginDiv').show();
	
}); */
 function getLogin(){
			var userName = document.getElementById('uname').value;
			var password = document.getElementById("psw").value;
			if(userName == '' || password == ''){
				alert("User Id and Password are mandatory");
			return false;
 		}
 			var data = {"userName":userName,"password":password};
				$.ajax({

					url : 'http://localhost:9191/doLogin',
					type : 'post',
					data :data,
					success : function(data) {
						if(data == 'success')
							getTicket();
						else
							alert(data);
					},
					error : function(data) {
						alert("something went wrong");
						// var errorMsg = 'Ajax request failed: ' + xhr.responseText;
						console.log('ajax error = ' + JSON.stringify(data));
					}
				});
			}
 var ticket;
 function getTicket()
 {
	 $.ajax({

			url : 'http://182.71.18.237:9292/doLogin',
			//url : 'http://192.168.1.135:8080/Noodle/Noodle?page=',
			type : 'get',
			success : function(data) {
				ticket = data;
				console.log('ajax success = ' + ticket);
				$('#loginDiv').hide();
				$('#mainDiv').show();
			},
			error : function(data) {
				alert("error");
				// var errorMsg = 'Ajax request failed: ' + xhr.responseText;
				console.log('ajax error = ' + JSON.stringify(data));
			}
		});
 }
	function openCity(evt, cityName) {
		var i, tabcontent, tablinks;
		tabcontent = document.getElementsByClassName("tabcontent");
		for (i = 0; i < tabcontent.length; i++) {
			tabcontent[i].style.display = "none";
		}
		tablinks = document.getElementsByClassName("tablinks");
		for (i = 0; i < tablinks.length; i++) {
			tablinks[i].className = tablinks[i].className.replace(
					" active", "");
		}
		document.getElementById(cityName).style.display = "block";
		evt.currentTarget.className += " active";
		if (cityName == "part") {
			initParts();
		} else if (cityName == "warrantyRepair") {
			initViz1();
		}

	}
	function initParts() {
		//alert("ticket" + ticket);
		// this has to come from ajax response  http://192.168.1.31/#/workbooks/8/views
		// http://192.168.1.31/trusted/Zk0HeIHKSa-Tbzgl7jlgLQ==:9fltIFoH3ojTf-BekNfm3k9d/views/Vizualizations/Region
					
		var containerDiv = document.getElementById("parts"), url = "http://localhost:9191/"+ "trusted/" + ticket+"/views/Superstore/Customers", options = {
			hideTabs : false
		}; 
		/* var containerDiv = document.getElementById("parts"), url = "http://192.168.1.31/trusted/"+ticket+"/views/Visualizations/Region", options = {
			hideTabs : false
		}; */
		var viz = new tableau.Viz(containerDiv, url, options);
		// Create a viz object and embed it in the container div.
	}
	function initViz1() {
		var containerDiv = document.getElementById("warranty"), url = "http://localhost:9191/POC/", options = {
			hideTabs : true
		};

		var viz = new tableau.Viz(containerDiv, url, options);
		// Create a viz object and embed it in the container div.
	}

</script>



<style>
form {
    border: 3px solid #f1f1f1;
}

input[type=text], input[type=password] {
    width: 100%;
    padding: 12px 20px;
    margin: 8px 0;
    display: inline-block;
    border: 1px solid #ccc;
    box-sizing: border-box;
}

button {
    background-color: #4CAF50;
    color: white;
    padding: 14px 20px;
    margin: 8px 0;
    border: none;
    cursor: pointer;
    width: 100%;
}

button:hover {
    opacity: 0.8;
}

.cancelbtn {
    width: auto;
    padding: 10px 18px;
    background-color: #f44336;
}

.imgcontainer {
    text-align: center;
    margin: 24px 0 12px 0;
}

img.avatar {
    width: 40%;
    border-radius: 50%;
}

.container {
    padding: 16px;
}

span.psw {
    float: right;
    padding-top: 16px;
}

/* Change styles for span and cancel button on extra small screens */
@media screen and (max-width: 300px) {
    span.psw {
       display: block;
       float: none;
    }
    .cancelbtn {
       width: 100%;
    }
}
</style>
</head>
<body>


<div id='loginDiv'>
<h2>Login Form</h2>
  <div class="container">
    <label><b>Username</b></label>
    <input type="text" id = 'uname' placeholder="Enter Username" name="uname" required>

    <label><b>Password</b></label>
    <input type="password" id = 'psw' placeholder="Enter Password" name="psw" required>
        
   <button class="button" onclick="getLogin()">Login</button>
    <input type="checkbox" checked="checked"> Remember me
  </div>

  <div class="container" style="background-color:#f1f1f1">
    <button type="button" class="cancelbtn">Cancel</button>
    <span class="psw">Forgot <a href="#">password?</a></span>
  </div>
</div>

<div id='mainDiv'>

	<form method="POST" id="form1" onload="JavaScript:handleClick()">
	<table class="style1">
		<tr>
		<!-- 	<td><input type="hidden" name="username" value="reader" /></td> -->
			<td><input type="hidden" name="submittable" value="Go" />
		</tr>
	</table>
		</form>

	<div class="tab">
		<button class="tablinks" onclick="openCity(event, 'part')">Parts</button>
		<button class="tablinks" onclick="openCity(event, 'warrantyRepair')">Warranty</button>
	</div>

	<div id="part" class="tabcontent">
		<div>
			<div id="parts" style="width: 800px; height: 700px;"></div>
		</div>
	</div>

	<div id="warrantyRepair" class="tabcontent">
		<div>
			<div id="warranty" style="width: 800px; height: 700px;"></div>
		</div>
	</div>

</div>
</body>
</html>
 