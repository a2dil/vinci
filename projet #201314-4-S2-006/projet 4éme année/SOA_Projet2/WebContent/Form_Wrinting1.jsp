<%@taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
<%@taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>

<f:view>
    <html lang="en">
        <head>
            <title>Wrinting</title>
        </head>
        <body>
            
            
            <form>
	<ul>
        <li>
        <h3> Service Wrinting</h3>
        	<label for="name">Nom Fichier:</label>
            <input type="text" size="40" id="name" />
        </li>
        <li>
        	<label for="email">Descritopn:</label>
            <textarea cols="50" rows="5" id="message" size="40"></textarea>
        </li>
         <p>
        <button type="submit" class="action" >Suivant</button></p>
        </ul></form>
        </body>
    </html>
</f:view>