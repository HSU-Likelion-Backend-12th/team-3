- ### ✨ 이슈 번호

  - ex) #21

  [과제1] 회원가입/로그인/회원탈퇴 API 개발

  https://github.com/khyaejin/account-assignment-base.git

  [Notion](https://tangible-erica-4a1.notion.site/API-1c6665b41910463f8ad334926ea53d3a) 를 참고하여 과제를 수행해주세요.

  [회원가입]

  - 회원가입에 성공한 경우(201)

  ![image-20240516230358339](C:\Users\user\Documents\LikeLion\team-3\hyejin\hw5\image-20240516230358339.png)

  - userId에 영문자와 숫자가 아닌 다른 것이 포함된 경우(400)

  ![image-20240516230416226](C:\Users\user\AppData\Roaming\Typora\typora-user-images\image-20240516230416226.png)

  - 전화번호 형식이 맞지 않을 경우 (400

  ![image-20240516230432311](C:\Users\user\AppData\Roaming\Typora\typora-user-images\image-20240516230432311.png)

  - 이메일 형식이 맞지 않은 경우(400)

  ![image-20240516230447803](C:\Users\user\AppData\Roaming\Typora\typora-user-images\image-20240516230447803.png)

  

  

  [로그인]

  - 회원이 존재하지 않는 경우(400)

  ![image-20240516231800849](C:\Users\user\AppData\Roaming\Typora\typora-user-images\image-20240516231800849.png)

  - 로그인에 성공한 경우(200)

  ![image-20240516232422880](C:\Users\user\AppData\Roaming\Typora\typora-user-images\image-20240516232422880.png)

  - 비밀번호가 일치하지 않는 경우(401)

  ![image-20240516232446215](C:\Users\user\AppData\Roaming\Typora\typora-user-images\image-20240516232446215.png)

  

  

  [회원탈퇴]

  - 존재하지 않는 회원일 경우(404)

  ![image-20240516232614820](C:\Users\user\AppData\Roaming\Typora\typora-user-images\image-20240516232614820.png)

  정상 탈퇴가 된 경우(200)

  ![image-20240516232629171](C:\Users\user\AppData\Roaming\Typora\typora-user-images\image-20240516232629171.png)

  

  

  

  [과제2] 게시글 전체 리스트 API 개발

  바로 이전 세션에서 사용했던 프로젝트에 이어서 게시글 전체 리스트 API를 개발해주세요.
  GET 메소드, 요청 경로는 http://localhost:8080/api/post/all 입니다.
  성공 시 아래와 같은 응답이 넘어옵니다.
  테스트를 위해 게시글 생성 API로 게시글을 2개 이상 생성 후 테스트를 진행해주세요.

  https://github.com/khyaejin/Post-API.git

  ![image-20240516233148207](C:\Users\user\AppData\Roaming\Typora\typora-user-images\image-20240516233148207.png)

  <br><br>

  ### 📄 과제를 통해 배운 것

  - 과제를 통해 배운 것을 작성해주세요.

  - 블로그 링크 첨부, PDF 파일 멘토에게 전달, 간단한 텍스트로 작성 등 아무거나 괜찮습니다! 😊

    -> API 명세서를 작성할 때의 전체적인 흐름을 배웠다.

  <br><br>

  ### 🦁 이번 주 과제는 어땠나요?

  #### 1-1) 어려웠던 점이 있다면 작성해주세요! 없다면 쓰지 않아도 됩니다.
  - 저번 실습에서 PostMapping에서의 Post와 게시글을 의미하는 Post를 헷갈려서 Post 패키지를 만든 이유가 PostMapping을 모아두려고 한 것인줄 알았다. 

  <br>

  #### 1-2) 어떻게 극복했나요?
  - Post 패키지 안에 GetMapping 등이 있길래 확인해보니 게시글 관련된 것들을 묶어두기 위해 만든 패키지였다는 것을 깨달았다.

  <br>

  #### 2) 과제 난이도는 어느 정도였나요?
  - ⭐️⭐️⭐️⭐️⭐️ (1: 너무 쉽다, 3: 보통이다, 5: 너무 어렵다)

  <br>

  #### 3) 이번 주 세션/과제에서의 개선사항을 작성해주세요! 없다면 쓰지 않아도 됩니다.
  - 
