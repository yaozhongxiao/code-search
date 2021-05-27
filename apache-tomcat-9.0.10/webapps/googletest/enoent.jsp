<%--
CDDL HEADER START

The contents of this file are subject to the terms of the
Common Development and Distribution License (the "License").
You may not use this file except in compliance with the License.

See LICENSE.txt included in this distribution for the specific
language governing permissions and limitations under the License.

When distributing Covered Code, include this CDDL HEADER in each
file and include the License file at LICENSE.txt.
If applicable, add the following below this CDDL HEADER, with the
fields enclosed by brackets "[]" replaced with your own identifying
information: Portions Copyright [yyyy] [name of copyright owner]

CDDL HEADER END

Copyright (c) 2005, 2017, Oracle and/or its affiliates. All rights reserved.
Portions Copyright 2011 Jens Elkner.

--%><%@page session="false" isErrorPage="true" import="
org.opensolaris.opengrok.web.Prefix,
org.opensolaris.opengrok.configuration.RuntimeEnvironment"
 %><%
/* ---------------------- enoent.jsp start --------------------- */
{
    PageConfig cfg = PageConfig.get(request);
    cfg.setTitle("File not found");

    String context = request.getContextPath();
    cfg.getEnv().setUrlPrefix(context + Prefix.SEARCH_R + "?");
}
%><%@

include file="httpheader.jspf"

%><body>
<div id="page">
    <div id="whole_header">
        <div id="header"><%@

include file="pageheader.jspf"

        %></div>
        <div id="Masthead"></div>
        <div id="sbar"><%@

include file="menu.jspf"

        %></div>
    </div>
<%
{
    PageConfig cfg = PageConfig.get(request);
    String configError = "";
    if (cfg.getSourceRootPath().isEmpty()) {
        configError = "CONFIGURATION parameter has not been configured in "
            + "web.xml! Please configure your webapp.";
    } else if (!cfg.getEnv().getSourceRootFile().isDirectory()) {
        configError = "The source root specified in your configuration does "
            + "not point to a valid directory! Please configure your webapp.";
    } else if (!cfg.hasHistory()) {
        configError = "Resource lacks history info. Was remote SCM side up when indexing occurred? "
            + "Cleanup history cache dir(or just the .gz for the file or db record) and rerun indexer making sure remote side will respond during indexing.";
   }
%>
    <h3 class="error">Error: File not found!</h3>
    <p>The requested resource is not available. </p>
    <p> <%= configError %> </p>
<%
}
/* ---------------------- enoent.jsp end --------------------- */
%><%@

include file="foot.jspf"

%>