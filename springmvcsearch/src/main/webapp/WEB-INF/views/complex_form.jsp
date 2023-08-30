
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<title>Bootstrap Form Example</title>
<!-- Add Bootstrap CSS link -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body>

	<div class="container mt-4">
		<h2>Student Registration Form</h2>
		<div class="alert alert-danger" role="alert">
		
			<form:errors path="student.*"/>
			
			
			
			</div>
		<form action="handleform" method="post">
			<!-- Name Field -->
			<div class="form-group">
				<label for="name">Name:</label> <input name="name" type="text"
					class="form-control" id="name" placeholder="Enter your name">
			</div>

			<!-- ID Field -->
			<div class="form-group">
				<label for="id">ID:</label> <input name="id" type="text"
					class="form-control" id="id" placeholder="Enter your ID">
			</div>

			<!-- Date of Birth (DOB) Field -->
			<div class="form-group">
				<label for="dob">Date of Birth:</label> <input name="dob"
					type="date" class="form-control" id="dob" placeholder="DD/mm/yy">
			</div>

			<!-- Course Selection Field -->
			<div class="form-group">
				<label for="courses">Select Courses:</label> <select
					class="form-control" name="cources" id="courses">
					<option value="" disabled selected>Select your courses</option>
					<option value="java">java</option>
					<option value="python">Python</option>
					<option value="web devlopment">web devlopment</option>
					<!-- Add more course options here -->
				</select>
			</div>

			<!-- Gender Selection Field -->
			<div class="form-group">
				<label for="gender">Select Gender:</label> <select
					class="form-control" name="gender" id="gender">
					<option value="" disabled selected>Select your gender</option>
					<option value="male">Male</option>
					<option value="female">Female</option>
					<option value="other">Other</option>
				</select>
			</div>

			<!-- Type Selection Field -->
			<div class="form-group">
				<label for="type">Select Type:</label> <select class="form-control"
					name="type" id="type">
					<option value="" disabled selected>Select type</option>
					<option value="regular">Regular</option>
					<option value="distance">Distance Learning</option>
					<!-- Add more type options here -->
				</select>
			</div>
			<div class="card">
				<div class="card-body">
					<p>Your Address</p>
					<div class="form-group">
						<input name="address.street" type="text" class="form-control"
							placeholder="Enter street" />

					</div>

					<div class="form-group">
						<input name="address.city" type="text" class="form-control"
							placeholder="Enter city" />

					</div>

				</div>
			</div>



			<!-- Submit Button -->
			<button type="submit" class="btn btn-primary">Submit</button>
		</form>
	</div>

	<!-- Add Bootstrap JS and jQuery links -->
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>

</body>
</html>
