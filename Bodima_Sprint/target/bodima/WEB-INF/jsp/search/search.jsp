 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
 <%@page pageEncoding="UTF-8" %>    <meta charset="utf-8">

    <!--==========================
      About Section
    ============================-->
    <section id="about" class="wow fadeInUp">
      <div class="container">
        <div class="row">
          <div class="col-lg-6 about-img">
          <!--<iframe style="width:800px;height:400px;border:none;" src="file:///E:/Projects/BodimaReact/Bodima-web/images/sriLanka/sriLanka/index.html">-->
          </div>

          <div class="col-lg-6 content">
            <h2>Search Your Next Home</h2>
            <h3>This is one of the easiest way to find your next home.</h3>
            <form>
               <div class="form-row">
              <div class="form-group col-md-6">
                <div class="form-group">
                  <label for="sel1">Price list:</label>
                  <select class="form-control" id="sel1">
                    <option>3,500 Rs ></option>
                    <option>3,500 Rs-5000 Rs</option>
                    <option>5000 Rs-10,000 Rs</option>
                    <option>10,000 Rs-20,000 Rs</option>
                    <option>20,000 Rs-30,000 Rs</option>
                    <option>30,000 Rs-50,000 Rs</option>
                    <option>50,000 Rs<</option>

                  </select>
                </div>
              </div>
              <div class="form-group col-md-6">
              <div class="middle">
                <label>
                <input type="radio" name="radio" checked/>
                <div class="front-end box">
                  <span>Male</span>
                </div>
              </label>

                <label>
                <input type="radio" name="radio"/>
                <div class="back-end box">
                  <span>Female</span>
                </div>
              </label>
              </div>
              </div>
              </div>
               <div class="form-row">
              <div class="form-group col-md-4">

                <label for="email">Rooms:</label>
                <input type="text" class="form-control" id="email">
              </div>
              <div class="form-group col-md-4">
                <label for="pwd">Persons per Room</label>
                <input type="text" class="form-control" id="pwd">
              </div>
              <div class="form-group col-md-4">
                <label for="pwd">Persons per Room</label>
                <input type="text" class="form-control" id="pwd">
              </div>
              </div>
              <button type="submit" class="btn btn-default text-center">Submit</button>
            </form>
            <!--<ul>
              <li><i class="ion-android-checkmark-circle"></i> Ullamco laboris nisi ut aliquip ex ea commodo consequat.</li>
              <li><i class="ion-android-checkmark-circle"></i> Duis aute irure dolor in reprehenderit in voluptate velit.</li>
              <li><i class="ion-android-checkmark-circle"></i> Ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate trideta storacalaperda mastiro dolore eu fugiat nulla pariatur.</li>
            </ul>-->

          </div>
        </div>

      </div>
    </section><!-- #about -->