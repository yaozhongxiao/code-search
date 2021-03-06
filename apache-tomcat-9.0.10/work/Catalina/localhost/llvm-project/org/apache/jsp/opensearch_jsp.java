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
import java.util.Set;
import org.opensolaris.opengrok.web.Util;
import java.net.URLEncoder;
import java.util.TreeSet;
import org.opensolaris.opengrok.web.Prefix;
import org.opensolaris.opengrok.web.PageConfig;
import org.opensolaris.opengrok.configuration.Project;

public final class opensearch_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/projects.jspf", Long.valueOf(1487754254000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.net.URLEncoder");
    _jspx_imports_classes.add("org.opensolaris.opengrok.configuration.Project");
    _jspx_imports_classes.add("java.util.Set");
    _jspx_imports_classes.add("org.opensolaris.opengrok.web.Prefix");
    _jspx_imports_classes.add("org.opensolaris.opengrok.web.Util");
    _jspx_imports_classes.add("java.util.TreeSet");
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


/* ---------------------- projects.jspf start --------------------- */
{
    // Use UTF-8 if no encoding is specified in the request
    if (request.getCharacterEncoding() == null) {
        request.setCharacterEncoding("UTF-8");
    }

    PageConfig cfg = PageConfig.get(request);
    cfg.getEnv().setUrlPrefix(request.getContextPath() + Prefix.SEARCH_R + "?");

    String projects = cfg.getRequestedProjectsAsString();
    if (projects.length() != 0) {
        Cookie cookie = new Cookie(PageConfig.OPEN_GROK_PROJECT, URLEncoder.encode(projects, "utf-8"));
        response.addCookie(cookie);
    }
}
/* ---------------------- projects.jspf end --------------------- */


    /* ---------------------- opensearch.jsp start --------------------- */
{
    PageConfig cfg = PageConfig.get(request);

    // Optimize for URLs up to 128 characters. 
    StringBuilder url = new StringBuilder(128);
    String ForwardedHost = request.getHeader("X-Forwarded-Host");
    String scheme = request.getScheme();
    int port = request.getServerPort();

    url.append(scheme).append("://");

    // Play nice in proxy environment by using hostname from the original
    // request to construct the URLs.
    // Will not work well if the scheme or port is different for proxied server
    // and original server. Unfortunately the X-Forwarded-Host does not seem to
    // contain the port number so there is no way around it.
    if (ForwardedHost != null) {
        url.append(ForwardedHost);
    } else {
        url.append(request.getServerName());

        // Append port if needed.
        if ((port != 80 && scheme.equals("http")) ||
                   (port != 443 && scheme.equals("https"))) {
            url.append(':').append(port);
        }
    }

    String imgurl = url +  cfg.getCssDir() + "/img/icon.png";

    /* TODO  Bug 11749 ??? */
    StringBuilder text = new StringBuilder();
    url.append(request.getContextPath()).append(Prefix.SEARCH_P).append('?');
    Set<String> projects = cfg.getRequestedProjects();
    for (String name : projects) {
        text.append(name).append(',');
        Util.appendQuery(url, "project", name);
    }
    if (text.length() != 0) {
        text.setLength(text.length()-1);
    }

      out.write("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n");
      out.write("<OpenSearchDescription xmlns=\"http://a9.com/-/spec/opensearch/1.1/\">\n");
      out.write("    <ShortName>OpenGrok ");
      out.print( text.toString() );
      out.write("</ShortName>\n");
      out.write("    <Description>Search in OpenGrok ");
      out.print( text.toString() );
      out.write("</Description>\n");
      out.write("    <InputEncoding>UTF-8</InputEncoding>\n");
      out.write("    <Image height=\"16\" width=\"16\" type=\"image/png\">");
      out.print( imgurl );
      out.write("</Image>\n");
      out.write("<Url template=\"");
      out.print( url.toString() );
      out.write("&amp;q={searchTerms}\" type=\"text/html\"/>\n");
      out.write("</OpenSearchDescription>\n");

}
/* ---------------------- opensearch.jsp end --------------------- */

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
