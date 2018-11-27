<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<style type="text/css">
	#mainForm table tr:first-child,
	#mainForm table tr td:first-child
	{
		background-color : gray;
	}
</style>

<script type="text/javascript">

	function viewMultiplication(){
		//입력한 단수 값
		var num = document.getElementById('number').value;
		//form
		var mainForm =	document.getElementById('mainForm');
		// 2~9 숫자만 입력 가능한 조건식
		if(num == '') {
			alert('숫자를 입력하십시요');
		}else{
			mainForm.submit();
		}
	}
</script>

</head>



<body>
    <form id='mainForm' name='mainForm' action='/lecture/multiplication.jsp' target='post'>
        <table border='1'>
           <tr>
           		<td>1*1 = 1</td> <td>2*1 = 2</td> <td>3*1 = 3</td> <td>4*1 = 4</td> <td>5*1 = 5</td> <td>6*1 = 6</td> <td>7*1 = 7</td> <td>8*1 = 8</td> <td>9*1 = 9</td>
           </tr>
           <tr>
           		<td>1*2 = 2</td> <td>2*2 = 4</td> <td>3*2 = 6</td> <td>4*2 = 8</td> <td>5*2 = 10</td> <td>6*2 = 12</td> <td>7*2 = 14</td> <td>8*2 = 16</td> <td>9*2 = 18</td>
           </tr>
           <tr>
           		<td>1*3 = 3</td> <td>2*3 = 8</td> <td>3*3 = 9</td> <td>4*3 = 12</td> <td>5*3 = 15</td> <td>6*3 = 18</td> <td>7*3 = 21</td> <td>8*3 = 24</td> <td>9*3 = 27</td>
           </tr>
           <tr>
           		<td>1*4 = 4</td> <td>2*4 = 2</td> <td>3*4 = 12</td> <td>4*4 = 16</td> <td>5*4 = 20</td> <td>6*4 = 24</td> <td>7*4 = 24</td> <td>8*4 = 32</td> <td>9*4 = 36</td>
           </tr>
           <tr>
           		<td>1*5 = 5</td> <td>2*5 = 2</td> <td>3*5 = 15</td> <td>4*5 = 20</td> <td>5*5 = 25</td> <td>6*5 = 30</td> <td>7*5 = 35</td> <td>8*5 = 30</td> <td>9*5 = 45</td>
           </tr>
           <tr>
           		<td>1*6 = 6</td> <td>2*6 = 2</td> <td>3*6 = 18</td> <td>4*6 = 24</td> <td>5*6 = 30</td> <td>6*6 = 36</td> <td>7*6 = 42</td> <td>8*6 = 48</td> <td>9*6 = 54</td>
           </tr>
           <tr>
           		<td>1*7 = 7</td> <td>2*7 = 2</td> <td>3*7 = 21</td> <td>4*7 = 28</td> <td>5*7 = 35</td> <td>6*7 = 42</td> <td>7*7 = 49</td> <td>8*7 = 56</td> <td>9*7 = 63</td>
           </tr>
           <tr>
           		<td>1*8 = 8</td> <td>2*8 = 2</td> <td>3*8 = 24</td> <td>4*8 = 32</td> <td>5*8 = 40</td> <td>6*8 = 48</td> <td>7*8 = 56</td> <td>8*8 = 64</td> <td>9*8 = 72</td>
           </tr>
           <tr>
           		<td>1*9 = 9</td> <td>2*9 = 2</td> <td>3*9 = 27</td> <td>4*9 = 36</td> <td>5*9 = 45</td> <td>6*9 = 54</td> <td>7*9 = 63</td> <td>8*9 = 72</td> <td>9*9 = 81</td> 
           </tr>
           
        </table>
    <input type='text' id='number' name='number'/><input type='button' value='전송' onclick='viewMultiplication();'/>
    </form>
</body>
</html>