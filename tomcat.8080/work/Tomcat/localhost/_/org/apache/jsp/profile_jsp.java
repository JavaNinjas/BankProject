/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.54
 * Generated at: 2014-08-14 09:53:01 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class profile_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <title>Bank Project</title>\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <meta name=\"description\" content=\"\">\r\n");
      out.write("    <meta name=\"author\" content=\"\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Le styles -->\r\n");
      out.write("    <link href=\"bootstrap/css/bootstrap.css\" rel=\"stylesheet\">\r\n");
      out.write("    <link id=\"switch_style\" href=\"bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"bootstrap/css/bootstrap-responsive.css\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"css/docs.css\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"js/google-code-prettify/prettify.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("    <script src=\"//ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    <script src=\"bootstrap/js/jquery.js\"></script>\r\n");
      out.write("    <script src=\"bootstrap/js/bootstrap-transition.js\"></script>\r\n");
      out.write("    <script src=\"bootstrap/js/bootstrap-alert.js\"></script>\r\n");
      out.write("    <script src=\"bootstrap/js/bootstrap-modal.js\"></script>\r\n");
      out.write("    <script src=\"bootstrap/js/bootstrap-dropdown.js\"></script>\r\n");
      out.write("    <script src=\"bootstrap/js/bootstrap-scrollspy.js\"></script>\r\n");
      out.write("    <script src=\"bootstrap/js/bootstrap-tab.js\"></script>\r\n");
      out.write("    <script src=\"bootstrap/js/bootstrap-tooltip.js\"></script>\r\n");
      out.write("    <script src=\"bootstrap/js/bootstrap-popover.js\"></script>\r\n");
      out.write("    <script src=\"bootstrap/js/bootstrap-button.js\"></script>\r\n");
      out.write("    <script src=\"bootstrap/js/bootstrap-collapse.js\"></script>\r\n");
      out.write("    <script src=\"bootstrap/js/bootstrap-carousel.js\"></script>\r\n");
      out.write("    <script src=\"bootstrap/js/bootstrap-typeahead.js\"></script>\r\n");
      out.write("    <script src=\"bootstrap/js/application.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<div class=\"container\" width=\"970px\">\r\n");
      out.write("\r\n");
      out.write("    <div class=\"row-fluid\">\r\n");
      out.write("        <div class=\"span9\"><br/>\r\n");
      out.write("\r\n");
      out.write("            <h1>Bank Project</h1>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"span3\"><br/>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"pull-right\">\r\n");
      out.write("                <a href=\"#\" original-title=\"facebook\"><img src=\"bootstrap/icon/soc1.png\" alt=\"facebook\"></a>\r\n");
      out.write("                <a href=\"#\" original-title=\"Delicious\"><img src=\"bootstrap/icon/soc2.png\" alt=\"Delicious\"></a>\r\n");
      out.write("                <a href=\"#\" original-title=\"myspace\"><img src=\"bootstrap/icon/soc3.png\" alt=\"myspace\"></a><br/><br/>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <div class=\"navbar\">\r\n");
      out.write("        <div class=\"navbar-inner\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <a data-target=\".nav-collapse\" data-toggle=\"collapse\" class=\"btn btn-navbar\">\r\n");
      out.write("                    <span class=\"icon-bar\"></span>\r\n");
      out.write("                    <span class=\"icon-bar\"></span>\r\n");
      out.write("                    <span class=\"icon-bar\"></span>\r\n");
      out.write("                </a>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"nav-collapse\">\r\n");
      out.write("                    <ul class=\"nav\">\r\n");
      out.write("                        <li class=\"active\"><a href=\"/index.jsp\">Homepage</a></li>\r\n");
      out.write("                        <li><a href=\"/result.jsp\">List of clients</a></li>\r\n");
      out.write("                        <li><a href=\"#\">Sandbox</a></li>\r\n");
      out.write("                        <li><a href=\"#\">About</a></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div>\r\n");
      out.write("                <!-- /.nav-collapse -->\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- /navbar-inner -->\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <div class=\"row-fluid\">\r\n");
      out.write("\r\n");
      out.write("        <div class=\"span4\">\r\n");
      out.write("            <div class=\"form-actions form-inline\">\r\n");
      out.write("                <fieldset>\r\n");
      out.write("                    <legend>UAH</legend>\r\n");
      out.write("                    Account status: active<br>\r\n");
      out.write("                    Account balance: 1337.00<br>\r\n");
      out.write("                    <br>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"control-group\">\r\n");
      out.write("                        <div class=\"controls form-inline\">\r\n");
      out.write("                            <button id=\"singlebutton1\" name=\"singlebutton1\" class=\"btn btn-inverse\">Open account</button>\r\n");
      out.write("                            <button id=\"singlebutton2\" name=\"singlebutton2\" class=\"btn btn-inverse disabled\">Close\r\n");
      out.write("                                account\r\n");
      out.write("                            </button>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </fieldset>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("       ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <legend>Operations</legend>\r\n");
      out.write("    <div class=\"control-group\">\r\n");
      out.write("\r\n");
      out.write("        <label class=\"control-label\">Choose currency:</label>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"control-group form-horizontal\">\r\n");
      out.write("            <label class=\"radio\" for=\"radios-0\">\r\n");
      out.write("                <input type=\"radio\" name=\"radios\" id=\"radios-0\" value=\"Option one\" checked=\"checked\">\r\n");
      out.write("                UAH\r\n");
      out.write("            </label>\r\n");
      out.write("            <label class=\"radio\" for=\"radios-1\">\r\n");
      out.write("                <input type=\"radio\" name=\"radios\" id=\"radios-1\" value=\"Option two\">\r\n");
      out.write("                USD\r\n");
      out.write("            </label>\r\n");
      out.write("            <label class=\"radio\" for=\"radios-1\">\r\n");
      out.write("                <input type=\"radio\" name=\"radios\" id=\"radios-1\" value=\"Option two\">\r\n");
      out.write("                RUB\r\n");
      out.write("            </label>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"control-group\">\r\n");
      out.write("            <label class=\"control-label\" for=\"textinput\">Amount:</label>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"controls form-horizontal\">\r\n");
      out.write("                <input type=\"text\" class=\"input\" placeholder=\"0.00\" id=\"inputKey\">\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <div class=\"control-group\">\r\n");
      out.write("            <div class=\"control-group\">\r\n");
      out.write("                <label class=\"control-label\" for=\"textinput\">Recipient:</label>\r\n");
      out.write("                <input type=\"text\" class=\"input\" placeholder=\"Leave blank if recepient is you\" id=\"inputKey\">\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"control-group\">\r\n");
      out.write("\r\n");
      out.write("                <button id=\"singlebutton\" name=\"singlebutton\" class=\"btn btn-inverse\">Send money</button>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <div id=\"theme_switcher\">\r\n");
      out.write("        <style>\r\n");
      out.write("            .container {\r\n");
      out.write("                width: 970px\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            #theme_switcher {\r\n");
      out.write("                left: 10px;\r\n");
      out.write("                position: fixed;\r\n");
      out.write("                top: 10px;\r\n");
      out.write("            }\r\n");
      out.write("        </style>\r\n");
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script src=\"http://code.jquery.com/jquery.min.js\"></script>\r\n");
      out.write("<script src=\"bootstrap/js/bootstrap.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("    var buttonToSwitch1 = $('#singlebutton1')\r\n");
      out.write("    var buttonToSwitch2 = $('#singlebutton2')\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    $(document).ready(function () {\r\n");
      out.write("        $('.btn-inverse').click(\r\n");
      out.write("                function () {\r\n");
      out.write("                    switch (true) {\r\n");
      out.write("                        case(buttonToSwitch1.hasClass('disabled')):\r\n");
      out.write("                            buttonToSwitch1.removeClass('disabled');\r\n");
      out.write("                            buttonToSwitch2.addClass('disabled');\r\n");
      out.write("                            $.ajax({\r\n");
      out.write("                                url: \"/added\",\r\n");
      out.write("                                data: \"data\",\r\n");
      out.write("                                success: function() {\r\n");
      out.write("                                  window.location.replace(\"/added.jsp\")\r\n");
      out.write("                                }\r\n");
      out.write("                            })\r\n");
      out.write("                            break;\r\n");
      out.write("                        case(buttonToSwitch2.hasClass('disabled')):\r\n");
      out.write("                            buttonToSwitch2.removeClass('disabled');\r\n");
      out.write("                            buttonToSwitch1.addClass('disabled');\r\n");
      out.write("                    }\r\n");
      out.write("//            $(this).addClass('disabled');\r\n");
      out.write("//            $('#singlebutton2').removeClass('disabled');\r\n");
      out.write("                });\r\n");
      out.write("    });\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
