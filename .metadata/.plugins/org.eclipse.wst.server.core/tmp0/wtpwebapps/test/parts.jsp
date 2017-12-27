
<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8">
    <title></title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <link rel="stylesheet" href="assets/css/style.css">
    <link href="https://fonts.googleapis.com/css?family=Open+Sans" rel="stylesheet">
  </head>
  <body>
    <header>
      <div id="ng-layout-topbar" class="">
        <a class="menu-button" href="#">
          <i class="fa fa-bars"></i>
        </a>

        <a class="logo">
          <img alt="logo" src="assets/img/mobile-daimler-logo.png">
        </a>

        <div class="ui-g" style="float: right;">
          <ul class="ng-topbar-menu">
            <li style="color:white;width:20px;">
              <i class="fa fa-user"></i>
            </li>
            <li style="color:white;margin-top:25%;">
              Hi <%=(String)request.getAttribute("userName")%> | HO
            </li>
          </ul>
        </div>

      </div>
    </header>

    <aside class="">
      <div  class="ng-tns-c1-0" id="ng-layout-sidebar">
        <div  class="ng-layout-menu">
          <a  class="ng-tns-c1-0 active-menuitem" id="dashboard_menutitle" href="#/dashboard">
            <i  class="fa fa-dashboard" title="Dashboard"></i>
            <span  class="ng-tns-c1-0">Dashboard</span>
          </a>
          <a id="asbd_menutitle" class="ng-tns-c1-0">
            <i class="fa fa-line-chart"></i>
            <span class="ng-tns-c1-0">ASBD</span>
            <i class="fa fa-angle-down ng-tns-c1-0 slide-arrow"></i>
          </a>
          <div class="ng-tns-c1-0 submenushow">
            <a id="parts_submenutitle" class="ng-tns-c1-0" onclick="openCity(event, 'part')">
              <i class="fa fa-gears" title="Parts"></i>
              <span class="ng-tns-c1-0">Parts</span>
            </a>
           <!--  <a id="contracts_submenutitle" class="ng-tns-c1-0" href="#/contracts">
              <i class="fa fa-file-text" title="Service Contracts"></i>
              <span class="ng-tns-c1-0">Service Contracts</span>
            </a> -->
          </div>

          <a id="ccare_menutitle" class="ng-tns-c1-0" href="#/customer-care">
            <i class="fa fa-handshake-o" title="Customer Care"></i>
            <span class="ng-tns-c1-0">Customer Care</span>
          </a>
          <a class="ng-tns-c1-0">
            <i class="fa fa-arrow-circle-o-left ng-tns-c1-0"></i>

            <span class="ng-tns-c1-0">Toggle Navigation</span>
          </a>
          <a class="ng-tns-c1-0" id="logout_menutitle" href="#/logout">
            <i class="fa fa-power-off" title="Logout"></i>
            <span class="ng-tns-c1-0">Logout</span>
          </a>
        </div>
      </div>
    </aside>

    <div id="ng-layout-content" class="layout">
      <div class="ui-breadcrumb ui-widget ui-widget-header ui-helper-clearfix ui-corner-all">
        <ul>
          <li class="ui-breadcrumb-home fa fa-home"></li>
          <li class="ui-breadcrumb-chevron fa fa-chevron-right"></li>
          <li role="menuitem" class="">
            <a class="ui-menuitem-link" href="#">
              <span class="ui-menuitem-text">Dashboard</span>
            </a>
          </li>
          <li class="ui-breadcrumb-chevron fa fa-chevron-right"></li>
          <li role="menuitem" class="">
            <a class="ui-menuitem-link" href="#">
              <span class="ui-menuitem-text">After Sales</span>
            </a>
          </li>
        </ul>
      </div>
      
      <div id="part" class="tabcontent">
		<div>
			<div id="parts" style="width: 800px; height: 600px;"></div>
		</div>
	</div>

	<div id="warrantyRepair" class="tabcontent">
		<div>
			<div id="warranty" style="width: 800px; height: 700px;"></div>
		</div>
	</div>
    </div>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/2.2.4/jquery.js"></script>
    <script type="text/javascript" 	src="https://public.tableau.com/javascripts/api/tableau-2.min.js"></script>
    <script src="assets/js/custom.js"></script>
    <script type="text/javascript">
    $(document).ready(function() {
     $.ajax({

			url : 'http://localhost:9191/doLogin',
			//url : 'http://192.168.1.135:8080/Noodle/Noodle?page=',
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
		
	});
</script>
<script type="text/javascript">
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
			
	// http://localhost:9191/trusted/Gz7lB42-RY28TDucm-PumQ==:XTDRmECCfy52fW-pU54aDC5N/views/Superstore/Customers
	
	var containerDiv = document.getElementById("parts"), url = "http://localhost:9191/"+ "trusted/" + ticket+"/views/Superstore/Customers", options = {
		hideTabs : false
	}; 
	
	
	/* var containerDiv = document.getElementById("parts"), url = "http://192.168.1.31/trusted/"+ticket+"/views/Visualizations/Region", options = {
		hideTabs : false
	}; */
	var viz = new tableau.Viz(containerDiv, url, options);
	// Create a viz object and embed it in the container div.
}

</script>
  </body>
</html>
