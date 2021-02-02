# phone-example-android
일반적인 통화와 관련된 예제들을 담아 놓은 장소입니다.

## 전화 걸기
전화 어플에 있는 Activity 정보를 넣어 Intent 정의

    Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:01012345678"));
  
    startActivity(intent);
