/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2019-06-12 03:02:36 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.L2school;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class LiKe2School_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
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
      response.setContentType("text/html; charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<?xml version=\"1.0\" encoding=\"utf-8\" ?>\r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\" xmlns:f=\"http://java.sun.com/jsf/core\" xmlns:h=\"http://java.sun.com/jsf/html\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("<title>符合条件的理科2本学校</title>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/css/home.css\"/>\r\n");
      out.write("</head>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\tfunction deleteRow(r){\r\n");
      out.write("\t\tvar i = r.parentNode.parentNode.rowIndex;\r\n");
      out.write("\t\tdocument.getElementById('myTable').deleteRow(i);\r\n");
      out.write("\t}\r\n");
      out.write("</script>\r\n");
      out.write("<body>\r\n");
      out.write("\t<h3 align=\"center\">符合条件的理科二本学校</h1>\r\n");
      out.write("\t\r\n");
      out.write("\t<table align=\"center\" border=\"1\" >\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td width=\"3%\">姓名 &nbsp;&nbsp; </td>\r\n");
      out.write("\t\t\t\t<td width=\"3%\">性别 &nbsp;&nbsp;</td>\r\n");
      out.write("\t\t\t\t<td width=\"3%\">科类 &nbsp;&nbsp;</td>\r\n");
      out.write("\t\t\t\t<td width=\"3%\">分数 &nbsp;&nbsp;</td>\r\n");
      out.write("\t\t\t\t<td width=\"3%\">位次 &nbsp;&nbsp;</td>\r\n");
      out.write("\t\t\t\t<td width=\"3%\">批次 &nbsp;&nbsp;</td>\r\n");
      out.write("\t\t\t\t<td width=\"3%\">电话 &nbsp;&nbsp;&nbsp;&nbsp;</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t</table>\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t<table align=\"center\" border=\"1\" style=\"border-spacing:18px\" id=\"myTable\">\r\n");
      out.write("\t\t<tbody align=\"center\">\r\n");
      out.write("\t\t\t  <tr>\r\n");
      out.write("\t\t\t\t\t<td width=\"4%\"><label>招生人数</label></td>\r\n");
      out.write("\t\t\t\t\t<td width=\"4%\"><label>增减变化</label></td>\r\n");
      out.write("\t\t\t\t\t<td width=\"4%\"><label>专业分析</label></td>\r\n");
      out.write("\t\t\t\t\t<td width=\"4%\"><label>院校代码</label></td>\r\n");
      out.write("\t\t\t\t\t<td width=\"14%\"><label>学校名称</label></td>\r\n");
      out.write("\t\t\t\t\t<td width=\"4%\"><label>去年线差</label></td>\r\n");
      out.write("\t\t\t\t\t<td width=\"4%\"><label>前年线差</label></td>\r\n");
      out.write("\t\t\t\t\t<td width=\"4%\"><label>平均线差</label></td>\r\n");
      out.write("\t\t\t\t\t<td width=\"4%\"><label>去年系数</label></td>\r\n");
      out.write("\t\t\t\t\t<td width=\"4%\"><label>前年系数</label></td>\r\n");
      out.write("\t\t\t\t\t<td width=\"4%\"><label>平均系数</label></td>\r\n");
      out.write("\t\t\t\t\t<td width=\"4%\"><label>去年位次</label></td>\r\n");
      out.write("\t\t\t\t\t<td width=\"4%\"><label>前年位次</label></td>\r\n");
      out.write("\t\t\t\t\t<td width=\"4%\"><label>平均位次</label></td>\r\n");
      out.write("\t\t\t\t\t<td width=\"4%\"><label>线差对比</label></td>\r\n");
      out.write("\t\t\t\t\t<td width=\"4%\"><label>系数对比</label></td>\r\n");
      out.write("\t\t\t\t\t<td width=\"4%\"><label>位次对比</label></td>\r\n");
      out.write("\t\t\t\t\t<td width=\"4%\"><label>统计年数</label></td>\r\n");
      out.write("\t\t\t\t\t<td width=\"4%\"><label></label></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t</hr>\r\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t</tbody>\r\n");
      out.write("\t</table>\r\n");
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

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent(null);
    // /L2school/LiKe2School.jsp(58,4) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("p");
    // /L2school/LiKe2School.jsp(58,4) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/L2school/LiKe2School.jsp(58,4) '${LiKe2School}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${LiKe2School}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t  \t\t<tr>\r\n");
          out.write("\t\t\t\t\t     <td><label>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${p.count}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</label></td>\r\n");
          out.write("\t\t\t\t\t     <td><label>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${p.change}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</label></td>\r\n");
          out.write("\t\t\t\t\t     <td><label>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${p.hard}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</label></td>\r\n");
          out.write("\t\t\t\t\t     <td><label>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${p.pid}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</label></td>\r\n");
          out.write("\t\t\t\t\t     <td><label>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${p.name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</label></td>\r\n");
          out.write("\t\t\t\t\t     <td><label>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${p.xiancha1}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</label></td>\r\n");
          out.write("\t\t\t\t\t     <td><label>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${p.xiancha2}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</label></td>\r\n");
          out.write("\t\t\t\t\t  \t <td><label>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${p.averxiancha}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</label></td>\r\n");
          out.write("\t\t\t\t\t     <td><label>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${p.xishu1}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</label></td>\r\n");
          out.write("\t\t\t\t\t     <td><label>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${p.xishu2}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</label></td>\r\n");
          out.write("\t\t\t\t\t     <td><label>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${p.averxishu}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</label></td>\r\n");
          out.write("\t\t\t\t\t     <td><label>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${p.weici1}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</label></td>\r\n");
          out.write("\t\t\t\t\t     <td><label>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${p.weici2}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</label></td>\r\n");
          out.write("\t\t\t\t\t     <td><label>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${p.averweici}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</label></td>\r\n");
          out.write("\t\t\t\t\t     <td><label>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${p.xiancha}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</label></td>\r\n");
          out.write("\t\t\t\t\t     <td><label>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${p.xishu}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</label></td>\r\n");
          out.write("\t\t\t\t\t     <td><label>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${p.weici}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</label></td>\r\n");
          out.write("\t\t\t\t\t     <td><label>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${p.nian}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("年</label></td>\r\n");
          out.write("\t\t\t\t\t     <td><input type=\"submit\" value=\"删除\" onclick=\"deleteRow(this)\"></input></td>\r\n");
          out.write("\t\t\t\t     \t</tr>\r\n");
          out.write("\t\t\t\t     \t</hr>\r\n");
          out.write("\t\t\t  \t");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f0.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
    }
    return false;
  }
}
