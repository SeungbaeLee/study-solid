
궁금한 점.

SRP :
*     비밀 번호 암호화는 계정 생성 외에는 쓸 일이 없어보인다.
      그럼 UserService Class에 메소드만 따로 만들어 가져다 써도 이건 SRP에 위배되나?
      개인적인 느낌 -> 핵심은 로직 안에 로직이 있는 것이 문제인거 같은데 그럼,
      해당 클래스 안에 메소드를 만들어서 땡겨쓰나, 클래스를 따로 파서 의존성 주입 후 땡겨쓰는거나
      굳이 클래스를 따로 만들어야 하나?


OCP : 
*     수정요구로 인해 인터페이스를 구현한 클래스가 두개가 생길 시
      인터페이스 주입 시 주입되는 클래스(오버라이딩 되는 메소드 등) 어떤 게 되는건가?
      만약 수정사항이 있어서 클래스를 하나 만들어서 구현했다면 전에 쓰던 클래스는 삭제해야하는건가?

ISP : 
*     어차피 해당 메소드만 끌어다 쓸건데 이게 불필요한 간섭인가?
      대형 프로젝트는 도메인, 기능 등 모든게 엄청 많고 클텐데 얼마만큼 세세하게 나누는가?
      둘 다 어쨋든 비밀번호 관련 로직인데, 이걸 나눌정도인가 이 나누는 명확한 기준점?


DIP : 
*     클래스에 클래스를 주입하는 경우는 바람직하지 못한가? => 클래스간의 상위 하위 구분은 어떻게??






※forcode는 에러방지용으로 작성 무시할 것