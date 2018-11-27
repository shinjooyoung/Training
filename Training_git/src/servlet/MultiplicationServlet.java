package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MultiplicationServlet
 */

public class MultiplicationServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public MultiplicationServlet() { 
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
     */
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        //인코딩 방식설정, text html 형태로 출력
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=UTF-8");
       
        
        String number = request.getParameter("number");
        
        System.out.println(number);

        //출력장치 확보
        PrintWriter out = response.getWriter();
        
        //html 코드 작성
        out.println(" <!DOCTYPE html>"); 
        out.println("<html>");
       
        
        out.println("<meta charset=\"UTF-8\">");
        out.println("<title>Insert title here</title>");
        out.println("<style type=\"text/css\">");
        
        out.println("  #mainForm table tr:first-child,"); 
        out.println("  #mainForm table tr td:first-child");
        out.println("  {");
        out.println("      background-color : gray;\r\n");
        out.println("  }");
        
        out.println("</style>");
        
        out.println("<script type=\"text/javascript\">");
        
        out.println("  function viewMultiplication() {");
        out.println("      // 입력한 단수 값");
        out.println("      var num = document.getElementById('number').value;");
        out.println("      // form");
        out.println("      var mainForm =  document.getElementById('mainForm');");
        out.println("      // 2~9 숫자만 입력 가능한 조건식");
        out.println("      if(num == '') {");
        out.println("          alert('숫자를 입력하십시요');");
        out.println("      } else {");
        out.println("          mainForm.submit();");
        out.println("      }");
        out.println("  }");
        out.println("</script>");
        out.println("</head>");
        out.println("<body>");
        out.println("  <form id='mainForm' name='mainForm' action='/lecture/servlet/MultiplicationServlet' target='get'>");
        
        out.println("      <table border='1'>");
        
        if(number != null) {
            for (int i = 1; i < 10; i++) {
                out.println("          <tr>");
                out.println("<td>" );
                out.println(number +"X"+i+" = "+(Integer.parseInt(number)*i));
                out.println("</td>");
                out.println("           </tr>");
            }
        } else {
      
        out.println("          <tr>");
        out.println("              <td>1*1 = 1</td> <td>2*1 = 2</td> <td>3*1 = 3</td> <td>4*1 = 4</td> <td>5*1 = 5</td> <td>6*1 = 6</td> <td>7*1 = 7</td> <td>8*1 = 8</td> <td>9*1 = 9</td>");
        out.println("           </tr>");
        
        out.println("           <tr>");
        out.println("               <td>1*2 = 2</td> <td>2*2 = 4</td> <td>3*2 = 6</td> <td>4*2 = 8</td> <td>5*2 = 10</td> <td>6*2 = 12</td> <td>7*2 = 14</td> <td>8*2 = 16</td> <td>9*2 = 18</td>");
        out.println("           </tr>");
        
        out.println("           <tr>");
        out.println("               <td>1*3 = 3</td> <td>2*3 = 8</td> <td>3*3 = 9</td> <td>4*3 = 12</td> <td>5*3 = 15</td> <td>6*3 = 18</td> <td>7*3 = 21</td> <td>8*3 = 24</td> <td>9*3 = 27</td>");        
        out.println("           </tr>");
         
        out.println("           <tr>");
        out.println("               <td>1*4 = 4</td> <td>2*4 = 2</td> <td>3*4 = 12</td> <td>4*4 = 16</td> <td>5*4 = 20</td> <td>6*4 = 24</td> <td>7*4 = 24</td> <td>8*4 = 32</td> <td>9*4 = 36</td>");
        out.println("           </tr>");
        
        out.println("           <tr>");
        out.println("               <td>1*5 = 5</td> <td>2*5 = 2</td> <td>3*5 = 15</td> <td>4*5 = 20</td> <td>5*5 = 25</td> <td>6*5 = 30</td> <td>7*5 = 35</td> <td>8*5 = 30</td> <td>9*5 = 45</td>");
        out.println("           </tr>");
              
        out.println("           <tr>");
        out.println("               <td>1*6 = 6</td> <td>2*6 = 2</td> <td>3*6 = 18</td> <td>4*6 = 24</td> <td>5*6 = 30</td> <td>6*6 = 36</td> <td>7*6 = 42</td> <td>8*6 = 48</td> <td>9*6 = 54</td>");
        out.println("           </tr>");
        
        out.println("           <tr>");
        out.println("               <td>1*7 = 7</td> <td>2*7 = 2</td> <td>3*7 = 21</td> <td>4*7 = 28</td> <td>5*7 = 35</td> <td>6*7 = 42</td> <td>7*7 = 49</td> <td>8*7 = 56</td> <td>9*7 = 63</td>");
        out.println("           </tr>");
        
        out.println("           <tr>");
        out.println("               <td>1*8 = 8</td> <td>2*8 = 2</td> <td>3*8 = 24</td> <td>4*8 = 32</td> <td>5*8 = 40</td> <td>6*8 = 48</td> <td>7*8 = 56</td> <td>8*8 = 64</td> <td>9*8 = 72</td>");
        out.println("           </tr>");
        
        out.println("           <tr>");
        out.println("               <td>1*9 = 9</td> <td>2*9 = 2</td> <td>3*9 = 27</td> <td>4*9 = 36</td> <td>5*9 = 45</td> <td>6*9 = 54</td> <td>7*9 = 63</td> <td>8*9 = 72</td> <td>9*9 = 81</td>");
        out.println("           </tr>");
        }
            
        out.println("       </table>");
        out.println("       <input type='text' id='number' name='number' /> <input type='button' value='전송' onclick='viewMultiplication();'/>");
        out.println("   </form>");

        out.println("</body>");
        out.println("<html>");
        
        //출력닫기
        out.close();
    
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        response.getWriter().append("Served at: ").append(request.getContextPath());
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        doGet(request, response);
    }

}
