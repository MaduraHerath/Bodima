 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
 <%@page pageEncoding="UTF-8" %>    <meta charset="utf-8">

 <section id="intro">
    <div class="intro-content">

        <div class="row main-content">
          <div class="col-md-6 col-sm-12" style="padding-right: 0px;padding-left: 0px;" >
          <a href="#about" class="btn-get-started scrollto " id="getstart" style="margin-bottom: 18px !important"><i class="material-icons wow rubberBand" style="font-size: 60px;">search</i></a>
          <h4 class="white wow fadeIn" style="color:#FAFAFA">Search</h4>
          </div>
          <div class="col-md-6 col-sm-12" style="padding-right: 0px;padding-left: 0px;" >
          <a href="#portfolio" class="btn-projects scrollto" id="add"style="margin-bottom: 18px !important"><i class="material-icons wow rubberBand"  style="font-size: 60px;">add</i></a>
           <h4 class="white wow fadeIn" style="color:#FAFAFA">Add</h4>
          </div>
      </div>
         <div class="videoContainer">
           <div class="overlay"></div>
           <video autoplay loop muted>
               <source src="<c:url value="/resources/vid/main.mp4" />"type="video/mp4">
                   <source src="<c:url value="/resources/vid/main.mp4" />" type="video/webm">
           </video>
       </div>
    </div>
  </section>