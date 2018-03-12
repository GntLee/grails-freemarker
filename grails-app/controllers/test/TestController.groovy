package test

import org.apache.catalina.util.ServerInfo

class TestController {

    def index() {

        // 传值方式一
        //render view: "/test/index", model:[user: "test"]

        // 传值方式二
        request.setAttribute("user","test")

        //获取操作系统名称
        request.setAttribute("os",System.getProperty("os.name"))

        //获取JDK版本
        request.setAttribute("java_version",System.getProperty("java.version"))

        //获取服务器版本
        request.setAttribute("tomcat_version",request.getServletContext().getServerInfo())
        request.setAttribute("tomcat_version",ServerInfo.getServerInfo())
        render view: "/test/index"
    }
}
