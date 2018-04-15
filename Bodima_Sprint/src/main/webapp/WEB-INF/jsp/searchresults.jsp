<%@page contentType="text/html;charset = UTF-8" language="java" %>
<%@ page import ="java.io.*,java.util.*"%>
<%@page isELIgnored="false" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<meta name="theme-color" content="#00E676">
<jsp:include page="header.jsp"/>
<body id="body">
<jsp:include page="topbar.jsp"/>
  <main id="main">
    <section id="services">
      <div class="container">
        <div class="section-header">
          <h2>Filter Options</h2>
          <p></p>
        </div>

        <div class="row">
        <c:forEach items="${bodimList}" var="bodim">

          <div class="col-lg-6">
            <div class="box wow fadeInUp">
            <div class="row">
                <div class="col-md-12">
                <label class="title">Address :</label>
                <i class="add_location"></i>
                <span class="address">${bodim.address}</span>
                </div>
                <div class = "col-md-6">
                      <label class="title">Price :</label>
                        <i class="fa fa-dollar "></i>
                      <span class="address">${bodim.price}</span>
                </div>
                <div class = "col-md-6">
                        <label class="title">Rooms :</label>
                          <i class="fa fa-home"></i>
                      <span class="address">${bodim.roomCount}</span>
                </div>
                <div class = "col-md-12">
                        <label class="title">Owner :</label>
                        <i class="fa fa-user"></i>
                      <span class="address">${bodim.owner}</span>
                </div>
                        <div class = "col-md-12">
                        <label class="title">Contact Number :</label>
                        <i class="fa fa-phone"></i>
                      <span class="address">07723515684</span>
                </div>
            </div>
            <div class="row">
            <div class="col-md-6">
                <button  class="btn btn-default text-center"  href="/bodima/bodims">Add</button>
            </div>
            <div class="col-md-6"></div>
            </div>
            </div>
          </div>

         </c:forEach>

        </div>

      </div>
    </section><!-- #services -->
  </main>
<jsp:include page="footer.jsp"/>
</body>
</html>