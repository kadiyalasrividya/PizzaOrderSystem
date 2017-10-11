<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Select your Toppings</title>
</head>
<body>

	<h3>Select the size you want</h3>
			<input type="radio" name="size" value="thin"> Small<br>
  			<input type="radio" name="size" value="Medium"> Medium<br>
  			<input type="radio" name="size" value="large"> Large<br>
  			
	<h3>Select the base for your pizza</h3>
		<select name="base">
			<option value="thin">Thin</option>
			<option value="Medium">Medium</option>
			<option value="Extra Large">Large</option>
			<option value="Homemade">Homemade</option>
		</select>
		<h3>Select the type of pizza you want</h3>
			<input type="radio" name="pizzatype" value="margherita"> Margherita ---> Small : 75  Medium : 180  Large : 330<br>
  			<input type="radio" name="pizzatype" value="FreshVeggie"> Fresh Veggie --->  Small : 130  Medium : 265  Large : 425<br>
  			<input type="radio" name="pizzatype" value="countrySpecial"> Country Special  ---> Small : 150  Medium : 280  Large : 425<br>
  			<input type="radio" name="pizzatype" value="farmhouse"> Farm House --->  Small : 175  Medium : 325  Large : 490<br>
  			<input type="radio" name="pizzatype" value="mexicanGreenWave"> Mexican green Wave ---> Small : 190  Medium : 350  Large : 520<br>
  			<input type="radio" name="pizzatype" value="barbeque"> Barbeque Chicken --->  Small : 210  Medium : 370  Large : 525<br>
  			<input type="radio" name="pizzatype" value="chickenMexicana"> Chicken Mexicana ---> Small : 225  Medium : 390  Large : 540<br>
  			<input type="radio" name="pizzatype" value="buffaloChicken"> Buffalo Chicken  ---> Small : 270  Medium : 410  Large : 575<br>
			
		<h3>Select the toppings of your choice</h3>
			<p><input type="checkbox" name="topping" value="BlackOlives"/>Black Olives --->   20</p>
			<p><input type="checkbox" name="topping" value="Onions"/> Onions  --->  30</p>
			<p><input type="checkbox" name="topping" value="CrispCapsicum"/>Crisp BellPeppers --->   30</p>
			<p><input type="checkbox" name="topping" value="corn"/>Golden Corn --->  40</p>
			<p><input type="checkbox" name="topping" value="FreshTomato"/>Fresh Tomato --->  45</p>
			<p><input type="checkbox" name="topping" value="ChunckyChicken"/>Chunky Chicken --->  50</p>
			<p><input type="checkbox" name="topping" value="zesty"/>Zesty Chicken Sausage --->  55</p>
			<p><input type="checkbox" name="topping" value="HotNspicy"/>Hot N Spicy Chicken --->  60</p>
			<p><input type="checkbox" name="topping" value="ExtraCheese"/>Extra Cheese --->  70</p>
			
			<a href="checkout.jsp">Checkout</a>

</body>
</html>