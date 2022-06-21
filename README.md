# SpringBoot TeamProject
## Stelling(스텔링)

### Stelling(스텔링)
스텔링은? 누구에게나 작가가 될 수 있는 기회를 제공해준다.


프로젝트에서 맡은 역할 :
웹소켓을 사용한 작가와 일러스트 쌍방향 통신 구현, 메인 페이지 제작

<hr/>

### 프로젝트를 통해 느낀점 :

먼저 메인페이지를 제작하면서 리액트에서 사용했던 방식으로 구사하기 위해 RestAPI로 가져온 데이터를 map 함수를 사용해 구현을해봣다.엄청난 코드가 나왓고 가독성 또한 좋지 못했다.
하지만 슬라이드를 2개 만들어 봤는데 첫번짼 Clone함수를 사용한 슬라이드를 제작하였고  두번째는 index값을 사용하여 classList add/remove 를 사용하여 구현을 하였다.

채팅을 구현하면서 웹소켓을 처음 사용해봤다. 채팅을 어떻게 사용하는건지 , 어떤방식으로 굴러가는건지 하나도 모르는 상태에서 시작했기에 검색만 주구장창 해본 결과 stomp.js라는 것도 알알게 되었고 stomp.js는 도저히 내 머리로 이해할수 없어 웹소켓을 사용하였다. 결국엔 코드 복사붙여 넣기에 내맘대로 수정한 코드지만 구현은 했지만 내가 어떻게 구현했는지 의문이다.    
<hr/>

### 아쉬웠던점 : 

메인페이지를 리액트처럼 제작하고싶어 구상을 되게많이했는데  document.createElement 와 백틱중 어떤걸 사용해야할지 고민을 했었는대 검색결과 document.createElement쓰는게 보안상 좋다라는 글을 읽고 document.createElement를 사용해봤는데 가독성이 너무 떨어져서 코드가 너무 더러워졌지만, 이미 엎질러진 물이라 생각해서 제작을 진행하였다.

채팅은 웹소켓을 사용했었다. SPA가 아니다보니 페이지가 끊킬때마다 웹소켓의 세션이 끊켯고 이걸 해결하기 위해 며칠을 고민한 결과 방을 새로 만들면 세션이 다시 생성되어 채팅이 연결이 되지만, 가끔씩 세션이 연결안되는 문제점을 발견을하여 검색을 해봤는데, 어찌할 방법이 없다해서 채팅은 이렇게 마무리 지었다.   

<hr/>

### 프로젝트에서 사용한 스택 : HTML , CSS , JavaScript, Thymeleaf, WebSocket, SpringBoot, JPA
