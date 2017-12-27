




<!DOCTYPE html>
<!--[if lt IE 7]>      <html class="no-js lt-ie9 lt-ie8 lt-ie7"> <![endif]-->
<!--[if IE 7]>         <html class="no-js lt-ie9 lt-ie8"> <![endif]-->
<!--[if IE 8]>         <html class="no-js lt-ie9"> <![endif]-->
<!--[if gt IE 8]><!--> <html class="no-js"> <!--<![endif]-->

<head>
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <meta http-equiv="Content-Type" content="text/html;charset=UTF-8">

  <meta http-equiv="Pragma" content="no-cache">
  <meta http-equiv="Expires" content="-1">
  <meta name="weblogin-version" content="6.0.5">
  <meta name="detailcode" content="0">
  <meta name="language" content="en">
  <meta name="viewport" content="width=device-width,initial-scale=1.0, maximum-scale=1.0, user-scalable=no">

  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
   

  <link rel="stylesheet" type="text/css" href="assets/css/weblogin-b0d4dd5e.css">
  <link rel="stylesheet" type="text/css" href="assets/css/brand.css">
  
  
  <!--[if lt IE 9]>
    <script src="/internet/iap/shared/js/vendor/html5shiv-3.7.1.js"></script>
  <![endif]-->
  <script src="/internet/iap/shared/js/vendor/modernizr-2.6.2-respond-1.1.0.min-2.6.2.js"></script>
  
  <script language="Javascript" type="text/javascript">
     // put frame on top
     if (top.location != this.location) {
        top.location = this.location;
     }
     
     $(document).ready(function() {
    	 var result = <%=(String)request.getAttribute("result")%>;
    	 if(result == null || result == '')
    		$('#error').hide();
    		
    	});
  </script>

  <title>Web Login</title>
  </head>
  <body>
<div class="container">
  <div class="header">
    <div class="row">
      <div class="visible-xs col-xs-6 headerLabel">
          <h5>
            LOGIN
            
          </h5>
        </div>
                <div class="pull-right menu">
           <div class="help">&nbsp;</div>
          
          <div class="select-style">
            <select id="languageSelector" onblur="selectblur()" onfocus="selectfocus()" onchange="setLanguage(this.value, 'https://cdiwl-appstest.i.daimler.com/internet/login?brand=mbusa&amp;TYPE=33554432&amp;REALMOID=06-0df16c9c-97d6-111b-a06a-862e0018fb1e&amp;GUID=&amp;SMAUTHREASON=0&amp;METHOD=GET&amp;SMAGENTNAME=%24SM%24aFxoztyTHET904rw%252bP9fppfeTS%252bxYgrrxaL3qplkynZwThsL0FrYXTpPmbqFC4Ca37o3w4YLRDQcS%252fQCuBS48HJFeE0ICFhM&amp;TARGET=%24SM%24https%253a%252f%252fnetstar5-portal-dev%252ei%252edaimler%252ecom%252fnetstar%252f&amp;wlrefresh=true')">
              
              
            </select> 
          </div>
          <script type="text/javascript">
            var sel = document.getElementById('languageSelector');
            if (sel != null) {
              if (sel.length === 0) {
                sel.className = 'invisible';
              }           
              sel.value='en';
            }
            
            // Workaround for IE needs to be fixed, or change cursor
            function selectfocus() {
        $(".container").css('cursor','pointer');
            }

            function selectblur() {
                $(".container").css('cursor','auto');
            }
            
          </script>
        </div>

        </div>
      </div>
      
      <div id="brand" class="brand">
        <div class="row">
          <div class="col-xs-12 col-sm-5 col-lg-5">
            <div class="newcontent">
              <div class="hidden-xs" style="position: relative; top: 5px;">
                <h5>
              LOGIN &nbsp;&nbsp;&nbsp;<div id='error' style="display: inline;"> <font style="color:red;font-size:10px;"> <%=(String)request.getAttribute("result")%> </font>  </div
              
            </h5>
          <hr>
        </div>

        <div>
          

          

          

          

          
        </div>

        
          <div id="loginType" style="display: none;">uid</div>
          <div id="msgEnterCredentials" style="display: none;">
            
            Please enter username (User ID), password and security code.
          </div>
        
        

        <form id="login" name="login" class="form-horizontal" role="form" action="home" method="POST" autocomplete="off" autocorrect="off" autocapitalize="off">
          <input type="hidden" name="target" value="https://netstar5-portal-dev.i.daimler.com/netstar/"/>
<input type="hidden" name="smauthreason" value="0"/>
<input type="hidden" name="smagentname" value="$SM$aFxoztyTHET904rw+P9fppfeTS+xYgrrxaL3qplkynZwThsL0FrYXTpPmbqFC4Ca37o3w4YLRDQcS/QCuBS48HJFeE0ICFhM"/>

          

          <div class="row">
            <div class="col-sm-12 noPadding">
              <div class="form-group">
                <label for="j_username" class="col-md-4 noPadding"> <span>
                      User ID:
                      
                     </span>
                </label>

                <div class="col-sm-11 col-md-8 noPadding">
                  <input type= "text" class="credential credential input_padding" id="usr"  name="j_username"
                    
                         type="text"
                         maxlength="25"
                         
                      required />
                </div>
              </div>

              
              <div class="form-group">
                <label for="j_password" class="col-md-4 noPadding"> <span>
                  Web Password:
                  
                </span>
                </label>
                <div class="col-sm-11 col-md-8 noPadding">
                  <input type="password" class="credential
                  
                  input_padding"
                    id="password" value="" name="j_password" maxlength="25" required />
                    
                    <img class="hidden-xs credentialsLogo" src="https://cdiwl-appstest.i.daimler.com/internet/iap/pages/default/img/cd_internet_med41-43151EAC.png">
                </div>
              </div>

              
            </div>
          </div>

          

          <div class="col-md-offset-4">
            <button class="btn btn-primary loginButton" id="button_login" type="submit">
              Login
            </button>
          </div>
        </form>
        <hr>

        <div class="row">
    <div class="col-md-5 links">
        <a href="javascript: window.open('https://login.i.daimler.com/password/passwordChange?t=logout','pwtool','screenX=50,left=50,screenY=20,top=20,width=900,height=600,resizable=no,scrollbars=yes,menubar=no,toolbar=no,directories=no,location=no,status=no').focus();">
            Change Web password
        </a>
    </div>
    <div class="col-md-7 links">
        <a href="javascript: window.open('https://login.i.daimler.com/password/passwordReset?t=logout','pwtool','screenX=50,left=50,screenY=20,top=20,width=900,height=600,resizable=no,scrollbars=yes,menubar=no,toolbar=no,directories=no,location=no,status=no').focus();">
            Reset Web password
        </a>
    </div>
</div>

        
        
      </div>
    </div>
      
    </div>
    </div>

    <div class="footer">
      

<div class="row-fluid">
  &copy;
  2017
  Mercedes-Benz USA, LLC.
  
  All rights reserved.
  
  
  
</div>


    </div>
  </div>

  
  <script>var ctx = "/internet/"</script>

<script type="text/javascript" src="/internet/iap/shared/js/jquery.min-1.11.3.bootstrap.min-3.3.5.iap_brand.js"></script>
  
  <script type="text/javascript" src="iap/shared/js/iap_login_ea9e5a20.js"></script>

  
  

  <script>
    $(document).ready(function() {

        setTimeout(function(){
            var usrInput = $('#usr');
            var usr = usrInput.val();
            if (usr.length == 0) {
                usrInput.focus();
            } else {//if (pwd.length == 0) {
                var passwordInput = $('#password');
                passwordInput.focus();
                // set cursor to last position
                var tmpStr = passwordInput.val();
                if (tmpStr !== '') {
                    passwordInput.val('');
                    passwordInput.val(tmpStr);
                }
            }
        }, 100);

        var hash = self.document.location.hash;
        if (hash.length <= 1) {
            return true;
        }
        if (hash && hash.indexOf('#') === -1) {
            hash = '#' + hash;
        }
        var loginButton = $('#login');
        loginButton.attr('action', loginButton.attr('action') + hash);
    });
  </script>
</body>
</html>

<!-- WEBLLINNLS/en -->
