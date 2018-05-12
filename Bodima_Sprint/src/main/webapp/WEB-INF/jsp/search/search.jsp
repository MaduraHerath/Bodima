<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@page pageEncoding="UTF-8" %>
<meta charset="utf-8">

<!--==========================
Search Section
============================-->
<section id="about" class="wow fadeInUp">
    <div class="container">
        <div class="row">
            <div class="col-lg-6 pull-right" style="position: relative; height: 500px;">
                <jsp:include page="../map/map.jsp"/>
            </div>

            <div class="col-lg-6 content">
                <h2>Search Your Next Home</h2>

                <form class="box" style="padding-top:28px;">
                    <div class="form-row">
                        <div class="form-group col-md-6">
                            <div class="form-group">
                                <label for="pricerange">Price list:</label>
                                <select class="form-control" id="pricerange">
                                    <option value=3500>3,500 Rs ></option>
                                    <option value=5000>less than Rs-5000 Rs</option>
                                    <option value=10000>less than Rs-10,000 Rs</option>
                                    <option value=20000>10,000 Rs-20,000 Rs</option>
                                    <option value=30000>20,000 Rs-30,000 Rs</option>
                                    <option value=435454>30,000 Rs-50,000 Rs</option>

                                </select>
                            </div>
                        </div>
                        <div class="form-group col-md-6">
                            <div class="middle">
                                <div class="row">
                                    <div class="col center">
                                        <label>
                                            <input type="radio" name="gender" value="Male" checked/>
                                            <div class="front-end box">
                                                <span>Male</span>
                                            </div>
                                        </label>
                                    </div>
                                    <div class="col center">
                                        <label>
                                            <input type="radio" name="gender" value="Female"/>
                                            <div class="back-end box">
                                                <span>Female</span>
                                            </div>
                                        </label>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="form-row">
                        <div class="form-group col-md-4">
                            <div class="form-group">
                                <label for="noRooms">Rooms:</label>
                                <select class="form-control" id="noRooms">
                                    <option value=1>1</option>
                                    <option value=2>2</option>
                                    <option value=3>3</option>
                                    <option value=4>4</option>
                                    <option value=5>5</option>
                                    <option value=6>more</option>
                                </select>
                            </div>
                        </div>
                        <div class="form-group col-md-4">
                            <div class="form-group">
                                <label for="personPerRoom">Persons Per Rooms:</label>
                                <select class="form-control" id="personPerRoom">
                                    <option value=1>1</option>
                                    <option value=2>2</option>
                                    <option value=3>3</option>
                                    <option value=4>4</option>
                                    <option value=5>5</option>
                                    <option value=6>more</option>
                                </select>
                            </div>
                        </div>
                        <div class="form-group col-md-4">
                            <label for="pwd">Persons per Room</label>
                            <input type="text" class="form-control" id="pwd">
                        </div>
                    </div>
                    <a class="btn btn-default text-center col-xs-12 col-md-6 box"
                       style="background-color:#50d8af;color:white" onclick="searchBodima()">Search</a>

                </form>
                <!--<ul>
                <li><i class="ion-android-checkmark-circle"></i> Ullamco laboris nisi ut aliquip ex ea commodo consequat.</li>
                <li><i class="ion-android-checkmark-circle"></i> Duis aute irure dolor in reprehenderit in voluptate velit.</li>
                <li><i class="ion-android-checkmark-circle"></i> Ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate trideta storacalaperda mastiro dolore eu fugiat nulla pariatur.</li>
                </ul>-->

            </div>

        </div>

    </div>
</section>
<!-- #about -->