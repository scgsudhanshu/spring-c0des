<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<!-- Modal for Add User -->

     <div id="SignUpModal" class="modal fade" role="dialog">
    <div class="modal-dialog modal-lg" role="content">
        <!-- Modal content-->
        <div class="modal-content">
            <div class="modal-header">
                <h4 class="modal-title">Sign Up</h4>
                <button type="button" class="close" data-dismiss="modal">&times;</button>
            </div>
            <div class="modal-body">
                <form action="SignUpUser" method="post">
                    

                    <div class="form-group col-sm-8">
                        <label  for="user_img">Your Image</label>
                        <input type="file" class="form-control form-control-sm mr-1" id="user_img" name = "user_img" >
                        
                        
                    </div>

                        <div class="form-group col-sm-8">
                                <label  for="name">Name</label>
                                <input type="text" class="form-control form-control-sm mr-1" id="name" name = "name" placeholder="Enter Your Name" required>
                        </div>

                        <div class="form-group col-sm-8">
                            <label  for="mobiles">Mobile No.</label>
                            <input type="text" class="form-control form-control-sm mr-1" id="mobile" name = "mobiles" placeholder="Enter Your Mobile No." required>
                        </div>

                        <div class="form-group col-sm-8">
                            <label  for="mobiles2">Alternate Mobile No.</label>
                            <input type="text" class="form-control form-control-sm mr-1" id="mobile2" name = "mobiles" placeholder="Enter Your Mobile No." required>
                        </div>

                        <div class="form-group col-sm-8">
                        <label  for="email">Email Id</label>
                        <input type="email" class="form-control form-control-sm mr-1" id="email" name = "email" placeholder="Enter Your Email Address" required>
                        </div>

                        <div class="form-group col-sm-8">
                            <label  for="rAddress">Residential Address</label>
                            <input type="text" class="form-control form-control-sm mr-1" id="raddress" name = "rAddress" placeholder="Enter Your Residential Address" required>
                            </div>

                            <!-- <div class="input-group col-sm-8">
                                <div class="input-group-prepend"> -->
                                  <!--<div class="input-group-text"> -->
                                    <!-- <input type="checkbox" class="form-control form-control-sm mr-1 " id="psamer" name = "psamer">
                                     -->
                                  <!--</div> -->
                                <!-- </div>
                                <label  for="psamer" class="inline-block mr-1"> Is Permanent Address Same as Residential Address</label>
                              </div> -->

                            <!-- <div class="form-group col-sm-8">
                                <input type="checkbox" class="form-control form-control-sm mr-1 " id="rsamep" name = "rsamep">
                                <label  for="rsamep" class="inline-block">Is Permanent Address Same as Residential Address</label>
                                </div> -->

                            <!-- <div class="form-group col-sm-8">
                                <label  for="pAddress">Permanent Address</label>
                                <input type="text" class="form-control form-control-sm mr-1" id="pAddress" name = "pAddress" placeholder="Enter Your Permanent Address" required>
                                </div> -->

                                <!-- <div class="input-group col-sm-8">
                                    <div class="input-group-prepend">
                                      <div class="input-group-text"> 
                                        <input type="checkbox" class="form-control form-control-sm mr-1 " id="passportchk" name = "passportchk"
                                        data-toggle="collapse" data-target="#passportdiv">
                                      </div> 
                                    </div>
                                    <label  for="passportch" class="inline-block mr-1"> Do you have Passport</label>
                                  </div> -->


                                <!-- <div class="form-group col-sm-8">
                                    <input type="checkbox" class="form-control form-control-sm mr-1" id="passportch" name = "passportch">
                                    <label  for="passportch">Do you have Passport</label>
                                    
                                    </div> -->

                                    <div class="form-group col-sm-8" id = "passportdiv">
                                        <label  for="passport">Passport No.</label>
                                        <input type="text" class="form-control form-control-sm mr-1" id="passport" name = "passport" placeholder="Enter Your Passport No.">
                                        </div>
                                    
                                        <div class="form-group col-sm-8">
                                            <label  for="aadhar">Aadhar No.</label>
                                            <input type="text" class="form-control form-control-sm mr-1" id="aadharNo" name = "aadharNo" placeholder="Enter Your Aadhar No.">
                                            </div>
                                    
                        <div class="form-group col-sm-8">
                            <label  for="password">Password</label>
                            <input type="password" class="form-control form-control-sm mr-1" id="password"  name =  "password" placeholder="Password" required>
                        </div>
                        
                       
                       
                       
                    
                    <div class="form-row">
                        <button type="button" class="btn btn-secondary btn-sm ml-auto" data-dismiss="modal">Cancel</button>
                        <button type="submit" class="btn btn-primary btn-sm ml-1">Sign Up</button>        
                    </div>
                </form>
            </div>
        </div>
    </div>
</div>

<script>
    function passchk()
    {
        console.log("Passport is checked : ");
        var x= document.getElementById("passportdiv")
        .style.display="block";
        console.log("Hidden >>>>>>");
    }
</script>

</body>
</html>