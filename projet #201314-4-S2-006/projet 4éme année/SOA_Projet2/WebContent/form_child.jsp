<%@taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
<%@taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>

<f:view>
    <html lang="en">
        <head>
            <title>New Child</title>
        </head>
        <body>
        
           <form action="">
            <h3>Nom Child</h3>
             <li>
        	<label for="name">nom de Child :</label>
            <input type="text" size="40" id="name" />
        </li>
            
             <p>
        <button type="submit" class="action">Suivant</button></p>
            
        </body>
    </html>
</f:view>