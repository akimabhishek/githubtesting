/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.82
 * Generated at: 2017-11-08 07:09:06 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<!--[if lt IE 7]>      <html class=\"no-js lt-ie9 lt-ie8 lt-ie7\"> <![endif]-->\r\n");
      out.write("<!--[if IE 7]>         <html class=\"no-js lt-ie9 lt-ie8\"> <![endif]-->\r\n");
      out.write("<!--[if IE 8]>         <html class=\"no-js lt-ie9\"> <![endif]-->\r\n");
      out.write("<!--[if gt IE 8]><!--> <html class=\"no-js\"> <!--<![endif]-->\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\">\r\n");
      out.write("  <meta http-equiv=\"Content-Type\" content=\"text/html;charset=UTF-8\">\r\n");
      out.write("\r\n");
      out.write("  <meta http-equiv=\"Pragma\" content=\"no-cache\">\r\n");
      out.write("  <meta http-equiv=\"Expires\" content=\"-1\">\r\n");
      out.write("  <meta name=\"weblogin-version\" content=\"6.0.5\">\r\n");
      out.write("  <meta name=\"detailcode\" content=\"0\">\r\n");
      out.write("  <meta name=\"language\" content=\"en\">\r\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width,initial-scale=1.0, maximum-scale=1.0, user-scalable=no\">\r\n");
      out.write("\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\r\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\r\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\r\n");
      out.write("   \r\n");
      out.write("\r\n");
      out.write("  <link rel=\"stylesheet\" type=\"text/css\" href=\"assets/css/weblogin-b0d4dd5e.css\">\r\n");
      out.write("  <link rel=\"stylesheet\" type=\"text/css\" href=\"assets/css/brand.css\">\r\n");
      out.write("  \r\n");
      out.write("  \r\n");
      out.write("  <!--[if lt IE 9]>\r\n");
      out.write("    <script src=\"/internet/iap/shared/js/vendor/html5shiv-3.7.1.js\"></script>\r\n");
      out.write("  <![endif]-->\r\n");
      out.write("  <script src=\"/internet/iap/shared/js/vendor/modernizr-2.6.2-respond-1.1.0.min-2.6.2.js\"></script>\r\n");
      out.write("  \r\n");
      out.write("  <script language=\"Javascript\" type=\"text/javascript\">\r\n");
      out.write("     // put frame on top\r\n");
      out.write("     if (top.location != this.location) {\r\n");
      out.write("        top.location = this.location;\r\n");
      out.write("     }\r\n");
      out.write("     \r\n");
      out.write("     $(document).ready(function() {\r\n");
      out.write("    \t var result = ");
      out.print((String)request.getAttribute("result"));
      out.write(";\r\n");
      out.write("    \t if(result == null || result == '')\r\n");
      out.write("    \t\t$('#error').hide();\r\n");
      out.write("    \t\t\r\n");
      out.write("    \t});\r\n");
      out.write("  </script>\r\n");
      out.write("\r\n");
      out.write("  <title>Web Login</title>\r\n");
      out.write("  </head>\r\n");
      out.write("  <body>\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("  <div class=\"header\">\r\n");
      out.write("    <div class=\"row\">\r\n");
      out.write("      <div class=\"visible-xs col-xs-6 headerLabel\">\r\n");
      out.write("          <h5>\r\n");
      out.write("            LOGIN\r\n");
      out.write("            \r\n");
      out.write("          </h5>\r\n");
      out.write("        </div>\r\n");
      out.write("                <div class=\"pull-right menu\">\r\n");
      out.write("           <div class=\"help\">&nbsp;</div>\r\n");
      out.write("          \r\n");
      out.write("          <div class=\"select-style\">\r\n");
      out.write("            <select id=\"languageSelector\" onblur=\"selectblur()\" onfocus=\"selectfocus()\" onchange=\"setLanguage(this.value, 'https://cdiwl-appstest.i.daimler.com/internet/login?brand=mbusa&amp;TYPE=33554432&amp;REALMOID=06-0df16c9c-97d6-111b-a06a-862e0018fb1e&amp;GUID=&amp;SMAUTHREASON=0&amp;METHOD=GET&amp;SMAGENTNAME=%24SM%24aFxoztyTHET904rw%252bP9fppfeTS%252bxYgrrxaL3qplkynZwThsL0FrYXTpPmbqFC4Ca37o3w4YLRDQcS%252fQCuBS48HJFeE0ICFhM&amp;TARGET=%24SM%24https%253a%252f%252fnetstar5-portal-dev%252ei%252edaimler%252ecom%252fnetstar%252f&amp;wlrefresh=true')\">\r\n");
      out.write("              \r\n");
      out.write("              \r\n");
      out.write("            </select> \r\n");
      out.write("          </div>\r\n");
      out.write("          <script type=\"text/javascript\">\r\n");
      out.write("            var sel = document.getElementById('languageSelector');\r\n");
      out.write("            if (sel != null) {\r\n");
      out.write("              if (sel.length === 0) {\r\n");
      out.write("                sel.className = 'invisible';\r\n");
      out.write("              }           \r\n");
      out.write("              sel.value='en';\r\n");
      out.write("            }\r\n");
      out.write("            \r\n");
      out.write("            // Workaround for IE needs to be fixed, or change cursor\r\n");
      out.write("            function selectfocus() {\r\n");
      out.write("        $(\".container\").css('cursor','pointer');\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            function selectblur() {\r\n");
      out.write("                $(\".container\").css('cursor','auto');\r\n");
      out.write("            }\r\n");
      out.write("            \r\n");
      out.write("          </script>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("      \r\n");
      out.write("      <div id=\"brand\" class=\"brand\">\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("          <div class=\"col-xs-12 col-sm-5 col-lg-5\">\r\n");
      out.write("            <div class=\"newcontent\">\r\n");
      out.write("              <div class=\"hidden-xs\" style=\"position: relative; top: 5px;\">\r\n");
      out.write("                <h5>\r\n");
      out.write("              LOGIN &nbsp;&nbsp;&nbsp;<div id='error' style=\"display: inline;\"> <font style=\"color:red;font-size:10px;\"> ");
      out.print((String)request.getAttribute("result"));
      out.write(" </font>  </div\r\n");
      out.write("              \r\n");
      out.write("            </h5>\r\n");
      out.write("          <hr>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div>\r\n");
      out.write("          \r\n");
      out.write("\r\n");
      out.write("          \r\n");
      out.write("\r\n");
      out.write("          \r\n");
      out.write("\r\n");
      out.write("          \r\n");
      out.write("\r\n");
      out.write("          \r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        \r\n");
      out.write("          <div id=\"loginType\" style=\"display: none;\">uid</div>\r\n");
      out.write("          <div id=\"msgEnterCredentials\" style=\"display: none;\">\r\n");
      out.write("            \r\n");
      out.write("            Please enter username (User ID), password and security code.\r\n");
      out.write("          </div>\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("\r\n");
      out.write("        <form id=\"login\" name=\"login\" class=\"form-horizontal\" role=\"form\" action=\"home\" method=\"POST\" autocomplete=\"off\" autocorrect=\"off\" autocapitalize=\"off\">\r\n");
      out.write("          <input type=\"hidden\" name=\"target\" value=\"https://netstar5-portal-dev.i.daimler.com/netstar/\"/>\r\n");
      out.write("<input type=\"hidden\" name=\"smauthreason\" value=\"0\"/>\r\n");
      out.write("<input type=\"hidden\" name=\"smagentname\" value=\"$SM$aFxoztyTHET904rw+P9fppfeTS+xYgrrxaL3qplkynZwThsL0FrYXTpPmbqFC4Ca37o3w4YLRDQcS/QCuBS48HJFeE0ICFhM\"/>\r\n");
      out.write("\r\n");
      out.write("          \r\n");
      out.write("\r\n");
      out.write("          <div class=\"row\">\r\n");
      out.write("            <div class=\"col-sm-12 noPadding\">\r\n");
      out.write("              <div class=\"form-group\">\r\n");
      out.write("                <label for=\"j_username\" class=\"col-md-4 noPadding\"> <span>\r\n");
      out.write("                      User ID:\r\n");
      out.write("                      \r\n");
      out.write("                     </span>\r\n");
      out.write("                </label>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"col-sm-11 col-md-8 noPadding\">\r\n");
      out.write("                  <input type= \"text\" class=\"credential credential input_padding\" id=\"usr\"  name=\"j_username\"\r\n");
      out.write("                    \r\n");
      out.write("                         type=\"text\"\r\n");
      out.write("                         maxlength=\"25\"\r\n");
      out.write("                         \r\n");
      out.write("                      required />\r\n");
      out.write("                </div>\r\n");
      out.write("              </div>\r\n");
      out.write("\r\n");
      out.write("              \r\n");
      out.write("              <div class=\"form-group\">\r\n");
      out.write("                <label for=\"j_password\" class=\"col-md-4 noPadding\"> <span>\r\n");
      out.write("                  Web Password:\r\n");
      out.write("                  \r\n");
      out.write("                </span>\r\n");
      out.write("                </label>\r\n");
      out.write("                <div class=\"col-sm-11 col-md-8 noPadding\">\r\n");
      out.write("                  <input type=\"password\" class=\"credential\r\n");
      out.write("                  \r\n");
      out.write("                  input_padding\"\r\n");
      out.write("                    id=\"password\" value=\"\" name=\"j_password\" maxlength=\"25\" required />\r\n");
      out.write("                    \r\n");
      out.write("                    <img class=\"hidden-xs credentialsLogo\" src=\"https://cdiwl-appstest.i.daimler.com/internet/iap/pages/default/img/cd_internet_med41-43151EAC.png\">\r\n");
      out.write("                </div>\r\n");
      out.write("              </div>\r\n");
      out.write("\r\n");
      out.write("              \r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("\r\n");
      out.write("          \r\n");
      out.write("\r\n");
      out.write("          <div class=\"col-md-offset-4\">\r\n");
      out.write("            <button class=\"btn btn-primary loginButton\" id=\"button_login\" type=\"submit\">\r\n");
      out.write("              Login\r\n");
      out.write("            </button>\r\n");
      out.write("          </div>\r\n");
      out.write("        </form>\r\n");
      out.write("        <hr>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("    <div class=\"col-md-5 links\">\r\n");
      out.write("        <a href=\"javascript: window.open('https://login.i.daimler.com/password/passwordChange?t=logout','pwtool','screenX=50,left=50,screenY=20,top=20,width=900,height=600,resizable=no,scrollbars=yes,menubar=no,toolbar=no,directories=no,location=no,status=no').focus();\">\r\n");
      out.write("            Change Web password\r\n");
      out.write("        </a>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"col-md-7 links\">\r\n");
      out.write("        <a href=\"javascript: window.open('https://login.i.daimler.com/password/passwordReset?t=logout','pwtool','screenX=50,left=50,screenY=20,top=20,width=900,height=600,resizable=no,scrollbars=yes,menubar=no,toolbar=no,directories=no,location=no,status=no').focus();\">\r\n");
      out.write("            Reset Web password\r\n");
      out.write("        </a>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("      \r\n");
      out.write("    </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"footer\">\r\n");
      out.write("      \r\n");
      out.write("\r\n");
      out.write("<div class=\"row-fluid\">\r\n");
      out.write("  &copy;\r\n");
      out.write("  2017\r\n");
      out.write("  Mercedes-Benz USA, LLC.\r\n");
      out.write("  \r\n");
      out.write("  All rights reserved.\r\n");
      out.write("  \r\n");
      out.write("  \r\n");
      out.write("  \r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("\r\n");
      out.write("  \r\n");
      out.write("  <script>var ctx = \"/internet/\"</script>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\" src=\"/internet/iap/shared/js/jquery.min-1.11.3.bootstrap.min-3.3.5.iap_brand.js\"></script>\r\n");
      out.write("  \r\n");
      out.write("  <script type=\"text/javascript\" src=\"iap/shared/js/iap_login_ea9e5a20.js\"></script>\r\n");
      out.write("\r\n");
      out.write("  \r\n");
      out.write("  \r\n");
      out.write("\r\n");
      out.write("  <script>\r\n");
      out.write("    $(document).ready(function() {\r\n");
      out.write("\r\n");
      out.write("        setTimeout(function(){\r\n");
      out.write("            var usrInput = $('#usr');\r\n");
      out.write("            var usr = usrInput.val();\r\n");
      out.write("            if (usr.length == 0) {\r\n");
      out.write("                usrInput.focus();\r\n");
      out.write("            } else {//if (pwd.length == 0) {\r\n");
      out.write("                var passwordInput = $('#password');\r\n");
      out.write("                passwordInput.focus();\r\n");
      out.write("                // set cursor to last position\r\n");
      out.write("                var tmpStr = passwordInput.val();\r\n");
      out.write("                if (tmpStr !== '') {\r\n");
      out.write("                    passwordInput.val('');\r\n");
      out.write("                    passwordInput.val(tmpStr);\r\n");
      out.write("                }\r\n");
      out.write("            }\r\n");
      out.write("        }, 100);\r\n");
      out.write("\r\n");
      out.write("        var hash = self.document.location.hash;\r\n");
      out.write("        if (hash.length <= 1) {\r\n");
      out.write("            return true;\r\n");
      out.write("        }\r\n");
      out.write("        if (hash && hash.indexOf('#') === -1) {\r\n");
      out.write("            hash = '#' + hash;\r\n");
      out.write("        }\r\n");
      out.write("        var loginButton = $('#login');\r\n");
      out.write("        loginButton.attr('action', loginButton.attr('action') + hash);\r\n");
      out.write("    });\r\n");
      out.write("  </script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("<!-- WEBLLINNLS/en -->\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
