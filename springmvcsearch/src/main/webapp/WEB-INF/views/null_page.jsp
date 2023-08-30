    <%@ page isELIgnored="false"%>

<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Error Page</title>
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
  <style>
    body {
      background-color: #f8f9fa;
    }
    .error-container {
      text-align: center;
      padding: 100px;
    }
    .error-heading {
      font-size: 4rem;
      color: #dc3545;
    }
    .error-message {
      font-size: 1.5rem;
      margin-top: 20px;
    }
    .button-container {
      margin-top: 30px;
    }
    .btn {
      margin-right: 10px;
    }
  </style>
</head>
<body>
  <div class="container error-container">
    <h1 class="error-heading">OOPs! sorry</h1>
    <h1>${ msg}</h1>
    <div class="button-container">
      <a href="/" class="btn btn-primary">Home</a>
      <a href="/contact" class="btn btn-secondary">Contact Us</a>
    </div>
  </div>
</body>
</html>
