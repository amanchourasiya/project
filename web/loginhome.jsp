<%-- 
    Document   : loginhome
    Created on : 19 Apr, 2017, 7:05:39 AM
    Author     : jarvis
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <%@include file="header1.jsp" %>
    <div class="section section-breadcrumbs">
			<div class="container">
				<div class="row">
					<div class="col-md-12">
						<h1>Our available  courses</h1>
					</div>
				</div>
			</div>
		</div>
    
    
    <%if(request.getAttribute("message")!=null){%>
   <h3> <%=request.getAttribute("message")%></h3>
    <%}%>
    
    <div class="section">
	    	<div class="container">
                    
				<div class="row">
			
			<ul class="grid cs-style-2">
	        	<div class="col-md-4 col-sm-6">
					<figure>
						<img src="img/courses/collections.png" alt="img04">
						<figcaption>
							<h3>Collections</h3>
							<span>Industrial approach</span>
							<a href="collectiondetails.jsp">Take a look</a>
						</figcaption>
					</figure>
	        	</div>	
				<div class="col-md-4 col-sm-6">
					<figure>
						<img src="img/courses/generics.png" alt="img01">
						<figcaption>
							<h3>Generics</h3>
							<span>Reusability of code</span>
							<a href="genericdetails.jsp">Take a look</a>
						</figcaption>
					</figure>
				</div>
				<div class="col-md-4 col-sm-6">
					<figure>
						<img src="img/courses/exceptions.png" alt="img02">
						<figcaption>
							<h3>Exception Handling</h3>
							<span>A world of imperfection</span>
							<a href="exceptiondetails.jsp">Take a look</a>
						</figcaption>
					</figure>
				</div>
				<div class="col-md-4 col-sm-6">
					<figure>
						<img src="img/courses/oops.png" alt="img05">
						<figcaption>
							<h3>OOPS in JAVA</h3>
							<span>Basic building block</span>
							<a href="oopsdetails.jsp">Take a look</a>
						</figcaption>
					</figure>
				</div>
				<div class="col-md-4 col-sm-6">
					<figure>
						<img src="img/courses/multithreading.png" alt="img03">
						<figcaption>
							<h3>Multithreading in Java</h3>
							<span>Parallel computing</span>
							<a href="multithreadingdetails.jsp">Take a look</a>
						</figcaption>
					</figure>
				</div>
				<div class="col-md-4 col-sm-6">
					<figure>
						<img src="img/courses/jvm.png" alt="img06">
						<figcaption>
							<h3>JVM Architecture</h3>
							<span>Knowing internals of Java</span>
							<a href="jvmdetails.jsp">Take a look</a>
						</figcaption>
					</figure>
				</div>
			</ul>

				
				</div>
				
				<ul class="pager">
				  <li><a href="#">Previous</a></li>
				  <li><a href="#">Next</a></li>
				</ul>
				
			</div>
		</div>
    <hr>
    <%@include file="footer.jsp"%>
</html>
