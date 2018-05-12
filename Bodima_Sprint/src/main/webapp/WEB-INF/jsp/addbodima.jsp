<%@page pageEncoding="UTF-8" %>

<section id="addbodima" class="wow fadeInUp">
    <div class="container">
        <div class="section-header">
            <h2>Add Bodima</h2>
            <div class="container" style="padding-top:28px">
                <div class="form">

                    <div id="errormessage"></div>
                    <form action="" method="post" role="form" class="contactForm">
                        <div class="form-row">
                            <div class="form-group col-md-6">
                                <input type="text" name="ownerName" class="form-control" id="ownerName"
                                       placeholder="Owner Name" data-rule="minlen:4"
                                       data-msg="Please enter at least 4 chars"/>
                                <div class="validation"></div>
                            </div>
                            <div class="form-group col-md-6">

                                <select class="form-control" id="addLocation">
                                    <option value="Colombo">Colombo</option>
                                    <option value="Kandy">Kandy</option>
                                    <option value="Gampaha">Gampaha</option>
                                    <option value="Matale">Matale</option>
                                    <option value="Ampara">Ampara</option>
                                    <option value="Batticaloa">Batticaloa</option>
                                    <option value="Mannar">Mannar</option>
                                    <option value="Batticaloa">Batticaloa</option>
                                    <option value="Jaffna">Jaffna</option>
                                    <option value="Kilinochchi">Kilinochchi</option>
                                    <option value="Nuvara Eliya">Nuvara Eliya</option>
                                    <option value="Polonnaruwa">Polonnaruwa</option>
                                    <option value="Trincomalee">Trincomalee</option>
                                    <option value="Anuradhapura">Anuradhapura</option>
                                    <option value="Vavuniya">Vavuniya</option>
                                    <option value="Mulativu">Mulativu</option>
                                    <option value="Kurunegala">Kurunegala</option>
                                    <option value="Puttalam">Puttalam</option>
                                    <option value="Ratnapura">Ratnapura</option>
                                    <option value="Galle">Galle</option>
                                    <option value="Hambantota">Hambantota</option>
                                    <option value="Matara">Matara</option>
                                    <option value="Badulla">Badulla</option>
                                    <option value="Monaragala">Monaragala</option>
                                    <option value="Kegalla">Kegalla</option>
                                    <option value="Kalutara">Kalutara</option>
                                </select>

                                <div class="validation"></div>
                            </div>
                        </div>
                        <div class="form-row">
                            <div class="form-group col-md-3">
                                <input type="text" class="form-control" name="addPrice" id="addPrice"
                                       placeholder="Price" data-rule="minlen:4"
                                       data-msg="Please enter at least 8 chars of subject"/>
                                <div class="validation"></div>
                            </div>
                            <div class="form-group col-md-3">
                                <input type="text" class="form-control" name="addroomCount" id="addroomCount"
                                       placeholder="No of Rooms" data-rule="minlen:4"
                                       data-msg="Please enter at least 8 chars of subject"/>
                                <div class="validation"></div>
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
                        <div class="form-group">
                            <textarea class="form-control" name="addAddress" id="addAddress" rows="2" data-rule="required"
                                      data-msg="Please write something for us" placeholder="Address"></textarea>
                            <div class="validation"></div>
                        </div>
                        <div class="text-center">
                            <button onclick="addBodima()">Add Bodima</button>
                        </div>
                    </form>
                </div>

            </div>
        </div>

    </div>
</section>
<!-- #testimonials -->
