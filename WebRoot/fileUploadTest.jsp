<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<title>Add Product Form</title>
</head>
<body>
    <div id="global">
        <form:form action="http://localhost:8080/HejiaSCM/singleSave" method="post" enctype="multipart/form-data">
            <fieldset>
                <p>
                    <label for="image">Upload files </label> 
                    <input type="file" name="file" multiple="multiple"/>
                </p>
                <p id="buttons">
                    <input id="reset" type="reset" tabindex="4"> 
                    <input id="submit" type="submit" tabindex="5" value="Upload file">
                </p>
            </fieldset>
        </form:form>
        <form:form method="POST" action="multipleSave" enctype="multipart/form-data">
			<fieldset>
				File1 to upload: <input type="file" name="file">
		 
				Name1: <input type="text" name="name">
		 
		 
				File2 to upload: <input type="file" name="file">
		 
				Name2: <input type="text" name="name">
		 
		
				<input type="submit" value="Upload"> Press here to upload the file!
			</fieldset>
	</form:form>
    </div>
</body>
</html>