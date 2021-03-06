/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.10
 * Generated at: 2020-07-22 08:06:18 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Set;
import org.opensolaris.opengrok.history.DirectoryHistoryReader;
import org.opensolaris.opengrok.history.History;
import org.opensolaris.opengrok.history.HistoryEntry;
import org.opensolaris.opengrok.history.HistoryGuru;
import org.opensolaris.opengrok.web.Util;
import org.opensolaris.opengrok.web.Prefix;
import org.opensolaris.opengrok.web.PageConfig;

public final class rss_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("org.opensolaris.opengrok.history.DirectoryHistoryReader");
    _jspx_imports_classes.add("org.opensolaris.opengrok.history.HistoryEntry");
    _jspx_imports_classes.add("org.opensolaris.opengrok.history.HistoryGuru");
    _jspx_imports_classes.add("java.text.SimpleDateFormat");
    _jspx_imports_classes.add("java.util.Set");
    _jspx_imports_classes.add("org.opensolaris.opengrok.history.History");
    _jspx_imports_classes.add("org.opensolaris.opengrok.web.Prefix");
    _jspx_imports_classes.add("org.opensolaris.opengrok.web.Util");
    _jspx_imports_classes.add("java.io.File");
    _jspx_imports_classes.add("org.opensolaris.opengrok.web.PageConfig");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
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

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			"error.jsp", false, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      out = pageContext.getOut();
      _jspx_out = out;


/* ---------------------- rss.jsp start --------------------- */
{
    PageConfig cfg = PageConfig.get(request);
    String redir = cfg.canProcess();
    if (redir == null || redir.length() > 0) {
        if (redir != null) {
            response.sendRedirect(redir);
        } else {
            response.sendError(HttpServletResponse.SC_NOT_FOUND);
        }
        return;
    }
    cfg.getEnv().setUrlPrefix(request.getContextPath() + Prefix.SEARCH_R + '?');
    String path = cfg.getPath();
    String dtag = cfg.getDefineTagsIndex();
    String ForwardedHost = request.getHeader("X-Forwarded-Host");
    response.setContentType("text/xml");

      out.write("<?xml version=\"1.0\"?>\n");
      out.write("<?xml-stylesheet type=\"text/xsl\" href=\"");
      out.print( request.getContextPath()
    );
      out.write("/rss.xsl.xml\"?>\n");
      out.write("<rss version=\"2.0\" xmlns:dc=\"http://purl.org/dc/elements/1.1/\">\n");
      out.write("<channel>\n");
      out.write("    <title>Changes in ");
      out.print( path.length() == 0
        ? "Cross Reference"
        : Util.htmlize(cfg.getResourceFile().getName()) );
      out.write("</title>\n");
      out.write("    <description>");
      out.print( Util.htmlize(dtag) );
      out.write("</description>\n");
      out.write("    <language>en</language>\n");
      out.write("    <copyright>Copyright 2015</copyright>\n");
      out.write("    <generator>Java</generator>");

    History hist = null;
    String newline = System.getProperty("line.separator");
    if(cfg.isDir()) {
        hist = new DirectoryHistoryReader(cfg.getHistoryDirs()).getHistory();
    } else {
        hist = HistoryGuru.getInstance().getHistory(cfg.getResourceFile());
    }
    if (hist != null) {
        int i = 20;
        for (HistoryEntry entry : hist.getHistoryEntries()) {
            if (i-- <= 0) {
                break;
            }
            if (entry.isActive()) {
    
      out.write("<item>\n");
      out.write("        <title>");

            /*
             * Newlines would result in HTML tags inside the 'title' which
             * causes the title to be displayed as 'null'. Print first line
             * of the message. The whole message will be printed in description.
             */
            String replaced = entry.getMessage().split("\n")[0];
        
      out.print( Util.htmlize(entry.getRevision()) );
      out.write(' ');
      out.write('-');
      out.write(' ');
      out.print( Util.htmlize(replaced) );
      out.write("</title>\n");
      out.write("        <link>");

            // Play nice in proxy environment by using hostname from the original
            // request to construct the URLs.
            // Will not work well if the scheme or port is different for proxied server
            // and original server. Unfortunately the X-Forwarded-Host does not seem to
            // contain the port number so there is no way around it.
            String requestURL = request.getScheme() + "://";
            if (ForwardedHost != null) {
                requestURL += ForwardedHost;
            } else {
                requestURL += request.getServerName();
                String port = Integer.toString(request.getLocalPort());
                if (!port.isEmpty()) {
                    requestURL += ":" + port;
                }
            }
            requestURL += request.getContextPath();
            requestURL += Prefix.HIST_L + cfg.getPath() + "#" + entry.getRevision();
        
      out.print( Util.htmlize(requestURL) );
      out.write("</link>\n");
      out.write("        <description>");

            for (String e : entry.getMessage().split("\n")) {
            
      out.print( Util.htmlize(e) );

            }
            
      out.write("\n");
      out.write("\n");
      out.write("            List of files:\n");
      out.write("            ");

            if (cfg.isDir()) {
                Set<String> files = entry.getFiles();
                if (files != null) {
                    for (String ifile : files) {
            
      out.print( Util.htmlize(ifile) );

                    }
                }
            } else {
            
      out.print( Util.htmlize(path) );

            }
        
      out.write("</description>\n");
      out.write("        <pubDate>");

            SimpleDateFormat df =
                new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss Z");
        
      out.print( Util.htmlize(df.format(entry.getDate())) );
      out.write("</pubDate>\n");
      out.write("        <dc:creator>");
      out.print( Util.htmlize(entry.getAuthor()) );
      out.write("</dc:creator>\n");
      out.write("    </item>\n");

            }
        }
    }

      out.write("</channel>\n");
      out.write("</rss>\n");

}
/* ---------------------- rss.jsp end --------------------- */

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
