/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2017-12-22 08:30:49 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp.medicalResource;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class medicalResource_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/WEB-INF/jsp/medicalResource/../common.jsp", Long.valueOf(1513930635026L));
  }

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
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width,initial-scale=1,user-scalable=0\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://res.wx.qq.com/open/libs/weui/1.1.2/weui.min.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"../css/common.css\">\r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("    <script type=\"text/javascript\" src=\"https://res.wx.qq.com/open/libs/weuijs/1.1.3/weui.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("    <script type=\"text/javascript\" src=\"//api.map.baidu.com/api?v=2.0&ak=rpkCZLxtUq5tKU7cYIV3nxllcWFNpPgO\"></script>\r\n");
      out.write("\r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("    <script src=\"../js/common/vue.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("    <script src=\"../js/common/jquery-3.2.1.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("    <script src=\"http://res.wx.qq.com/open/js/jweixin-1.2.0.js\"></script>\r\n");
      out.write("    <script src=\"../js/common/wxService.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    <script src=\"../js/common/page.js\"></script>\r\n");
      out.write("    <script src=\"../js/common/locationService.js\"></script>\r\n");
      out.write("    <script src=\"../js/common/util.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    <script>\r\n");
      out.write("        // TODO:环境切换逻辑\r\n");
      out.write("        (function () {\r\n");
      out.write("            var build = 0 // 0测试  1生产\r\n");
      out.write("            var prdConfig = {\r\n");
      out.write("                getCategorys: 'http://172.31.65.92:8080/dcmsfront/cms/getCategorys',\r\n");
      out.write("                getArticleList: 'http://172.31.65.92:8080/dcmsfront/cms/getArticleList',\r\n");
      out.write("                getArticleData: 'http://172.31.65.92:8080/dcmsfront/cms/getArticleData',\r\n");
      out.write("                getMedicalResource: 'http://172.31.65.92:8080/dcmsfront/medicalResource/getAll'\r\n");
      out.write("            }\r\n");
      out.write("            var devConfig = {}\r\n");
      out.write("            var arr = [prdConfig, devConfig]\r\n");
      out.write("            window.httpConfig = arr[build]\r\n");
      out.write("        }())\r\n");
      out.write("    </script>\r\n");
      out.write("\r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("    <script src=\"../js/common/httpService.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <title>诊疗资源</title>\r\n");
      out.write("    <style>\r\n");
      out.write("        .medical-resource .weui-navbar {\r\n");
      out.write("            position: static;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .medical-resource .weui-panel__bd {\r\n");
      out.write("            background: #ffffff;\r\n");
      out.write("        }\r\n");
      out.write("    </style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"dc-page medical-resource\">\r\n");
      out.write("    <div class=\"weui-navbar\">\r\n");
      out.write("        <div class=\"weui-navbar__item\"\r\n");
      out.write("             :class=\"{'weui-bar__item_on':currentIndex==1}\"\r\n");
      out.write("             @click=\"select(1)\"\r\n");
      out.write("        >\r\n");
      out.write("            诊疗服务\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"weui-navbar__item \"\r\n");
      out.write("             :class=\"{'weui-bar__item_on':currentIndex==2}\"\r\n");
      out.write("             @click=\"select(2)\">\r\n");
      out.write("            诊疗物资\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"main\">\r\n");
      out.write("        <div class=\"service\" v-show=\"currentIndex==1\">\r\n");
      out.write("            <div v-for=\"item in allService\" class=\"wrap\">\r\n");
      out.write("                <div class=\"weui-cells__title\">{{item.category}}</div>\r\n");
      out.write("                <div class=\"weui-cells\">\r\n");
      out.write("                    <div class=\"weui-cell\" v-for=\"list in item.list\">\r\n");
      out.write("                        <div class=\"weui-cell__bd\">\r\n");
      out.write("                            <p>{{list.name}}</p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        ");
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"material\" v-show=\"currentIndex==2\">\r\n");
      out.write("            <div v-for=\"item in allMaterial\" class=\"wrap\">\r\n");
      out.write("                <div class=\"weui-cells__title\">{{item.category}}</div>\r\n");
      out.write("                <div class=\"weui-cells\">\r\n");
      out.write("                    <div class=\"weui-cell\" v-for=\"list in item.list\">\r\n");
      out.write("                        <div class=\"weui-cell__bd\">\r\n");
      out.write("                            <p>{{list.name}}</p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        ");
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("<script>\r\n");
      out.write("    (function () {\r\n");
      out.write("        var page = new Vue({\r\n");
      out.write("            el: '.medical-resource',\r\n");
      out.write("            data: function () {\r\n");
      out.write("                return {\r\n");
      out.write("                    searchStr: '',\r\n");
      out.write("                    currentIndex: 1,\r\n");
      out.write("                    allMaterial: [],\r\n");
      out.write("                    allService: []\r\n");
      out.write("                }\r\n");
      out.write("            },\r\n");
      out.write("            created: function () {\r\n");
      out.write("                var _this = this\r\n");
      out.write("                httpService.getMedicalResource().then(function (data) {\r\n");
      out.write("                    _this.allMaterial = data.data.allMaterial\r\n");
      out.write("                    _this.allService = data.data.allService\r\n");
      out.write("                    console.log(data)\r\n");
      out.write("                })\r\n");
      out.write("            },\r\n");
      out.write("            mounted: function () {\r\n");
      out.write("            },\r\n");
      out.write("            methods: {\r\n");
      out.write("                select: function (index) {\r\n");
      out.write("                    this.currentIndex = index\r\n");
      out.write("                }\r\n");
      out.write("            }\r\n");
      out.write("        })\r\n");
      out.write("    }());\r\n");
      out.write("</script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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
