<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>TextMining | File Occurrence</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Pooled Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<!-- Bootstrap Core CSS -->
<link href="css/bootstrap.min.css" rel='stylesheet' type='text/css' />
<!-- Custom CSS -->
<link href="css/style.css" rel='stylesheet' type='text/css' />
<link rel="stylesheet" href="css/morris.css" type="text/css"/>
<!-- Graph CSS -->
<link href="css/font-awesome.css" rel="stylesheet"> 
<!-- jQuery -->
<script src="js/jquery-2.1.4.min.js"></script>
<!-- //jQuery -->
<!-- tables -->
<link rel="stylesheet" type="text/css" href="css/table-style.css" />
<link rel="stylesheet" type="text/css" href="css/basictable.css" />
<script type="text/javascript" src="js/jquery.basictable.min.js"></script>
<script type="text/javascript">
    $(document).ready(function() {
      $('#table').basictable();

      $('#table-breakpoint').basictable({
        breakpoint: 768
      });

      $('#table-swap-axis').basictable({
        swapAxis: true
      });

      $('#table-force-off').basictable({
        forceResponsive: false
      });

      $('#table-no-resize').basictable({
        noResize: true
      });

      $('#table-two-axis').basictable();

      $('#table-max-height').basictable({
        tableWrapper: true
      });
    });
</script>






<!-- //tables -->
<link href='//fonts.googleapis.com/css?family=Roboto:700,500,300,100italic,100,400' rel='stylesheet' type='text/css'/>
<link href='//fonts.googleapis.com/css?family=Montserrat:400,700' rel='stylesheet' type='text/css'>

  
<!-- lined-icons -->
<link rel="stylesheet" href="css/icon-font.min.css" type='text/css' />



<!-- //lined-icons -->
</head> 
<body>
   <div class="page-container">
   <!--/content-inner-->
<div class="left-content">
	   <div class="mother-grid-inner">
            <!--header start here-->
				<div class="header-main">
					<div class="logo-w3-agile">
								<img src="images/thomas1.png" alt="" height=75px>
							</div>
					
						
						<div class="profile_details w3l">		
								<ul>
									<li class="dropdown profile_details_drop">
										<a href="#" class="dropdown-toggle" data-toggle="dropdown" aria-expanded="false">
											<div class="profile_img">	
												<span class="prfil-img"><img src="images/admin.png" alt=""> </span> 
												<div class="user-name">
													<p><c:out value="${UserName.getPassword()}"/></p>
													<span>Administrator</span>
												</div>
												<i class="fa fa-angle-down"></i>
												<i class="fa fa-angle-up"></i>
												<div class="clearfix"></div>	
											</div>	
										</a>
										<ul class="dropdown-menu drp-mnu">
											
											<li> <a href="#">Last Login  : 09 Aug 2017 4:41 PM</a> </li> 
											<li> <a href="login_new.jsp"><i class="fa fa-sign-out"></i> Logout</a> </li>
										</ul>
									</li>
								</ul>
							</div>
							
				     <div class="clearfix"> </div>	
				</div>
<!--header end here-->
<ol class="breadcrumb">
                <li class="breadcrumb-item"><a href="index.jsp">Home</a><i class="fa fa-angle-right" ></i><a href="#" >File Occurrence</a></li>
            </ol>
        
        <!--    <p align="right"><input type="text">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  
          
          <a href="add_new_synonyms.jsp" ><button class="btn-primary btn" ">ADD</button></a>
		<button class="btn-inverse btn" data-toggle="modal" data-target="#myModal" >DELETE</button></p> -->
			
  <!-- Modal Popup Insert-->
  <div class="modal fade" id="myModal" role="dialog">
    <div class="modal-dialog">
    
      <!-- Modal content-->
      <div class="modal-content">
        <div class="modal-header">
          <button type="button" class="close" data-dismiss="modal">&times;</button>
          
           
           <p><img src="images/thomas1.png" alt="" height=75px></p>
        </div>
        <div class="modal-body">
        
       <div class="agile-tables">
					<div class="w3l-table-info">
					 <h2>Text Mining</h2>
					  <form method="POST" action='SynonymsController' name="frmAddUser">	
					    <table>
					    
						<tbody>
				                         
                <tr>
                    <td><h4><font color="red">Enter new word</font> </h4>  </td>
                    <td> :</td>
                    <td><input type="text" name="file_category" value="<c:out value="${user.file_category}" />" / ></td>
                    
                </tr>
            <tr>
                    <td><h4><font color="red">Enter new word</font> </h4>  </td>
                    <td> :</td>
                    <td><input type="text" name="file_category" value="<c:out value="${user.file_category}" />" / ></td>
                    
                </tr>
            </tbody>
            </table>
            <br>
            <div class="row">
			<div class="col-sm-8 col-sm-offset-2">
				<button type="submit" class="btn-primary btn">Submit</button>
				
			</div>
		</div>                    <td><c:out value="${user.id}" /></td>
		
            
            
    </form>
            
            </div>
            </div>
            </div>
        <div class="modal-footer">
          <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
        </div>
      </div>
      
    </div>
  </div>
  
  <!-- Modal insert  close --> 
  
  <!-- Modal Popup update-->
  <div class="modal fade" id="myModalw" role="dialog">
    <div class="modal-dialog">
    
      <!-- Modal content-->
      <div class="modal-content">
        <div class="modal-header">
          <button type="button" class="close" data-dismiss="modal">&times;</button>
          
           
           <p><img src="images/thomas1.png" alt="" height=75px></p>
        </div>
        <div class="modal-body">
        
       <div class="agile-tables">
					<div class="w3l-table-info">
					 <h2>Text Mining</h2>
					  <form method="POST" action='UserController' name="frmAddUser">	
					    <table>
					    
						<tbody>
						
				  <tr>
                    <td><h4><font color="red">User ID :</font> </h4>  </td>
                    <td> :</td>
                    <td><input type="text" name="userid" readonly="readonly" value="<c:out value="${user.id}" />" / ></td>
                    
                </tr>                        
                <tr>
                    <td><h4><font color="red">File Category</font> </h4>  </td>
                    <td> :</td>
                    <td><input type="text" name="file_category" value="<c:out value="${user.file_category}" />" / ></td>
                    
                </tr>
                <tr>
                    <td><h4><font color="red">Topic   </font> </h4>  </td>
                    <td> :</td>
                    <td><input type="text" name="topic" value="<c:out value="${user.topic}" />" /></td>
                    
                </tr>
                <tr>
                    <td><h4><font color="red">Search Key include   </font> </h4>   </td>
                    <td> :</td>
                    <td><input type="text" name="search_key_i" value="<c:out value="${user.search_key_i}" />" /></td>
                    
                </tr>
                <tr>                    <td><c:out value="${user.id}" /></td>
                
                    <td><h4><font color="red">Search Key include   </font> </h4></td>
                    <td> :</td>
                    <td><input type="text" name="search_key_e" value="<c:out value="${user.search_key_e}" />" /></td>
                    
                </tr>
          
            </tbody>
            </table>
            <br>
            <div class="row">
			<div class="col-sm-8 col-sm-offset-2">
				<button type="submit" class="btn-primary btn">Submit</button>
				
			</div>
		</div>
            
            
    </form>
            
            </div>
            </div>
            </div>
        <div class="modal-footer">
          <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
        </div>
      </div>
      
    </div>
  </div>
  
  <!-- Modal update close --> 
  
<div class="agile-grids">	
				<!-- tables -->
				
				<div class="agile-tables">
					<div class="w3l-table-info">
					  <h2>Text Mining File Properties List</h2>
					    <table id="table">
						<thead>
						  <tr>
							<th>Id</th>
							<th>File Name</th>
							<th>File Id</th>
							<th>Topic</th>
							<th>Search Word</th>
							<th>No Of Occurrence Exact</th>
							<th>No Of Occurrence Near</th>
							<th>Start Time</th>
							<th>End Time</th>
							</tr>
						</thead>
						<tbody>
						
						<c:forEach items="${FileOccurrview}" var="user">
                <tr>
                    <td><c:out value="${user.id}" /></td>
                    <td><c:out value="${user.file_name}" /></td>
                    <td><c:out value="${user.file_id}" /></td>
                    <td> <c:out value="${user.topic}" /> </td>
                    <td><c:out value="${user.search_word}" /></td>
                    <td><c:out value="${user.no_of_occurrence_exact}" /></td>
                    <td><c:out value="${user.no_of_occurrence_near}" /></td>
                    <td><c:out value="${user.start_time}" /></td>
                    <td><c:out value="${user.end_time}" /></td>
                   
                    
                </tr>
            </c:forEach>
						
						
						</tbody>
					  </table>
					  	<nav>
						<ul class="pagination pagination-lg">
							<li><a href="#" aria-label="Previous"><span aria-hidden="true">«</span></a></li>
							<li><a href="#">1</a></li>
							<li><a href="#">2</a></li>
							<li><a href="#">3</a></li>
							<li><a href="#">4</a></li>
							<li><a href="#">5</a></li>
							<li><a href="#" aria-label="Next"><span aria-hidden="true">»</span></a></li>
						</ul>
					</nav>
					</div>
				 

				</div>
				<!-- //tables -->
				
			</div>
			
<!-- script-for sticky-nav -->
		<script>
		$(document).ready(function() {
			 var navoffeset=$(".header-main").offset().top;
			 $(window).scroll(function(){
				var scrollpos=$(window).scrollTop(); 
				if(scrollpos >=navoffeset){
					$(".header-main").addClass("fixed");
				}else{
					$(".header-main").removeClass("fixed");
				}
			 });
			 
		});
		</script>
		<!-- /script-for sticky-nav -->
<!--inner block start here-->
<div class="inner-block">

</div>
<!--inner block end here-->
<!--copy rights start here-->
<div class="copyrights">
	 <p>© 2016 Thomas Innovation . All Rights Reserved </p>
</div>	
<!--COPY rights end here-->
</div>
</div>
  <!--//content-inner-->
		<!--/sidebar-menu-->
				<div class="sidebar-menu">
					<header class="logo1">
						<a href="#" class="sidebar-icon"> <span class="fa fa-bars"></span> </a> 
					</header>
						<div style="border-top:1px ridge rgba(255, 255, 255, 0.15)"></div>
                           <div class="menu">
									<ul id="menu" >
										<li><a href="index.jsp"><i class="fa fa-tachometer"></i> <span>Dashboard</span><div class="clearfix"></div></a></li>
										
										
									
									 <li id="menu-academico" ><a href="#"><i class="fa fa-list-ul" aria-hidden="true"></i><span> Manage</span> <span class="fa fa-angle-right" style="float: right"></span><div class="clearfix"></div></a>
										   <ul id="menu-academico-sub" >
										   <li id="menu-academico-avaliacoes" ><a href="UserController?action=listUser">Search Phrases</a></li>
											<li id="menu-academico-avaliacoes" ><a href="NegationControllerNew?action=listUser">Negation</a></li>
											<li id="menu-academico-avaliacoes" ><a href="SynonymsController?action=listUser">Synonyms</a></li>
										  </ul>
										</li>
									
									 <li><a href="tabels.html"><i class="fa fa-table"></i>  <span>File Upload</span><div class="clearfix"></div></a></li>
									
								  </ul>
								</div>
							  </div>
							  <div class="clearfix"></div>		
							</div>
							
							<script>
							var toggle = true;
										
							$(".sidebar-icon").click(function() {                
							  if (toggle)
							  {
								$(".page-container").addClass("sidebar-collapsed").removeClass("sidebar-collapsed-back");
								$("#menu span").css({"position":"absolute"});
							  }
							  else
							  {
								$(".page-container").removeClass("sidebar-collapsed").addClass("sidebar-collapsed-back");
								setTimeout(function() {
								  $("#menu span").css({"position":"relative"});
								}, 400);
							  }
											
											toggle = !toggle;
										});
							</script>
<!--js -->
<script src="js/jquery.nicescroll.js"></script>
<script src="js/scripts.js"></script>
<!-- Bootstrap Core JavaScript -->
   <script src="js/bootstrap.min.js"></script>
   <!-- /Bootstrap Core JavaScript -->	   

</body>
</html>