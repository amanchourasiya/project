<%-- 
    Document   : collectiondetail
    Created on : Apr 18, 2017, 7:15:27 PM
    Author     : Autobot
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <%@include file="header.jsp"%>
    
    <div class="section section-breadcrumbs">
			<div class="container">
				<div class="row">
					<div class="col-md-12">
						<h1>Course Details</h1>
					</div>
				</div>
			</div>
		</div>
    
     <div class="section">
	    	<div class="container">
	    		<div class="row">
	    			<!-- Product Image & Available Colors -->
	    			<div class="col-sm-6">
	    				<div class="product-image-large">
	    					<img src="img/courses/collections.png" alt="Item Name">
	    				</div>
	    				<div class="colors">
							<span class="color-white"></span>
							<span class="color-black"></span>
							<span class="color-blue"></span>
							<span class="color-orange"></span>
							<span class="color-green"></span>
						</div>
	    			</div>
	    			<!-- End Product Image & Available Colors -->
	    			<!-- Product Summary & Options -->
	    			<div class="col-sm-6 product-details">
	    				<h2>Collection Framework</h2>
						<h3>Quick Overview</h3>
	    				<p>
                                        Collection has been the red hot concept in IT industry as it allows the development of logic very fast and get the work done easily.
                                        </p>
	    				<p>
                                            By attending this course students will be able to get a good conceptual and practical grasp on collections framework which will benefit them in technical interviews and help in surviving the IT industry.
                                            
						</p>						
						<h3>Course Details</h3>
						<p><strong>Duration : </strong> 6 weeks - 4 lectures per week.(Self paced)</p>
						<p><strong>Date: </strong>As soon as you subscribe</p>
						<p><strong>Tags: </strong>Java, Collections, IT industry</p>
                                               <form name="courseenroll" action="courseregistration">
                                                   <input type="hidden" name="course" value="collections">
                                                <input type="submit" name="enroll" value="Enroll to this course" 
                                                       onclick="return confirm('Do you really want to enroll into this course.');"
                                                       >
                                                </form>       
	    			</div>
	    			<!-- End Product Summary & Options -->
	    			
	    		</div>
			</div>
		</div>
		
<hr>
		
    
    <%@include file="footer.jsp"%>
</html>
