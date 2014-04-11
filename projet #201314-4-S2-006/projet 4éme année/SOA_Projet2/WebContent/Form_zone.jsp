<%@taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
<%@taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>

<f:view>
    <html lang="en">
        <head>
            <title>Form Zone</title>
        </head>
        <body>
        <h3> Nom De Zone </h3>
             <form action="">
         <li>
            <label for="car">Nombre De Zone:</label>
            <select id="number">
                <option>1</option>
                <option>2</option>
                <option>3</option>
                <option>4</option>
              
            </select>
        </li>
        
           <li>
        	<label for="name">Zone 1:</label>
            <input type="text" size="40" id="name" />
        </li>
        
         <li>
        	<label for="name">Zone 2:</label>
            <input type="text" size="40" id="name" />
        </li>
            
             <p>
        <button type="submit" class="action">Terminer</button></p>
        
        
        </form>
      
        </body>
    </html>
</f:view>