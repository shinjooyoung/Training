## Java 프로그램의 종류



### Java 어플리케이션 

Java 어플리케이션은 JVM이 설치되어 있으면 웹부라우저 밖에있어도 독립적으로 실행 가능한 프로그램이다.

Applet이 웹브라우져안에서 실행되는 반면에 Java 어라플리케이션은 웹브라우져 밖에서도 독립적으로 실행이 가능하다



### Applet 

서버에서 클라이언트로 클래스파일이 전송된 후 실행되는 작은 프로그램으로

웹브라우저 안에서만 작동이 되며 보통 멀티미디어 효과( 애니메이션, 시계, 달력 등)를 내기위해서 사용됨

Servlet이 서버쪽에서 실행하고 클라이언트에서 보내주는 반면에

Applet은 클라이언트에서 실행을 하고 실행할때마다 서버에서 다운을 받아 실행시킨다.



### Servlet

자바기반으로 만드는 웹 어플리케이션 프로그래밍 기술로 Server 와 Applet의 합쳐진 의미로

CGI프로그램과 같이 웹 서버 프로그램의 기능을 확장하기 위한 프로그램이다.

Applet은 브라우저에서 돌아가는 작은 프로그램이라고 하면 Servlet은 서버에서 돌아가는 프로그램을 의미한다.





## Stream 과 Writer



### Stream은 자료의 입출력을 도와주는 중간매개체로 입력과 출력이 관련된 곳이면 어디든 동작합니다
### Stream은 크게 두가지 나누어 지는데 바이트 단위(InputStream, OutputStream)와 문자 단위(Reader,Writer) 입니다.




### 바이트 단위
InputStream, OutputStream은 추상 클래스로 인스턴스화 하지 못합니다.
InputStream은 데이터를 읽어오는 객체이며 OutputStream은 데이터를 써서 내보내는 객체입니다.
주로 이미지, 동영상 등을 송수신할 때 주로 사용됩니다.





### 문자 단위
Reader,Writer은 추상 클래스로 인스턴스화 하지 못합니다..
Reader는 문자열을 읽어오는 객체이고 Writer은 문자열을 써서 출력하는 객체 입니다.
말 그대로 문자를 입출력하는데 사용하는 스트림으로 html 문서, 텍스트 파일을 송수신할 때 사용됩니다.




## 기본적인 자료구조 Interface 종류

기본적인 자료구조 Interface 종류
Collection, List, Set, Map 은 클래스가 아닌 인터페이스입니다. 각각 어떤 의미인지 간략히 서술하세요. (API 참조)



### Collection

목록성 데이터를 처리하는 자료구조를 말합니다. 

간단하게 하면 데이터의 집합, 그룹을 의미하고

Set,  List, Queue등이 Collection 인터페이스를 구현화 하고 있습니다.



### List

순서가 있는 데이터의 집합으로 데이터 중복을 허용합니다.

배열과 List의 구조는 비슷하지만 배열은 크기가 고정되있고 List는 가변적 길이를 가집니다.



### Set

순서를 유지하지 않는 데이터의 집합입니다. 

중복 데이터를 허용하지 않으며 자동으로 제거를 합니다.



### Map

Map은 키(Key)와 값(value)으로 이루어져 있습니다.

모든 데이터는 키와 값이 존재하고 키와 값중 하나라도 없다면

저장을 할 수 없습니다.

Map의 경우 Collection을 상속받고 있지 않지만 Collection으로 분류됩니다.



## 기본적인 자료구조 Class 종류
List, Set, Map 의 구현클래스는 어떤것들이 있는지 각각 나열하세요. (API 참조




### List

- LinkedList - 링크를 연결해 리스트를 구현합니다. 데이터의 추가와 삭제는 빠르게 되지만 데이터 조회시 root 0번째부터 링크를 통해 조회하기 때문에 조회속도가 느립니다.

- Vector - ArrayList와 동일한 구조로 되어있습니다. 멀티스레드 환경에서 동기화 처리가 되어있어 멀티 스레드 환경에서는 ArrayList보다 성능이 우수합니다.

- ArrayList - 배열을 이용해서 리스트를 구현 합니다. 내부적 배열을 사용해 인덱스를 이용한 접근은 빠르지만 데이터의 추가와 삭제가 느립니다.



### Set

- HashSet - 데이터를 해쉬 테이블을 담는 클래스로 임이의 데이터를 고정된 길이의 데이터로 매핑하는 함수 입니다. 기존의 데이터를 키(Key)라고 하고 매핑 후 데이터를(HashValue) 그 과정을 해싱(Hashing)이라고 합니다.

- TreeSet - 레드-블랙 트리(이진트리로 자동으로 균형을 맞춰줌) 자료구조로 입력된 데이터의 값에 따라 정렬이 됩니다. 이전 데이터와 비교해가며 저장이 되며 HashSet보다 성능이 떨어집니다

- LinkedHashSet - HashSet을 상속받도록 되어있고 데이터를 해쉬테이블에 담는 클래스로 HashSet과는 다르게 저장된 순서에 따라서 순서가 결정됩니다.



### Map

- hashMap - Map인터페이스를 구현하기 위해 해시테이블을 사용한 클래스로 중복을 허용하지 않고 순서를 보장하지 않으며 Null값이 올 수 있습니다.

- TreeMap - 이진트리 형태로 키(Key)와 값(Value)의 쌍으로 이루어진 데이터를 저장합니다. 정렬된 순서로 키(Key)와 값(Value) 쌍을 저장하므로 검색이 빠르지만 저장시 정렬을 하기때문에 시간이 오래 걸립니다.

- Hashtable - 해시함수를 사용해서 키(Key)를 해시값(HashValue)으로 매핑하고 해시값(HashValue)을 주소 삼아 데이터의 값(Value)을 키(Key)와 함께 저장하는 자료구조를 말합니다.



## HTTP



### HTTP와 FTP


#### HTTP

웹서버와 클라이언트간에 정보를 교환하기 위한 통신 규약(네트워크 80번 포트)입니다.
HTTP Request로 요청을하고 HTTP Response로 응답을 받습니다.

#### FTP

인터넷을 통한 파일 송수신 서비스로 http로 접속되는 WWW보다 빠른 속도로 데이터를 주고 받을 수 있습니다.
서버와 클라이언트간에는 2개의 연결이 생깁니다. 데이터 전송을 위해 신호를 주고받기 위한 포트(네트워크 21번 포트)와 실제로 데이터 전송에 사용되는 포트(네트워크 20번 포트) 입니다.



### HTTP 메소드 종류

- GET - URI(URL) 형식으로 리소스를 요청
- HEAD - Get방식과 유사하며 헤더 정보만을 보냄(웹 서버 정보, 다운 여부 점검 등)
- POST - 클라이언트에서 서버로 정보를 보낼때 사용
- PUT - POST처럼 정보를 보내는건 동일하나 서버의 데이터 갱신위주로 사용됨
- DELET - 웹서버의 리소스를 제거할때 사용 
- OPTIONS - 웹서버에서  지원되는 메소드 종류를 확인 가능
- TRACE - 요청 리소스가 수신되는 경로를 보여줌
- CONNECT - 직접 통신할 수 없을떄 중계기로서 대리로 통신을 수행하는 기능, 프록시서버와 동일


### HTTP 컨텐트 타입

#### * 전송하는 데이터의 형식으로 mime type 형식으로 표현됨

#### * mime type - content type을 표현하는 방식으로 8가지 종류가 존재 application, audio, image, message, model, multipart, text, video

#### 자주쓰이는 content type

- text/html - HTML 문서
- text/css	- HTML CSS 스타일시트
- text/plain - HTML 텍스트 파일
- application/msword - 마이크로소프트 워드 문서
- application/pdf - Acrobat(.pdf) 파일
- application/vnd.ms-excel - 마이크로소프트 엑셀 스프레드시트
- application/vnd.ms-powerpoint - 마이크로소프트 파워포인트 프리젠테이션
- image/gif - GIF 이미지
- image/jpeg - JPEG 이미지
- video/mpeg - MPEG 동영상 클립


### Servlet

#### Servlet main() 메쏘드 없이 동작하는 이유

servlet은 servlet컨테이너로 관리가 됩니다.  servlet을 실행하고 관리하는 역활을 해주기 때문에 url요청이 오면 servlet컨테이너를 통해서 service() 호출되어 동작합니다. 그래서 main() 메쏘드가 없이도 동작이 가능합니다. 

#### Servlet 퀴즈

##### Servlet은 main() 메쏘드가 없는데도 동작이 됩니다. 말이안되죠? main() 메쏘드를 가진 클래스는 어디에 있을까요?
응답객체를 만들어 주는 주체는 servlet컨테이너 입니다 서블릿에 대한 URL요청이 오면 컨테이너가 HttpServletResponse와 HttpServletRequest 객체를 생성합니다. 그 후 URL을 분석 후 어떤 서블릿을 요청한지 확인을 합니다. 그다음에 서블릿 스레드를 생성해 Request, Response 참조를 넘깁니다.

##### 응답객체의 writer 속성은 빨대라고 생각할 수 있습니다. System.out 빨대의 끝단은 콘솔(커멘드창)입니다. 응답객체 writer의 끝단은 어디일까요?

응답객체의 writer 속성이 빨대라면 빨대 끝단은 최종적으로 나오는 웹 브라우저 화면입니다


### JSP 로부터 만들어진 Servlet 소스 분석
#### JSP의 page 지시자나 작성한 HTML 들이 어떤 Java 소스로 변환되었는지 분석하고 그 내용을 간락히 적으십시요.
JSP의 page지시자는 response객체의 setContentType 메소드로 contentType을 설정, HTML로 작성한 코드들은 jsp객체들이 자동으로 생성(request, response, pageContext, session, application, out, config , page ) 되고 out 출력스트림을 통해 write 함수를 호출해서 응답할 HTML 텍스트를 전달하는 구조로 되어있음

- request : 요청을 처리하는 객체

- response : 응답을 처리하는객체

- pageContext : jsp페이지와 관련 컨텍스트 정보를 담고 있는객체

- session : 세션관리를 위한 객체

- application : 컨텍스트의 범위의 공유되는 데이터를 담고 있는 객체 

- out : 브라우져로의 출력 스트림을 담당하는 객체

- config : 서블릿이 초기화 하는 동안 참조해야 할 정보를전달해주는 객체

- page : this, 서블릿 자신의 객체

* 컨텍스트 : 같은 웹 응용 프로그램에 소속된 서블릿과 JSP 프로그램들은 실행환경을 서로 공유하며 이러한 환경을 컨텍스트라고함, 이런 컨텍스트를 통해 서블릿과 JSP는 데이터 공유가 가능함


#### JSP 실행 과정의 이해

##### 브라우저 주소창에 url 요청 후 브라우저에 응답이 보여질때까지 브라우저와 Tomcat 이 수행하는 작업을 순서대로 기술하십시요. 

브라우저는 Tomcat 에게 http Get또는 Post 방식으로 요청을 보내면 해당 객체를 서블릿 컨테이너에서 찾고 없을경우 JSP 파일을 서블릿 파일로 변환, 서블릿 파일을 클래스 파일로 컴파일 하여 서블릿 컨테이너에 로딩하여 브라우저로 응답함

