<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@page pageEncoding="UTF-8" %>
<meta charset="utf-8">


<!--==========================
Footer
============================-->
<footer id="footer">
    <div class="container">
        <div class="copyright">
            &copy; Copyright <strong>Bodima</strong>. All Rights Reserved
        </div>
        <div class="credits">
            <!--
              All the links in the footer should remain intact.
              You can delete the links only if you purchased the pro version.
              Licensing information: https://bootstrapmade.com/license/
              Purchase the pro version with working PHP/AJAX contact form: https://bootstrapmade.com/buy/?theme=Reveal
            -->
            <a href="https://bodima.tk/">Online Bodima Site</a> by Madura Herath
        </div>
    </div>
</footer>
<!-- #footer -->

<a href="#" class="back-to-top"><i class="fa fa-chevron-up"></i></a>

<!-- JavaScript Libraries -->
<script src="<c:url value="/resources/lib/jquery/jquery.min.js" />"></script>
<script src="<c:url value="/resources/lib/jquery/jquery-migrate.min.js"/>"></script>
<script src="<c:url value="/resources/lib/bootstrap/js/bootstrap.bundle.min.js"/>"></script>
<script src="<c:url value="/resources/lib/easing/easing.min.js"/>"></script>
<script src="<c:url value="/resources/lib/superfish/hoverIntent.js"/>"></script>
<script src="<c:url value="/resources/lib/superfish/superfish.min.js"/>"></script>
<script src="<c:url value="/resources/lib/wow/wow.min.js"/>"></script>
<script src="<c:url value="/resources/lib/owlcarousel/owl.carousel.min.js"/>"></script>
<script src="<c:url value="/resources/lib/magnific-popup/magnific-popup.min.js"/>"></script>
<script src="<c:url value="/resources/lib/sticky/sticky.js"/>"></script>
<!-- Contact Form JavaScript File -->
<script src="<c:url value="/resources/contactform/contactform.js" />"></script>


<!-- Template Main Javascript File -->
<script src="<c:url value="/resources/js/main.js" />"></script>
<script src="<c:url value="/resources/js/index.js" />"></script>

<!-- Map scripts - add the below to your page -->
<!-- jsmaps-panzoom.js is optional if you are using enablePanZoom -->
<link href="<c:url value="/resources/jsmaps/jsmaps.css"/>" rel="stylesheet" type="text/css"/>
<script src="<c:url value="/resources/jsmaps/jsmaps-libs.js"/>" type="text/javascript"></script>
<script src="<c:url value="/resources/jsmaps/jsmaps-panzoom.js" />"></script>
<script src="<c:url value="/resources/jsmaps/jsmaps.js" />" type="text/javascript"></script>
<script src="<c:url value="/resources/maps/sriLanka.js"/>" type="text/javascript"></script>
<!-- End Map scripts -->

<!-- OverHang JS File -->
<script src="<c:url value="/resources/overhang/overhang.min.js"/>" type="text/javascript"></script>

<script type="text/javascript">

    $(function () {

        $('#sriLanka-map').JSMaps({
            map: 'sriLanka',
            onStateClick: function (data) {
                $.ajax({
                    url: '/bodima/bodimList',
                    type: 'GET',
                    async:false,
                    data: jQuery.param({search:data.name}),
                    contentType: "application/json",
                    success: function (response) {

                    },
                    error: function () {

                    }
                });
            },

        });

    });

</script>