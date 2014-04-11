<%@taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
<%@taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>

<f:view>
    <html lang="en">
        <head>
            <title>attribut</title>
        </head>
        <body>
        <h3> Nom D'attribut</h3>
        <form action="">
         <li>
            <label for="car">Nombre D'attribut:</label>
            <select id="number">
                <option>1</option>
                <option>2</option>
                <option>3</option>
                <option>4</option>
              
            </select>
        </li>
        
           <li>
        	<label for="name">Attribut 1:</label>
            <input type="text" size="40" id="name" />
        </li>
        
         <li>
        	<label for="name">Attibut 2:</label>
            <input type="text" size="40" id="name" />
        </li>
            
             <p>
        <button type="submit" class="action">Suivant</button></p>
        
        
        </form>
            
            
        </body>
    </html>
</f:view>