/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.54
 * Generated at: 2014-08-14 09:38:59 UTC
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
      out.write("\r\n");
      out.write("    <link href=\"bootstrap/css/bootstrap-responsive.css\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"css/docs.css\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"js/google-code-prettify/prettify.css\" rel=\"stylesheet\">\r\n");
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
      out.write("<body>\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("\r\n");
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
      out.write("                        <li><a href=\"https://github.com/JavaNinjas/BankProject\" target=\"_blank\">GitHub</a></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div>\r\n");
      out.write("                <!-- /.nav-collapse -->\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- /navbar-inner -->\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"row-fluid\">\r\n");
      out.write("        <div class=\"span7\">\r\n");
      out.write("\r\n");
      out.write("            <div id=\"myCarousel\" class=\"carousel slide\">\r\n");
      out.write("                <!-- Carousel items -->\r\n");
      out.write("                <div class=\"carousel-inner\">\r\n");
      out.write("                    <div class=\"active item\"><img src=\"pictures/vanGogh1.jpg\" style=\"width:100%\"/>\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"carousel-caption\">\r\n");
      out.write("                            <h4>Hibernate</h4>\r\n");
      out.write("\r\n");
      out.write("                            <p>This project uses Hibernate + Heroku Postresql.</p>\r\n");
      out.write("\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"item\"><img src=\"pictures/vanGogh2.jpg\" style=\"width:100%\"/>\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"carousel-caption\">\r\n");
      out.write("                            <h4>MVC</h4>\r\n");
      out.write("\r\n");
      out.write("                            <p>MVC architecture is implemented.</p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"item\"><img src=\"pictures/vanGogh3.jpg\" style=\"width:100%\"/>\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"carousel-caption\">\r\n");
      out.write("                            <h4>Feel free to test it</h4>\r\n");
      out.write("\r\n");
      out.write("                            <p>Add clients, delete them or transfer money.</p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <!-- Carousel nav -->\r\n");
      out.write("                <a class=\"carousel-control left\" href=\"#myCarousel\" data-slide=\"prev\">&lsaquo;</a>\r\n");
      out.write("                <a class=\"carousel-control right\" href=\"#myCarousel\" data-slide=\"next\">&rsaquo;</a>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"span5\">\r\n");
      out.write("            <img src=\"pictures/stock1.jpg\"/><br/><br/>\r\n");
      out.write("\r\n");
      out.write("            <form name=\"input\" action=\"/index\" method=\"get\" class=\"well\">\r\n");
      out.write("                <h3>Welcome to our bank</h3>\r\n");
      out.write("\r\n");
      out.write("                <p style=\"text-align:justify\">\r\n");
      out.write("                    Provide your credentials to enter service. In case client is not found your profile will be created automatically.\r\n");
      out.write("                </p>\r\n");
      out.write("\r\n");
      out.write("                <input type=\"email\" name=\"email\" placeholder=\"Email\">\r\n");
      out.write("                <input type=\"password\" name=\"password\" placeholder=\"Password\"><br>\r\n");
      out.write("                <button class=\"btn btn-inverse\" type=\"submit\">Sign in</button>\r\n");
      out.write("                <a href=\"/create.jsp\" class=\"btn btn-inverse\">Register</a>\r\n");
      out.write("            </form>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"row-fluid\">\r\n");
      out.write("        <div class=\"span4\">\r\n");
      out.write("\r\n");
      out.write("            <center>\r\n");
      out.write("                <a data-toggle=\"modal\" href=\"#myModal\"><img src=\"pictures/stock2.jpg\"/></a>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"modal hide\" id=\"myModal\">\r\n");
      out.write("                    <div class=\"modal-header\">\r\n");
      out.write("                        <button type=\"button\" class=\"close\" data-dismiss=\"modal\">×</button>\r\n");
      out.write("                        <h3>Modal header</h3>\r\n");
      out.write("                        <img src=\"http://placehold.it/600x300\" style=\"width:600px; height:300px\"/>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <br/><br/>\r\n");
      out.write("\r\n");
      out.write("                <a class=\"btn\" style=\"width:285px;\" href=\"#\">Lorem Ipsum is simply dummy<br/> text of the printing</a>\r\n");
      out.write("            </center>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"span4\">\r\n");
      out.write("            <center>\r\n");
      out.write("                <a data-toggle=\"modal\" href=\"#myModal1\"><img src=\"pictures/stock2.jpg\"/></a>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"modal hide\" id=\"myModal1\">\r\n");
      out.write("                    <div class=\"modal-header\">\r\n");
      out.write("                        <button type=\"button\" class=\"close\" data-dismiss=\"modal\">×</button>\r\n");
      out.write("                        <h3>Modal header</h3>\r\n");
      out.write("                        <img src=\"http://placehold.it/600x300\" style=\"width:600px; height:300px\"/>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <br/><br/>\r\n");
      out.write("\r\n");
      out.write("                <a class=\"btn\" style=\"width:285px;\" href=\"#\">Lorem Ipsum is simply dummy<br/> text of the printing</a>\r\n");
      out.write("            </center>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"span4\">\r\n");
      out.write("            <center>\r\n");
      out.write("                <a data-toggle=\"modal\" href=\"#myModal2\"><img src=\"pictures/stock2.jpg\"/></a>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"modal hide\" id=\"myModal2\">\r\n");
      out.write("                    <div class=\"modal-header\">\r\n");
      out.write("                        <button type=\"button\" class=\"close\" data-dismiss=\"modal\">×</button>\r\n");
      out.write("                        <h3>Modal header</h3>\r\n");
      out.write("                        <img src=\"http://placehold.it/600x300\" style=\"width:600px; height:300px\"/>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <br/><br/>\r\n");
      out.write("\r\n");
      out.write("                <a class=\"btn\" style=\"width:285px;\" href=\"#\">Lorem Ipsum is simply dummy<br/> text of the printing</a>\r\n");
      out.write("            </center>\r\n");
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
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("    $(function() {\r\n");
      out.write("        $('#theme_switcher ul li a').bind('click',\r\n");
      out.write("                function(e) {\r\n");
      out.write("                    $(\"#switch_style\").attr(\"href\", \"css/\"+$(this).attr('rel')+\"/bootstrap.min.css\");\r\n");
      out.write("                    return false;\r\n");
      out.write("                }\r\n");
      out.write("        );\r\n");
      out.write("    });\r\n");
      out.write("</script>\r\n");
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
