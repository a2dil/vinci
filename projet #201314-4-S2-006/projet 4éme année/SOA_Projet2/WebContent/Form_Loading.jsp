<%@taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
<%@taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>

<f:view>
    <html lang="en">
        <head>
            <title>Service Loading</title>
        </head>
        <body>
            
        <form action="">
            
             <li>
            <label>Upload a file:</label>
            <input type="file" />
            <button type="submit" class="action">Read</button>
        </li>
           
            <li>
        	<label for="message">Message:</label>
            <textarea cols="50" rows="5" id="message"></textarea>
		</li>
     
            </form>
            
        </body>
    </html>
</f:view>